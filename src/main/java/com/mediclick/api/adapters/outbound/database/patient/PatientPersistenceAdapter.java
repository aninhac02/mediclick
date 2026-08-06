package com.mediclick.api.adapters.outbound.database.patient;

import com.mediclick.api.adapters.outbound.database.patient.document.PatientDocument;
import com.mediclick.api.adapters.outbound.database.patient.mapper.PatientMapper;
import com.mediclick.api.adapters.outbound.database.patient.repository.PatientRepository;
import com.mediclick.api.application.domain.patient.Patient;
import com.mediclick.api.application.port.out.patient.PatientDatabasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PatientPersistenceAdapter implements PatientDatabasePort {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    @Override
    public Patient save(Patient patient) {
        PatientDocument patientDocument = patientMapper.toDocument(patient);
        PatientDocument savedPatient = patientRepository.save(patientDocument);

        return patientMapper.toDomain(savedPatient);
    }

    @Override
    public Patient findByCpf(String cpf) {
        //REFATORAR DEPOIS
        PatientDocument patientDocument = patientRepository.findById(0L).get();
        return patientMapper.toDomain(patientDocument);
    }

    @Override
    public List<Patient> findAll() {
        List<PatientDocument> patientDocumentList = patientRepository.findAll();
        return patientDocumentList.stream()
                .map(patientMapper::toDomain)
                .toList();
    }

    @Override
    public void delete(Long id) {
        patientRepository.deleteById(id);

    }
}
