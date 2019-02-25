<template>
 <div>
  <div class="card" @click="detail">
		<Card :bordered="false" >
			<h3 slot="title" >政策解读标题</h3>
				<router-link to="/collectiondetails" slot="extra" >
				查看详情
				</router-link>
			<p>政策解读的省略内容Content of no border type. Content of no border type. Content of no border type. Content of no border type. </p>
		</Card>
	</div>
	<div class="card" @click="detail">
		<Card :bordered="false" >
			<h3 slot="title" >政策解读标题</h3>
			<a href="#" slot="extra" >
				查看详情
			</a>
			<p >政策解读的省略内容Content of no border type. Content of no border type. Content of no border type. Content of no border type. </p>
		</Card>
	</div>
	<div class="card" @click="detail">
		<Card :bordered="false">
			<h3 slot="title" >政策解读标题</h3>
			<a href="#" slot="extra" >
				查看详情
			</a>
			<p >政策解读的省略内容Content of no border type. Content of no border type. Content of no border type. Content of no border type. </p>
		</Card>
	</div>
	<Page :total="100" show-total />
</div>
</template>
<script>
export default {
  name: 'collection',
data(){
		return {
			policyRead:[],
		}
		
	},
	methods:{
		
		detail(){			
			const id = 22222
			const route = {
			    name: 'collectiondetails',
			    params: {
			      id
			    }			    
			}
			  this.$router.push(route)			
		}
	}
		
}
</script>
<style>
	.card{
		margin:10px;
	}
</style>
