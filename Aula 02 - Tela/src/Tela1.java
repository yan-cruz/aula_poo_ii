import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.swing.JLabel;
import java.swing.JTextField;
import java.awt.Font;
import java.swing.JButton;

public class Tela1 extends JFrame{
    private JPanel painel;
    private JLabel jlNomeCompleto, jlData, jlNome;
    private JTextField jtxNome;
    private JButton jbOk;

    public Tela1(){
        painel = new JPanel();
        jlNomeCompleto = new JLabel("Yan Cruz");
        jlData = new JLabel("22/10/2023");
        jlNome = new JLabel("Nome: ");
        jtxNome = new JTextField();
        jbOk = new JButton("OK");
    }
    public void configuraJanela(){
        setVisible(true);
        setTitle("Aula 02 - Tela1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700)
        setResizable(false);
        configurarPainel();
    }
    public void configurarPainel(){
        jlNomeCompleto.setFont(new Font("Arial", Font.BOLD, 20));
        jlNomeCompleto.setForeground(Color.black);
        painel.setLayout(null);
        jlNomeCompleto.setBounds(10, 10, 200, 30);
        painel.setBackground(Color.purple);
        painel.add(jlNomeCompleto);
        jlData.setBounds(220, 10, 50, 30);
        painel.add(jlData);
        jlNome.setBounds(10, 50, 50, 30);
        painel.add(jlNome);
        jtxNome.setBounds(70, 50, 200, 30);
        painel.add(jtxNome);
        jbOk.setBounds(50, 90, 60, 30);
        painel.add(jbOk);
        jbOk.addActionListener((e) -> {
            JOptionPane.showMessageDialog(this, "Olá");
        });
    }
}
