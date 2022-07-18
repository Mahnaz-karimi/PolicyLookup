package com.example.restJsonService;
import java.time.LocalDate;

import lombok.Data;

@Data
public class PolicyLookup {

    private final String policyNumber;
    private final String incidentDate;
    private final String licensePlate;
    private final String vin;
}
