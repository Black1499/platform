<template>
	<div id="register" style="background-color: #00008B;" >
		<el-row>
			<el-col :span="12">
				<div style="text-align: center;">
					<img id="img-logo" src="../assets/uugai.com_1547534130625.png" />
				</div>
			</el-col>
			<el-col :span="12">
				<router-link id="link-return" :to="{path:'/home'}">返回登录</router-link>
			</el-col>
		</el-row>

		<el-main>
			<div id="content-register">
				<br />
				<h2 id="head2">
					<i class="el-icon-edit-outline"></i>
					<span id="span-message">填写注册信息</span>
					<span id="span-remark">（以下信息皆为必填项，请认真填写）</span>
				</h2>

				<br />

				<div style="width: 45%; text-align: center; margin: auto;">

					<el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

						<el-form-item label="企业注册号:" prop="number">
							<el-input v-model="ruleForm.number"></el-input>
						</el-form-item>

						<el-form-item label="企业名称:" prop="enterprise_name">
							<el-input v-model="ruleForm.enterprise_name"></el-input>
						</el-form-item>


						<el-form-item label="地址:" prop="address">
							<div style="margin-right: 11em;">
								<el-cascader :options="address_options" change-on-select v-model="selectedOptions3"></el-cascader>
							</div>
							<p> </p>
							<el-input v-model="ruleForm.address"></el-input>
						</el-form-item>

						<el-form-item label="法人:" prop="representative_people">
							<el-input v-model="ruleForm.representative_people"></el-input>
						</el-form-item>

						<el-form-item label="注册基金:" prop="registed_capital">
							<el-input v-model="ruleForm.registed_capital"></el-input>
						</el-form-item>

						<el-form-item label="联系方式:" prop="phone_number">
							<el-input v-model="ruleForm.phone_number"></el-input>
						</el-form-item>

						<el-form-item label="登记机关:" prop="registed_office">
							<el-input v-model="ruleForm.registed_office"></el-input>
						</el-form-item>


						<el-form-item label="注册时间:" prop="registed_time">
							<el-date-picker type="date" placeholder="选择日期" v-model="ruleForm.registed_time" style="width: 100%;"></el-date-picker>
						</el-form-item>

						<div style="margin-right: 11em;">
							<el-form-item label="登记状态" prop="registed_status">
								<el-select v-model="ruleForm.registed_status" clearable placeholder="请选择活动区域">
									<el-option label="存续" value="存续"></el-option>
									<el-option label="在业" value="在业"></el-option>
									<el-option label="吊销" value="吊销"></el-option>
									<el-option label="注销" value="注销"></el-option>
									<el-option label="迁入" value="迁入"></el-option>
									<el-option label="迁出" value="迁出"></el-option>
									<el-option label="停业" value="停业"></el-option>
									<el-option label="清算" value="清算"></el-option>
								</el-select>
							</el-form-item>
						</div>

						<el-form-item label="注册时间:" prop="founded_time">
							<el-date-picker type="date" placeholder="选择日期" v-model="ruleForm.founded_time" style="width: 100%;"></el-date-picker>
						</el-form-item>

						<el-form-item label="注册时间:" prop="approved_time">
							<el-date-picker type="date" placeholder="选择日期" v-model="ruleForm.approved_time" style="width: 100%;"></el-date-picker>
						</el-form-item>

						<el-form-item>
							<el-button id="submit_button" type="primary" @click="submitForm('ruleForm')">立即注册</el-button>
						</el-form-item>
						<br />
					</el-form>

				</div>

			</div>
			<div style="margin: auto; text-align: center; ">
				<p style="font-size:1px; line-height: 150%;color: #99A9BF;">
					主管单位：南方IT学院<br />

					地址：广东珠海斗门白蕉南路29号南方IT学院<br />

					联系电话：13825960681<br />

					E-MAIL：571588455@qq.com<br />

					技术支持：南方IT学院S3S147班<br />

					粤公网安备 44040202000805号 <br />
				</p>
			</div>
		</el-main>
	</div>

</template>


