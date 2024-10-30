package com.melody_mentor.Repositories;

import com.melody_mentor.Entities.MusicalChord;
import com.melody_mentor.Entities.MusicalScale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MusicalChordRepository extends JpaRepository<MusicalChord,Long> {
    List<MusicalChord> findChordByType(String type);


}
