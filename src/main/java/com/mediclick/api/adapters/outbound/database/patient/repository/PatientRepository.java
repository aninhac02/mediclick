package com.mediclick.api.adapters.outbound.database.patient.repository;

import com.mediclick.api.adapters.outbound.database.patient.document.PatientDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<PatientDocument, Long> {

}
