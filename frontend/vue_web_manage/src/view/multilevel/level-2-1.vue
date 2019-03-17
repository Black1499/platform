<template>

	<div>
		<Row>
			<i-col span="16">&nbsp;</i-col>
			<i-col span="8">
				<Input search enter-button style="width: 200px" placeholder="Enter something..." @on-search="searchs" />
			</i-col>
		</Row>
		<br>

		<div>
			<div style="background:#eee;padding: 5px" @click="createTagQuery"  v-for="(v,index) in list2" class="card" :data-id="v.id">
				<Card :bordered="false">
					<p slot="title">{{v.title}}</p>
					<router-link to="{v.id}" slot="extra">
						状态：{{v.status}}
					</router-link>
					<p>{{v.content}}</p>
				</Card>
			</div>
		</div>

		<div style="text-align: center;">
			<Page :total="100" show-sizer />
		</div>
	</div>
</template>
<script>
	export default {
		name: 'level_2_1',
		data(){
			return{
				title: '',
				content: '',
				status: '',
				list2: []
			}
		},
		created() {
			this.data();
		},
		methods: {
			searchs() {
				alert("ok");
			},
			createTagQuery(e) {
				const id = e.currentTarget.dataset.id;
				const verify = '核实';
				const compile = '编辑';
				console.log(e.currentTarget.dataset.id);
				const route = {
					name: 'query',
					query: {
						id,
						verify,
						compile
					}
				}
				this.$router.push(route)
			},
			createTagQuery2() {
				const id = 3;
				const route = {
					name: 'skip',
					query: {
						id
					}
				}
				this.$router.push(route)
			},
			data() {
				this.$http.get('/policy/raw/getByPager/1/4').then(resp => {
					let list=[];
					for (let arr of resp.data.data) {
						list.push({
							id:arr.id,
							title: arr.title,
							content: arr.content,
							status: arr.status
						})
					}
					this.list2 = list;
					// 					this.title=resp.data.data[0].title;
					// 					this.content=resp.data.data[0].content;
					// 					this.status=resp.data.data[0].status;
					//					console.log(list)

				})
			}
		}
	}
</script>
<style>
.card p{
		width: 100%;
		overflow: hidden;
		text-overflow: ellipsis;
		white-space: nowrap;
	}
</style>
