package com.en.newproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
@GetMapping("/")
public String pravisht(){
    return "Pravisht";
}


}
