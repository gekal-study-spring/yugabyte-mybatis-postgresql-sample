package cn.gekal.sample.yugabyte.controller;

import cn.gekal.sample.yugabyte.model.Student;
import cn.gekal.sample.yugabyte.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class TestController {

    private final StudentService studentService;

    public TestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {

        return this.studentService.findAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id) {

        return this.studentService.getStudentById(id);
    }
}
