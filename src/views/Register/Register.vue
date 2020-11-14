<template>
    <body class="my-login-page">
    <section class="h-100">
        <div class="container h-100">
            <div class="row justify-content-md-center h-100">
                <div class="card-wrapper">
                    <div class="brand">
                        <img src="../../static/img/1.jpg">
                    </div>
                    <div class="card fat">
                        <div class="card-body">
                            <h4 class="card-title">注册</h4>
                            <form  :model="registerForm">
                                <div class="form-group">
                                    <label for="name">用户名</label>
                                    <input :model="registerForm.name" id="name" type="text" class="form-control" name="name" required autofocus>
                                </div>

                                <div class="form-group">
                                    <label for="email">电子邮箱</label>
                                    <input :model="registerForm.email" id="email" type="email" class="form-control" name="email" required>
                                </div>

                                <div class="form-group">
                                    <label for="password">密码</label>
                                    <input :model="registerForm.password" id="password" type="password" class="form-control" name="password" required data-eye>
                                </div>

                                

                                <div class="form-group no-margin">
                                    <button  @click="toVerify()" class="btn btn-primary btn-block"> 
                                        注册
                                    </button>
                                </div>
                                <div class="margin-top20 text-center">
                                    已经有账号？ <router-link to="/SignIn" class="item">登录</router-link>
                                </div>
                            </form>
                            <el-dialog title="验证" :visible.sync="dialogTableVisible" center :append-to-body='true' :lock-scroll="false" width="30%">
                               <Verify></Verify>
                            </el-dialog>
                            


                            <!-- <el-from ref="form" :model="form" label-width="320px" >
                                <el-form-item label="用户名" :rules="[{ required: true, message: '请输入用户名', trigger: 'blur' }]">
                                    <el-input v-model="form.name"  placeholder="请输入用户名"></el-input>    
                                </el-form-item>
                                <el-form-item label="密码" :rules="[
                                    { required: true, message: '请输入密码', trigger: 'blur' },
                                    { type: 'password', message: '请输入正确的密码', trigger: ['blur', 'change'] }
                                ]">
                                    <el-input v-model="form.password" placeholder="请输入密码" show-password></el-input>    
                                </el-form-item>
                                <el-form-item label="确认密码" :rules="[{ required: true, message: '请输入密码', trigger: 'blur' }]">
                                    <el-input v-model="form.passwordagain" placeholder="请再次输入密码" show-password></el-input>    
                                </el-form-item>
                                <el-form-item label="验证方式">
                                    <el-radio-group v-model="form.verifyStyle">
                                        <el-radio label="phoneStyle"></el-radio>
                                        <el-radio label="emailStyle"></el-radio>
                                    </el-radio-group>
                                </el-form-item>
                                <el-form-item v-if="form.verifyStyle == 'phoneStyle'" label="手机号" >
                                    <el-input v-model="form.phone" placeholder="请输入手机号"></el-input>    
                                </el-form-item>
                                <el-form-item v-else label="邮箱号">
                                    <el-input v-model="form.email" placeholder="请输入邮箱号"></el-input>    
                                </el-form-item>
                                <el-form-item  v-if="form.verifyStyle == 'phoneStyle'" prop="phone" class="pr">
                                    <el-input placeholder="短信验证码"  v-model="form.phoneCode"></el-input>
                                    <button @click.prevent="getCode()"  class="code-btn" :disabled="!show">
                                        <span v-show="show">获取验证码</span>
                                        <span v-show="!show" class="count">{{count}} s</span>
                                    </button>
                                </el-form-item>
                                <el-form-item  v-else prop="mailCode" class="pr">
                                    <el-input placeholder="邮箱验证码"  v-model="form.emailCode"></el-input>
                                    <button @click.prevent="getCode()"  class="code-btn" :disabled="!show">
                                        <span v-show="show">获取验证码</span>
                                        <span v-show="!show" class="count">{{count}} s</span>
                                    </button>
                                </el-form-item>
                                <el-form-item size="large">
                                    <el-button type="primary" @click="onSubmit()">立即注册</el-button>
                                    <el-button type="primary" @click="back">取消</el-button>  
                                </el-form-item>
                                
                            </el-from>  -->
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </section>
    

    </body>

