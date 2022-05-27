package es.eoi.jdbc.repository.interfaces;

import es.eoi.jdbc.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface StudentRepository {


    public Student findById(String id);

    public List<Student> findAll();

    public Student create(Student student);

    public boolean delete(String id);

    public Student update(Student student);



}
