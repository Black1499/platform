<template>
	<!-- 整个登陆页面的div -->
	<div id="login">
		<el-button type="text" @click="dialogFormVisible = true">点击登录</el-button>

		<el-dialog title="用户登录" :visible.sync="dialogFormVisible" width="40%" customClass="customheight" >
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

	</div>

</template>




<script>
	export default {
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
		}
	};
</script>



 <style>
       .customheight{
        height:50%;
    }
		
		.sss{
			margin-bottom: -2em;
			margin-top: 3em;
		}
      </style>