package com.melody_mentor.Services;

import com.melody_mentor.Entities.MusicalChord;
import com.melody_mentor.Entities.MusicalScale;
import com.melody_mentor.Repositories.MusicalChordRepository;

import java.util.List;

public interface MusicalChordService {

List<MusicalChord> getChordsByType(String type);

List<MusicalChord> getAllChords();

}
