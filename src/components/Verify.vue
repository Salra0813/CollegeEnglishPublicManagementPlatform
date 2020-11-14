<template>
  <div>
        <el-form ref="form" :model="form" label-width="80px">
            <el-form-item label="手机号">
                <el-input v-model="form.phone" placeholder="请输入手机号"></el-input>
            </el-form-item>
            <el-form-item label="验证码">
                <el-input v-model="form.verifyCode" placeholder="请输入验证码"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="submit" @click="onSubmit">注册</el-button>
            </el-form-item>
        </el-form>
  </div>

</template>

<script>
    export default {
        name: 'Verify',
        data() {
    return {
        form: {
          phone: '',
          verifyCode: ''
        }
      }

        },
         methods: {
         onSubmit() {
        console.log('submit!');
      }
    }
    }

</script>

<style scoped>

</style>