<template>
	<!-- 统计页面 -->
	<div id="declare">
		<!--数据统计框-->
		<el-row :gutter="20">
			<el-col :span="10" :offset="2">
				<div class="grid-content bg-purple" style=" height: 350px;">

					<div align="center">
						<div slot="header" class="clearfix">
							<b align="center">数据统计</b>
						</div>
						<br />
						<div class="text item">
							<i class="el-icon-edit">发布</i>
							{{"总数：1912 本月：11   今日：2"}}
						</div>

						<div class="text item">
							<i class="el-icon-bell">订阅</i>
							{{"总数：6965 本月：29   今日：6"}}
						</div>

						<div class="text item">
							<i class="el-icon-share">精准送</i>
							{{"总数：506580 本月：863   今日：0"}}
						</div>
					</div>
				</div>

			</el-col>
			<el-col :span="10">
				<div class="grid-content bg-purple">
					<div style="  width: 550px; height: 350px;">
						<b align="center">政策订阅</b>
						<div id="charts-1" style="width:550px;height:300px;"></div>
					</div>
				</div>
			</el-col>
		</el-row>

		<!--echarts饼图-->
		<el-row :gutter="20">
			<el-col :span="10" :offset="2">
				<div class="grid-content bg-purple">
					<div style="  width: 550px; height: 350px;">
						<b align="center">政策分类</b>
						<div id="charts-2" style="width:550px;height:300px;"></div>
					</div>
				</div>
			</el-col>

			<el-col :span="10">
				<div class="grid-content bg-purple">
					<div style="  width: 550px; height: 350px;">
						<b align="center">申诉分类</b>
						<div id="charts-3" style="width:550px;height:300px;"></div>
					</div>
				</div>
			</el-col>
		</el-row>
	</div>
</template>

<script>
	var echarts = require('echarts');
	export default {

		mounted() {
			/*ECharts图表*/
			var myChart = echarts.init(document.getElementById('charts-1'));
			myChart.setOption({
				series: [{
						name: '访问来源',
						type: 'pie',
						radius: '70%',
						color: ['#EE6AA7', '#E40045', '#67E300', '#FFBF00'],
						itemStyle: {
							normal: {
								label: {
									show: true,
									formatter: '{b} : {c} ({d}%)'
								},
								labelLine: {
									show: true
								},
							}
						},
						data: [{
								value: 1912,
								name: '总数'
							},
							{
								value: 110,
								name: '本月'
							},
							{
								value: 70,
								name: '本日'
							},
							{
								value: 800,
								name: '本年'
							},

						]
					},

				]
			})
			/*ECharts图表*/
			var myChart = echarts.init(document.getElementById('charts-2'));
			myChart.setOption({
				series: [{
					name: '访问来源',
					type: 'pie',
					radius: '70%',
					itemStyle: {
						normal: {

							label: {
								show: true,
								formatter: '{b} : {c} ({d}%)'
							},
							labelLine: {
								show: true
							}
						}
					},
					data: [{
							value: 6965,
							name: '总数'
						},
						{
							value: 300,
							name: '本月'
						},
						{
							value: 100,
							name: '本日'
						},
						{
							value: 3000,
							name: '本年'
						}

					]
				}]
			})
			var myChart = echarts.init(document.getElementById('charts-3'));
			myChart.setOption({
				series: [{
					name: '访问来源',
					type: 'pie',
					color: ['#B23AEE', 'blue', 'red', 'yellow'],
					radius: '70%',
					itemStyle: {
						normal: {

							label: {
								show: true,
								formatter: '{b} : {c} ({d}%)'
							},
							labelLine: {
								show: true
							}
						}
					},
					data: [{
							value: 6965,
							name: '总数'
						},
						{
							value: 300,
							name: '本月'
						},
						{
							value: 100,
							name: '本日'
						},
						{
							value: 3000,
							name: '本年'
						}

					]
				}]
			})
		},
	}
</script>

<style>
	.el-row {
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
		background: #AEEEEE;
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

	body {
		margin: 0;
		padding: 0;
	}
</style>
