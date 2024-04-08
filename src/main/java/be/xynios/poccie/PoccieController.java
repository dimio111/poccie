package be.xynios.poccie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PoccieController {

    @GetMapping("/greeting")
    public Map<String, String> hello(){
        return Map.of("Hello", "boys");
    }
}
