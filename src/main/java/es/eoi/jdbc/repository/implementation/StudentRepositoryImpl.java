package es.eoi.jdbc.repository.implementation;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.interfaces.StudentRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private Connection openConnection() throws SQLException {
        final String url = "jdbc:mysql://127.0.0.1:3306/jdbcproject";
        final String user = "root";
        final String password = "1234";

        return DriverManager.getConnection(url, user, password);
    }


    public Student findById(String id) {
        return null;
    }


    public List<Student> findAll() {
        return null;
    }


    public Student create(Student student) {
        return null;
    }


    public boolean delete(String id) {
        return false;
    }


    public Student update(Student student) {
        return null;
    }
}
