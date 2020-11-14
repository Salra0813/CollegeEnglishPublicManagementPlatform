<template>
  <div class="HomePage">
    <home-carousel></home-carousel>
    <class-area></class-area>
    <class-second-area></class-second-area>
    <learn-area></learn-area>
  </div>
</template>

<script>
import HomeCarousel from "../HomePage/HomeCarousel"
import ClassArea from "../HomePage/ClassArea"
import ClassSecondArea from "../HomePage/ClassSecondArea"
import LearnArea from "../HomePage/LearnArea"

export default {
  name:"HomePage",
  components:{
    HomeCarousel,
    ClassArea,
    ClassSecondArea,
    LearnArea,
  }
}
</script>

<style lang="less" scoped>
@import url("/src/style/Common.less");
.HomePage{
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color: white;
    .HomeCarousel{
      margin-top: 6rem;
    }
}
</style>