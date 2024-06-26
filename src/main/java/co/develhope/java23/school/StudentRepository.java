package co.develhope.java23.school;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository <Student, Long>{

    Student findById(long id);
}
