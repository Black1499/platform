<template>
	<!-- 登录页面 -->
	<!-- 整个登陆页面的div -->
	<div id="login" style=" background-color: cornsilk;">
		<!-- logo框 -->
		<div style=" background-color:lightcyan ;">
			<!-- honeydew -->
			<div style="width: 40%; background-color: lightcyan; background-image: url(../assets/uugai.com_1547534130625.png);">
				<img src="../assets/uugai.com_1547534130625.png" style="margin:0% 30% ; width: 90%; vertical-align: ;" />
			</div>
		</div>

		<!-- 链接框 -->
		<div style="background-color: lightcyan; text-align: right; height: 1%;">
			<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"> -->
			<router-link :to="{name:'notice'}" style="margin:20%; width: 40%; font-size:1em;">返回登录</router-link>
			<!-- <a style="margin:20%; width: 40%; font-size:1em;" href="../views/Home.vue">返回登录</a> -->
		</div>

		<!-- 内容框 -->
		<div style="margin: auto; width: 65%;height: 80%; background-color: #F9FAFC;">
			<div style="width: 90%;margin: auto;">
				<div>
					<br />
					<h2 style="color: #409EFF;">
						填写注册信息
					</h2>
				</div>

				<div style="text-align: right; margin-right: 5%; font-size: 0.8em; color: #99A9BF;">
					<span>（以下信息皆为必填项，请认真填写）</span>
				</div>
				<span style="text-align: center; color: #C5C5C5;">————————————————————————————————————————————————</span>
				<br />

				<br />
				<div style="text-align: center;">
					<div style="width: 80%;margin: auto;">
						<span>企业注册号：</span>
						<div style="display:inline-block; width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%;margin: auto;">
						<span>企业名称：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span>企业地址：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span>企业法人：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span>注册基金：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span>联系方式：</span>
						<div style="display:inline-block; width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>


				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span>登记机关：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span>注册时间：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center; ">
					<div style="width: 80%;margin: auto;">
						<span>登记状态：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span>成立时间：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />

				<div style="text-align: center;">
					<div style="width: 80%; margin: auto;">
						<span> 核准日期：</span>
						<div style="display:inline-block;width: 60%;">
							<el-input placeholder="请输入内容" clearable>
							</el-input>
						</div>
					</div>
				</div>

				<br />
				<div style="text-align: center;">
					<div style=" margin: auto; font-size: 1em;">
						<el-button type="warning" size="medium"><span>&nbsp;立即注册&nbsp;</span></el-button>
					</div>
				</div>
				<br />
			</div>
		</div>
		<br />
		<div style="margin: auto; text-align: center;">
			<span>
				主管单位：南方IT学院<br />

				地址：广东珠海斗门白蕉南路29号南方IT学院<br />

				联系电话：13825960681<br />
				
				E-MAIL：571588455@qq.com<br />

				技术支持：南方IT学院S3S147班<br />

				粤公网安备 44040202000805号 <br />
			</span>
		</div>
		<br />
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

</style>
