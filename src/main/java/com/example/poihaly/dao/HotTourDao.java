package com.example.poihaly.dao;


import com.example.poihaly.entity.HotTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotTourDao extends JpaRepository<HotTour,Integer> {
}
