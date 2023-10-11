package shubhaDhang.data_access.Impl;

import jdk.internal.net.http.common.SSLTube;
import org.springframework.stereotype.Component;
import shubhaDhang.data_access.StudentDao;
import shubhaDhang.exception.StudentEmptyException;
import shubhaDhang.model.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {
    private List<Student> students;

    public StudentDaoImpl(List<Student> students) {
        this.students = students;
    }

    public Student save(Student student) {
        students.add(student);
        return student;

    }

    public Student find(int id) {
        for (Student s:students
             ) {
            if(s.getId()==id)
                return s;}
        return null;
    }

    public List<Student> findAll() {
        List<Student> allStudents=new ArrayList<>();
        for (Student s:allStudents) {
            System.out.println(s.toString());
        }
        return allStudents;
    }

    public void delete(int id) {
        students.removeIf(student->student.getId()==id);
    }
}
