package com.lectorium.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lectorium.model.Publisher;
import com.lectorium.services.IpublisherService;
// import com.lectorium.services.PublisherService;

// import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

//http://localhost:8081/publishers
@RestController
@RequestMapping("/publishers")
// @AllArgsConstructor
@RequiredArgsConstructor
public class PublisherController {
    // @Autowired
    private final IpublisherService service;

    @GetMapping
    public Publisher savePublisher() {
        // service = new PublisherService();
        return service.saveAndValid(new Publisher(1, "UPN"));
    }
}