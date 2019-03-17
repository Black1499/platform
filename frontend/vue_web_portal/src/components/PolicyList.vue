<template>
	<div id="policylist">
		<!-- <div id="breadcrumb">
			<el-breadcrumb separator-class="el-icon-arrow-right">
				<el-breadcrumb-item :to="{ path: '/notice' }">首页</el-breadcrumb-item>
				<el-breadcrumb-item>公告</el-breadcrumb-item>
			</el-breadcrumb>
		</div> -->
		<div class="list">
			<ul class="ul">
				<div style="text-align: left;">
					<el-input v-model="input" style="width:80%;margin: 10px 0px;" placeholder="请输入查询关键字">
						<template slot="append">
							<el-button style="width: 8em;" slot="append">搜索</el-button>
						</template>
					</el-input>
				</div>
				<li v-for="n in 10">
					<a href="">这是标题</a>
					<div class="content"><span>2018-10-10</span> vue实现百度搜索下拉提示功能 这段代码用到vuejs和vue-resouece</div>
					<span class="span">浏览次数:1</span>
				</li>
				<el-pagination background layout="prev, pager, next" :total="1000"></el-pagination>
			</ul>
			<!-- <div style="background-color: #2094C4;width: 30%;float: right;margin: 30px 0px;text-align: left;"></div> -->
		</div>
	</div>
</template>

<script>
	export default {
		data() {
			return {

			};
		}
	}
</script>

<style scoped>
	li {
		list-style: none;
	}

	.text {
		font-size: 14px;
	}

	.item {
		margin-bottom: 18px;
	}

	.clearfix:before,
	.clearfix:after {
		display: table;
		content: "";
	}

	.clearfix:after {
		clear: both
	}

	.box-card {
		width: 480px;
	}

	#breadcrumb {
		margin: 0px auto;
		width: 90%;
		height: 20px;
		border-bottom: 1px solid #888;
	}

	.list {
		margin: 0px auto;
		width: 90%;
		/* border: 1px solid #888; */
	}

	.ul {
		text-align: left;
		float: left;
		margin: 20px auto;
		width: 60%;
	}

	.ul li {
		margin-bottom: 1em;
		border-bottom: #E6E6E6 dotted 1px;
	}

	.ul span {
		color: #888;
	}

	.ul a {
		font-size: 1.3em;
	}

	.content {
		line-height: 16px;
		font-size: 0.9em;
		width: 70%;
	}

	.span {
		font-size: 0.9em;
	}
</style>
