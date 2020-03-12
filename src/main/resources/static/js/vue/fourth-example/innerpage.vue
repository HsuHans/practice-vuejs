<template>
<div id="center" class="main innerpage">
	<!-- 內頁新增一個classname-->
	<a class="accesskey" href="#aC" id="aC" accesskey="C" title="主要內容區">:::</a>
	<div class="container">
		<!-- breadcrumb路徑 -->
		<breadcrumbs :breadcrumb-list="[{'name':'首頁','url':'#'},{'name':'節點','url':'#'},{'name':'節點','url':'#'}]"></breadcrumbs>
		<!-- h2節點 -->
		<h2 class="title">節點標題</h2>
		<!-- function功能區塊 -->
		<div class="function">
			<ul>
				<li class="back"><a href="#">回上一頁</a></li>
				<li class="print"><a href="#">友善列印</a></li>
				<li class="forward"><a href="#">轉寄友人</a></li>
			</ul>
		</div>
		<!-- LP Start -->
		<section class="lp">
			<!-- category -->
			<div class="category">
				<ul>
					<li><a href="#">標籤1</a></li>
					<li><a href="#">標籤2</a></li>
					<li><a href="#">標籤3</a></li>
					<li><a href="#">標籤4</a></li>
					<li><a href="#">標籤5</a></li>
					<li><a href="#">標籤6</a></li>
					<li><a href="#">標籤7</a></li>
					<li><a href="#">標籤8</a></li>
					<li><a href="#">標籤9</a></li>
					<li><a href="#">標籤10</a></li>
				</ul>
			</div>
			<!-- 文字列表 -->
			<list :pageResult="pageResult"></list>
		</section>
		<!-- LP End -->
		<!-- Pagination -->
		<pagination 
			:totalPage="pageResult.totalPage"
			:currentPage="pageResult.currentPage"
			:totalRecord="pageResult.totalRecord"
			@changePage="changePage">
		</pagination>
	</div>
</div>
</template>

<script>
import { getPagedArticle } from "../../web-service/article-service.js";
import List from "./list.vue";
import Breadcrumbs from "../../common/breadcrumbs.vue";
import Pagination from "../../common/pagination.vue";

export default {
	components: { Breadcrumbs, List, Pagination },
	data(){
		return {
			pageResult: {
				rows:[],
				totalPage: 10,
				currentPage:1
			},
			loading: true
		}
	},
	mounted(){
		getPagedArticle(1, 10).then((data)=>{
			this.pageResult = data || [];
			this.loading = false;
		});
	},
	methods: {
		changePage: function(page){
			this.loading = true;
			getPagedArticle(page, this.pageResult.size).then((data)=>{
				this.pageResult = data || [];
				this.loading = false;
			});
		}
	}
}

</script>
