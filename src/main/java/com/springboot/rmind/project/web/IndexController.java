package com.springboot.rmind.project.web;

import com.springboot.rmind.project.web.dto.IndexResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "This is index.page";
    }

    @GetMapping("/index/dto")
    public IndexResponseDto indexDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new IndexResponseDto(name, amount);
    }
}
