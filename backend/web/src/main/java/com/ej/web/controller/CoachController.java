package com.ej.web.controller;

import java.util.ArrayList;
import java.util.List;

import com.ej.web.domain.CoachDTO;
import com.ej.web.entities.Coach;
import com.ej.web.repositories.CoachRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CoachController
 */

@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired CoachDTO coach;
    @Autowired ModelMapper modelMapper;
    @Autowired CoachRepository repo;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @GetMapping("")
    public Iterable<CoachDTO> findAll() {
     Iterable<Coach> entities = repo.findAll();
     System.out.println(entities);
     List<CoachDTO> list = new ArrayList<>();
     for(Coach s: entities){
         CoachDTO coach = modelMapper.map(s, CoachDTO.class);
         list.add(coach);
     }
     System.out.println("값들어오는지 확인:"+list);
        return list;
    }
    
    // @GetMapping("")
    // public findbyId(){

    // }

    // @GetMapping("/{Id}")
    // public CoachDTO findbyId(@PathVariable String id){
    //     return modelMapper.map(repo.findById(Long.parseLong(id)).get(),CoachDTO.class);
    // }
    
    // @GetMapping("/{coachId}")
    // public CoachDTO findbyId(@PathVariable String coachId){
    //     return modelMapper.map(repo.findCoachByCoachid(Long.parseLong(coachId)),CoachDTO.class);
    // }

    @PostMapping("")
    public void save(@RequestBody CoachDTO dto){
        Coach coach = new Coach();
       
        coach.setCoachId(dto.getCoachId());
        coach.setCoachName(dto.getCoachName());
        coach.setPassword(dto.getPassword());
        coach.setCoachLoc(dto.getCoachLoc());
        coach.setCoachInfo(dto.getCoachInfo());
        coach.setCoachLink(dto.getCoachLink());
        coach.setCoachResume1(dto.getCoachResume1());
        coach.setCoachResume2(dto.getCoachResume2());
        coach.setCoachResume3(dto.getCoachResume3());
        coach.setPhoto(dto.getPhoto());
        repo.save(coach);

        System.out.println("들어감");
    }


     
    @GetMapping("/{coachId}")
    public CoachDTO findByCoachId(@PathVariable String coachId){
        System.out.println(coachId);
        CoachDTO d = modelMapper.map(repo.findByCoachId(coachId), CoachDTO.class);
        System.out.println("이거확인해야함:"+d.getCoachId()+d.getCoachInfo());
        // System.out.println(
        // d.getCoachId()+" : "+
        // d.getCoachInfo()+" : "+
        // d.getCoachLink()+" : "+
        // d.getCoachLoc()+" : "+
        // d.getCoachName()+" : "+
        // d.getCoachResume1()+" : "+
        // d.getCoachResume2()+" : "+
        // d.getCoachResume3()+" : "+
        // d.getPassword()+" : "+
        // d.getPhoto());
        return d;
    }



    @PutMapping("/{coachId}") 
    public void update(@PathVariable String coachId, @RequestBody CoachDTO dto){
        Coach entity = repo.findByCoachId(coachId);
        entity.setCoachId(dto.getCoachId());
        entity.setCoachName(dto.getCoachName());
        entity.setPassword(dto.getPassword());
        entity.setCoachLoc(dto.getCoachLoc());
        entity.setCoachInfo(dto.getCoachInfo());
        entity.setCoachLink(dto.getCoachLink());
        entity.setCoachResume1(dto.getCoachResume1());
        entity.setCoachResume2(dto.getCoachResume2());
        entity.setCoachResume3(dto.getCoachResume3());
        coach.setPhoto(dto.getPhoto());
        repo.save(entity);
    }


    @DeleteMapping("/{coachId}")
    public void deleteById(@PathVariable String coachId){
        System.out.println("삭제컨트롤러");
        Coach entity = repo.findByCoachId(coachId);
        repo.deleteById(entity.getId());
    }


    
}