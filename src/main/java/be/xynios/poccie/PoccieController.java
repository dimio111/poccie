package be.xynios.poccie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PoccieController {

    @GetMapping("/greeting")

    public Map<String, String> hello(){
        Map<String, String> resp = new HashMap<>();
        resp.put("Hello", "Boys");
        String who = System.getenv("who");
        if (who != null) {
            resp.put("and", who);
        }
        return resp;
    }
}
