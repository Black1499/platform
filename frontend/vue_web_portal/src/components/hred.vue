<template>
	<el-container>
		<div>
			<img align="left" id="logo" src="XXX" alt="公司logo" />
			<h1 id="name">{{data.name}}</h1>
		</div>
		<el-col :span="6" :offset="10">
		</el-col>
		<el-header height="40px">
			<el-button type="primary">信息推送</el-button>
			<el-button type="primary">日志文件</el-button>
			<el-button type="primary" @click="user()" >用户管理</el-button>
		</el-header>
	</el-container>
</template>

<script>
	export default {
		data() {
			return {
				data: {
					name: 'XX有限公司'
				}
			}
		},
		methods: {
			user: function() {
				window.location.assign("user.html")
			}
		}
	}
</script>

<style scoped>
	#logo {
		height: 100px;
		width: 100px;
		margin-left: 20px;
		margin-top: 20px;
		margin-right: 20px;
	}

	#name {
		float: left;
		padding-top: 70px;
		margin-bottom: 0px;
	}

	.el-header {
		background-color: darkblue;
		text-align: center;
		line-height: 40px;
	}
</style>
