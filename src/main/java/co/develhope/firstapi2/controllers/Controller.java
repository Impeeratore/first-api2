package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial1")

public class Controller {

    @GetMapping("/{n}")
    public int getFactorial1(@PathVariable int n){
        int factorial1 = n;
        for (int i= n-1; i > 0; i--) factorial1*=i;
        return factorial1;
    }
}
