package cn.gekal.sample.yugabyte.service;

import cn.gekal.sample.yugabyte.model.Student;
import cn.gekal.sample.yugabyte.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAllStudents() {
        return this.studentRepository.findAllStudents();
    }

    public Optional<Student> getStudentById(Integer id) {
        return this.studentRepository.getStudentById(id);
    }
}
