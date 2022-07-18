package com.example.restJsonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PolicyLookupControler {
    private static final String template1 = " %s";
    private static final String template2 = " %s";
    private static final String template3 = " %s";
    private static final String template4 = " %s";

    @GetMapping("/policy")
    public PolicyLookup policyLookup(@RequestParam(value ="policyNumber", defaultValue= "p01") String policyNumber,
                                     @RequestParam(value ="incidentDate", defaultValue= "2020-03-04T07:18:44.059Z")String incidentDate,
                                     @RequestParam(value ="licensePlate", defaultValue= "ab12345") String licensePlate,
                                     @RequestParam(value ="vin", defaultValue= "TMADC51SABJ134901")String vin){
        return new PolicyLookup(String.format(template1, policyNumber),String.format(template2, incidentDate),
                String.format(template3, licensePlate),String.format(template4, vin));
    }

}
