package cn.gekal.sample.yugabyte.repository;

import cn.gekal.sample.yugabyte.model.Student;
import cn.gekal.sample.yugabyte.repository.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {

    private final StudentMapper studentMapper;

    public StudentRepository(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public List<Student> findAllStudents() {
        return this.studentMapper.findAllStudents();
    }

    public Optional<Student> getStudentById(Integer id) {
        return this.studentMapper.getStudentById(id);
    }
}
