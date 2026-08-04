package com.mediclick.api.adapters.inbound.controller;

import com.mediclick.api.adapters.inbound.dtos.request.PatientRequestDto;
import com.mediclick.api.adapters.inbound.dtos.response.PatientResponseDto;
import com.mediclick.api.application.usecase.PatientUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientUseCase patientUseCase;


    public ResponseEntity<PatientResponseDto> save(@RequestBody PatientRequestDto patientDto) {
        // 1. Mapeia DTO para Domínio
        // 2. Chama o caso de uso: patientUseCase.createPatient(patient)
        // 3. Mapeia Domínio de volta para DTO e retorna

        return null;
    }


}