<script>
	export default {
		data() {
			return {
				registed_time: [{
					type: 'date',
					required: true,
					message: '请选择日期',
					trigger: 'change'
				}],

				ruleForm: {
					number: '',
					enterprise_name: '',
					address: '',
					representative_people: '',
					registed_capital: '',
					phone_number: '',
					registed_office: '',
					registed_time: '',
					registed_status: '',
					founded_time: '',
					approved_time: ''
				},
				address_options: [{
						value: 'guangdongsheng',
						label: '广东省',
						children: [{
							value: 'zhuhaishi',
							label: '珠海市',
							children: [{
								value: 'shizhishu',
								label: '市直属'
							}, {
								value: 'xiangzhouqu',
								label: '香洲区'
							}, {
								value: 'gaoxinqu',
								label: '高新区'
							}, {
								value: 'doumenqu',
								label: '斗门区'
							}, {
								value: 'jinwanqu',
								label: '金湾区'
							}, {
								value: 'wanshanqu',
								label: '万山区'
							}, {
								value: 'baoshuiqu',
								label: '保税区'
							}, {
								value: 'hengqinxinqu',
								label: '横琴新区'
							}, {
								value: 'gaolangangqu',
								label: '高栏港区'
							}]
						}]
					},

				],
				selectedOptions3: ['guangdongsheng', 'zhuhaishi', 'shizhishu'],

				rules: {
					number: [{
							required: true,
							message: '请输入企业注册号',
							trigger: 'blur'
						},
						{
							min: 9,
							max: 9,
							message: '请输入9位组织机构代码，统一社会信用代码输入第9-17位',
							trigger: 'blur'
						}
					],
					enterprise_name: [{
							required: true,
							message: '请输入企业名称',
							trigger: 'blur'
						},
						{
							min: 2,
							max: 16,
							message: '请输入2-16字的企业名称',
							trigger: 'blur'
						}
					],
					address: [{
						required: true,
						message: '请输入企业地址',
						trigger: 'blur'
					}, {
						min: 1,
						max: 20,
						message: '请输入1-20字的企业地址',
						trigger: 'blur'
					}],
					representative_people: [{
						required: true,
						message: '请输入法人名字',
						trigger: 'blur'
					}, {
						min: 1,
						max: 16,
						message: '法人名字不超过16位',
						trigger: 'blur'
					}],

					registed_capital: [{
						required: true,
						message: '请输入注册资金',
						trigger: 'blur'
					}, {
						max: 12,
						message: '注册资金不超过12位数',
						trigger: 'blur'
					}],

					phone_number: [{
							required: true,
							message: '请输入联系电话',
							trigger: 'blur'
						},
						{
							min: 5,
							max: 16,
							message: '联系号码不低于5位且不超过16位',
							trigger: 'blur'
						}
					],

					registed_office: [{
						required: true,
						message: '请输入企业登记机关',
						trigger: 'blur'
					}],
					registed_time: [{
						type: 'date',
						required: true,
						message: '请选择日期',
						trigger: 'change'
					}],
					registed_status: [{
						required: true,
						message: '请选择企业登记状态',
						trigger: 'change'
					}],
					founded_time: [{
						type: 'date',
						required: true,
						message: '请选择日期',
						trigger: 'change'
					}],
					approved_time: [{
						type: 'date',
						required: true,
						message: '请选择日期',
						trigger: 'change'
					}]
				}
			};
		},
		methods: {
			submitForm(formName) {
				this.$refs[formName].validate((valid) => {
					if (valid) {
						alert('submit!');
					} else {
						console.log('error submit!!');
						return false;
					}
				});
			}
		}
	}
</script>

<style scoped>
	.el-row {
		background-color: #00008B;
		color: #333;
		text-align: center;
		margin-bottom: 1em;
	}


	.el-main {
		background-color: whitesmoke;
		color: #333;
		text-align: center;
	}

	#img-logo {
		width: 65%;
		margin: 1em 0 0 3em;

	}

	#link-return {
		color: #FFFFFF;
		margin: 7em 0em 0em 34em;
		font-size: 0.8em;
		display: block;
		width: 10%;
	}

	#content-register {
		border-radius: 4px;
		min-height: 36px;
		background: #FFFFFF;
		width: 80%;
		margin: auto;
	}

	#head2 {
		width: 90%;
		margin: auto;
		border-bottom: 1px solid #99A9BF;
	}

	.el-icon-edit-outline {
		float: left;
		margin: 0.45em 0 0 0.3em;
		color: #409EFF;
	}

	#span-message {
		margin-right: 31em;
		color: #409EFF;
	}

	#span-remark {
		color: #99A9BF;
		font-size: 0.5em;
		margin-left: -19em;
	}
	
	#submit_button{
		margin-right: 7em;
	}
</style>
