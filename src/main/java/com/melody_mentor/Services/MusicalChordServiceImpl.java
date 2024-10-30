package com.melody_mentor.Services;

import com.melody_mentor.Entities.MusicalChord;
import com.melody_mentor.Repositories.MusicalChordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicalChordServiceImpl implements MusicalChordService{

    @Autowired
    private MusicalChordRepository musicalChordRepository;
    @Override
    public List<MusicalChord> getChordsByType(String type) {
        return musicalChordRepository.findChordByType(type);

    }

    @Override
    public List<MusicalChord> getAllChords() {
        return musicalChordRepository.findAll();
    }
}
