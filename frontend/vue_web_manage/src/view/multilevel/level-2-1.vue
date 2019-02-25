<template>
  
	<div>
    <Row>
			<i-col span="16">&nbsp;</i-col>
			<i-col span="8">
			<Input search enter-button style="width: 200px" placeholder="Enter something..."  @on-search="searchs"/>
			</i-col>
		</Row>
<br>
	
		<div style="background:#eee;padding: 5px" @click="createTagQuery">
				<Card :bordered="false">
						<p slot="title">无边框标题</p>
						<p>无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充。</p>
				</Card>
		</div>
		
		
		<div style="background:#eee;padding: 5px" @click="createTagQuery2">
				<Card :bordered="false">
						<p slot="title">无边框标题</p>
						<p>无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充。</p>
				</Card>
		</div>
		
		<div style="background:#eee;padding: 5px">
				<Card :bordered="false">
						<p slot="title">无边框标题</p>
						<p>无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充无边框内容填充。</p>
				</Card>
		</div>
		
		<div style="text-align: center;">
		 <Page :total="100" show-sizer />
		 </div>
		</div>
</template>
<script>
export default {
  name: 'level_2_1',
  methods:{
		searchs(){
			alert("ok");
		},
createTagQuery () {
	const id = 1;
	const verify = '核实';
	const compile = '编辑'
		const route = {
			name: 'query',
			query:{
				id,
				verify,
				compile
			}
		}
		this.$router.push(route)
	},
	createTagQuery2 () {
		const id = 3;	
 			const route = {
				name: 'skip',
				query:{
					id
				}
			}
			this.$router.push(route)
		}
},

}
</script>
