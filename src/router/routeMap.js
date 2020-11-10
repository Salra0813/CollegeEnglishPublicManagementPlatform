//路由图
const routeMap = [   
    
    // {   //跳转登录页面
    //     name:'Login',
    //     path:'/Login',
    //     hidden: true,
    //     component: () => import('@/views/Login'),
    // },

    // {   //跳转注册页面
    //     name: 'Register',
    //     path: '/Register',
    //     hidden: true,
    //     component: () => import('@/views/Register'),
    // },

    {   //跳转主页面
        name: 'HomePage',
        path: '/',
        hidden: true,
        component: () => import('@/views/HomePage/HomePage.vue'),
    },


]
export default routeMap;