package io.github.brfreitas.rest.versioning.api.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping(produces = "application/vnd.github.brfreitas-v1+json")
    public Greeting getGreetingVersion1(){
        return new Greeting("Seja bem vindo");
    }

    @GetMapping(produces = {"application/vnd.github.brfreitas-v2.2+json"})
    public Greeting getGreetingVersion2(){
        return new Greeting("Sea bienvenido");
    }

    @GetMapping(produces = {"application/vnd.github.brfreitas-v3+json", "*/*"})
    public Greeting getGreetingVersion3(){
        return new Greeting("welcome");
    }

}
