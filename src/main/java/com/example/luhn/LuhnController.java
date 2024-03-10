package com.example.luhn;


import org.springframework.web.bind.annotation.*;

@RestController
public class LuhnController {


    @GetMapping("/validate/{num}")
    public boolean validate(@PathVariable(name = "num") String num) {
        return LuhnUtil.compute(num);
    }

}
