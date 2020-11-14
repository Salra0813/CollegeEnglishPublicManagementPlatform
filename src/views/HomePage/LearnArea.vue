<template>
  <div class="LearnArea">
    <div class="header">
      <p class="title">学习模式</p>
      <p class="subtitle">LEARNING MODE</p>
    </div>
    <div class="icon">
      <div class="item">
        <font-awesome-icon
          :icon="['fa', 'book']"
          class="iconpic"
        ></font-awesome-icon>
        <p>作文</p>
      </div>
      <div class="item">
        <font-awesome-icon
          :icon="['fa', 'edit']"
          class="iconpic"
        ></font-awesome-icon>
        <p style="margin-right:1rem">练习</p>
      </div>
      <div class="item">
        <font-awesome-icon
          :icon="['fa', 'file']"
          class="iconpic"
        ></font-awesome-icon>
        <p>套题</p>
      </div>
      <div class="item">
        <font-awesome-icon
          :icon="['fa', 'question-circle']"
          class="iconpic"
        ></font-awesome-icon>
        <p>答疑</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style lang = "less" scoped>
@import url("/src/style/Common.less");
@areaHeight: 40rem;

.LearnArea {
  display: flex;
  flex-direction: column;
  align-items: center;
  height: @areaHeight;
  width: 100%;
  .header {
    margin-top: 7rem;
    display: flex;
    flex-direction: column;
    text-align: center;
    .title {
      font-size: 2.5rem;
      color: @firstfont;
      font-weight: bold;
    }
    .subtitle {
      margin-top: 1rem;
      color: @thridfont;
      font-size: 2rem;
      font-weight: bold;
    }
  }
  .icon {
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    margin-top: 6rem;
    width: 64rem;
    .item {
      display: flex;
      flex-direction: column;
      align-items: center;
      .iconpic {
        font-size: 4.2rem;
        color: @bluecolor;
      }
      p {
        margin-top: 1.2rem;
        font-size: 1.4rem;

      }
    }
  }
}
</style>