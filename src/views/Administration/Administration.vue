<template>
    
        <el-container >                            <!--element ui 容器布局 -->
            <el-aside width="200px">
                <vertical-menu></vertical-menu>    <!--左侧菜单组件 -->
            </el-aside>
    
            <el-main>
                <router-view></router-view>       <!--右侧管理员管理组件 -->
            </el-main>
        </el-container>
    
</template>

<script>

import VerticalMenu from '../../components/VerticalMenu.vue'
export default {
    name:'administration',
    components: { 
        VerticalMenu 
    },

}

</script>

<style lang="less" scoped>

</style>
