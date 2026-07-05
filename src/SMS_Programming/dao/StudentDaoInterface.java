package SMS_Programming.dao;

import SMS_Programming.model.Student;

public interface StudentDaoInterface {
    public boolean insertStudent(Student s);
    public boolean delete(int roll);
    public boolean update(int roll, String update, int ch, Student s);
    public void showAllStudents();
    public boolean showAllStudentById(int roll);

}


