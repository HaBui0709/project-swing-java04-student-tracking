/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import libs.DBConnectionLibs;
import utils.DBConnectionUtils;

/**
 *
 * @author KimAnh
 */
public class StudentDao {
    public List<Student> getStudents() throws SQLException, ClassNotFoundException{
        List<Student> students = new ArrayList<>();
        Connection conn = DBConnectionLibs.getMySQLConnection(DBConnectionUtils.HOST_NAME, 
                DBConnectionUtils.DB_NAME, DBConnectionUtils.USERNAME, DBConnectionUtils.PASSWORD);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(DBConnectionUtils.SQL_QUERY);
        while(rs.next()){
            Student student = new Student(rs.getInt("student_id"), rs.getString("fullname"), 
                    rs.getBoolean("gender"), rs.getDate("date_of_birth").toLocalDate() ,
                    rs.getString("phone"), rs.getString("email"), 
                    rs.getString("flink"), rs.getString("work_place"), rs.getString("address"), 
                    rs.getString("description"), rs.getString("status"));
            students.add(student);
        }
        return students;
    }
}
