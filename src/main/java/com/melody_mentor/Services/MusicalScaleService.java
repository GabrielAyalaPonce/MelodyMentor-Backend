package com.melody_mentor.Services;

import com.melody_mentor.Entities.MusicalScale;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MusicalScaleService {

    List<MusicalScale> getAllScales();
    List<MusicalScale> getScalesByType(String type);


}
