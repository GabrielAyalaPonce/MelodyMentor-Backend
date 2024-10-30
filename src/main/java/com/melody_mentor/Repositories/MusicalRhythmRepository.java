package com.melody_mentor.Repositories;

import com.melody_mentor.Entities.MusicalChord;
import com.melody_mentor.Entities.MusicalRhythm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicalRhythmRepository extends JpaRepository<MusicalRhythm,Long> {
}
