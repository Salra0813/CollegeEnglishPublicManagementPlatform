<template>
  <div class="TheHeader">
    <div class="logo"><a href="#">English</a></div>
    <div class="nav">
      <ul>
        <li><a href="#">微课堂</a></li>
        <li><a href="#">专项训练</a></li>
        <li><a href="#">四六级助考</a></li>
      </ul>
    </div>
    <div class="user">
      <a href="#"><img src="../static/img/Head.jpg" alt="头像" /></a>
    </div>
    <a  @click="toRegister" class="sign">登录/注册</a>   <!--测试注册 现在的点击方法是 跳转到注册页面-->
  </div>
</template>

<script>
export default {

  methods:{
    toRegister(){
      this.$router.push("/Register");
    }
  }
};
</script>

<style lang = "less" scoped>
@import url("/src/style/Common.less");
@headerHeight: 3.333333rem;
@imgHeight: 5.208333rem;
@logoSize: 2rem;

.TheHeader {
  display: flex;
  flex-direction: row;
  align-items: center;
  height: @headerHeight;
  width: 100%;
  background-color:@brandcolor;
  .logo {
    margin: 0 2rem 0 4rem;
    text-align: center;
    font-size: @logoSize;
  }
  .nav {
    ul {
      display: flex;
      flex-direction: row;
      li {
        margin-left: 2rem;
        list-style-type: none;
      }
    }
  }
  .user {
    margin-left: 34rem;
    img {
      margin-top: 2.5rem;
      width: @imgHeight;
      height: @imgHeight;
      border-radius: 50%;
      border: 3px solid black;
    }
  }
  .sign{
      margin-left: 2rem;
  }
}

a {
  color: white;
  text-decoration: none;
}
</style>