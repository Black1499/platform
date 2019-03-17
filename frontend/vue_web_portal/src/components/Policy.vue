<template>
	<div id="policy">
		<el-row :gutter="20">
			<el-col :span="6" :offset="2">
				<div class="grid-content bg-purple">
					<el-row>
						<el-card :body-style="{ padding: '0px' }">
							<img src="../assets/Policy_3.jpg" class="image" height="200px">
							<div style="padding: 14px;">
								<span>最新政策</span>
								<el-button type="text" class="button">更多</el-button>
								<div class="bottom clearfix">
									<el-col :span="24" v-for="newPolicy in newPolicy" :key="newPolicy">
										<div class="grid-content bg-purple">
											<a style="color: black;" href="#">{{newPolicy.length>7?newPolicy.substring(0,14)+"...":newPolicy}}</a>
										</div>
									</el-col>
								</div>
							</div>
						</el-card>
					</el-row>
				</div>
			</el-col>
			<el-col :span="6" :offset="1">
				<div class="grid-content bg-purple">
					<el-row>
						<el-card :body-style="{ padding: '0px' }">
							<img src="../assets/Policy_2.jpg" class="image" height="200px">
							<div style="padding: 14px;">
								<span>解读政策</span>
								<el-button type="text" class="button">更多</el-button>

								<div class="bottom clearfix">
									<el-col :span="24" v-for="newPolicy in newPolicy" :key="newPolicy">
										<div class="grid-content bg-purple">
											<a style="color: black;" href="#">{{newPolicy.length>7?newPolicy.substring(0,14)+"...":newPolicy}}</a>
										</div>
									</el-col>
								</div>
							</div>
						</el-card>
					</el-row>
				</div>
			</el-col>
			<el-col :span="6" :offset="1">
				<div class="grid-content bg-purple">
					<el-row>
						<el-card :body-style="{ padding: '0px' }">
							<img src="../assets/Policy_1.jpg" class="image" height="200px">
							<div style="padding: 14px;">
								<span>申报政策</span>
								<el-button type="text" class="button">更多</el-button>

								<div class="bottom clearfix">
									<el-col :span="24" v-for="newPolicy in newPolicy" :key="newPolicy">
										<div class="grid-content bg-purple">
											<a style="color: black;" href="#">{{newPolicy.length>7?newPolicy.substring(0,14)+"...":newPolicy}}</a>
										</div>
									</el-col>
								</div>

							</div>
						</el-card>
					</el-row>
				</div>
			</el-col>

		</el-row>
		<el-row :gutter="20">
			<el-col :span="18" :offset="2">
				<div class="grid-content bg-purple">
					<el-tabs v-model="activeName2" type="card" @tab-click="handleClick">

						<el-tab-pane label="市级" name="first">
							<el-row :gutter="20">
								<el-col :span="12" v-for="x in p" :key="x">
									<div class="grid-content bg-purple">
										<a style="color: black;" href="#">{{x.length>7?x.substring(0,12)+"...":x}}</a>
										<b style="margin:0 30px ; font-size: 15px;">{{time}}</b>
									</div>
								</el-col>
							</el-row>
						</el-tab-pane>



						<el-tab-pane label="香洲" name="second">

						</el-tab-pane>



						<el-tab-pane label="斗门" name="third">

						</el-tab-pane>



						<el-tab-pane label="金湾" name="four">

						</el-tab-pane>


						<el-tab-pane label="横琴" name="five">

						</el-tab-pane>


						<el-tab-pane label="高新" name="six">

						</el-tab-pane>


						<el-tab-pane label="保税" name="seven">

						</el-tab-pane>


						<el-tab-pane label="万山" name="eight">

						</el-tab-pane>


					</el-tabs>
				</div>
			</el-col>
		</el-row>



	</div>
</template>

<script>
	export default {
		data() {
			return {
				activeName2: 'first',
				currentDate: new Date(),
				time: "2019-02-25",
				p: ["城企联动普惠养老专项行动",
					"关于促进中国（珠海）跨境电",
					"支持自由贸易试验区深化改",
					"关于香港特别行政区、澳门特",
					"地方党政领导干部食品安全",
					"关于促进小农户和现代农业"
				],

				newPolicy: ["城企联动普惠养老专项行动实施方案（试行）",
					"支持自由贸易试验区深化改革创新若干措施分工方案",
					"地方党政领导干部食品安全责任制规定",
					"省直机关政府购买服务信息公开管理暂行办法"
				]
			};
		},
		methods: {
			handleClick(tab, event) {
				console.log(tab, event);
			}
		}
	};
</script>

<style scoped>
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
		background: white;
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

	.time {
		font-size: 13px;
		color: #999;
	}

	.bottom {
		margin-top: 13px;
		line-height: 12px;
	}

	.button {
		padding: 0;
		float: right;
	}

	.image {
		width: 100%;
		display: block;
	}

	.clearfix:before,
	.clearfix:after {
		display: table;
		content: "";
	}

	.clearfix:after {
		clear: both
	}
</style>
