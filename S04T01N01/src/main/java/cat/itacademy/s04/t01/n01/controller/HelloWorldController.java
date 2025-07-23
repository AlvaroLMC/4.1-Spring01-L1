package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // Method using @RequestParam
    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Maven project.";
    }

    // Method using @PathVariable (optional)
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        if (name == null) name = "UNKNOWN";
        return "Hello, " + name + ". You are running a Maven project.";
    }
}


/* PRUEBAS
http://localhost:9000/HelloWorld?name=Alvaro
http://localhost:9000/HelloWorld?

http://localhost:9000/HelloWorld2/Laura
http://localhost:9000/HelloWorld2 */
