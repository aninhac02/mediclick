package com.mediclick.api.application.port.in.patient;

import com.mediclick.api.application.domain.patient.Patient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PatientUseCase {

    Patient createPatient(Patient patient);
    Patient findByCpf(String cpf);
    List<Patient> findAll();
    void delete(Long id);
}
