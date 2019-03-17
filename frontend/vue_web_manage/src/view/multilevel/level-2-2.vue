<template>
	<div id="app">
		<label class="tit">索 引 号：</label>
		<Input class="info" :value="indexNumber"/>
		<label class="tit">主题分类：</label>
		<Input class="info" value="市场监管、安全生产监管、工商"/>
		<label class="tit">发文机关：</label>
		<Input class="info" :value="releaseOffice" /><br />
		<label>主 题 词：</label>
		<Input class="info" :value="policyBasis"></Input>
		<label class="tit">成文日期：</label>
		<Input class="info" :value="wirittenTime" />
		<label>发文字号：</label>
		<Input class="info" :value="releaseNumber" /><br />
		<label>发布日期：</label>
		<Input class="info" :value="releaseTime" />
		<label>标 题：</label>
		<Input class="title" :value="title" />

		<div id="editorElem" style="height: 550px" v-html="content">{{content}}</div>
	</div>
</template>

<script>
	import E from 'wangeditor'
	export default {
		name: 'level_2_2',
		data() {
			return {
				indexNumber:'',
				type:'',
				releaseOffice:'',
				policyBasis:'',
				wirittenTime:'',
				releaseNumber:'',
				releaseTime:'',
				title:'',
				content:''
			}
		},
		created() {
			this.data();
		},
		mounted() {
			
			var editorElem = new E('editorElem')
			editorElem.create();
			editorElem.$txt.html(this.html);
		},
		methods:{
			data(){
				this.$http.get('/policy/raw/selectByPrimaryKey/1').then(resp => {
					
						this.indexNumber=resp.data.data[0].indexNumber;
						this.type=resp.data.data[0].type;
						this.releaseOffice=resp.data.data[0].releaseOffice;
						this.policyBasis=resp.data.data[0].policyBasis;
						this.wirittenTime=resp.data.data[0].wirittenTime;
						this.releaseNumber=resp.data.data[0].releaseNumber;
						this.releaseTime=resp.data.data[0].releaseTime;
						this.title=resp.data.data[0].title;
						this.content=resp.data.data[0].content;
						//console.log(resp.data.data[0].html);
					})
			}
		}
	}
</script>

<style>
	.title {
		width: 700px;
	}

	.tit {
		width: 20px;
	}

	.info {
		width: 220px;
		margin: 10px;
	}

	.app {
		font-size: 18px;
	}
</style>
