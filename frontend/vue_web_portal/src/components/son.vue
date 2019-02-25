<template>
	<div id="app">
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
				<el-button type="primary">用户管理</el-button>
				<el-button type="primary">
                    <router-link :to="{path:'/subscribe'}">政策订阅</router-link>
                </el-button>
			</el-header>
		</el-container>
		<router-view />
	</div>
</template>

<script>
	export default {
		data() {
			return {
				data: {
					name: 'XX公司XX用户'
				}
			}
		}
	}
</script>

<style scoped>
	#app {
		font-family: 'Avenir', Helvetica, Arial, sans-serif;
		-webkit-font-smoothing: antialiased;
		-moz-osx-font-smoothing: grayscale;
		text-align: center;
		color: #2c3e50;
		/* margin-top: 60px; */
	}

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
