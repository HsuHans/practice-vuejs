<template>
	<div class="breadcrumb">
		<ul>
			<li v-for="(bread, index ) in breadcrumbList" :key="index">
				<a v-if="index != Object.keys(breadcrumbList).length - 1" :href="bread.url">{{bread.name}}</a>
				<span v-else>{{bread.name}}</span>
			</li>
		</ul>
	</div>
</template>

<script>
export default {
	props: {
		breadcrumbList: {
			type: Array,
			default: function(){
				return [];
			}
		}
	}
}
</script>

<style>
</style>