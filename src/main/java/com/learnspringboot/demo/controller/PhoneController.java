package com.learnspringboot.demo.controller;

import com.learnspringboot.demo.models.Phone;
import com.learnspringboot.demo.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author tamvo
 * @created 09/03/2020 - 1:18 PM
 */

@Controller
public class PhoneController {

    @Autowired
    private PhoneRepository phoneRepository;

    @RequestMapping(value = "api/phones", method = RequestMethod.GET)
    public ResponseEntity<Object> getPhones(){
        List<Phone> phones = phoneRepository.findAll();
        if (phones == null){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(phones, HttpStatus.OK);
    }
}
