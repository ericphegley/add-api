package com.synergisticit;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController  // Marks this class as an API controller
@RequestMapping("/api/v1") // Base URL for API
public class AddTwoNumbers {

    @GetMapping("/add")
    public Map<String, Integer> addNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return Map.of("result", result);
    }
}
