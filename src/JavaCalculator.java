import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton butClear;
    private JButton butAdd;
    private JButton butMultiply;
    private JButton butEquals;
    private JButton butDivision;
    private JButton but7;
    private JButton but4;
    private JButton but1;
    private JButton butSqrt;
    private JButton but8;
    private JButton but5;
    private JButton butDecimal;
    private JButton butLn;
    private JButton but9;
    private JButton but6;
    private JButton but00;
    private JButton but0;
    private JButton but2;
    private JButton but3;
    private JButton butMinus;

    float a, b , result;
    String op;

    public JavaCalculator() {


        but00.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + but00.getText()));

        but0.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + but0.getText()));

        but1.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + but1.getText());
            }
        });


        but2.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but2.getText());
            }
        });

        but3.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but3.getText());
            }
        });

        but4.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but4.getText());
            }
        });

        but5.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but5.getText());
            }
        });

        but6.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but6.getText());
            }
        });

        but7.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but7.getText());
            }
        });

        but8.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but8.getText());
            }
        });

        but9.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + but9.getText());
            }
        });

        butClear.addActionListener(e -> txtDisplay.setText(""));

        butAdd.addActionListener(e -> {
            a = Float.parseFloat(txtDisplay.getText());
            op = "+";
            txtDisplay.setText("");
        });

        butMinus.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
            }
        });

        butMultiply.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(txtDisplay.getText());
                op = "×";
                txtDisplay.setText("");
            }
        });

        butDivision.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");
            }
        });

        butSqrt.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(txtDisplay.getText());
                op = "sqrt";
            }
        });

        butLn.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(txtDisplay.getText());
                op = "Log";
            }
        });

        butDecimal.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() +  butDecimal.getText());
            }
        });

        butEquals.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Float.parseFloat(txtDisplay.getText());

                switch (op) {
                    case "+" -> {
                        result = a + b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "-" -> {
                        result = a - b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "×" -> {
                        result = a * b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "/" -> {
                        result = a / b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "sqrt" -> {
                        result = (int) Math.sqrt(a);
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "Log" -> {
                        double num = a;
                        txtDisplay.setText(String.valueOf(Math.log(num)));
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
