<template>

  <div>
     <Toolbar></Toolbar>
        <br></br>
       <div>{{this.coachName}}</div>
        <br></br>
        <img src="https://placeimg.com/1200/480/men"/>
       
        <br></br>
     
           <h1 class="font-weight-light mb-4">About Coach</h1>
           <!-- 'I will be the leader of a company that ends up being worth billions of dollars, because I got the answers. I understand culture. I am the nucleus. I think that’s a responsibility that I have, to push possibilities, to show people, this is the level that things could be at.' -->
           {{coachInfo}}
        
        <br></br>
           <h3>Link</h3>
          
          <span>
          <a href= "https://www.instagram.com/hongsick/">{{coachLink}}</a>
          <p>{{id}}</p>
          </span>
     
       <br></br>
      
           <h3>career</h3>
          <span>
          {{coachResume1}}
          </span>
          <div>
           <br></br>
          <span>
          {{coachResume2}}
          </span>
          </div>
          <div>
           <br></br>
          <span>
           {{coachResume3}}
          </span>
          </div>
         <br></br>
     
         <div>
         <div class="mapouter">
         <div class="gmap_canvas">
            <iframe
              id="gmap_canvas"
              width="100%"
              height="100%"
              src="https://maps.google.com/maps?q=google&t=&z=13&ie=UTF8&iwloc=&output=embed"
              frameborder="0"
              scrolling="no"
              marginheight="0"
              marginwidth="0"
             />
          </div>
          </div>
          </div> 
        
            <br></br>
            <button class="btn btn-default" @click="modify">modify</button>
            <button class="btn btn-danger" @click="deleteById">delete</button>
            <br></br>
            <br></br>
            <br></br>
      
      </div>
</template>

<script>
import axios from 'axios'
import Footer from '@/components/core/Footer.vue'
import Toolbar from '@/components/core/Toolbar.vue'

export default {

 data(){
  return {
      context: 'http://localhost:3000/coach',
     
      coachId: this.$route.params.coachId,
      coachName: '',
      coachInfo:'',
      coachLink:'',
      coachResume1:'',
      coachResume2:'',
      coachResume3:''
    }
  },
   components:{
     Toolbar, Footer
  },
  //  beforeRouteEnter(to,from,next){
  //     axios.get(to.params.coachId)
  //      .then((res) => {
  //         next( vm =>{
  //                vm.coach = res
  //         })
  //      }).catch((e) =>{
  //        next(false)
  //      })
  //    },
      methods:{
        read(){
          axios.get(`http://localhost:3000/coach/${this.coachId}`)
          .then( res => {
              this.coachName = res.data.coachName
              this.coachInfo = res.data.coachInfo
              this.coachLink = res.data.coachLink
              this.coachResume1 = res.data.coachResume1
              this.coachResume2 = res.data.coachResume2
              this.coachResume3 = res.data.coachResume3
          })
            .catch((e)=>{
              alert('안됨 ㅠㅠ')
            })
        },
         modify(){
            this.$router.push('/membermodify/'+ this.coachId)
        },
         deleteById(){
          axios.delete(`http://localhost:3000/coach/${this.coachId}`)
           .then(() => {
             alert('삭제성공')
                this.$router.push('Home')
         })
      },
    },
    beforeMount () {
      this.read()
    }
  }
</script>


