package cn.gekal.sample.yugabyte.repository.mapper;

import cn.gekal.sample.yugabyte.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface StudentMapper {

    @Select("SELECT id, name, age, language FROM student;")
    List<Student> findAllStudents();

    @Select("SELECT id, name, age, language FROM student WHERE id = #{id};")
    Optional<Student> getStudentById(@Param("id") Integer id);
}
