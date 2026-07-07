package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculadoraF extends JFrame implements ActionListener {

    JTextField txtNum1, txtNum2, txtResultado;
    JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

    public calculadoraF() {
        setTitle("Calculadora");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        
        add(new JLabel("Número 1:"));
        txtNum1 = new JTextField();
        add(txtNum1);

        add(new JLabel("Número 2:"));
        txtNum2 = new JTextField();
        add(txtNum2);

        add(new JLabel("Resultado:"));
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        add(txtResultado);

        
        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");
        


         Font fuenteGrande = new Font("Arial", Font.BOLD, 48);

    txtNum1.setFont(fuenteGrande);
    txtNum2.setFont(fuenteGrande);
    txtResultado.setFont(fuenteGrande);

    btnSumar.setFont(fuenteGrande);
    btnRestar.setFont(fuenteGrande);
    btnMultiplicar.setFont(fuenteGrande);
    btnDividir.setFont(fuenteGrande);

    add(btnSumar);
    add(btnRestar);
    add(btnMultiplicar);
    add(btnDividir);

    setVisible(true);


        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);

        
        btnSumar.addActionListener(this);
        btnRestar.addActionListener(this);
        btnMultiplicar.addActionListener(this);
        btnDividir.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double resultado = 0;

            if (e.getSource() == btnSumar) {
                resultado = num1 + num2;
            } else if (e.getSource() == btnRestar) {
                resultado = num1 - num2;
            } else if (e.getSource() == btnMultiplicar) {
                resultado = num1 * num2;
            } else if (e.getSource() == btnDividir) {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this,
                            "No se puede dividir entre cero.");
                    return;
                }
                resultado = num1 / num2;
            }
             
           txtResultado.setText("CREO QUE ES  : " + (int)resultado );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese números válidos.");
        }
    }

    public static void main(String[] args) {
        new calculadoraF();
    }
}
