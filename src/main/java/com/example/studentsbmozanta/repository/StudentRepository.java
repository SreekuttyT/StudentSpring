
package com.example.studentsbmozanta.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.studentsbmozanta.model.Student;
//import org.springframework.data.mongodb.core.mapping.Document;

@Repository
//@Document

public interface StudentRepository extends MongoRepository<Student, Long> {

	

}
