<template>
<div class="pagination">
	<form action="" class="form_inline">
		<div class="total"> 共<span>{{totalRecord}}</span>筆資料，第<span>{{currentPage}}/{{totalPage}}</span>頁，每頁顯示 <select name="" id="">
				<option value="">10</option>
				<option value="">20</option>
				<option value="">30</option>
				<option value="">40</option>
			</select> 筆， <input type="button" class="btn" value="確定">
		</div>
	</form>
	<ul class="page">
		<li class="first">
			<a href="#" @click="changePage(1)" title="第一頁">第一頁 </a></li>
		<li class="prev">
			<a href="#" @click="changePage(currentPage - 1)" title="回上一頁">回上一頁 </a></li>
		<template v-if="currentPage <= 6">
			<li v-for="n in totalPageLessThanSix" :key="n"
					:class="{active: currentPage == n}"
					@click="changePage(n)">
					<a href="#">{{n}}</a>
			</li>
			<template v-if="totalPage > 6">
				<li class="paging-ellipsis">....</li>
				<li @click="changePage(this.totalPage)">
					<a href="#">{{this.totalPage}}</a>
				</li>
			</template>
		</template>
		<template v-else-if="currentPage >= (totalPage - 6)">
			<li @click="changePage(1)">
				<a href="#">1</a>
			</li>
			<li class="paging-ellipsis">...</li>
			<li v-for="n in totalPageLessMinusSix" :key="n"
					@click="changePage(n)"
					:class="{active: currentPage == n}">
					<a href="#">{{n}}</a>
			</li>
		</template>
		<template v-else>
			<li @click="changePage(1)">
				<a href="#">1</a>
			</li>
			<li class="paging-ellipsis">...</li>
			<li v-for="n in minusCurrentPageLessThanThree" :key="n"
					:class="{active: currentPage == n}"
					@click="changePage(n)">
				<a href="#">{{n}}</a>
			</li>
			<li class="paging-ellipis">...</li>
			<li @click="changePage(totalPage)">
				<a href="#">{{totalPage}}</a>
			</li>
		</template>
		<li class="next">
			<a href="#" @click="changePage(currentPage + 1)" title="下一頁">下一頁 </a>
		</li>
		<li class="last">
			<a href="#" @click="changePage(totalPage)" title="最後一頁">最後一頁 </a>
		</li>
	</ul>
</div>
</template>
<script>
	export default {
		props: {
			totalRecord: {
				type: Number
			},
			currentPage: {
				type: Number,
				default: 1
			},
			totalPage: {
				type: Number,
				default: 1
			}
		},
		computed: {
			totalPageLessThanSix: function () {
				return this.totalPage > 6 ? 6 : this.totalPage;
			},
			totalPageLessMinusSix: function () {
				var array = [];
				for (var i = totalPage-5 ; i ++ ; i <totalPage) {
					array.push(i);
				}
				return array;
			},
			minusCurrentPageLessThanThree: function () {
				var array = [];
				for (var i in this.totalPage) {
					if (Math.abs(i - currentPage) < 3) {
						array.push(i);
					}
				}
				return array;
			}
		},
		methods: {
			changePage: function(page){
				debugger;
				if(page <= 0){
					page = 1;
				}

				if(page > this.totalPage){
					page = this.totalPage;
				}

				this.$emit("changePage", page);
			}
		}
	}
</script>
