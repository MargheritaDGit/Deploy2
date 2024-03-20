package com.example.Deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping ("/api")
public class BasicController {
    @GetMapping("/random")
    public Integer sum() {
        Random random = new Random();
        Integer x = random.nextInt();
        Integer y = random.nextInt();
        return x+y;
    }

}
