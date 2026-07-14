package com.mediclick.api.domain.appointment;

import java.math.BigDecimal;
import java.util.UUID;

public class Appointment {

    private UUID id;
    private UUID patientId;
    private UUID doctorId;
    private boolean healthInsurance;
    private BigDecimal price;
}
