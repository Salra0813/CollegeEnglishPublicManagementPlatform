<template>
    <div >      
    <el-menu default-active="2"  class="el-menu-vertical-demo"  @open="handleOpen"  @close="handleClose" background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
      <el-menu-item index="1" route>
        <i class="el-icon-setting"></i>
        <span slot="title">课程学习管理</span>
      </el-menu-item>
      <el-menu-item index="2">
        <i class="el-icon-s-check"></i>
        <span slot="title">开课申请审核</span>
      </el-menu-item>
      <el-menu-item index="3">
        <i class="el-icon-user"></i>
        <span slot="title">人员管理</span>
      </el-menu-item>
      <el-menu-item index="4">
        <i class="el-icon-s-custom"></i>
        <span slot="title">身份认证</span>
      </el-menu-item>
      <el-menu-item index="5">
        <i class="el-icon-pie-chart"></i>
        <span slot="title">网络活跃度</span>
      </el-menu-item>
    </el-menu>
    </div>
</template>

<script>
  export default {
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style lang='less' scoped>
.el-menu{
    height: 30rem;
}

</style>
