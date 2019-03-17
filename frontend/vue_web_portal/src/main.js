import Vue from 'vue'
import './plugins/axios'
import App from './views/App.vue'
import Total from './views/Total.vue'
import Home from './components/Home.vue'

import Test from './Test.vue'
import './plugins/element.js'
import router from './router'
import echarts from 'echarts';
import Axios from 'axios'

Vue.prototype.$echarts = echarts;
Vue.prototype.$http = Axios;

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(Total)
}).$mount('#app')

Vue.prototype.$http = Axios;

Axios.defaults.baseURL = "http://localhost:8888";
Axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';
Vue.config.productionTip = false;
Vue.prototype.$addr = Axios;
