package com.mkm.springmvc;

import com.mkm.springmvc.model.Alien;
import com.mkm.springmvc.model.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;

    @GetMapping(value = "/aliens", produces = "application/json")
    public List<Alien> getAliens(){
        List<Alien> aliens = repo.findAll();
        System.out.println(aliens);
        return aliens;
    }

    @GetMapping("/alien/{id}")
    public Alien getAlien(@PathVariable("id") Long id){
        System.out.println("helloooooooooooo  ");
        System.out.println("In add alien request" + id);
        Alien a = repo.findById(id).orElse(new Alien(0L,"",0));
        return a;
    }

    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal){
        return principal;
    }



}
