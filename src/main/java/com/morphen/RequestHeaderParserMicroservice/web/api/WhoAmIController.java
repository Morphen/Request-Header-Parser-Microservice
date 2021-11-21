package com.morphen.RequestHeaderParserMicroservice.web.api;

import com.morphen.RequestHeaderParserMicroservice.models.WhoAMI;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class WhoAmIController {

    @ResponseBody
    @GetMapping("/whoami")
    public WhoAMI listAllHeaders(@RequestHeader Map<String, String> headers) {
        WhoAMI whoiam = new WhoAMI();
        headers.forEach((key, value) -> {
            whoiam.setLanguage(value);
        });
        System.out.println(whoiam.getSoftware());
        return whoiam;
    }
}
