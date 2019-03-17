<template>
	<div>
		<Button @click="modal10 = true">用户添加</Button>
		<br><br>
		<Modal title="用户" v-model="modal10" class-name="vertical-center-modal">
			<Form :model="formLeft" label-position="left" :label-width="50">
				<FormItem label="账号">
					<Input v-model="formLeft.input1"></Input>
				</FormItem>
				<FormItem label="密码">
					<Input v-model="formLeft.input2"></Input>
				</FormItem>
				<FormItem label="联系人">
					<Input v-model="formLeft.input3"></Input>
				</FormItem>
				<FormItem label="邮箱" prop="mail">
					<Input v-model="formLeft.mail" placeholder="Enter your e-mail"></Input>
				</FormItem>
				<FormItem label="手机" prop="phone">
					<Input v-model="formLeft.mail" placeholder="手机号码"></Input>
				</FormItem>
			</Form>
		</Modal>

		<Table border :columns="columns12" :data="data6">
			<template slot-scope="{ row }" slot="name">
				<strong>{{ row.name }}</strong>
			</template>
			<template slot-scope="{ row, index }" slot="action">
				<Button type="primary" size="small" style="margin-right: 5px" @click="show(index)">View</Button>
				<Button type="error" size="small" @click="remove(index)">Delete</Button>
			</template>
		</Table>
	</div>
</template>
<script>
	export default {
		name: 'user_management',
		data() {
			return {
				modal9: false,
				modal10: false,
				formLeft: {
					input1: '',
					input2: '',
					input3: '',
					mail: ''
				},
				columns12: [{
						title: 'Name',
						slot: 'name'
					},
					{
						title: 'Age',
						key: 'age'
					},
					{
						title: 'Address',
						key: 'address'
					},
					{
						title: 'Action',
						slot: 'action',
						width: 150,
						align: 'center'
					}
				],
				data6: [{
						name: 'John Brown',
						age: 18,
						address: 'New York No. 1 Lake Park'
					},
					{
						name: 'Jim Green',
						age: 24,
						address: 'London No. 1 Lake Park'
					},
					{
						name: 'Joe Black',
						age: 30,
						address: 'Sydney No. 1 Lake Park'
					},
					{
						name: 'Jon Snow',
						age: 26,
						address: 'Ottawa No. 2 Lake Park'
					}
				]
			}
		},
		methods: {
			show(index) {
				this.$Modal.info({
					title: 'User Info',
					content: `Name：${this.data6[index].name}<br>Age：${this.data6[index].age}<br>Address：${this.data6[index].address}`
				})
			},
			remove(index) {
				this.data6.splice(index, 1);
			}
		}
	}
</script>
<style lang="less">
	.vertical-center-modal {
		display: flex;
		align-items: center;
		justify-content: center;

		.ivu-modal {
			top: 0;
		}
	}
</style>
