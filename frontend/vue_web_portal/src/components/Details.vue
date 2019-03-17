<template>
	<div class="details">
		<el-row>
			<el-col :span="24">
				<div class="grid-content bg-purple-dark">
					<el-breadcrumb separator-class="el-icon-arrow-right">
						<el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
						<el-breadcrumb-item :to="{ path: '/' }">申报政策</el-breadcrumb-item>
						<el-breadcrumb-item >政策详情</el-breadcrumb-item>
					</el-breadcrumb>
				</div></el-col>
		</el-row>
		<div style="border: 1px solid gray; width: 1030px; height: 1030px; margin-top: 1%; margin-left: 12%; ">
			<div style="border: 1px solid gray; height: 50%; width: 85%; margin-left: 7%; margin-top: 4%;background-color: #C5C5C5;">
				<h3 style="text-align: center;">关于珠海政企云发布做了相关调整</h3>
				<p>
					<span>实施主体：</span>
				</p>
				<p>
					<span>发布日期：<code>2018-12-03</code></span>
					<span style="margin-left: 20%;">截止日期：<code>2018-12-03</code></span>
				</p>
				<p>
					<span>关键字：</span>
				</p>
				<div class="policy-txt clear">
						<el-button type="primary">政策依据</el-button><a href="">根据财政部、国家税务总局、商务部、科技部、国家发展改革委《关于将技术先进型服务企业所得税政策推广至全国实施的通知》（财税〔2017〕79号）及财政部、国家税务总局、商务部、科技部、国家发展改革委《关于将服务贸易创新发展试点地区技术先进型服务企业所得税政策推广至全国实施的通知》（财税〔2018〕44号）的有关要求</a>
				</div>
				<div class="policy-txt clear" style="margin-top: 20px;">
					 <el-button type="primary">政策源</el-button><a href="">根据财政部、国家税务总局、商务部、科技部、国家发展改革委《关于将技术先进型服务企业所得税政策推广至全国实施的通知》（财税〔2017〕79号）及财政部、国家税务总局、商务部、科技部、国家发展改革委《关于将服务贸易创新发展试点地区技术先进型服务企业所得税政策推广至全国实施的通知》（财税〔2018〕44号）的有关要求</a>
				</div>
			</div>
			<div style="margin-left: 7%;">
				<el-tabs v-model="activeName" @tab-click="handleClick">
					<el-tab-pane label="政策明细" name="first">政策明细</el-tab-pane>
					<el-tab-pane label="申报卡" name="second">申报卡</el-tab-pane>
					<el-tab-pane label="政策解读" name="third">政策解读</el-tab-pane>
					<el-tab-pane label="政策评议" name="fourth">政策评议</el-tab-pane>
				</el-tabs>
			</div>	
			
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
   #zxd_x{width:20px; height:20px;text-align:center;font-size:16px;color:red;position:absolute;right:0px; top:0px;cursor:pointer;}
</style>
