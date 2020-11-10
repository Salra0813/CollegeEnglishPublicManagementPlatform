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
@footerHeight: 6.25rem;
@textHeight: 4.166667rem;
@titleSize: 1.7rem;

.TheFooter {
  display: flex;
  flex-direction: column;
  background-color: @brandcolor;
  .text-1 {
    display: flex;
    flex-direction: row;
    height: @textHeight;
    align-items: center;
    .title {
      color: white;
      margin: 0 37rem 0 4rem;
      font-size: @titleSize;
    }
    ul {
      display: flex;
      flex-direction: row;
      li {
        margin-left: 2rem;
        list-style-type: none;
        color: white;
      }
    }
  }
  .text-2 {
    display: flex;
    flex-direction: column;
    margin-bottom: 1.25rem;
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