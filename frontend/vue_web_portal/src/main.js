import Vue from 'vue'
import App from './views/App.vue'
import Total from './views/Total.vue'
import Home from './components/Home.vue'
import Subscribe from './components/Subscribe.vue'
import Hred from './components/hred.vue'
import Son from './components/son.vue'

import Test from './Test.vue'
import './plugins/element.js'
import router from './router'
import echarts from 'echarts';

Vue.prototype.$echarts = echarts;

Vue.config.productionTip = false

new Vue({
  router,
    render: h => h(Total)
}).$mount('#app')
