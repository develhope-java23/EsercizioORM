package co.develhope.java23.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/students")
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/{id}")
    public Student getId(@PathVariable long id){
        return studentRepository.findById(id);
    }

    @PostMapping
    public Student createStudent (@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping
    public Collection<Student> findAllStudents () {
        return studentRepository.findAll();
    }
}
