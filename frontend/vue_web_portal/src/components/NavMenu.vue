<template>
	<!-- 二级页面的导航栏 -->
	<div id="navmenu">
		<ul class="shape">
			<li>
				<router-link :to="{name:'notice'}">首页</router-link>
			</li>
			<li>
				<router-link :to="{name:'policy'}">政策</router-link>
			</li>
			<li>
				<router-link :to="{name:'atlas'}">申报政策</router-link>
			</li>
			<li>
				<router-link :to="{name:'declare'}">政策统计图</router-link>
			</li>
		</ul>
	</div>

</template>

<script>
</script>

<style scoped>
	/* #navmenu ul li {
		display: inline;
	} */

	* {
		padding: 0;
		margin: 0;
	}

	.shape {
		margin: 20px auto;
		width: 1250px;
		height: 40px;
		background-color: #6495ED;
		list-style: none;
	}

	.shape li {
		width: 25%;
		text-align: center;
		padding-top: 8px;
		padding-bottom: 8px;
		float: left;
	}

	.shape li a {
		font-size: 18px;
		display: block;
		width: 100%;
		text-decoration: none;
		color: white;
		font-weight: bold;
	}

	.shape li:hover {
		background-color: #c00;
	}
</style>
