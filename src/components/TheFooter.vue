<template>
  <div class="TheFooter">
    <div class="text-1">
      <p class="title">英语学习网站</p>
      <ul>
        <li>回到顶部</li>
        <li>关于我们</li>
        <li>鸣谢</li>
        <li>联系方式</li>
      </ul>
    </div>
    <div class="text-2">
      <div class="line"></div>
      <p>四川师范大学计算机科学学院四班</p>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style lang = "less" scoped>
@import url("/src/style/Common.less");
@footerHeight: 10rem;
@titleSize: 3rem;

.TheFooter {
  display: flex;
  flex-direction: column;
  background-color: @brandcolor;
  height: @footerHeight;
  .text-1 {
    display: flex;
    flex-direction: row; 
    align-items: center;
    justify-content: space-between;
    margin-top: 1.5rem;
    .title {
      color: @fourthfont;
      font-size: @titleSize;
      font-weight: bold;
      margin-left: 3rem;
    }
    ul {
      display: flex;
      flex-direction: row;
      margin-right: 3rem;
      li {
        margin-left: 2rem;
        list-style-type: none;
        color: @fourthfont;
      }
    }
  }
  .text-2 {
    display: flex;
    flex-direction: column;
    margin-top: 1.4rem;
    .line {
      border: solid gray;
      border-top: 1px;
    }
    p {
      margin-top: 0.364583rem;
      text-align: center;
      color: @thridfont;
      font-size: 0.8rem;
    }
  }
}
</style>