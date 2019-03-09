package com.example.poihaly.service.impl;

import com.example.poihaly.dao.HotTourDao;
import com.example.poihaly.entity.HotTour;
import com.example.poihaly.service.HotTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotTourServiceImpl implements HotTourService {

    @Autowired
    HotTourDao hotTourDao;

    @Override
    public void save(HotTour hotTour) {
        hotTourDao.save(hotTour);

    }

    @Override
    public List<HotTour> findAll() {
        return hotTourDao.findAll();
    }

    @Override
    public Optional<HotTour> findById(int id) {
        return hotTourDao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        hotTourDao.deleteById(id);

    }
}
