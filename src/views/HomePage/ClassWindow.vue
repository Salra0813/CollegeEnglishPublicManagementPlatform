<template>
  <div class="ClassWindow lightshadow">
    <div class="pic">
      <img :src="imgUrl" />
    </div>
    <div class="title">{{ title }}</div>
    <div class="stunum">
      <font-awesome-icon :icon="['fas', 'user']"></font-awesome-icon>
      <p>{{ stuNum }}</p>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      imgUrl: require("../../static/img/HomeWinPic_1.jpg"),
      title: "高中英语——名师专业辅导",
      stuNum: "100",
    };
  },
};
</script>

<style lang = "less" scoped>
@import url("/src/style/Common.less");
@windowHeight: 14.322917rem;
@windowWidth: 14.479167rem;
@picHeight: 9.5rem;
@titleSize: 1rem;
@subTitle: 0.9rem;

.ClassWindow {
  display: flex;
  flex-direction: column;
  width: @windowWidth;
  height: @windowHeight;
  border-radius: 9px;
  background-color: white;
  .pic {
    width: 100%;
    height: @picHeight;
    border-radius: 9px;
    border: 2px white solid;
    img {
      width: 100%;
      height: 100%;
      border-radius: 9px;
    }
  }
  .title {
    margin-top: 1.3rem;
    margin-left:  0.5rem;
    font-size: @titleSize;
    font-weight: bold;
    color: @firstfont;
    text-align: left;
  }
  .stunum {
    display: flex;
    flex-direction: row;
    align-items: center;
    font-size: @subTitle;
    color: @thridfont;
    margin: 0.7rem 0 0 0.5rem;
    p {
      margin-left: 0.4rem;
    }
  }
}
</style>