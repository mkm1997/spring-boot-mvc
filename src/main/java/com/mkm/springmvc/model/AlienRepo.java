package com.mkm.springmvc.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Long> {
//    @Query("from Alien where name= :name")
    //fisrt part should be findBy or getBy
    public List<Alien> getByName(String name);
    public List<Alien> getByNameOrderByIdDesc(String name);
    @Query("from Alien where name= :name")
    List<Alien> name(@Param("name")String  name);
}
