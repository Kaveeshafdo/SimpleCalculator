
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.lang.*;
//import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener, MouseListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField headerField = new JTextField();
    JTextArea area = new JTextArea();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bpls = new JButton("+");
    JButton bmin = new JButton("-");
    JButton bmul = new JButton("\u00D7");
    JButton bdiv = new JButton("/");
    JButton beq = new JButton("=");
    JButton bsqrt = new JButton("y" + "\u221A" + "x");
    JButton bdot = new JButton(".");
    JButton bdel = new JButton("DEL");
    JButton brt = new JButton("x" + "\u02B8");
    JButton bclr = new JButton("CE");
    Font btnfont = new Font("Arial", Font.BOLD, 25);
    Font btnfont1 = new Font("Arial", Font.PLAIN, 20);
    Font delbtnfont = new Font("Arial", Font.PLAIN, 22);
    Font delclrbtnfont = new Font("Arial", Font.PLAIN, 18);
    ImageIcon image = new ImageIcon("images/logo.jpg");
    Border brd = BorderFactory.createLineBorder(Color.BLACK);
    //DecimalFormat df = new DecimalFormat("#.##");

    String strnum1 = "";
    String strnum2 = "";
    String strtot = "";

    double num1 = 0;
    double num2 = 0;
    double total = 0;
    double val;
    Object btn;
    String op;

    Calculator() {

        super("Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(291, 428);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(new Color(129, 130, 131));
        //this.setContentPane(new JLabel(new ImageIcon("images/Cal_background.jpg")));
        this.setIconImage(image.getImage());
        this.setLayout(null);

        area.setBounds(2, 2, 269, 77);
        area.setLineWrap(false);
        area.setWrapStyleWord(false);
        area.setBackground(new Color(129, 130, 131));
        area.setForeground(new Color(255, 255, 255));
        area.setFont(new Font("Arial", Font.BOLD, 40));
        area.setBorder(brd);
        area.getCaret().setVisible(false);
        area.setText("0");

        this.add(area);

        panel.setBounds(2, 80, 270, 300);
        panel.setLayout(new GridLayout(5, 4, 1, 1));
        panel.setBackground(new Color(129, 130, 131));

        b1.setFont(btnfont);
        b1.setBackground(new Color(46, 47, 47));
        b1.setForeground(new Color(255, 255, 255));
        b1.setFocusPainted(false);
        b1.setBorderPainted(true);
        b1.setBorder(brd);
        b1.addActionListener(this);
        b1.addMouseListener(this);

        b2.setFont(btnfont);
        b2.setBackground(new Color(46, 47, 47));
        b2.setForeground(new Color(255, 255, 255));
        b2.setFocusPainted(false);
        b2.setBorderPainted(true);
        b2.setBorder(brd);
        b2.addMouseListener(this);
        b2.addActionListener(this);

        b3.setFont(btnfont);
        b3.setBackground(new Color(46, 47, 47));
        b3.setForeground(new Color(255, 255, 255));
        b3.setFocusPainted(false);
        b3.setBorderPainted(true);
        b3.setBorder(brd);
        b3.addMouseListener(this);
        b3.addActionListener(this);

        b4.setFont(btnfont);
        b4.setBackground(new Color(46, 47, 47));
        b4.setForeground(new Color(255, 255, 255));
        b4.setFocusPainted(false);
        b4.setBorderPainted(true);
        b4.setBorder(brd);
        b4.addMouseListener(this);
        b4.addActionListener(this);

        b5.setFont(btnfont);
        b5.setBackground(new Color(46, 47, 47));
        b5.setForeground(new Color(255, 255, 255));
        b5.setFocusPainted(false);
        b5.setBorderPainted(true);
        b5.setBorder(brd);
        b5.addMouseListener(this);
        b5.addActionListener(this);

        b6.setFont(btnfont);
        b6.setBackground(new Color(46, 47, 47));
        b6.setForeground(new Color(255, 255, 255));
        b6.setFocusPainted(false);
        b6.setBorderPainted(true);
        b6.setBorder(brd);
        b6.addMouseListener(this);
        b6.addActionListener(this);

        b7.setFont(btnfont);
        b7.setBackground(new Color(46, 47, 47));
        b7.setForeground(new Color(255, 255, 255));
        b7.setFocusPainted(false);
        b7.setBorderPainted(true);
        b7.setBorder(brd);
        b7.addMouseListener(this);
        b7.addActionListener(this);

        b8.setFont(btnfont);
        b8.setBackground(new Color(46, 47, 47));
        b8.setForeground(new Color(255, 255, 255));
        b8.setFocusPainted(false);
        b8.setBorderPainted(true);
        b8.setBorder(brd);
        b8.addMouseListener(this);
        b8.addActionListener(this);

        b9.setFont(btnfont);
        b9.setBackground(new Color(46, 47, 47));
        b9.setForeground(new Color(255, 255, 255));
        b9.setFocusPainted(false);
        b9.setBorderPainted(true);
        b9.setBorder(brd);
        b9.addMouseListener(this);
        b9.addActionListener(this);

        b0.setFont(btnfont);
        b0.setBackground(new Color(46, 47, 47));
        b0.setForeground(new Color(255, 255, 255));
        b0.setFocusPainted(false);
        b0.setBorderPainted(true);
        b0.setBorder(brd);
        b0.addMouseListener(this);
        b0.addActionListener(this);

        bpls.setFont(delbtnfont);
        bpls.setBackground(new Color(74, 77, 78));
        bpls.setForeground(new Color(255, 255, 255));
        bpls.setFocusPainted(false);
        bpls.setBorderPainted(true);
        bpls.setBorder(brd);
        bpls.addMouseListener(this);
        bpls.addActionListener(this);

        bmin.setFont(delbtnfont);
        bmin.setBackground(new Color(74, 77, 78));
        bmin.setForeground(new Color(255, 255, 255));
        bmin.setFocusPainted(false);
        bmin.setBorderPainted(true);
        bmin.setBorder(brd);
        bmin.addMouseListener(this);
        bmin.addActionListener(this);

        bmul.setFont(delbtnfont);
        bmul.setBackground(new Color(74, 77, 78));
        bmul.setForeground(new Color(255, 255, 255));
        bmul.setFocusPainted(false);
        bmul.setBorderPainted(true);
        bmul.setBorder(brd);
        bmul.addMouseListener(this);
        bmul.addActionListener(this);

        bdiv.setFont(delbtnfont);
        bdiv.setBackground(new Color(74, 77, 78));
        bdiv.setForeground(new Color(255, 255, 255));
        bdiv.setFocusPainted(false);
        bdiv.setBorderPainted(true);
        bdiv.setBorder(brd);
        bdiv.addMouseListener(this);
        bdiv.addActionListener(this);

        beq.setFont(btnfont);
        beq.setBackground(new Color(70, 100, 118));
        beq.setForeground(new Color(255, 255, 255));
        beq.setFocusPainted(false);
        beq.setBorderPainted(true);
        beq.setBorder(brd);
        beq.addMouseListener(this);
        beq.addActionListener(this);

        bsqrt.setFont(btnfont1);
        bsqrt.setBackground(new Color(74, 77, 78));
        bsqrt.setForeground(new Color(255, 255, 255));
        bsqrt.setFocusPainted(false);
        bsqrt.setBorderPainted(true);
        bsqrt.setBorder(brd);
        bsqrt.addMouseListener(this);
        bsqrt.addActionListener(this);

        bdot.setFont(btnfont);
        bdot.setBackground(new Color(46, 47, 47));
        bdot.setForeground(new Color(255, 255, 255));
        bdot.setFocusPainted(false);
        bdot.setBorderPainted(true);
        bdot.setBorder(brd);
        bdot.addMouseListener(this);
        bdot.addActionListener(this);

        bdel.setFont(delclrbtnfont);
        bdel.setBackground(new Color(74, 77, 78));
        bdel.setForeground(new Color(255, 255, 255));
        bdel.setFocusPainted(false);
        bdel.setBorderPainted(true);
        bdel.setBorder(brd);
        bdel.addMouseListener(this);
        bdel.addActionListener(this);

        brt.setFont(delbtnfont);
        brt.setBackground(new Color(46, 47, 47));
        brt.setForeground(new Color(255, 255, 255));
        brt.setFocusPainted(false);
        brt.setBorderPainted(true);
        brt.setBorder(brd);
        brt.addMouseListener(this);
        brt.addActionListener(this);

        bclr.setFont(delclrbtnfont);
        bclr.setBackground(new Color(74, 77, 78));
        bclr.setForeground(new Color(255, 255, 255));
        bclr.setFocusPainted(false);
        bclr.setBorderPainted(true);
        bclr.setBorder(brd);
        bclr.addMouseListener(this);
        bclr.addActionListener(this);

        panel.add(bsqrt);
        panel.add(bdel);
        panel.add(bclr);
        panel.add(bdiv);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bmul);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bpls);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bmin);
        panel.add(b0);
        panel.add(bdot);
        panel.add(brt);
        panel.add(beq);

        this.add(panel);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        btn = e.getSource();//b1
       String text = e.getActionCommand();//1
