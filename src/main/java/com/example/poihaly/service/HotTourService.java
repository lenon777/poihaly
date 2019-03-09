package com.example.poihaly.service;

import com.example.poihaly.entity.HotTour;

import java.util.List;
import java.util.Optional;

public interface HotTourService {


    void save(HotTour hotTour);

    List<HotTour> findAll();

    Optional<HotTour> findById(int id);

    void deleteById(int id);
}
