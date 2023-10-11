package shubhaDhang.service;

import shubhaDhang.data_access.StudentDao;
import shubhaDhang.model.Student;
import shubhaDhang.util.ScannerInputService;
import shubhaDhang.util.UserInputService;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {
    private final UserInputService scannerService;
    private final StudentDao studentDao;

    public StudentManagementConsoleImpl(UserInputService inputService, ScannerInputService scannerService, StudentDao studentDao) {
        this.scannerService = inputService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        String name = scannerService.getString();
        int id = scannerService.getInt();
        Student student = new Student(id, name);
        return student;
    }

    @Override
    public Student save(Student student) {
        if (student != null) {
            studentDao.save(student);
            return student;
        }
        throw new RuntimeException("Student is null");

    }

    @Override
    public Student find(int id) {
        studentDao.find(id);

        return new Student(id);
    }

    @Override
    public Student remove(int id) {
        studentDao.delete(id);
        return new Student(id);
    }

    @Override
    public List<Student> findAll() {
        List<Student> foundStudents = studentDao.findAll();
        return foundStudents;
    }

    @Override
    public Student edit(Student student) {
        student.setStudentName(student.getStudentName());

        return student;
    }
}
