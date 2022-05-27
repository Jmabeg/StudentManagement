package es.eoi.jdbc.service;

import es.eoi.jdbc.repository.interfaces.StudentRepository;

public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


}
