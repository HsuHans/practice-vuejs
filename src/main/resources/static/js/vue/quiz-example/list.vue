<template>
	<no-result-found v-if="loading == false && pageResult.rows.length == 0">
	</no-result-found>
	<table v-else summary="">
		<thead>
			<tr>
				<th>編號</th>
				<th>標題</th>
				<th>日期</th>
			</tr>
		</thead>
		<tbody>
			<tr v-for="row in pageResult.rows" :key="row.id">
				<td class="num">{{row.id}}</td>
				<td ><a href="#">{{row.title}}</a></td>
				<td class="date">{{row.postDate}}</td>
			</tr>
		</tbody>
	</table>
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
