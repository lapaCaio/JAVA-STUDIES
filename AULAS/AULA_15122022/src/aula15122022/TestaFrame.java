package aula15122022;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestaFrame {
    public static void main(String[] args) {

        JFrame minhaTela = new JFrame("Java Clicker");

        JButton botao = new JButton("0");

        //JTextField campoTexto = new JTextField();
        //campoTexto.setColumns(10);
        //minhaTela.add(campoTexto);

        minhaTela.add(botao);

        ActionListener zeButuca = new ActionListener() {
            private int click;

            @Override
            public void actionPerformed(ActionEvent e) {
                this.click = click + 1;
                botao.setText(String.valueOf(click));

                if (getClick() > 300) {

                }
            }

            public int getClick() {
                return click;
            }

            public void setClick(int click) {
                this.click = click;
            }
        };

        botao.addActionListener(zeButuca);

        minhaTela.setLayout(new FlowLayout());
        minhaTela.setSize(300, 300);
        minhaTela.setVisible(true);
        minhaTela.setLocationRelativeTo(null);
        minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}