<template>
	<Table border :columns="columns1" :data="data1"></Table>
</template>
<script>
	export default {
		data() {
			return {
				columns1: [{
						title: 'id',
						key: 'id',
						align: 'center',
					},
					{
						title: 'Name',
						key: 'name',
						align: 'center',
					},
					{
						title: 'Action',
						key: 'action',
						width: 350,
						align: 'center',
						render: (h, params) => {
							return h('div', [
								h('Button', {
									props: {
										type: 'info',
										size: 'small'
									},
									style: {
										marginRight: '15px'
									},
									on: {
										click: () => {

											const route = {
												name: 'collectiondetails',

											}
											this.$router.push(route)
											//this.show(params.index)
										}
									}
								}, '详细'),
								h('Button', {
									props: {
										type: 'warning',
										size: 'small'
									},
									style: {
										marginRight: '15px'
									},
									on: {
										click: () => {

											const route = {
												name: 'collectiondetails',

											}
											this.$router.push(route)
											//this.show(params.index)
										}
									}
								}, '修改'),
								h('Button', {
									props: {
										type: 'error',
										size: 'small'
									},
									on: {
										click: () => {

											// this.remove(params.index)
										}
									}
								}, '删除')
							]);
						}
					}
				],
				data1: []
			}
		},
		created() {
			this.data();
		},
		methods: {
			data() {
				let that = this;
				this.$http.get('/education/select').then(resp => {
					let list = [];
					for(let arr of  resp.data.data){
						list.push(
							{
								id:arr.id,
								name:arr.name
							}
						)
					}
					that.data1 = list;
				});
			}
		}
	}
</script>
<style>
</style>
