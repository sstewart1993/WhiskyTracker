package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/distill")
    public ResponseEntity<List<Distillery>> getAllDistilleries(
            @RequestParam(name="region", required = false)String region){
        if(region != null){
            return new ResponseEntity<>(distilleryRepository.findDistilleryByRegion(region), HttpStatus.OK);
        }
        return new ResponseEntity<>(distilleryRepository.findAll(), HttpStatus.OK);

    }
//
//    @GetMapping(value = "/distill/whiskey")
//    public ResponseEntity<List<Whisky>> getAllWhiskiesFromDistilleryWithAge(
//            @RequestParam(name="distillery", required = false)String distillery){
//        if(distillery != null){
//            return new ResponseEntity<>(distilleryRepository.)
//        }
//    }

//    @GetMapping(value = "/whisky")
//    public ResponseEntity<List<Whisky>> getAllWhiskiesForAnAge(
//    @RequestParam(name="age", required = false)String age){
//        if(age != null){
//            return new ResponseEntity<>(whiskyRepository.findWhiskiesByAge(12), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
//    }


}
