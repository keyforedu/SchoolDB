public class Student {

    private String name;
    private String gender;
    private int gpa;
    private String nim;
    private String birth_date;
    private int grade;

    public Student() {

    }

    public Student(String name, String gender, int gpa, String nim, String birth_date, int grade) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
        this.nim = nim;
        this.birth_date = birth_date;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

       
}