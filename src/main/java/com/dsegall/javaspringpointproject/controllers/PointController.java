package com.dsegall.javaspringpointproject.controllers;

        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PointCalculator")
public class PointController {

    @GetMapping("/home")
    public ResponseEntity<String> get () {

        return ResponseEntity.ok("Hello World");
    }

}