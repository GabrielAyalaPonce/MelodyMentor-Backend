package com.melody_mentor.Controllers;

import com.melody_mentor.Entities.MusicalChord;
import com.melody_mentor.Entities.MusicalScale;
import com.melody_mentor.Services.MusicalChordService;
import com.melody_mentor.Services.MusicalScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("musical-chords")
@CrossOrigin
public class MusicalChordController {

    @Autowired
    private MusicalChordService musicalChordService;

    @GetMapping
    public List<MusicalChord> getChordsByType(@RequestParam(required = false) String type) {
        if (type != null && !type.isEmpty()) {
            return musicalChordService.getChordsByType(type);
        } else {
            return musicalChordService.getAllChords();
        }
    }
}
