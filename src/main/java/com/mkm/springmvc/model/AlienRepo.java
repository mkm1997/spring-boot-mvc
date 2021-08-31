package com.mkm.springmvc.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Long> {
//    @Query("from Alien where name= :name")
    public List<Alien> getByName(String name);
}
