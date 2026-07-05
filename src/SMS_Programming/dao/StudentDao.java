package SMS_Programming.dao;

import SMS_Programming.db.DB_Connection;
import SMS_Programming.model.Student;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao implements StudentDaoInterface {


    @Override
    public boolean insertStudent(Student s) {
        boolean flag = false;
        try {
            Connection con = DB_Connection.createConnection();
            String query = "insert into students_details(sname,clgname,city,percentage) value(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,s.getName());
            pst.setString(2,s.getClgname());
            pst.setString(3,s.getCity());
            pst.setDouble(4,s.getPercentage());
            pst.executeUpdate();
            flag = true;

        } catch (Exception ex){
            ex.printStackTrace();
        }


        return flag;
    }

    @Override
    public boolean delete(int roll) {
        boolean flag = true;
        try {
            Connection con = DB_Connection.createConnection();
            String query = "Delete from Students_details where rollNum="+roll;
            PreparedStatement pst= con.prepareStatement(query);
            pst.executeUpdate();
            flag = true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(int roll, String update, int ch, Student s) {
        int choice = ch;
        boolean flag = true;
        try {

            if (choice==1){
                Connection con = DB_Connection.createConnection();
                String query = "update students_details set sname=? where rollNum=?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1,update);
                ps.setInt(2,roll);
                ps.executeUpdate();
                flag = true;

            }

        } catch (Exception ex){

        }
        return flag;
    }

    @Override
    public void showAllStudents() {
        try {
            Connection con = DB_Connection.createConnection();
            String query = "select * from students_details";
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery(query);
            while (rs.next()){
                System.out.println("Roll no :- "+rs.getInt(1)+"\n"+
                        "Name:- "+rs.getString(2)+"\n"+
                        "Clg name:- "+rs.getString(3)+"\n"+
                        "City:- "+rs.getString(4)+"\n"+
                        "Percentage:- "+rs.getDouble(5));
                System.out.println("-----------------------------------------");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public boolean showAllStudentById(int roll) {
        try {
            Connection con = DB_Connection.createConnection();
            String query = "select * from students_details Where rollnum ="+roll;
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery(query);
            while (rs.next()){
                System.out.println("Roll no :- "+rs.getInt(1)+"\n"+
                        "Name:- "+rs.getString(2)+"\n"+
                        "Clg name:- "+rs.getString(3)+"\n"+
                        "City:- "+rs.getString(4)+"\n"+
                        "Percentage:- "+rs.getDouble(5));
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }


}
