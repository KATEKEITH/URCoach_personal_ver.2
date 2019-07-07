import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import MemberList from '@/components/views/MemberList'
import MemberModify from '@/components/views/MemberModify'
import Typography from '@/components/views/Typography'
import UserProfile from '@/components/views/UserProfile'


Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/memberlist',
      // Relative to /src/views
      view: 'MemberList',
      component: MemberList,
      props: true
    },
    {
      path: '/user-profile',
      name: 'User Profile',
      component: UserProfile,
      view: 'UserProfile',
      props: true
    },
    {
      path: '/typography/:coachId',
      name: 'Typography',
      component: Typography,
      view: 'Typography',
      props: true
    },
    {
      path: '/membermodify/:coachId',
      name: 'MemberModify',
      component: MemberModify,
      view: 'MemberModify',
      props: true
    }
  ]
})
