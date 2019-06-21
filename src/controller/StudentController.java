/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Student;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import service.StudentService;

/**
 *
 * @author KimAnh
 */
public class StudentController {
	// hello I'm habui
    private final JTable tbStudent;

    public StudentController(JTable tbStudent) {
        this.tbStudent = tbStudent;
    }

    public List<Student> getStudents() {
        try {
            return new StudentService().getStudents();
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void createTable() {
        List<Student> students = getStudents();
        //students.add(new Student(1, "Habui", true, LocalDate.of(1997, Month.MARCH, 1), "12345", "ha.bk7997@gmail.com", "fb.com", "DHBK", "DN", "no", "available"));
        tbStudent.setModel(new StudentTableModel(students));
    }

    class StudentTableModel extends AbstractTableModel {

        private final List<Student> students;

        private StudentTableModel(List<Student> students) {
            this.students = students;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "STT";
                case 1:
                    return "Họ và tên";
                case 2:
                    return "Giới tính";
                case 3:
                    return "Ngày sinh";
                case 4:
                    return "Số điện thoại";
                case 5:
                    return "Email";
                case 6:
                    return "Facebook";
                case 7:
                    return "Nơi công tác";
                case 8:
                    return "Địa chỉ";
                case 9:
                    return "Mô tả";
                case 10:
                    return "Trạng thái";
            }
            return null;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 2){
                return Boolean.class;
            }
            return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
        }

        
        
        @Override
        public int getRowCount() {
            return students.size();
        }

        @Override
        public int getColumnCount() {
            return Student.class.getDeclaredFields().length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {

            Student student = students.get(rowIndex);
            
            switch (columnIndex) {
                case 0:
                    return student.getStudentId();

                case 1:
                    return student.getFullName();

                case 2:
                    return student.isGender();

                case 3:
                    return student.getDateOfBirth();

                case 4:
                    return student.getPhone();

                case 5:
                    return student.getEmail();

                case 6:
                    return student.getFlink();

                case 7:
                    return student.getWorkplace();

                case 8:
                    return student.getAddress();

                case 9:
                    return student.getDescription();

                case 10:
                    return student.getStatus();
            }
            return null;
        }

    }
}
