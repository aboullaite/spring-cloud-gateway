package me.aboullaite.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/books")
    public ResponseEntity<List> booksFallback(){
        return ResponseEntity.ok(Arrays.asList());
    }
}
