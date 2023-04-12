import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class DataTeacher extends JFrame implements ActionListener
{
    private Homepage homepage;

    private JPanel top_banner;
    private JPanel logo;
    private JPanel menu;
    private JPanel content;

    private JButton add_teacher_button;
    private JButton edit_teacher_button;
    private JButton delete_teacher_button;
    private JButton submit_button;
    private JButton back_button;


    public DataTeacher()
    {

    }

    public DataTeacher(Homepage homepage)
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
        content.setLayout(new FlowLayout());
        content.setBackground(Color.LIGHT_GRAY);
        add(content, BorderLayout.CENTER);



        //Menu Button
        add_teacher_button = new JButton("Add Teacher");
        add_teacher_button.setPreferredSize(new DimensionUIResource(200, 50));
        add_teacher_button.addActionListener(this);
        menu.add(add_teacher_button);

        edit_teacher_button = new JButton("Edit Teacher");
        edit_teacher_button.setPreferredSize(new DimensionUIResource(200, 50));
        edit_teacher_button.addActionListener(this);
        menu.add(edit_teacher_button);

        delete_teacher_button = new JButton("Delete Teacher");
        delete_teacher_button.setPreferredSize(new DimensionUIResource(200, 50));
        delete_teacher_button.addActionListener(this);
        menu.add(delete_teacher_button);

        submit_button = new JButton("Submit");
        submit_button.setPreferredSize(new DimensionUIResource(200, 50));
        submit_button.addActionListener(this);
        menu.add(submit_button);

        back_button = new JButton("<< Back");
        back_button.setPreferredSize(new DimensionUIResource(200, 50));
        back_button.addActionListener(this);
        menu.add(back_button);



        // Setting Page
        setTitle("Teacher Database Information");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
    }



    @Override
    public void actionPerformed(ActionEvent e)
    {    
        if (e.getSource().equals(back_button))
        {
            setVisible(false);
        }
    }

}