//路由图
const routeMap = [   
    
    {   //跳转登录页面
        name:'SignIn',
        path:'/SignIn',
        hidden: true,
        component: () => import('@/views/SignIn/SignIn.vue'),
    },

    {   //跳转注册页面
        name: 'Register',
        path: '/Register',
        hidden: true,
        component: () => import('@/views/Register/Register.vue'),
    },

    {   //跳转到手机验证页面
        name:'Verify',
        path:'/Verify',
        component: () => import(''),
    },

    {   //跳转主页面
        name: 'HomePage',
        path: '/',
        hidden: true,
        component: () => import('@/views/HomePage/HomePage.vue'),
    },


]

export default routeMap;
