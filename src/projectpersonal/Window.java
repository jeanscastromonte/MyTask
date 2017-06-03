package projectpersonal;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {
    JFrame window;
    JPanel panelA, panelB;
    JLabel Saludo,Saludo2;
    JButton button;
    
    public void CreatePanelA(){
        panelA = new JPanel();
        Saludo = new JLabel();
        Saludo.setText("Bienvenidos");
        //Saludo2 = new JLabel("Bienvenidos de nuevo");
        panelA.setLayout(new BoxLayout(panelA,BoxLayout.X_AXIS));
        //panelA.setLayout(new BoxLayout(panelA,BoxLayout.X_AXIS));
        panelA.add(Saludo);
        //panelA.add(Saludo2);
    }
    public void CreatePanelB(){
        panelB = new JPanel();
        button = new JButton();
        button.setText("Entrar");
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
        panelB.add(button);
    }
    public void CreateWindow(){
        window = new JFrame();
        window.setTitle("Ventana Nueva");
        window.setSize(400,400);
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
        window.add(panelA);
        window.add(panelB);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    }
    public Window(){
        this.CreatePanelA();
        this.CreatePanelB();
        this.CreateWindow();
    }
}
