package com.melody_mentor.Services;

import com.melody_mentor.Entities.MusicalRhythm;
import com.melody_mentor.Repositories.MusicalRhythmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicalRhythmServiceImpl {
    private MusicalRhythmRepository musicalRhythmRepository;

    public List<MusicalRhythm> getAllRhythm(){
        return musicalRhythmRepository.findAll();
    }
    public MusicalRhythm getRhythmById(Long id){
        return musicalRhythmRepository.findById(id).orElse(null);
    }
}
