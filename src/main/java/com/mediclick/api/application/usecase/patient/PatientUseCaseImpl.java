package com.mediclick.api.application.usecase.patient;

import com.mediclick.api.application.domain.patient.Patient;
import com.mediclick.api.application.port.in.patient.PatientUseCase;
import com.mediclick.api.application.port.out.patient.PatientDatabasePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PatientUseCaseImpl implements PatientUseCase {

    private final PatientDatabasePort patientDatabasePort;

    @Override
    public Patient createPatient(Patient patient) {
        return patientDatabasePort.save(patient);
    }

    @Override
    public Patient findByCpf(String cpf) {
        return patientDatabasePort.findByCpf(cpf);
    }

    @Override
    public List<Patient> findAll() {
        return patientDatabasePort.findAll();
    }

    @Override
    public void delete(Long id) {
        patientDatabasePort.delete(id);
    }
}