//        System.out.println(text);

        if (btn.equals(b0) || btn.equals(b1) || btn.equals(b2) || btn.equals(b3) || btn.equals(b4) || btn.equals(b5) || btn.equals(b6) || btn.equals(b7) || btn.equals(b8) || btn.equals(b9)) {
            double val = 0;
            if (!area.getText().trim().equals("")) {
                val = Double.parseDouble(area.getText().trim());
            }
            if (val != 0.0) {
                area.setText(area.getText().trim() + text);
            } else {
                area.setText(text);
            }
            
        } else if (e.getSource() == bclr) {
            area.setText(null);
        } else if (e.getSource() == bdel) {
            String s = area.getText();
            area.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                area.setText(area.getText() + s.charAt(i));
            }
        } else if (btn.equals(bpls) || btn.equals(bmin) || btn.equals(bmul) || btn.equals(bdiv) || btn.equals(brt) || btn.equals(bsqrt)) {
            op = text;
            num1 = Double.parseDouble(area.getText().trim());
            area.setText("0");

        } else if (btn.equals(beq)) {

            num2 = Double.parseDouble(area.getText().trim());

            if (op.equals("+")) {
                total = num1 + num2;            

            } else if (op.equals("-")) {
                total = num1 - num2;

            } else if (op.equals("\u00D7")) {
                total = num1 * num2;

            } else if (op.equals("/")) {
                total = num1 / num2;

            }
             else if (op.equals("x" + "\u02B8")) {
                total = Math.pow(num1, num2);

            }
            else if (op.equals("y" + "\u221A" + "x")) {
               double sqrt = Math.sqrt(num2);
               total = num1 * sqrt;
            }
            area.setText(""+ total);

        }
        else if (e.getSource() == bdot) {
            String a = area.getText();
            if (a.length() > 0) {
                area.append(".");
            }
        }
    }  

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource() == b0) {
            b0.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b1) {
            b1.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b2) {
            b2.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b3) {
            b3.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b4) {
            b4.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b5) {
            b5.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b6) {
            b6.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b7) {
            b7.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b8) {
            b8.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == b9) {
            b9.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bdot) {
            bdot.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == brt) {
            brt.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bpls) {
            bpls.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bmin) {
            bmin.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bmul) {
            bmul.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bdiv) {
            bdiv.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bsqrt) {
            bsqrt.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bdel) {
            bdel.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == bclr) {
            bclr.setBackground(new Color(139, 143, 145));
        } else if (e.getSource() == beq) {
            beq.setBackground(new Color(69, 142, 183));
        } else {

            b0.setBackground(new Color(46, 47, 47));
            b1.setBackground(new Color(46, 47, 47));
            b2.setBackground(new Color(46, 47, 47));
            b3.setBackground(new Color(46, 47, 47));
            b4.setBackground(new Color(46, 47, 47));
            b5.setBackground(new Color(46, 47, 47));
            b6.setBackground(new Color(46, 47, 47));
            b7.setBackground(new Color(46, 47, 47));
            b8.setBackground(new Color(46, 47, 47));
            b9.setBackground(new Color(46, 47, 47));
            bdot.setBackground(new Color(46, 47, 47));
            brt.setBackground(new Color(46, 47, 47));
            bpls.setBackground(new Color(74, 77, 78));
            bmin.setBackground(new Color(74, 77, 78));
            bmul.setBackground(new Color(74, 77, 78));
            bdiv.setBackground(new Color(74, 77, 78));
            bsqrt.setBackground(new Color(74, 77, 78));
            bdel.setBackground(new Color(74, 77, 78));
            bclr.setBackground(new Color(74, 77, 78));
            beq.setBackground(new Color(70, 100, 118));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == b0) {
            b0.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b1) {
            b1.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b2) {
            b2.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b3) {
            b3.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b4) {
            b4.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b5) {
            b5.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b6) {
            b6.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b7) {
            b7.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b8) {
            b8.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == b9) {
            b9.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == bdot) {
            bdot.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == brt) {
            brt.setBackground(new Color(46, 47, 47));
        } else if (e.getSource() == bpls) {
            bpls.setBackground(new Color(74, 77, 78));
        } else if (e.getSource() == bmin) {
            bmin.setBackground(new Color(74, 77, 78));
        } else if (e.getSource() == bmul) {
            bmul.setBackground(new Color(74, 77, 78));
        } else if (e.getSource() == bdiv) {
            bdiv.setBackground(new Color(74, 77, 78));
        } else if (e.getSource() == bsqrt) {
            bsqrt.setBackground(new Color(74, 77, 78));
        } else if (e.getSource() == bdel) {
            bdel.setBackground(new Color(74, 77, 78));
        } else if (e.getSource() == bclr) {
            bclr.setBackground(new Color(74, 77, 78));
        } else if (e.getSource() == beq) {
            beq.setBackground(new Color(70, 100, 118));
        } else {
            b0.setBackground(new Color(46, 47, 47));
            b1.setBackground(new Color(46, 47, 47));
            b2.setBackground(new Color(46, 47, 47));
            b3.setBackground(new Color(46, 47, 47));
            b4.setBackground(new Color(46, 47, 47));
            b5.setBackground(new Color(46, 47, 47));
            b6.setBackground(new Color(46, 47, 47));
            b7.setBackground(new Color(46, 47, 47));
            b8.setBackground(new Color(46, 47, 47));
            b9.setBackground(new Color(46, 47, 47));
            bdot.setBackground(new Color(46, 47, 47));
            brt.setBackground(new Color(46, 47, 47));
            bpls.setBackground(new Color(74, 77, 78));
            bmin.setBackground(new Color(74, 77, 78));
            bmul.setBackground(new Color(74, 77, 78));
            bdiv.setBackground(new Color(74, 77, 78));
            bsqrt.setBackground(new Color(74, 77, 78));
            bdel.setBackground(new Color(74, 77, 78));
            bclr.setBackground(new Color(74, 77, 78));
            beq.setBackground(new Color(70, 100, 118));

        }

    }

    public static void main(String args[]) {
        new Calculator();
    }
}
