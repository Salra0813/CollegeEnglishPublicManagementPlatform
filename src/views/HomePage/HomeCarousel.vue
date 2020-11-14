<template>
  <div class="HomeCarousel">
    <el-carousel :interval="4000" type="card" indicator-position ="none">
      <el-carousel-item v-for="(item, index) in picUrl" :key="index">
        <img :src="item" />
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
export default {
  data() {
    return {
      picUrl: [
        require("../../static/img/Carousel_1.png"),
        require("../../static/img/Carousel_2.png"),
        require("../../static/img/Carousel_3.png"),
      ],
    };
  },
};
</script>

<style lang = "less" scoped>
@carouselWidth: 67rem;
@carouselHeight: 20rem;

/deep/.el-carousel {
  height: @carouselHeight;
  width: @carouselWidth;
  .el-carousel__item {
    img {
      height: 100%;
      width: 100%;
      border: 4px black solid;
    }
  }
}
</style>