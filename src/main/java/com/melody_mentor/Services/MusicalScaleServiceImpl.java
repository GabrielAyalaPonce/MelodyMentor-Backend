package com.melody_mentor.Services;

import com.melody_mentor.Entities.MusicalScale;
import com.melody_mentor.Repositories.MusicalScaleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicalScaleServiceImpl implements MusicalScaleService{
    @Autowired
    private MusicalScaleRepository musicalScaleRepository;


    @Override
    public List<MusicalScale> getAllScales() {
        return musicalScaleRepository.findAll();
    }

    @Override
    public List<MusicalScale> getScalesByType(String type) {
        return musicalScaleRepository.findByType(type);
    }
}



