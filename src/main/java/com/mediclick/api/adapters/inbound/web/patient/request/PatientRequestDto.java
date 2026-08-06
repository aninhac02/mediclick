package com.mediclick.api.adapters.inbound.web.patient.request;

import com.mediclick.api.application.domain.address.Address;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatientRequestDto {

    private String name;
    private String cpf;
    private String email;
    private String phone;
    private Address address;
}