</template>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
    import Verify from '@/components/Verify.vue'

    export default {    
        name: "Register",
        data(){
            return{
                dialogTableVisible:false,
                registerForm:{
                    name:'',
                    password:'',
                    email:''
                }
                // form:{
                //     name:'',
                //     password:'',
                //     passwordagain:'',
                //     verifyStyle:'phoneStyle',
                //     phone:'',
                //     phoneCode:'',
                //     email:'',
                //     emailCode:''
                // },
            }
        },
        components:{
            Verify
        },
        methods:{
            toVerify(){      //弹出手机验证框
                this.dialogTableVisible=true;
            }
    //         onSubmit() {//注册方法
    //             if(this.form.password !== this.form.passwordagain){//检测两次输入的密码是否相同
    //                 this.$notify({
    //                     title: "提示",
    //                     message: "密码不一致",
    //                     duration: 2000,
    //                 });
    //             }
    //             this.$refs.form.validate((valid) => {
    //                 if (valid) {
    //                     this.$axios({
    //                         method: "POST",
    //                         url: "/api/register",
    //                         headers: {
    //                             "Content-Type": "application/json;charset=UTF-8",
    //                         },
    //                         data: {
    //                         name: this.form.name,
    //                         password: this.form.password,
    //                         passwordagain: this.form.passwordagain,
    //                         verifyStyle:this.form.verifyStyle,
    //                         phone:this.form.phone,
    //                         phoneCode:this.form.phoneCode,
    //                         email:this.form.email,
    //                         emailCode:this.form.emailCode
    //                         },
    //                     })
                       
    //                     .then((res) => {//检测验证成功
    //                         if (res.data.message === "success") {
    //                             this.$router.push("/Login");
    //                             this.$notify({//elemment ui 提示组件
    //                                 title: "提示",
    //                                 message: "注册成功",
    //                                 duration: 2000,
    //                             });
    //                         } else {
    //                             this.$notify({
    //                                 title: "提示",
    //                                 message: "注册失败",
    //                                 duration: 2000,
    //                             });
    //                         }
    //                     })
    //                     .catch(() => {
    //                         this.$notify({
    //                             title: "提示",
    //                             message: "用户访问错误",
    //                             duration: 2000,
    //                         });
    //                     });
    //                 } else {
    //                     console.log("error submit!!");
    //                     return false;
    //                 }    
    //             });  
    //         },
    //         back(){
    //             setTimeout(() => {
    //                             this.$router.push("/Login");
    //                         }, 2000)
    //         },
    //         getCode() {
    //         //axios请求
    //             if(this.form.verifyStyle == 'phoneStyle'){
    //                 console.log(this.form.phone);//传输手机号
    //             }else{
    //                 console.log(this.form.email);//传输邮箱号
    //             }
    //         // 验证码倒计时
    //             if (!this.timer) {
    //                 this.count = 60;
    //                 this.show = false;
    //                 this.timer = setInterval(() => {
    //                     if (this.count > 0 && this.count <= 60) {
    //                         this.count--;
    //                     } else {
    //                         this.show = true;
    //                         clearInterval(this.timer);
    //                         this.timer = null;
    //                     }
    //                 }, 1000);
    //             }
    //         }    
         }
     }
    
</script>

<style scoped>
    @import url("https://unpkg.com/element-ui/lib/theme-chalk/index.css");
    @import "../../style/bootstrap.min.css";
html,body {
	height: 100%;
}

body.my-login-page {
	background-color: #f7f9fb;
    background-image: url(https://gw.alipayobjects.com/zos/rmsportal/TVYTbAXWheQpRcWDaDMu.svg); 
	font-size: 16px;
    
}

.my-login-page .brand {
	width: 90px;
	height: 90px;
	overflow: hidden;
	border-radius: 50%;
	margin: 0 auto;
	margin: 20px auto;
	box-shadow: 0 0 40px rgba(0,0,0,.05);
}

.my-login-page .brand img {
	width: 100%;
}

.my-login-page .card-wrapper {
    width: 400px;
    height: 800px;
}

.my-login-page .card {
	border-color: transparent;
	box-shadow: 0 0 40px rgba(0,0,0,.05);
}

.my-login-page .card.fat {
    padding: 10px;
    /* height: 600px; */
}

.my-login-page .card .card-title {
	margin-bottom: 20px;
}

.my-login-page .form-control {
	border-width: 2.3px;
}

.my-login-page .form-group label {
	width: 100%;
}

.my-login-page .btn.btn-block {
	padding: 12px 10px;
}

.my-login-page .margin-top20 {
	margin-top: 20px;
}

.my-login-page .no-margin {
	margin: 0;
}


.pr {
position: relative;
}

.code-btn {
width: 100px;
height: 20px;
position: absolute;
top: 10px;
right: 5px;
z-index: 222;
color: #2b8edf;
font-size: 14px;
border: none;
border-left: 1px solid #bababa;
padding-left: 10px;
background-color: #fff;
cursor: pointer;
}
</style>
