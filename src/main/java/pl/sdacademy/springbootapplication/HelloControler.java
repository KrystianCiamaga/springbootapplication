package pl.sdacademy.springbootapplication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @RequestMapping("/")
    public String index(){

        return "Greetings from Spring";

    }


    @RequestMapping("/users/{name}")
    public String users(@PathVariable String name){
        return "Hello" + name;

    }



}
