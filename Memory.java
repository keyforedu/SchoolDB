import java.util.ArrayList;

public class Memory {

    private ArrayList <Student> students = new ArrayList<>();
    private ArrayList <Alumni> alumnuses = new ArrayList<>();
    private ArrayList <Grade> grades = new ArrayList<>();
    private ArrayList <Teacher> teachers = new ArrayList<>();

    public Memory() {
        
    }

    public Memory(ArrayList<Student> students, ArrayList<Alumni> alumnuses, ArrayList<Grade> grades,
            ArrayList<Teacher> teachers) {
        this.students = students;
        this.alumnuses = alumnuses;
        this.grades = grades;
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Alumni> getAlumnuses() {
        return alumnuses;
    }

    public void setAlumnuses(ArrayList<Alumni> alumnuses) {
        this.alumnuses = alumnuses;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
}