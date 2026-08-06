package com.mediclick.api.adapters.outbound.database.patient.document;

import com.mediclick.api.application.domain.address.Address;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Patient")
public class PatientDocument {

    @Id
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String phone;
    private Address address;
}
