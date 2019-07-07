<template>
<div>
  <Toolbar></Toolbar>
   
    <br>
    <div>
        <h1> modification</h1> 
    </div>
    </br>
<br></br>
<br>
<form>
    <div class="form-group">
      <label for="photo">Photo</label>
      <input type="text" class="form-control" id="photo" placeholder="photo" v-model="photo">
    </div>
    <div class="form-group">
      <label for="coachId">coachId</label>
      <input type="text" class="form-control" id="coachId" placeholder="coachId" v-model="coachId">
    </div>
    <div class="form-group">
      <label for="coachName">coachName</label>
      <input type="text" class="form-control" id="coachName" placeholder="coachName" v-model="coachName">
    </div>
    <div class="form-group">
      <label for="pwd">Password</label>
      <input type="password" class="form-control" id="pwd" placeholder="password" v-model="password">
    </div>
    <div class="form-group">
      <label for="coachLoc">coachLoc</label>
      <input type="text" class="form-control" id="coachLoc" placeholder="coachLoc" v-model="coachLoc">
    </div>
    <div class="form-group">
      <label for="coachLink">coachLink</label>
      <input type="text" class="form-control" id="coachLink" placeholder="coachLink" v-model="coachLink">
    </div>
     <div class="form-group">
      <label for="coachResume1">coachResume1</label>
      <input type="text" class="form-control" id="coachResume1" placeholder="coachResume1" v-model="coachResume1">
    </div>
    <div class="form-group">
      <label for="coachResume1">coachResume2</label>
      <input type="text" class="form-control" id="coachResume2" placeholder="coachResume1" v-model="coachResume2">
    </div>
    <div class="form-group">
      <label for="coachResume3">coachResume3</label>
      <input type="text" class="form-control" id="coachResume3" placeholder="coachResume3" v-model="coachResume3">
    </div>
     <div class="form-group">
      <label for="coachInfo">coachInfo</label>
      <input type="text" class="form-control" id="coachInfo" placeholder="coachInfo" v-model="coachInfo">
    </div>
    <button class="btn btn-default" @click="handleSaveClick">Update</button>
  </form>
</br>
  <Footer></Footer>
</div>
</template>

<script>
import axios from 'axios'
import Footer from '@/components/core/Footer.vue'
import Toolbar from '@/components/core/Toolbar.vue'


export default {
    name:'MemberModify',
    props:['coachId'],
    data() {
      return {
          context:'http://localhost:3000/coach',
          coach:{
            coachId: this.$route.params.coachId,
            coachName: '',
            password: '',
            coachLoc: '',
            coachInfo: '',
            coachLink: '',
            coachResume1: '',
            coachResume2: '',
            coachResume3: '',
            photo:''
          }
         }
     },
      components:{
       Footer,Toolbar
    },
    created(){
     axios.get(`http://localhost:3000/coach/${this.coachId}`)
     .then((res) =>{
     this.coachName = res.coachName;
     this.password  = res.password ;
     this.coachLoc  = res.coachLoc ;
     this.coachInfo  = res.coachInfo ;
     this.coachLink  = res.coachLink ;
     this.coachResume1  = res.coachResume1 ;
     this.coachResume2  = res.coachResume2 ;
     this.coachResume3  = res.coachResume3 ;
     this.photo   = res.photo  ;
     
     })
    },
     methods: {
     handleSaveClick(e){
            e.preventDefault();
            alert('클릭')
            let data = {
                coachId : this.coachId,
                coachName : this.coachName,
                password : this.password,
                coachLoc: this.coachLoc,
                coachInfo : this.coachInfo,
                coachLink : this.coachLink,
                coachResume1 : this.coachResume1,
                coachResume2 : this.coachResume2,
                coachResume3 : this.coachResume3,
                photo : this.photo,
                }
                let headers = {
                'Content-Type': 'application/json',
                'Authorization':'JWT fefege..'
                }
                axios.put(`http://localhost:3000/coach/${this.coachId}`,
                JSON.stringify(data),
                    { headers: headers })
                .then(() => {
                    alert('수정되었습니다.')
                    this.$router.push("/memberlist")
                })
                .catch(e => {
                    alert('ERROR')
                })
            }
       }  
}
</script>