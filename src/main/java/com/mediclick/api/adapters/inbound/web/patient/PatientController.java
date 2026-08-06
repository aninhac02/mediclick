package com.mediclick.api.adapters.inbound.web.patient;

import com.mediclick.api.adapters.inbound.web.patient.mapper.PatientWebMapper;
import com.mediclick.api.adapters.inbound.web.patient.request.PatientRequestDto;
import com.mediclick.api.adapters.inbound.web.patient.response.PatientResponseDto;
import com.mediclick.api.application.port.in.patient.PatientUseCase;
import com.mediclick.api.application.domain.patient.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientUseCase patientUseCase;
    private final PatientWebMapper patientWebMapper;

    @PostMapping
    public ResponseEntity<PatientResponseDto> create(@RequestBody PatientRequestDto patientDto) {
        Patient patient = patientUseCase.createPatient(patientWebMapper.toDomain(patientDto));
        return ResponseEntity.ok(patientWebMapper.toResponse(patient));
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<PatientResponseDto> findByCpf(@PathVariable String cpf) {
        Patient patient = patientUseCase.findByCpf(cpf);
        return ResponseEntity.ok(patientWebMapper.toResponse(patient));
    }

    @GetMapping
    public ResponseEntity<List<PatientResponseDto>> findAll() {
        var patientResponseDtoList = patientUseCase.findAll()
                .stream()
                .map(patientWebMapper::toResponse)
                .toList();
        return ResponseEntity.ok(patientResponseDtoList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        patientUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }


}
