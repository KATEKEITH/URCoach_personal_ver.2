<template>
  <div class="hello">
  <Toolbar></Toolbar>
  <MemberList/>
  <Footer></Footer>
  </div>
</template>

<script>
import Footer from '@/components/core/Footer.vue'
import Toolbar from '@/components/core/Toolbar.vue'
import MemberList from '@/components/views/MemberList.vue'


export default {
  name: 'home',
   components:{
    Footer,Toolbar,MemberList
  },
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
