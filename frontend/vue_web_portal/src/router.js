import Vue from 'vue'
import Router from 'vue-router'
import App from './views/App.vue'
import Home from './components/Home.vue'
import Notice from './components/Notice.vue'
import Policy from './components/Policy.vue'
import Atlas from './components/Atlas.vue'
import Declare from './components/Declare.vue'
import Login from './components/Login.vue'
import Register from './components/Register.vue'
import Son from './components/son.vue'
import Subscribe from './components/Subscribe.vue'

Vue.use(Router)

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: '/',
            name: 'app',
            component: App
        },
        {
            // 针对vue-router子路由默认视图不显示这个问题，要有默认子路由，那父路由的名字name得去掉
            path: '/home',
            component: Home,
            children: [
                {
                    path: '/',
                    name: 'notice',
                    component: Notice
                }, {
                    path: '/notice',
                    name: 'notice',
                    component: Notice
                }, {
                    path: '/policy',
                    name: 'policy',
                    component: Policy
                }, {
                    path: '/atlas',
                    name: 'atlas',
                    component: Atlas
                }, {
                    path: '/declare',
                    name: 'declare',
                    component: Declare
                }

            ]
        },
        {
            path: '/login',
            name: 'login',
            component: Login
        },
        {
            path: '/register',
            name: 'register',
            component: Register
        }, {
            path: '/son',
            name: 'son',
            component: Son,
            children:
                [
                    {
                        path: '/subscribe',
                        name: 'subscribe',
                        component: Subscribe
                    }
                ]
        }

    ]
})

