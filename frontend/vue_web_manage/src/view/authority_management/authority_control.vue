<template>
	<div>
		<Button type="primary" @click="modal1 = true">添加权限</Button>
		<br>
		<br>
		<Modal v-model="modal1" title="选择权限" @on-ok="ok" @on-cancel="cancel" width="550px">
			<Form :model="formRight" label-position="right" :label-width="80">
				<FormItem label="角色名称">
					<Input v-model="formRight.input1"></Input>
				</FormItem>
			</Form>

			<Form :model="formTop" label-position="top" :label-width="70">
				<FormItem label="权限控制">
					<CheckboxGroup v-model="checkAllGroup" @on-change="checkAllGroupChange">
						<Tag color="success" :indeterminate="indeterminate" :value="checkAll" @click.prevent.native="handleCheckAll">政策管理</Tag>&emsp;
						<Checkbox label="采集"></Checkbox>&emsp;
						<Checkbox label="编写"></Checkbox>&emsp;
						<Checkbox label="核实"></Checkbox>&emsp;
						<Checkbox label="发送"></Checkbox>&emsp;
						<Checkbox label="推送"></Checkbox>
					</CheckboxGroup>

					<CheckboxGroup v-model="checkAllGroup2" @on-change="checkAllGroupChange2">
						<Tag color="success" :indeterminate="indeterminate2" :value="checkAll" @click.prevent.native="handleCheckAll2">公告管理</Tag>&emsp;
						<Checkbox label="采集"></Checkbox>&emsp;
						<Checkbox label="编写"></Checkbox>&emsp;
						<Checkbox label="核实"></Checkbox>&emsp;
						<Checkbox label="发送"></Checkbox>
					</CheckboxGroup>

					<CheckboxGroup v-model="checkAllGroup3" @on-change="checkAllGroupChange3">
						<Tag color="success" :indeterminate="indeterminate3" :value="checkAll" @click.prevent.native="handleCheckAll3">申报政策</Tag>&emsp;
						<Checkbox label="采集"></Checkbox>&emsp;
						<Checkbox label="编写"></Checkbox>&emsp;
						<Checkbox label="核实"></Checkbox>&emsp;
						<Checkbox label="发送"></Checkbox>
					</CheckboxGroup>

					<CheckboxGroup v-model="checkAllGroup4" @on-change="checkAllGroupChange4">
						<Tag color="success" :indeterminate="indeterminate4" :value="checkAll" @click.prevent.native="handleCheckAll4">政策解读</Tag>&emsp;
						<Checkbox label="采集"></Checkbox>&emsp;
						<Checkbox label="编写"></Checkbox>&emsp;
						<Checkbox label="核实"></Checkbox>&emsp;
						<Checkbox label="发送"></Checkbox>
					</CheckboxGroup>

					<CheckboxGroup v-model="checkAllGroup5" @on-change="checkAllGroupChange5">
						<Tag color="success" :indeterminate="indeterminate5" :value="checkAll" @click.prevent.native="handleCheckAll5">日志管理</Tag>&emsp;
						<Checkbox label="查看"></Checkbox>
					</CheckboxGroup>

					<CheckboxGroup v-model="checkAllGroup6" @on-change="checkAllGroupChange6">
						<Tag color="success" :indeterminate="indeterminate6" :value="checkAll" @click.prevent.native="handleCheckAll6">用户管理</Tag>&emsp;
						<Checkbox label="查看"></Checkbox>&emsp;
						<Checkbox label="增加"></Checkbox>&emsp;
						<Checkbox label="修改"></Checkbox>&emsp;
						<Checkbox label="删除"></Checkbox>
					</CheckboxGroup>

					<CheckboxGroup v-model="checkAllGroup7" @on-change="checkAllGroupChange7">
						<Tag color="success" :indeterminate="indeterminate7" :value="checkAll" @click.prevent.native="handleCheckAll7">共性数据</Tag>&emsp;
						<Checkbox label="查看"></Checkbox>&emsp;
						<Checkbox label="增加"></Checkbox>&emsp;
						<Checkbox label="修改"></Checkbox>&emsp;
						<Checkbox label="删除"></Checkbox>
					</CheckboxGroup>
				</FormItem>
			</Form>
		</Modal>
		<!-- 数据表格 -->

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
		name: 'authority_control',
		data() {
			return {
				formRight: {
					input1: ''
				},
				modal1: false,
				indeterminate: true,
				checkAll: false,
				//表格数据
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
			ok() {
				this.$Message.info('已提交');
			},
			cancel() {
				this.$Message.info('已取消');
			},
			//表格中的按钮
			show(index) {
				this.$Modal.info({
					title: 'User Info',
					content: `Name：${this.data6[index].name}<br>Age：${this.data6[index].age}<br>Address：${this.data6[index].address}`
				})
			},
			remove(index) {
				this.data6.splice(index, 1);
			},
			//多选按钮
			handleCheckAll() {
				if (this.indeterminate) {
					this.checkAll = false;
				} else {
					this.checkAll = !this.checkAll;
				}
				this.indeterminate = false;

				if (this.checkAll) {
					this.checkAllGroup = ['采集', '编写', '核实', '发送', '推送'];
				} else {
					this.checkAllGroup = [];
				}
			},
			checkAllGroupChange(data) {
				if (data.length === 3) {
					this.indeterminate = false;
					this.checkAll = true;
				} else if (data.length > 0) {
					this.indeterminate = true;
					this.checkAll = false;
				} else {
					this.indeterminate = false;
					this.checkAll = false;
				}
			},
			handleCheckAll2() {
				if (this.indeterminate2) {
					this.checkAll = false;
				} else {
					this.checkAll = !this.checkAll;
				}
				this.indeterminate2 = false;

				if (this.checkAll) {
					this.checkAllGroup2 = ['采集', '编写', '核实', '发送', '推送'];
				} else {
					this.checkAllGroup2 = [];
				}
			},
			checkAllGroupChange2(data) {
				if (data.length === 3) {
					this.indeterminate2 = false;
					this.checkAll = true;
				} else if (data.length > 0) {
					this.indeterminate2 = true;
					this.checkAll = false;
				} else {
					this.indeterminate2 = false;
					this.checkAll = false;
				}
			},
			handleCheckAll3() {
				if (this.indeterminate3) {
					this.checkAll = false;
				} else {
					this.checkAll = !this.checkAll;
				}
				this.indeterminate3 = false;

				if (this.checkAll) {
					this.checkAllGroup3 = ['采集', '编写', '核实', '发送'];
				} else {
					this.checkAllGroup3 = [];
				}
			},
			checkAllGroupChange3(data) {
				if (data.length === 3) {
					this.indeterminate3 = false;
					this.checkAll = true;
				} else if (data.length > 0) {
					this.indeterminate3 = true;
					this.checkAll = false;
				} else {
					this.indeterminate3 = false;
					this.checkAll = false;
				}
			},
			handleCheckAll4() {
				if (this.indeterminate4) {
					this.checkAll = false;
				} else {
					this.checkAll = !this.checkAll;
				}
				this.indeterminate4 = false;

				if (this.checkAll) {
					this.checkAllGroup4 = ['采集', '编写', '核实', '发送'];
				} else {
					this.checkAllGroup4 = [];
				}
			},
			checkAllGroupChange4(data) {
				if (data.length === 3) {
					this.indeterminate4 = false;
					this.checkAll = true;
				} else if (data.length > 0) {
					this.indeterminate4 = true;
					this.checkAll = false;
				} else {
					this.indeterminate4 = false;
					this.checkAll = false;
				}
			},
			handleCheckAll5() {
				if (this.indeterminate5) {
					this.checkAll = false;
				} else {
					this.checkAll = !this.checkAll;
				}
				this.indeterminate5 = false;

				if (this.checkAll) {
					this.checkAllGroup5 = ['查看'];
				} else {
					this.checkAllGroup5 = [];
				}
			},
			checkAllGroupChange5(data) {
				if (data.length === 3) {
					this.indeterminate5 = false;
					this.checkAll = true;
				} else if (data.length > 0) {
					this.indeterminate5 = true;
					this.checkAll = false;
				} else {
					this.indeterminate5 = false;
					this.checkAll = false;
				}
			},
			handleCheckAll6() {
				if (this.indeterminate6) {
					this.checkAll = false;
				} else {
					this.checkAll = !this.checkAll;
				}
				this.indeterminate6 = false;

				if (this.checkAll) {
					this.checkAllGroup6 = ['查看', '增加', '修改', '删除'];
				} else {
					this.checkAllGroup6 = [];
				}
			},
			checkAllGroupChange6(data) {
				if (data.length === 3) {
					this.indeterminate6 = false;
					this.checkAll = true;
				} else if (data.length > 0) {
					this.indeterminate6 = true;
					this.checkAll = false;
				} else {
					this.indeterminate6 = false;
					this.checkAll = false;
				}
			},
			handleCheckAll7() {
				if (this.indeterminate7) {
					this.checkAll = false;
				} else {
					this.checkAll = !this.checkAll;
				}
				this.indeterminate7 = false;

				if (this.checkAll) {
					this.checkAllGroup7 = ['查看', '增加', '修改', '删除'];
				} else {
					this.checkAllGroup7 = [];
				}
			},
			checkAllGroupChange7(data) {
				if (data.length === 3) {
					this.indeterminate7 = false;
					this.checkAll = true;
				} else if (data.length > 0) {
					this.indeterminate7 = true;
					this.checkAll = false;
				} else {
					this.indeterminate7 = false;
					this.checkAll = false;
				}
			}
		}
	}
</script>
