<template>
	
	<!-- 二级页面的汇总 -->
	<div class="home">
		<el-container>
			<el-header>
				<!-- 头部 -->
				<el-row>
					<el-col :span="8">
						<div class="grid-content bg-purple-light" style="background-color: white;">
							<img src="../assets/uugai.com_1547534130625.png" width="50%" style="margin:0px 20% 0px;	" />
						</div>
					</el-col>
					<el-col :span="5">
						<div class="grid-content bg-purple-light" style="background-color: white;"></div>
					</el-col>
					<el-col :span="11">
						<div class="grid-content bg-purple-light" style="background-color: white;">
							<el-input placeholder="请输入内容" v-model="input" class="searchClass" style="width:50%; margin: 0px 10% 0px 0px;">
								<template slot="append">
									<el-button slot="append" icon="el-icon-search"></el-button>
								</template>
							</el-input>
							<!-- <router-link :to="{name:'login'}">登录/</router-link> -->
							
							<a class="aLoign" @click="dialogFormVisible = true">登录</a> /
							<el-dialog title="用户登录" style="line-height: 10px;" :visible.sync="dialogFormVisible" width="40%" customClass="customheight">
								<hr style="margin-top: -2em;" />
								<el-form :model="form" class="sss">
									<div style="margin-right:3em;">
										<el-form-item label="用户名:" :label-width="formLabelWidth">
											<el-input v-model="form.name" autocomplete="off" placeholder="请输入用户名"></el-input>
										</el-form-item>
										<el-form-item label="密码:" :label-width="formLabelWidth">
											<el-input v-model="form.password" autocomplete="off" placeholder="请输入密码"></el-input>
											</el-select>
										</el-form-item>
									</div>

								</el-form>
								<div slot="footer" class="dialog-footer" style="text-align: center;">
									<el-button type="primary" @click="dialogFormVisible = false">立 即 登 录</el-button>
								</div>
							</el-dialog>
							
							<router-link :to="{name:'register'}">注册</router-link>

						</div>
					</el-col>
				</el-row>
			</el-header>
			<!-- 导航 -->
			<NavMenu></NavMenu>

			<el-main>
				<!-- 各个页面 -->
				<router-view />
			</el-main>
		</el-container>
	</div>
</template>

<script>
	import NavMenu from '../components/NavMenu.vue'
	export default {
		name: 'home',
		data() {
			return {
				dialogFormVisible: false,
				form: {
					name: '',
					region: '',
					date1: '',
					date2: '',
					delivery: false,
					type: [],
					resource: '',
					desc: ''
				},
				formLabelWidth: '120px'
			};
		},
		components: {
			NavMenu: NavMenu
		},
	}
</script>
<style>
	a {
		text-decoration: none
	}
	
	.aLoign{
		cursor: pointer;
	}
	.aLoign:active{
		color: red; 
	}

	.searchClass {
		margin-top: 15px;
		border: 1px solid #c5c5c5;
		border-radius: 20px;
	}


	.searchClass .el-input-group__append {
		border: none;
		background-color: transparent;
	}

	.searchClass .el-input__inner {
		height: 36px;
		line-height: 36px;
		border: none;
		background-color: transparent;
	}

	.searchClass .el-icon-search {
		font-size: 16px;
	}

	.searchClass .centerClass {
		height: 100%;
		line-height: 100%;
		display: inline-block;
		vertical-align: middle;
		text-align: right;
	}

	.searchClass .line {
		width: 1px;
		height: 26px;
		background-color: #c5c5c5;
		margin-left: 14px;
	}

	.searchClass:hover {
		border: 1px solid #D5E3E8;
		background: #fff;
	}

	.searchClass:hover .el-icon-search {
		color: #409eff;
		font-size: 16px;
	}

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

	.el-carousel__item h3 {
		color: #475669;
		font-size: 18px;
		opacity: 0.75;
		line-height: 300px;
		margin: 0;
	}

	.el-carousel__item:nth-child(2n) {
		background-color: #99a9bf;
	}

	.el-carousel__item:nth-child(2n+1) {
		background-color: #d3dce6;
	}
</style>
