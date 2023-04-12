import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class Homepage extends JFrame implements ActionListener, WindowListener
{   
    private App app;
    private DataStudent dataStudent;
    private DataTeacher dataTeacher;
    private DataAlumni dataAlumni;
    private DataGrade dataGrade;

    private JPanel top_banner;
    private JPanel logo;
    private JPanel menu;
    private JPanel content;

    private JButton data_student_button;
    private JButton data_teacher_button;
    private JButton data_alumni_button;
    private JButton data_grade_button;

    private JPanel info_student;
    private JPanel info_teacher;
    private JPanel info_alumni;
    private JPanel info_grade;
    private JPanel info_male_student;
    private JPanel info_female_student;
    private JPanel info_male_teacher;
    private JPanel info_female_teacher;

    private Font font_sub_content_title;

    private JLabel info_student_label;
    private JLabel info_male_student_label;
    private JLabel info_female_student_label;
    private JLabel info_teacher_label;
    private JLabel info_male_teacher_label;
    private JLabel info_female_teacher_label;
    private JLabel info_grade_label;
    private JLabel info_alumni_label;

    public Homepage()
    {
        
    }

    public Homepage (App app)
    {
         setLayout(new BorderLayout(0, 0));
        


        // Panel Background
        top_banner = new JPanel();
        top_banner.setBackground(Color.BLUE);
        top_banner.setPreferredSize(new DimensionUIResource(1000, 100));
        top_banner.setLayout(new BorderLayout());
        add(top_banner, BorderLayout.NORTH);

        logo = new JPanel();
        logo.setBackground(Color.RED);
        logo.setPreferredSize(new DimensionUIResource(200, 100));
        top_banner.add(logo, BorderLayout.WEST);

        menu = new JPanel();
        menu.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        menu.setPreferredSize(new DimensionUIResource(200, 485));
        menu.setBackground(Color.GRAY);
        add(menu, BorderLayout.WEST);

        content = new JPanel();
        content.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        content.setBackground(Color.LIGHT_GRAY);
        add(content, BorderLayout.CENTER);

        

        // Menu Button
        data_student_button = new JButton("Data Student");
        data_student_button.setPreferredSize(new DimensionUIResource(200, 50));
        data_student_button.addActionListener(this);
        menu.add(data_student_button);

        data_teacher_button = new JButton("Data Teacher");
        data_teacher_button.setPreferredSize(new DimensionUIResource(200, 50));
        data_teacher_button.addActionListener(this);
        menu.add(data_teacher_button);

        data_alumni_button = new JButton("Data Alumni");
        data_alumni_button.setPreferredSize(new DimensionUIResource(200, 50));
        data_alumni_button.addActionListener(this);
        menu.add(data_alumni_button);

        data_grade_button = new JButton("Data Grade");
        data_grade_button.setPreferredSize(new DimensionUIResource(200, 50));
        data_grade_button.addActionListener(this);
        menu.add(data_grade_button);



        // Content
        font_sub_content_title = new Font (Font.SERIF, Font.BOLD, 20);

        info_student = new JPanel();
        info_student.setPreferredSize(new DimensionUIResource(200, 100));
        info_student_label = new JLabel("Student");
        info_student_label.setFont(font_sub_content_title);
        info_student.add(info_student_label);
        content.add(info_student);

        info_male_student = new JPanel();
        info_male_student.setPreferredSize(new DimensionUIResource(200, 100));
        info_male_student_label = new JLabel("Male Student");
        info_male_student_label.setFont(font_sub_content_title);
        info_male_student.add(info_male_student_label);
        content.add(info_male_student);

        info_female_student = new JPanel();
        info_female_student.setPreferredSize(new DimensionUIResource(200, 100));
        info_female_student_label = new JLabel("Female Student");
        info_female_student_label.setFont(font_sub_content_title);
        info_female_student.add(info_female_student_label);
        content.add(info_female_student);

        info_teacher = new JPanel();
        info_teacher.setPreferredSize(new DimensionUIResource(200, 100));
        info_teacher_label = new JLabel("Teacher");
        info_teacher_label.setFont(font_sub_content_title);
        info_teacher.add(info_teacher_label);
        content.add(info_teacher);

        info_male_teacher = new JPanel();
        info_male_teacher.setPreferredSize(new DimensionUIResource(200, 100));
        info_male_teacher_label = new JLabel("Teacher");
        info_male_teacher_label.setFont(font_sub_content_title);
        info_male_teacher.add(info_male_teacher_label);
        content.add(info_male_teacher);

        info_female_teacher = new JPanel();
        info_female_teacher.setPreferredSize(new DimensionUIResource(200, 100));
        info_female_teacher_label = new JLabel("Teacher");
        info_female_teacher_label.setFont(font_sub_content_title);
        info_female_teacher.add(info_female_teacher_label);
        content.add(info_female_teacher);

        info_alumni = new JPanel();
        info_alumni.setPreferredSize(new DimensionUIResource(200, 100));
        info_alumni_label = new JLabel("Alumni");
        info_alumni_label.setFont(font_sub_content_title);
        info_alumni.add(info_alumni_label);
        content.add(info_alumni);

        info_grade = new JPanel();
        info_grade.setPreferredSize(new DimensionUIResource(200, 100));
        info_grade_label = new JLabel("Grade");
        info_grade_label.setFont(font_sub_content_title);
        info_grade.add(info_grade_label);
        content.add(info_grade);



        // Init Frame
        this.app = app;

        dataStudent = new DataStudent(this);
        dataTeacher = new DataTeacher(this);
        dataAlumni = new DataAlumni(this);
        dataGrade = new DataGrade(this);



        // Setting Page
        setTitle("Homepage");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource().equals(data_student_button))
        {
            dataStudent.setVisible(true);
        }

        else if (e.getSource().equals(data_teacher_button))
        {
            dataTeacher.setVisible(true);
        }

        else if (e.getSource().equals(data_alumni_button))
        {
            dataAlumni.setVisible(true);
        }

        else if (e.getSource().equals(data_grade_button))
        {
            dataGrade.setVisible(true);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
    }
}