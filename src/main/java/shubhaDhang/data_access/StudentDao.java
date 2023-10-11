package shubhaDhang.data_access;

import shubhaDhang.model.Student;

import java.util.List;

public interface StudentDao {
    Student save(Student student);
    Student find(int id);
    List<Student>findAll();
    void delete(int id);
}
