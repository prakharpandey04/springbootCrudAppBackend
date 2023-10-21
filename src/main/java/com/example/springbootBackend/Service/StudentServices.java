package com.example.springbootBackend.Service;


import com.example.springbootBackend.Entity.Student;
import com.example.springbootBackend.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;

    public void saveorUpdate(Student students) {

        repo.save(students);

    }



    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(String studentId) {
        return repo.findById(studentId).get();
    }

    public Iterable<Student> listAll() {
        return this.repo.findAll();
    }


}
