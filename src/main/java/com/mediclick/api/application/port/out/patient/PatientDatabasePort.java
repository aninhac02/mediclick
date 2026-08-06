package com.mediclick.api.application.port.out.patient;

import com.mediclick.api.application.domain.patient.Patient;

import java.util.List;

public interface PatientDatabasePort {

    Patient save(Patient patient);
    Patient findByCpf(String cpf);
    List<Patient> findAll();
    void delete(Long id);
}
