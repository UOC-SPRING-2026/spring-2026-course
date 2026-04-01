package edu.uoc.epcsd.course.domain.repository;

import edu.uoc.epcsd.course.domain.Enrollment;
import edu.uoc.epcsd.course.infrastructure.repository.jpa.EnrollmentEntity;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository {

    List<Enrollment> findAllEnrollment();
    
    List<Enrollment> findEnrollmentByCourse(Long id);
    
    Optional<Enrollment> findEnrollmentByStudent(String userEmail);
    
    EnrollmentEntity createEnrollment(Enrollment enrollment);

    EnrollmentEntity updateEnrollment(Enrollment enrollment);

	Optional<Enrollment> getEnrollmentById(Long Id);

}
