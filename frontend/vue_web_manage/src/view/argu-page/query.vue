<template>
	<div>
		<div style="position: fixed;margin-left: 950px;">
						 <Button type="primary" @click="on1" :data-id="$route.query.id">编辑</Button>
						 <br>
						 <br>
						 <Button type="success" @click="on2">{{$route.query.verify}}</Button>
		</div>
	<div v-html="html">
	{{html}}
	</div>
	</div>
</template>

<script>
	import {
		mapMutations
	} from 'vuex'
	export default {
		name: 'query',
		data(){
			return{
				html:''
			}
		},
		created() {
			this.data();
		},
		methods: {
            
			...mapMutations([
				'closeTag'
			]),
			close() {
				/**
				 * 如果是调用closeTag方法，普通的页面传入的对象参数只需要写name字段即可
				 * 如果是动态路由和带参路由，需要传入query或params字段，用来区别关闭的是参数为多少的页面
				 */
				var nid;
				this.closeTag({
					name: 'query',
					query: {
						id: this.$route.query.id,
						verify: this.$route.query.verify,
						compile: this.$route.query.compile,
					}
				})
			},
			data(){
				this.$http.get('/policy/raw/selectByPrimaryKey/'+this.$route.query.id).then(resp => {
                        this.html=resp.data.data[0].html;
                        console.log(resp.data.data[0].html);
					})
			},
			on1() {
				const route = {
					name: 'level_2_2'
				}
				this.$router.push(route)
			},
			on2() {
				const route = {
					name: 'level_2_3'
				}
				this.$router.push(route)
			}
		}
	}
</script>

<style>

</style>
