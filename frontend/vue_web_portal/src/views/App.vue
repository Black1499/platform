<template>
	<!-- 一级门户 -->
	<div id="app">
		<el-container>
			<el-header>
				<el-breadcrumb separator="" style="float: right;margin:20px 20px">
					<el-breadcrumb-item>
						<router-link :to="{path:'/home'}">首页</router-link>
					</el-breadcrumb-item>
					<el-breadcrumb-item>
						<router-link :to="{path:'/home'}">政策</router-link>
					</el-breadcrumb-item>
					<el-breadcrumb-item>
						<router-link :to="{path:'/son'}">企业</router-link>
					</el-breadcrumb-item>
					<el-breadcrumb-item>
						<router-link :to="{path:'/home'}">登录</router-link>
					</el-breadcrumb-item>
					<el-breadcrumb-item></el-breadcrumb-item>
				</el-breadcrumb>
			</el-header>
			<el-main>
					<img src="../assets/uugai.com_1547534130625.png" width="450px" height="100px" style="margin-top: 30px;" /><br/>
					<el-input v-model="input" style="width: 600px;"></el-input>
					<el-button type="primary" icon="el-icon-search" style="background-color: #409EFF;border: 1px solid #409EFF;">搜索</el-button>
			</el-main>
		</el-container>

	</div>
</template>

<style>
	body {
		margin: 0;
		padding: 0;
	}

	.el-header,
	.el-footer {
		/* background-color: #B3C0D1; */
		color: #333;
		text-align: center;
		line-height: 60px;
	}

	.el-aside {
		/* background-color: #D3DCE6; */
		color: #333;
		text-align: center;
		line-height: 200px;
	}

	.el-main {
		/* background-color: #E9EEF3; */
		color: #333;
		text-align: center;
		/* line-height: 160px; */
		line-height: 40px;
	}

	body>.el-container {
		margin-bottom: 40px;
	}

	.el-container:nth-child(5) .el-aside,
	.el-container:nth-child(6) .el-aside {
		line-height: 260px;
	}

	.el-container:nth-child(7) .el-aside {
		line-height: 320px;
	}

	el-row {
		margin-bottom: 20px;

		&:last-child {
			margin-bottom: 0;
		}
	}

	.el-col {
		border-radius: 4px;
	}

	.bg-purple-dark {
		background: #99a9bf;
	}

	.bg-purple {
		background: #d3dce6;
	}

	.bg-purple-light {
		background: #e5e9f2;
	}

	.grid-content {
		border-radius: 4px;
		min-height: 36px;
	}

	.row-bg {
		padding: 10px 0;
		background-color: #f9fafc;
	}

	#nav a {
		text-decoration: underline;
		color: #333;
		float: right;
		margin-left: 20px;
		font-size: 14px;
	}
</style>
