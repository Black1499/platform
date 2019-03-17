<template>
	<!-- 申报政策页面 -->
	<div id="atlas">
		<el-row :gutter="20">
					<el-col :span="15">
						<div class="grid-content bg-purple">
							<el-row>
								<img src="../assets/Policy_1.jpg" class="image" style="width: 500px; height: 180px;">
								<span style="float: left;margin-left: 20px;font-size: 15px;"><b>申报政策</b></span>
								<a href="" style="float:right;font-size: 14px;">更多
									<i class="el-icon-d-arrow-right"></i></a>
								<ul style="margin-top: ;">
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
		
		
				<!-- <el-row :gutter="15">
					<el-col :span="15">
						<div class="aaa" style="background-color: #D3DCE6">
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
				</el-row> -->
				
				<div class="block">
					<label>选择政策类型：</label>
					  <el-cascader
						:options="options"
						v-model="selectedOptions"
						@change="handleChange">
					  </el-cascader>
				</div>
				
				<el-table
					  :data="tableData"
					  style="width: 50% ;position: absolute;left: 50%; top: 30%;">
					  <el-table-column
						prop="date"
						label="序号"
						width="180">
					  </el-table-column>
					  <el-table-column
						prop="name"
						label="标题"
						width="180">
					  </el-table-column>
					  <el-table-column
						prop="address"
						label="发文日期">
					  </el-table-column>
					  <el-table-column
					  prop="state"
					  label="状态">
					  </el-table-column>
				</el-table>
		
	</div>
</template>

<script>
	 export default {
    data() {
      return {
        options: [{
          value: 'zhinan',
          label: '指南',
          children: [{
            value: 'shejiyuanze',
            label: '设计原则',
            children: [{
              value: 'yizhi',
              label: '一致'
            }, {
              value: 'fankui',
              label: '反馈'
            }, {
              value: 'xiaolv',
              label: '效率'
            }, {
              value: 'kekong',
              label: '可控'
            }]
          }, {
            value: 'daohang',
            label: '导航',
            children: [{
              value: 'cexiangdaohang',
              label: '侧向导航'
            }, {
              value: 'dingbudaohang',
              label: '顶部导航'
            }]
          }]
        }, {
          value: 'zujian',
          label: '组件',
          children: [{
            value: 'basic',
            label: 'Basic',
            children: [{
              value: 'layout',
              label: 'Layout 布局'
            }, {
              value: 'color',
              label: 'Color 色彩'
            }, {
              value: 'typography',
              label: 'Typography 字体'
            }, {
              value: 'icon',
              label: 'Icon 图标'
            }, {
              value: 'button',
              label: 'Button 按钮'
            }]
          }, {
            value: 'form',
            label: 'Form',
            children: [{
              value: 'radio',
              label: 'Radio 单选框'
            }, {
              value: 'checkbox',
              label: 'Checkbox 多选框'
            }, {
              value: 'input',
              label: 'Input 输入框'
            }, {
              value: 'input-number',
              label: 'InputNumber 计数器'
            }, {
              value: 'select',
              label: 'Select 选择器'
            }, {
              value: 'cascader',
              label: 'Cascader 级联选择器'
            }, {
              value: 'switch',
              label: 'Switch 开关'
            }, {
              value: 'slider',
              label: 'Slider 滑块'
            }, {
              value: 'time-picker',
              label: 'TimePicker 时间选择器'
            }, {
              value: 'date-picker',
              label: 'DatePicker 日期选择器'
            }, {
              value: 'datetime-picker',
              label: 'DateTimePicker 日期时间选择器'
            }, {
              value: 'upload',
              label: 'Upload 上传'
            }, {
              value: 'rate',
              label: 'Rate 评分'
            }, {
              value: 'form',
              label: 'Form 表单'
            }]
          }, {
            value: 'data',
            label: 'Data',
            children: [{
              value: 'table',
              label: 'Table 表格'
            }, {
              value: 'tag',
              label: 'Tag 标签'
            }, {
              value: 'progress',
              label: 'Progress 进度条'
            }, {
              value: 'tree',
              label: 'Tree 树形控件'
            }, {
              value: 'pagination',
              label: 'Pagination 分页'
            }, {
              value: 'badge',
              label: 'Badge 标记'
            }]
          }, {
            value: 'notice',
            label: 'Notice',
            children: [{
              value: 'alert',
              label: 'Alert 警告'
            }, {
              value: 'loading',
              label: 'Loading 加载'
            }, {
              value: 'message',
              label: 'Message 消息提示'
            }, {
              value: 'message-box',
              label: 'MessageBox 弹框'
            }, {
              value: 'notification',
              label: 'Notification 通知'
            }]
          }, {
            value: 'navigation',
            label: 'Navigation',
            children: [{
              value: 'menu',
              label: 'NavMenu 导航菜单'
            }, {
              value: 'tabs',
              label: 'Tabs 标签页'
            }, {
              value: 'breadcrumb',
              label: 'Breadcrumb 面包屑'
            }, {
              value: 'dropdown',
              label: 'Dropdown 下拉菜单'
            }, {
              value: 'steps',
              label: 'Steps 步骤条'
            }]
          }, {
            value: 'others',
            label: 'Others',
            children: [{
              value: 'dialog',
              label: 'Dialog 对话框'
            }, {
              value: 'tooltip',
              label: 'Tooltip 文字提示'
            }, {
              value: 'popover',
              label: 'Popover 弹出框'
            }, {
              value: 'card',
              label: 'Card 卡片'
            }, {
              value: 'carousel',
              label: 'Carousel 走马灯'
            }, {
              value: 'collapse',
              label: 'Collapse 折叠面板'
            }]
          }]
        }, {
          value: 'ziyuan',
          label: '资源',
          children: [{
            value: 'axure',
            label: 'Axure Components'
          }, {
            value: 'sketch',
            label: 'Sketch Templates'
          }, {
            value: 'jiaohu',
            label: '组件交互文档'
          }]
        }],
		
        selectedOptions: [],
        selectedOptions2: [],
		
		tableData: [{
		date: '1',
		name: '关于珠海政策发布',
		address: '2017-05-17',
		state:'已经截止'
		}, {
		date:'2',
		name: '关于珠海政策发布',
		address: '2017-05-17',
		state:'已经截止'
		}, {
		date:'3',
		name: '关于珠海政策发布',
		address: '2017-05-17',
		state:'已经截止'
		}, {
		date:'4',
		name: '关于珠海政策发布',
		address: '2017-05-17',
		state:'已经截止'
		}],
		
		
      };
    },
    methods: {
      handleChange(value) {
        console.log(value);
      }
    }
  };
  
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
		
		.block{
			position: absolute;
			left: 60%;
			top: 23%;
		}
		
		
		

</style>
