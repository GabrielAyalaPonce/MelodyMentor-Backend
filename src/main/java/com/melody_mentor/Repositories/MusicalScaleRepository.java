package com.melody_mentor.Repositories;

import com.melody_mentor.Entities.MusicalScale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicalScaleRepository extends JpaRepository<MusicalScale,Long> {
    List<MusicalScale> findByType(String type);
}
