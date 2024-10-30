package com.melody_mentor.Controllers;

import com.melody_mentor.Entities.MusicalScale;
import com.melody_mentor.Services.MusicalScaleService;
import com.melody_mentor.Services.MusicalScaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musical-scales")
@CrossOrigin
public class MusicalScaleController {
    @Autowired
    private MusicalScaleService musicalScaleService;

    @GetMapping
    public List<MusicalScale> getScales(@RequestParam(required = false) String type) {
        if (type != null && !type.isEmpty()) {
            return musicalScaleService.getScalesByType(type);
        } else {
            return musicalScaleService.getAllScales();
        }
    }


}
