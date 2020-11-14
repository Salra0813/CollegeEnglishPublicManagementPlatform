<template>
  <div class="ClassArea">
    <img src="../../static/img/HomeTeacher.png" />
    <div class="class-content">
      <div class="class-head">
        <p>班级&课堂</p>
        <a href="#">更多>></a>
      </div>
      <div class="line"></div>
      <p class="class-subtitle">名师辅导，与五湖四海的同学在线学习</p>
      <div class="item">
        <div class="column">
          <class-window></class-window> <class-window></class-window>
        </div>
        <div class="column">
          <class-window></class-window> <class-window></class-window>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ClassWindow from "../HomePage/ClassWindow";
export default {
  components: {
    ClassWindow,
  },
};
</script>

<style lang = "less" scoped>
@import url("/src/style/Common.less");
@areaHeight: 44rem;
@imgWeight: 15rem;
@imgHeight: 28rem;

.ClassArea {
  display: flex;
  flex-direction: row;
  width: 100%;
  height: @areaHeight;
  background-color: @backgroundcolor;
  img {
    flex: 1;
    margin-top: 8rem;
    width: @imgWeight;
    height: @imgHeight;
  }
  .class-content {
    flex: 2;
    display: flex;
    flex-direction: column;
    .class-head {
      display: flex;
      flex-direction: row;
      justify-content: space-between;
      p {
        margin: 1rem 4rem 0 0;
        font-weight: bold;
        font-size: 2.5rem;
        color: @firstfont;
      }
      a {
        margin: 2rem 0.8rem 0 0;
        color: @firstfont;
        text-decoration: none;
      }
    }
    .line {
      margin-top: 0.520833rem;
      border-bottom: 2px solid @firstfont;
      width: 100%;
    }
    .class-subtitle {
      margin-top: 0.4rem;
      color: @secondfont;
    }
    .item {
      display: flex;
      flex-wrap: wrap;
      align-content: space-around;
      .column {
        flex-basis: 100%;
        display: flex;
        justify-content: space-around;
        margin-top:3rem;
      }
    }
  }
}
</style>