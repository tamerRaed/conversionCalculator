//Tamer Raed Alnauizi 120170770_102
package ConversionCalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class conversionCalculator extends JFrame {

    private ButtonGroup group;
    private JTextField field;
    private JButton[] Buttons;
    private JRadioButton Bin;
    private JRadioButton Dec;
    private JRadioButton Oct;
    private JRadioButton Hex;
    private JPanel panel;
    private JPanel panel2;
    private boolean cheak = true;
    private String convertFrom = "Dec";

    public conversionCalculator() {

        field = new JTextField();
        field.setFont(new Font("Arial", Font.BOLD, 18));
        field.setForeground(Color.black);
        field.setBackground(Color.WHITE);
        field.setEditable(false);
        setLayout(new BorderLayout());
        Buttons = new JButton[16];
        panel = new JPanel(new GridLayout(4, 4));
        JButton button0 = new JButton("0");
        Buttons[0] = button0;
        JButton button1 = new JButton("1");
        Buttons[1] = button1;
        JButton button2 = new JButton("2");
        Buttons[2] = button2;
        JButton button3 = new JButton("3");
        Buttons[3] = button3;
        JButton button4 = new JButton("4");
        Buttons[4] = button4;
        JButton button5 = new JButton("5");
        Buttons[5] = button5;
        JButton button6 = new JButton("6");
        Buttons[6] = button6;
        JButton button7 = new JButton("7");
        Buttons[7] = button7;
        JButton button8 = new JButton("8");
        Buttons[8] = button8;
        JButton button9 = new JButton("9");
        Buttons[9] = button9;
        JButton buttonA = new JButton("A");
        Buttons[10] = buttonA;
        JButton buttonB = new JButton("B");
        Buttons[11] = buttonB;
        JButton buttonC = new JButton("C");
        Buttons[12] = buttonC;
        JButton buttonD = new JButton("D");
        Buttons[13] = buttonD;
        JButton buttonE = new JButton("E");
        Buttons[14] = buttonE;
        JButton buttonF = new JButton("F");
        Buttons[15] = buttonF;
        for (int i = 0; i < Buttons.length; i++) {
            panel.add(Buttons[i]);
        }
        add(panel, BorderLayout.CENTER);
        Bin = new JRadioButton("Bin");
        Dec = new JRadioButton("Dec");
        Hex = new JRadioButton("Hex");
        Oct = new JRadioButton("Oct");
        Dec.setSelected(true);
        for (int i = 10; i < Buttons.length; i++) {
            Buttons[i].setEnabled(false);
        }
        group = new ButtonGroup();
        group.add(Bin);
        group.add(Dec);
        group.add(Hex);
        group.add(Oct);

        Bin.addActionListener(e -> {
            for (int i = 2; i < Buttons.length; i++) {
                Buttons[i].setEnabled(false);
            }
            if (!cheak) {
                switch (convertFrom) {
                    case "Oct":
                        field.setText(Integer.toBinaryString(Integer.parseInt(field.getText(), 8)));
                        break;
                    case "Dec":
                        field.setText(Integer.toBinaryString(Integer.parseInt(field.getText(), 10)));
                        break;
                    case "Hex":
                        field.setText(Integer.toBinaryString(Integer.parseInt(field.getText(), 16)));
                        break;
                }
            }
            convertFrom = "Bin";
        });
        Dec.addActionListener(e -> {
            for (int i = 0; i < 10; i++) {
                Buttons[i].setEnabled(true);
            }
            for (int i = 10; i < Buttons.length; i++) {
                Buttons[i].setEnabled(false);
            }
            if (!cheak) {
                switch (convertFrom) {
                    case "Bin":
                        field.setText(String.valueOf(Integer.parseInt(field.getText(), 2)));
                        break;
                    case "Oct":
                        field.setText(String.valueOf(Integer.parseInt(field.getText(), 8)));
                        break;
                    case "Hex":
                        field.setText(String.valueOf(Integer.parseInt(field.getText(), 16)));
                        break;
                }
            }
            convertFrom = "Dec";
        }
        );
        Hex.addActionListener(e -> {
            for (int i = 0; i < Buttons.length; i++) {
                Buttons[i].setEnabled(true);
            }
            if (!cheak) {
                switch (convertFrom) {
                    case "Bin":
                        field.setText(Integer.toHexString(Integer.parseInt(field.getText(), 2)).toUpperCase());
                        break;
                    case "Oct":
                        field.setText(Integer.toHexString(Integer.parseInt(field.getText(), 8)).toUpperCase());
                        break;
                    case "Dec":
                        field.setText(Integer.toHexString(Integer.parseInt(field.getText(), 10)).toUpperCase());
                        break;
                }
            }
            convertFrom = "Hex";
        }
        );
        Oct.addActionListener(e -> {
            for (int i = 0; i < 8; i++) {
                Buttons[i].setEnabled(true);
            }
            for (int i = 8; i < Buttons.length; i++) {
                Buttons[i].setEnabled(false);
            }
            if (!cheak) {
                switch (convertFrom) {
                    case "Bin":
                        field.setText(Integer.toOctalString(Integer.parseInt(field.getText(), 2)));
                        break;
                    case "Dec":
                        field.setText(Integer.toOctalString(Integer.parseInt(field.getText(), 10)));
                        break;
                    case "Hex":
                        field.setText(Integer.toOctalString(Integer.parseInt(field.getText(), 16)));
                        break;
                }
            }
            convertFrom = "Oct";
        }
        );
        JButton button = new JButton(" C ");

        button.addActionListener(e -> {
            field.setText("");
            cheak = true;
        });
        buttonA.addActionListener(e -> {
            field.setText(field.getText() + "A");
            cheak = false;
        });

        buttonB.addActionListener(e -> {
            field.setText(field.getText() + "B");
            cheak = false;
        });

        buttonC.addActionListener(e -> {
            field.setText(field.getText() + "C");
            cheak = false;
        });

        buttonD.addActionListener(e -> {
            field.setText(field.getText() + "D");
            cheak = false;
        });

        buttonE.addActionListener(e -> {
            field.setText(field.getText() + "E");
            cheak = false;
        });

        buttonF.addActionListener(e -> {
            field.setText(field.getText() + "F");
            cheak = false;
        });

        button0.addActionListener(e -> {
            field.setText(field.getText() + "0");
            cheak = false;
        });

        button1.addActionListener(e -> {
            field.setText(field.getText() + "1");
            cheak = false;
        });

        button2.addActionListener(e -> {
            field.setText(field.getText() + "2");
            cheak = false;
        });

        button3.addActionListener(e -> {
            field.setText(field.getText() + "3");
            cheak = false;
        });

        button4.addActionListener(e -> {
            field.setText(field.getText() + "4");
            cheak = false;
        });

        button5.addActionListener(e -> {
            field.setText(field.getText() + "5");
            cheak = false;
        });

        button6.addActionListener(e -> {
            field.setText(field.getText() + "6");
            cheak = false;
        });

        button7.addActionListener(e -> {
            field.setText(field.getText() + "7");
            cheak = false;
        });

        button8.addActionListener(e -> {
            field.setText(field.getText() + "8");
            cheak = false;
        });

        button9.addActionListener(e -> {
            field.setText(field.getText() + "9");
            cheak = false;
        });
        add(field, BorderLayout.NORTH);
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5, 1));
        panel2.add(Bin);
        panel2.add(Dec);
        panel2.add(Hex);
        panel2.add(Oct);
        panel2.add(button);
        add(panel2, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        conversionCalculator c = new conversionCalculator();
        c.setTitle("Conversion Calculator");
        Dimension d = new Dimension(450, 350);
        c.setSize(d);
        c.setLocationRelativeTo(null);
        c.setResizable(false);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setVisible(true);
    }
}
