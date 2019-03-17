<template>
	<!-- 二级页面的首页 -->
	<div id="notice">
		<el-row>
			<el-col :span="14" :offset="1">
				<div class="grid-content bg-purple">
					<el-carousel :interval="5000" height="">
						<el-carousel-item v-for="item in dataimg" :key="item">
							<img :src="item.src">
							<!-- <p class="italictext">{{item.txt}}</p> -->
						</el-carousel-item>
					</el-carousel>
				</div>
			</el-col>
			<el-col :span="7" :offset="1">
				<el-card class="box-card">
					<div slot="header" class="clearfix" style="line-height: 15px;">
						<span style="color: darkred;font-weight: bold;font-size: 18px;">公告</span>
						<router-link :to="{name:'policylist'}" style="float: right;font-size: 14px;">更多</router-link>
					</div>
					<div v-for="notice in notices" :key="notice" class="text item">
						<a href="#">{{notice.title.length>7?notice.title.substring(0,7)+"...":notice.title}}</a>
						<span style="float: right;font-size: 15px;">{{notice.date}}</span>
					</div>
				</el-card>
			</el-col>
		</el-row>
		<el-row>
			<el-col :span="12" :offset="1">
				<el-card class="box-card">
					<div slot="header" class="clearfix" style="line-height: 10px;">
						<span style="color: black;font-size: 20px;">最新政策</span>
						<a href="#" style="float: right;font-size: 14px;">
                            <router-link :to="{path:'/policyDetail'}"> 更多</router-link>
                           </a>
					</div>
					<div v-for="newest in newests" :key="newest" class="text item">
						<a href="#"><span>[{{newest.level}}]{{newest.title.length>7?newest.title.substring(0,20)+"...":notice.title}}</span></a>
						<span style="float: right;">{{newest.date}}</span>
					</div>
				</el-card>
			</el-col>
			<el-col :span="10" :offset="1">
				<el-card class="box-card">
					<div slot="header" class="clearfix" style="line-height: 10px;">
						<span style="color: black;font-size: 20px;">企业信息</span>
						<a href="#" style="float: right;font-size: 14px;">更多</a>
					</div>
					<div>
						<div style="float: left;">
							<img src="../assets/Policy_1.jpg" width="150px" height="100px">
						</div>
						<div>
							<p>&emsp;&emsp;珠海名称</p>
							<p>&emsp;&emsp;珠海企业</p>
						</div>
						<!-- <span style="float: right;">{{notice.date}}</span> -->
					</div>
				</el-card>
			</el-col>
		</el-row>
	</div>
</template>

<script>
	export default {
		name: 'notice',
		data() {
			return {
				item: {
					hasName: "这是用来测试的,看有没有错"
				},
				// 轮播图
				dataimg: [{
						src: require('../assets/img01.jpg'),
						txt: '一站式服务',
					},
					{
						src: require('../assets/img01.jpg'),
						txt: '国际服务',
					},
					{
						src: require('../assets/img01.jpg'),
						txt: '全网渠道',
					}
				],
				// 公告
				notices: [{
						title: "这里放的是公告标题",
						date: "2019-02-21"
					},
					{
						title: "这里放的是公告标题",
						date: "2019-02-21"
					},

					{
						title: "这里放的是公告标题",
						date: "2019-02-21"
					},
					{
						title: "这里放的是公告标题",
						date: "2019-02-21"
					},
				],
				// 最新政策
				newests: [
                    // {
					// 	level: "全国",
					// 	title: "这里放的是最新政策标题",
					// 	date: "2019-02-32",
					// },
					// {
					// 	level: "全国",
					// 	title: "这里放的是最新政策标题",
					// 	date: "2019-02-32",
					// },
					// {
					// 	level: "全国",
					// 	title: "这里放的是最新政策标题",
					// 	date: "2019-02-32",
					// },
					// {
					// 	level: "全国",
					// 	title: "这里放的是最新政策标题",
					// 	date: "2019-02-32",
					// }, {
					// 	level: "全国",
					// 	title: "这里放的是最新政策标题",
					// 	date: "2019-02-32",
					// },
				],
				// 企业信息
				enterprises: [{
					name: "这里放企业名",
					date: ""
				}]
			}
        },
        created() {
            this.getPolicy();
        },
        methods: {
            formatDate(date){
                var dates = new Date(date);
                var Y = dates.getFullYear() + '-';
                var M = (dates.getMonth()+1 < 10 ? '0'+(dates.getMonth()+1) : dates.getMonth()+1) + '-';
                var D = dates.getDate() + ' ';
                return Y+M+D;
            },
            getPolicy(){
                this.$http.get('/policy/raw/getByPager/1/10').then(resp => {
                    for (let arr of resp.data.data) {
                        console.log(arr);
                            this.newests.push({
                               level: "全国",
					 	       title: arr.title,
					 	       date: this.formatDate(arr.releaseTime),
                            })
                        }
                })
            }
        }
	}
</script>

<style scoped>
	/* 文本超出范围显示省略号 */
	.nav {
		display: block;
		/*根据个人需要自定义宽度*/
		width:3em;
		overflow: hidden;
		white-space: nowrap;
		text-overflow: ellipsis;

	}

	#notice ul li {
		margin-bottom: 10px;
	}

	.text {
		font-size: 16px;
	}

	.item {
		margin-bottom: 0px;
	}

	.clearfix:before,
	.clearfix:after {
		display: table;
		content: "";
	}

	.clearfix:after {
		clear: both
	}

	.box-card {
		text-align: left;
	}
    
</style>
