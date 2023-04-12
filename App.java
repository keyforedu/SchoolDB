import javax.swing.JFrame;

public class App extends JFrame
{
    private Homepage homepage;

    public App ()
    {
        homepage = new Homepage(this);
        
        homepage.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
