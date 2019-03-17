<template>
	<div id="declare" >
		<!--数据统计框-->
		<el-row :gutter="20">
			<el-col :span="10" :offset="2">
			<div class="grid-content bg-purple"  style=" height: 350px;">
			
				<div align="center"> 
					<div slot="header" class="clearfix">
						<b align="center">数据统计</b>
					</div>
					<br />
					<div class="text item">
						<i  class="el-icon-edit">发布</i>
						{{"总数：1912     本月：11   今日：2"}}
					</div>
					
					<div class="text item">
						<i  class="el-icon-bell">订阅</i>
						{{"总数：6965     本月：29   今日：6"}}
					</div>
					
					<div class="text item">
						<i  class="el-icon-share">精准送</i>    
						{{"总数：506580   本月：863   今日：0"}}
					</div>					
				</div>
			</div>
						
			</el-col>
			<el-col :span="10" >
				<div style="height: 350px;" class="grid-content bg-purple" >		
							<div id="charts-1" style="width:550px;height:300px;"></div>							
				</div>
			</el-col>	  
		</el-row>
		
		<!--echarts饼图-->
		<el-row :gutter="20">
			<el-col :span="10" :offset="2"  >
				<div class="grid-content bg-purple"  style=" height: 350px;">
						<div id="charts-2" style="width:550px;height:300px;"></div>			
				</div>
			</el-col>
			
			<el-col :span="10"  >
				<div class="grid-content bg-purple"  style=" height: 350px;">
						<div id="charts-3" style="width:550px;height:300px;"></div>	
				</div>
			</el-col>
		</el-row>	
		
		<el-row :gutter="20">
			<el-col :span="20" :offset="2"  >
				<div class="grid-content bg-purple" style="height: 400px;"  >
					<b align="center">企业活跃度排行榜</b>
					<div id="charts-4" style="width:100%; height: 350px;"></div>
				</div>
			</el-col>
		</el-row >	
	</div>	
</template>

<script>
	var echarts = require('echarts');
		export default {
		
	    mounted() {
	        /*ECharts图表*/
	        var myChart = echarts.init(document.getElementById('charts-2'));
	        myChart.setOption({
	            title : {
										text: '政策订阅',
										subtext: '订阅数量图',
										x:'center'
								},
								tooltip : {
										trigger: 'item',
										formatter: "{a} <br/>{b} : {c} ({d}%)"
								},
								legend: {
										orient: 'vertical',
										left: 'left',
										data: ['总数','本年','本月','本日']
								},
								series : [
										{
												name: '访问来源',
												type: 'pie',
												radius : '60%',
												center: ['50%', '60%'],
												data:[
														{value:335, name:'总数'},
														{value:310, name:'本年'},
														{value:234, name:'本月'},
														{value:135, name:'本日'},
												],
												itemStyle: {
														emphasis: {
																shadowBlur: 10,
																shadowOffsetX: 0,
																shadowColor: 'rgba(0, 0, 0, 0.5)'
														}
												}
										}
									]
							})
												
								/*ECharts图表*/
								var myChart = echarts.init(document.getElementById('charts-1'));
								myChart.setOption({
									title : {
												text: '政策分类',
												subtext: '分类数量图',
												x:'center'
										},
										tooltip : {
												trigger: 'item',
												formatter: "{a} <br/>{b} : {c} ({d}%)"
										},
										legend: {
												orient: 'vertical',
												left: 'left',
												data: ['国级政策','省级政策','市级政策','县级政策','镇级政策','企业政策']
										},
										series : [
												{
														name: '访问来源',
														type: 'pie',
														radius : '60%',
														center: ['50%', '60%'],
														data:[
																{value:335, name:'国级政策'},
																{value:310, name:'省级政策'},
																{value:234, name:'市级政策'},
																{value:135, name:'县级政策'},
																{value:110, name:'镇级政策'},
																{value:200, name:'企业政策'}	
														],
														itemStyle: {
																emphasis: {
																		shadowBlur: 10,
																		shadowOffsetX: 0,
																		shadowColor: 'rgba(0, 0, 0, 0.5)'
																}
														}
												}
											]
								})
						
							var myChart = echarts.init(document.getElementById('charts-3'));
							myChart.setOption({
								title : {
											text: '申诉分类',
											subtext: '申诉数量图',
											x:'center'
									},
									tooltip : {
											trigger: 'item',
											formatter: "{a} <br/>{b} : {c} ({d}%)"
									},
									legend: {
											orient: 'vertical',
											left: 'left',
											data: ['总数','本年','本月','本日']
									},
									series : [
											{
													name: '访问来源',
													type: 'pie',
													radius : '60%',
													center: ['50%', '60%'],
													data:[
															{value:335, name:'总数'},
															{value:310, name:'本年'},
															{value:234, name:'本月'},
															{value:135, name:'本日'},
													],
													itemStyle: {
															emphasis: {
																	shadowBlur: 10,
																	shadowOffsetX: 0,
																	shadowColor: 'rgba(0, 0, 0, 0.5)'
															}
													}
											}
										]
									})
									
									var myChart = echarts.init(document.getElementById('charts-4'));
									myChart.setOption({
										 color: ['red'],
										tooltip : {
												trigger: 'axis',
												axisPointer : {            // 坐标轴指示器，坐标轴触发有效
														type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
												}
										},
										grid: {
												left: '3%',
												right: '4%',
												bottom: '3%',
												containLabel: true
										},
										xAxis : [
												{
														type : 'category',
														data : ['广州xx公司', '珠海xx公司', '深圳xx公司', '中山xx公司', '佛山xx公司', '澳门xx公司', '香港xx公司'],
														axisTick: {
																alignWithLabel: true
														}
												}
										],
										yAxis : [
												{
														type : 'value'
												}
										],
										series : [
												{
														name:'活跃度',
														type:'bar',
														barWidth: '60%',
														data:[500, 262, 200, 334, 390, 330, 220]
												}
										]
									})
									
							},
						}
					
</script>

<style  scoped>

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
    background:#AEEEEE;
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

	body{
		margin:0;
		padding: 0;
	}

</style>
