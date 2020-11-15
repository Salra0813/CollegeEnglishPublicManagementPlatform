<template>
  <div>
        <el-form ref="form" :model="form" label-width="80px">
            <el-form-item label="手机号">
                <el-input v-model="form.phone" placeholder="请输入手机号"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="submit" @click="getCode">获取验证码</el-button>
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
            getCode(){      //提交手机号，获取验证码
                this.$axios({
                    method: "POST",
                    url: "/api/getCode",
                    headers: {
                        "Content-Type": "application/json;charset=UTF-8",
                    },
                    data: {
                    phone:this.form.phone,
                    },
                })
            },
            onSubmit() {     //提交验证码
                console.log('submit!');
                this.$refs.form.validate((valid) => {
                    if (valid) {
                        this.$axios({
                            method: "POST",
                            url: "/api/verify",
                            headers: {
                                "Content-Type": "application/json;charset=UTF-8",
                            },
                            data: {
                            phone:this.form.phone,
                            verifyCod:this.form.verifyCod,
                            },
                        })
                        .then((res) => {//检测验证成功
                            if (res.data.message === "success") {
                                this.$router.push("/Login");     //跳转到登录页面
                                this.$notify({        //elemment ui 提示组件
                                    title: "提示",
                                    message: "注册成功",
                                    duration: 2000,
                                });
                            } else {
                                this.$notify({
                                    title: "提示",
                                    message: "注册失败",
                                    duration: 2000,
                                });
                            }
                        })
                        .catch(() => {
                            this.$notify({
                                title: "提示",
                                message: "用户访问错误",
                                duration: 2000,
                            });
                        });
                    } else {
                        console.log("error submit!!");
                        return false;
                    }    
                });
            }
        }
    }

</script>

<style scoped>

</style>