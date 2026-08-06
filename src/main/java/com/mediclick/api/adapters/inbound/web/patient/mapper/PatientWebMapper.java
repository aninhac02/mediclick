package com.mediclick.api.adapters.inbound.web.patient.mapper;

import com.mediclick.api.adapters.inbound.web.patient.request.PatientRequestDto;
import com.mediclick.api.adapters.inbound.web.patient.response.PatientResponseDto;
import com.mediclick.api.application.domain.patient.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientWebMapper {

    Patient toDomain(PatientRequestDto patientRequestDto);

    PatientResponseDto toResponse(Patient patient);

}
