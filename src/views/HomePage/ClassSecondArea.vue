<template>
  <div class="ClassSecondArea">
    <p class="title">知识&专项</p>
    <div class="line"></div>
    <p class="subtitle">读万卷书，且行万里路</p>
    <div class="item">
      <div class="column">
        <p class="column-title">四级专项</p>
        <class-window></class-window><class-window></class-window>
      </div>
      <div class="column">
        <p class="column-title">六级专项</p>
        <class-window></class-window><class-window></class-window>
      </div>
      <div class="column">
        <p class="column-title">作文专项</p>
        <class-window></class-window><class-window></class-window>
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
@areaHeight: 53rem;

.ClassSecondArea {
  width: 100%;
  height: @areaHeight;
  display: flex;
  flex-direction: column;
  .title {
    margin: 3rem 0 0 2rem;
    font-size: 2.5rem;
    color: @firstfont;
    font-weight: bold;
  }
  .line {
    width: 52rem;
    margin-top: 1rem;
    border-bottom: 2px solid @firstfont;
  }
  .subtitle {
    margin: 0.4rem 0 0 2rem;
    color: @secondfont;
  }
  .item {
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    margin-top: 3rem;
    .column {
      display: flex;
      flex-direction: column;
      justify-content: space-around;
      height: 39rem;
      .column-title {
        text-align: center;
        color: @firstfont;
        font-weight: bold;
        font-size: 1.8rem;
      }
    }
  }
}
</style>