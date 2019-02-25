import Main from '@/components/main'
import parentView from '@/components/parent-view'

/**
 * iview-admin中meta除了原生参数外可配置的参数:
 * meta: {
 *  title: { String|Number|Function }
 *         显示在侧边栏、面包屑和标签栏的文字
 *         使用'{{ 多语言字段 }}'形式结合多语言使用，例子看多语言的路由配置;
 *         可以传入一个回调函数，参数是当前路由对象，例子看动态路由和带参路由
 *  hideInBread: (false) 设为true后此级路由将不会出现在面包屑中，示例看QQ群路由配置
 *  hideInMenu: (false) 设为true后在左侧菜单不会显示该页面选项
 *  notCache: (false) 设为true后页面在切换标签后不会缓存，如果需要缓存，无需设置这个字段，而且需要设置页面组件name属性和路由配置的name一致
 *  access: (null) 可访问该页面的权限数组，当前路由设置的权限会影响子路由
 *  icon: (-) 该页面在左侧菜单、面包屑和标签导航处显示的图标，如果是自定义图标，需要在图标名称前加下划线'_'
 *  beforeCloseName: (-) 设置该字段，则在关闭当前tab页时会去'@/router/before-close.js'里寻找该字段名对应的方法，作为关闭前的钩子函数
 * }
 */

export default [
  {
    path: '/login',
    name: 'login',
    meta: {
      title: 'Login - 登录',
      hideInMenu: true
    },
    component: () => import('@/view/login/login.vue')
  },
  {
    path: '/',
    name: '_home',
    redirect: '/home',
    component: Main,
    meta: {
      hideInMenu: true,
      notCache: true
    },
    children: [
      {
        path: '/home',
        name: 'home',
        meta: {
          hideInMenu: true,
          title: '首页',
          notCache: true,
          icon: 'md-home'
        },
        component: () => import('@/view/single-page/home')
      }
    ]
  },
  {
    path: '/message',
    name: 'message',
    component: Main,
    meta: {
      hideInBread: true,
      hideInMenu: true
    },
    children: [
      {
        path: 'message_page',
        name: 'message_page',
        meta: {
          icon: 'md-notifications',
          title: '消息中心'
        },
        component: () => import('@/view/single-page/message/index.vue')
      }
    ]
  },
  {
    path: '/multilevel',
    name: 'multilevel',
    meta: {
      icon: 'ios-menu',
      title: '政策管理'
    },
    component: Main,
    children: [
      {
        path: 'level_2_1',
        name: 'level_2_1',
        meta: {
          icon: 'md-hand',
          title: '采集'
        },
        component: () => import('@/view/multilevel/level-2-1.vue')
      },
     {
       path: 'level_2_2',
       name: 'level_2_2',
       meta: {
         icon: 'ios-brush-outline',
         title: '草拟'
       },
       component: () => import('@/view/multilevel/level-2-2.vue')
     },
		 {
		   path: 'level_2_3',
		   name: 'level_2_3',
		   meta: {
		     icon: 'md-checkbox-outline',
		     title: '核实'
		   },
		   component: () => import('@/view/multilevel/level-2-3.vue')
		 },
		// {
		//   path: 'level_2_4',
		//   name: '发布',
		//   meta: {
		//     icon: 'md-clipboard',
		//    title: '发布'
		//   },
		 //  component: () => import('@/view/multilevel/level-2-4.vue')
		 //},
		 {
		   path: 'level_2_5',
		   name: '推送',
		   meta: {
		     icon: 'ios-send',
		     title: '推送'
		   },
		   component: () => import('@/view/multilevel/level-2-5.vue')
		 },
    ]
  },
	{
	  path: '/policy-read',
	  name: '政策解读',
	  meta: {
	    icon: 'ios-menu',
	    title: '政策解读'
	  },
	  component: Main,
	  children: [
	    {
	      path: 'collection',
	      name: 'collection',
	      meta: {
	        icon: 'md-hand',
	        title: '采集'
	      },
	      component: () => import('@/view/policy_read/collection.vue')
	    },
	   {
	     path: 'draft',
	     name: 'draft',
	     meta: {
	       icon: 'ios-brush-outline',
	       title: '草拟'
	     },
	     component: () => import('@/view/policy_read/draft.vue')
	   },
		 {
		   path: 'verify',
		   name: 'verify',
		   meta: {
		     icon: 'md-checkbox-outline',
		     title: '核实'
		   },
		   component: () => import('@/view/policy_read/verify.vue')
		 },
		 {
		   path: 'release',
		   name: '发布',
		   meta: {
		     icon: 'md-clipboard',
		     title: '发布'
		   },
		   component: () => import('@/view/policy_read/release.vue')
		 },
		]
	},
	{
	  path: '/authority-management',
	  name: '权限管理',
	  meta: {
	    icon: 'ios-menu',
	    title: '权限管理'
	  },
	  component: Main,
	  children: [
	    {
	      path: 'user_management',
	      name: '用户管理',
	      meta: {
	        icon: 'md-contacts',
	        title: '用户管理'
	      },
	      component: () => import('@/view/authority_management/user_management.vue')
	    },
	   {
	     path: 'authority_control',
	     name: '权限控制',
	     meta: {
	       icon: 'ios-key-outline',
	       title: '权限控制'
	     },
	     component: () => import('@/view/authority_management/authority_control.vue')
	   },
	  ]
	},
	{
	  path: '/log_management',
	  name: '日志管理',
	  meta: {
	    icon: 'ios-menu',
	    title: '日志管理'
	  },
	  component: Main,
	  children: [
	    {
	      path: 'log_employee',
	      name: '企业日志',
	      meta: {
	        icon: 'md-hand',
	        title: '企业日志'
	      },
	      component: () => import('@/view/log_management/log_employee.vue')
	    },
	   {
	     path: 'log_government',
	     name: '政府日志',
	     meta: {
	       icon: 'ios-brush-outline',
	       title: '政府日志'
	     },
	     component: () => import('@/view/log_management/log_government.vue')
	   },
		 {
		   path: 'log_policy',
		   name: '政策日志',
		   meta: {
		     icon: 'md-checkbox-outline',
		     title: '政策日志'
		   },
		   component: () => import('@/view/log_management/log_policy.vue')
		 },
		]
	},
	
	{
	  path: '/data_management',
	  name: '数据管理',
	  meta: {
	    icon: 'ios-menu',
	    title: '数据管理'
	  },
	  component: Main,
	  children: [
	    {
	      path: 'data_backup',
	      name: '数据备份',
	      meta: {
	        icon: 'md-hand',
	        title: '数据备份'
	      },
	      component: () => import('@/view/data_management/data_backup.vue')
	    },
		]
	},
	{
		path: '/argu',
		name: 'argu',
		meta: {
			//hideInMenu: true
		},
		component: Main,
		children: [{
				path: 'params/:id',
				name: 'params',
				meta: {
					icon: 'md-flower',
					title: route => `{{ params }}-${route.params.id}`,
					notCache: true,
					beforeCloseName: 'before_close_normal'
				},
				component: () => import('@/view/argu-page/params.vue')
			},
			{
				path: 'query',
				name: 'query',
				meta: {
					icon: 'md-flower',
					title:'政策详情',
					notCache: true
				},
				component: () => import('@/view/argu-page/query.vue')
			},
			{
				path: 'collectiondetails',
				name: 'collectiondetails',
				meta: {
					icon: 'md-flower',
					title:'解读详情',
					notCache:true
				},
				component: () => import('@/view/policy_read/collectiondetails.vue')
			}
		]
	}
]