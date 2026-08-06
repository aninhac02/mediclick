package com.mediclick.api.adapters.outbound.database.patient.mapper;

import com.mediclick.api.adapters.outbound.database.patient.document.PatientDocument;
import com.mediclick.api.application.domain.patient.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    PatientDocument toDocument(Patient patient);

    Patient toDomain(PatientDocument patientDocument);
}
