<template>
	<no-result-found v-if="loading == false && pageResult.rows.length == 0">
	</no-result-found>
	<div v-else class="list">
		<ul>
			<li v-for="row in pageResult.rows" :key="row.id">
				<a href="#">
					<span class="num">{{row.id}}</span> {{row.title}} <span class="dept">({{row.department}})</span>
					<time>{{row.postDate}}</time>
				</a>
			</li>
		</ul>
	</div>
</template>

<script>
import { getPagedArticle } from "../../web-service/article-service.js";
import NoResultFound from "../../common/no-result-found.vue";

export default {
	components: {NoResultFound},
	props: {
		pageResult: {
			rows:[],
			totalPage: 10,
			currentPage:1
		},
		loading :false
	},
	mounted(){
	},
	methods: {
	}
}

</script>
