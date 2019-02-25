<template>
	<div id = 'subscribe'>
		<div id = "title">政策订阅</div>
		<el-form ref="form" :model="form" label-width="43%">
		
		  <el-form-item label="企业规模" prop="scale">
		    <el-select v-model="form.scale" placeholder="请选择企业规模">
		      <el-option label="" value=""></el-option>
		    </el-select>
		  </el-form-item>
			
			<el-form-item label="企业性质" prop="nature">
			  <el-select v-model="form.nature" placeholder="请选择企业性质">
			    <el-option label="" value=""></el-option>
			  </el-select>
			</el-form-item>
			
			<el-form-item label="从事行业" prop="industry">
			  <el-select v-model="form.industry" placeholder="请选择从事行业">
			    <el-option label="" value=""></el-option>
			  </el-select>
			</el-form-item>
			
			<el-form-item label="订阅类型" prop="type">
			  <el-select v-model="form.type" placeholder="请选择订阅类型">
			    <el-option label="" value=""></el-option>
			  </el-select>
			</el-form-item>
			
			<el-form-item label="订阅方式" prop="mode">
			  <el-select v-model="form.mode" placeholder="请选择订阅方式" @change="show">
			    <el-option label="邮箱" value="邮箱"></el-option>
					<el-option label="短信" value="短信"></el-option>
			  </el-select>
			</el-form-item>
			
			<el-form-item label="邮箱" v-if="showEmail" prop="email">
				<el-input v-model="form.email"  style="width:200px;"></el-input>
			</el-form-item>
			
			<el-form-item label="手机号" v-if="showTel" prop="tel">
				<el-input v-model="form.tel"  style="width:200px"></el-input>
			</el-form-item>
			
			<el-form-item label="验证码" v-if="showTel" prop="verificationCode">
				<el-input v-model="form.verificationCode"  style="width:200px"></el-input>
			</el-form-item>
					
			<el-form-item>
				<el-button type="primary" >确认</el-button>
				<el-button @click="resetForm('form')">重置</el-button>
			</el-form-item>
			
		</el-form>
	</div>
</template>

<script>
  export default {
    data() {
      return {
        form: {
					scale:'',
					nature:'',
					industry:'',
					type:'',
					mode:'',
					email:'',
					tel:'',
					verificationCode:'',
        },
				showEmail:false,
				showTel:false
      }
    },
    methods: {
			show(){
				if(event.target.innerText == "邮箱"){
						this.showEmail = true;
						this.showTel = false;
				}else{
						this.showEmail = false;
						this.showTel = true;
				}

			},
			resetForm(form) {
				this.showTel = false;
				this.showEmail = false;
				this.$refs[form].resetFields();
			}
    }
  }
</script>
<style scoped>
	#subscribe{
		width: 70%;
		height: 70%;
		background-color: white;
		margin-left: 15%;
		margin-top: 60px;
		padding-top: 10px;
	}
	#title{
		color: #606266;
		margin-left: 30px;
		font-size: 20px;
		font-weight:100;
	}
</style>