package com.mkm.springmvc.model;


import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien, Long> {
}
