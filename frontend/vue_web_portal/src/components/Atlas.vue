<template>
	<!-- 申报政策页面 -->
	<div id="atlas">
		<el-row :gutter="20">
					<el-col :span="15">
						<div class="grid-content bg-purple">
							<el-row>
								<span style="float: left;margin-left: 20px;font-size: 15px; margin-top: 180px;"><b>申报政策</b></span>
								<a href="" style="float:right;font-size: 14px; margin-top: 180px;">更多
									<i class="el-icon-d-arrow-right"></i></a>
								<ul style="margin-top: 210px;">
									<li style="list-style-type: none;">
										<a href="">aaaaaaaaaaaaa</a>
									</li>
									<li style="list-style-type: none;">
										<a href="">bbbbbbbbbbbbb</a>
									</li>
									<li style="list-style-type: none;">
										<a href="">ccccccccccccc</a>
									</li>
									<li style="list-style-type: none;">
										<a href="">ddddddddddddd</a>
									</li>
								</ul>
							</el-row>
						</div>
					</el-col>
				</el-row>
		
		
				<el-row :gutter="15">
					<el-col :span="15">
						<div class="aaa">
							<el-row>
								<span style="float: left;margin-left: 20px;font-size: 15px; margin-top: 150px;"><b>订阅政策</b></span>
								<ul style="margin-top: 210px; margin-right: 210px; font-size: 15px;">
									<i class="el-icon-edit-outline">发布</i>
									<p style="font-size: 10px;margin-top: -15px;">总数：</p>
									<i class="el-icon-rank" style="position: absolute;left: 40px;top: 270px;">推送</i>
									<p style="font-size: 10px;margin-top: -10px;">总数：</p>
									<i class="el-icon-location" style="position: absolute;left: 40px;top: 310px;">订阅</i>
									<p style="font-size: 10px;margin-top: -10px;">总数：</p>
								</ul>
							</el-row>
						</div>
					</el-col>
				</el-row>
		
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
	.el-col {
			border-radius: 5px;
		}
	
		.bg-purple-dark {
			background: ;
		}
	
		.bg-purple {
			background: ;
		}
	
		.bg-purple-light {
			background: ;
		}
	
		.grid-content {
			border-radius: 4px;
			min-height: 36px;
			height: 400px;
			width: 500px;
			text-align-last: center;
			margin-left: 100px;
		}
	
		.row-bg {
			padding: 10px 0;
			background-color: ;
		}
	
		.aaa {
			border-radius: 4px;
			min-height: 36px;
			height: 400px;
			width: 300px;
			text-align-last: center;
			border: 1px solid;
			position: absolute;
			left: 800px;
			top: -419px;
		}

</style>
