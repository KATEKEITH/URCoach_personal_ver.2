
<template>
    <div>
      <div  v-for="coach in coaches" :key="coach">
       <a @click="detail(coach)"><img src= "https://placeimg.com/100/100/any"/></a>
       <!-- <img src= "https://placeimg.com/100/100/any"/>    -->
       <!-- <a href="typography" ><img src= "https://placeimg.com/100/100/any"/></a> -->
       <!-- <a href="typography"><img src= {{coach.photo}}/></a> -->
       <!-- <a href="typography"><img :src= "coach.photo"/></a> -->
              <!-- {{coach.coachId}} -->
             <div>{{ coach.coachName }}</div>
             <div>{{ coach.coachLoc }} </div>
        </div>
    </div> 
  
  </template>
     

<script>
import axios from 'axios'
import Footer from '@/components/core/Footer.vue'
import Toolbar from '@/components/core/Toolbar.vue'

 

export default {
 data () {
   return {
      context: 'http://localhost:3000/coach',
      coaches: []
   }
 },
  methods:{
   detail(coach){
    alert(`${coach.coachId}`)
    this.$router.push({name:'Typography', params:{ coachId:`${coach.coachId}`}})
  }
 },
  created(){
   axios.get(`${this.context}`).then((res) =>{
     this.coaches = res.data;
     alert(this.coaches)
   })
 }
}
</script>

