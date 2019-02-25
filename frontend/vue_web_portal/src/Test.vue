<template>
	<!-- 这个页面只是用于测试不同的代码 -->
	<div class="test">
		<div style="margin: auto 10% ;">
			<el-carousel :interval="5000" height="360px" style="width: 700px;">
				<el-carousel-item v-for="item in dataimg" :key="item">
					<img :src="item.src" width="100%">
					<p class="italictext">{{item.txt}}</p>
				</el-carousel-item>
			</el-carousel>
		</div>
		
		<!-- <el-row>
			<el-col :span="14" :offset="1">
				<div class="grid-content bg-purple">
					<el-carousel :interval="5000" height="400px">
						<el-carousel-item v-for="item in dataimg" :key="item">
							<img :src="item.src" width="100%">
							<p class="italictext" style="margin-left:20px">{{item.txt}}</p>
						</el-carousel-item>
					</el-carousel>
				</div>
			</el-col>
			<el-col :span="7" :offset="1">
				<div class="grid-content bg-purple-light">
					<el-row>
						<span style="float: left;margin-left: 20px;font-size: 20px;"><b>公告</b></span>
						<a href="" style="float:right;font-size: 14px;">更多
							<i class="el-icon-d-arrow-right"></i></a>
					</el-row>
					<div>
						<ul style="list-style-type:none;text-align: left;">
							<li style="margin-bottom: 10px;">
								<a href="#">这里放的是14个字以内的标题</a>
								<span style="float: right;">2019-02-21</span>
							</li>
							<li>
								<a href="#">这里放的是14个字以内的标题</a>
								<span style="float: right;">2019-02-21</span>
							</li>
							<li>
								<a href="#">这里放的是14个字以内的标题</a>
								<span style="float: right;">2019-02-21</span>
							</li>
							<li>
								<a href="#">这里放的是14个字以内的标题</a>
								<span style="float: right;">2019-02-21</span>
							</li>
						</ul>
					</div>
				</div>
			</el-col>
			<el-col :span="1">
				<div class="grid-content bg-purple-light" style="background-color: white;"></div>
			</el-col>
		</el-row> -->
	</div>
</template>

<script>
	export default {
		name: 'home',
		data() {
			return {

				dataimg: [{
						src: require('./assets/img01.jpg'),
						txt: '一站式服务',
					},
					{
						src: require('./assets/img01.jpg'),
						txt: '国际服务',
					},
					{
						src: require('./assets/img01.jpg'),
						txt: '全网渠道',
					}
				]
			}
		}
	}
</script>
<style>
	
</style>
