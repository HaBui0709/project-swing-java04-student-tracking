/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.StudentDao;
import entity.Student;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KimAnh
 */
public class StudentService {
    private StudentDao studentDao = new StudentDao();
    public List<Student> getStudents() throws SQLException, ClassNotFoundException{
        return studentDao.getStudents();
    }
    
    public static void main(String[] args) {
        try {
            new StudentService().getStudents().forEach(s -> System.out.println(s));
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
