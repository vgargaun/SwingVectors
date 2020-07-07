
import javax.swing.*;
import java.awt.event.*;

public class WorkVectors {
    public static void main(String[] args) {
        JFrame window=new JFrame();

        final JTextField startPointX=new JTextField();
        final JTextField startPointY=new JTextField();
        final JTextField endPointX=new JTextField();
        final JTextField endPointY=new JTextField();

        final JTextField startPointX2=new JTextField();
        final JTextField startPointY2=new JTextField();
        final JTextField endPointX2=new JTextField();
        final JTextField endPointY2=new JTextField();

        final JTextField startPointX3=new JTextField();
        final JTextField startPointY3=new JTextField();
        final JTextField endPointX3=new JTextField();
        final JTextField endPointY3=new JTextField();

        final String[] b = new String[8];




        JButton bSuma=new JButton("Gathering");
        bSuma.setBounds(75,160,100, 40);

        JButton bMinus=new JButton("Subtraction");
        bMinus.setBounds(325,160,100, 40);
        ////////////////////////////////////////////////////////////////////
        ///Label
        ////////////////////////////////////////////////////////////////////
        JLabel l1,l2, l3,x1,x2,y1,y2;
        l1=new JLabel("Vector 1");
        l2=new JLabel("Vector 2");
        l3=new JLabel("New Vector");
        x1=new JLabel("Start Point X");
        y1=new JLabel("Start Point Y");
        x2=new JLabel("End point X");
        y2=new JLabel("End point Y");
        l1.setBounds(10,45, 70,30);
        l2.setBounds(10,80, 70,30);
        l3.setBounds(10, 115, 70, 30);

        x1.setBounds(80,4, 90,30);
        y1.setBounds(180,4, 90,30);
        x2.setBounds(280,4, 90,30);
        y2.setBounds(380,4, 90,30);
        ////////////////////////////////////////////////////////////////////
        ///TextBox Vector 1
        ////////////////////////////////////////////////////////////////////
        startPointX.setBounds(80,50, 90,20);
        startPointY.setBounds(180,50, 90,20);
        endPointX.setBounds(280,50, 90,20);
        endPointY.setBounds(380,50, 90,20);
        ////////////////////////////////////////////////////////////////////
        ///TextBox Vector 2
        ////////////////////////////////////////////////////////////////////
        startPointX2.setBounds(80,85, 90,20);
        startPointY2.setBounds(180,85, 90,20);
        endPointX2.setBounds(280,85, 90,20);
        endPointY2.setBounds(380,85, 90,20);
        ////////////////////////////////////////////////////////////////////
        ///TextBox Vector 3
        ////////////////////////////////////////////////////////////////////
        startPointX3.setBounds(80,120, 90,20);
        startPointY3.setBounds(180,120, 90,20);
        endPointX3.setBounds(280,120, 90,20);
        endPointY3.setBounds(380,120, 90,20);

    final Vector vector1 = new Vector();
    final Vector vector2 = new Vector();
        bSuma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b[0] =  startPointX.getText();
                b[1] = startPointY.getText();
                b[2] = endPointX.getText();
                b[3] = endPointY.getText();
                b[4] = startPointX2.getText();
                b[5] = startPointY2.getText();
                b[6] = endPointX2.getText();
                b[7] = endPointY2.getText();

                vector1.setX1(Double.parseDouble(b[0]));
                vector1.setY1(Double.parseDouble(b[1]));
                vector1.setX2(Double.parseDouble(b[2]));
                vector1.setY2(Double.parseDouble(b[3]));

                vector2.setX1(Double.parseDouble(b[4]));
                vector2.setY1(Double.parseDouble(b[5]));
                vector2.setX2(Double.parseDouble(b[6]));
                vector2.setY2(Double.parseDouble(b[7]));
                JFrame window2=new JFrame();

                Vector vector3 = vector1.sumVector(vector1,vector2);
                startPointX3.setText(String.valueOf(vector3.getX1()));
                startPointY3.setText(String.valueOf(vector3.getY1()));
                endPointX3.setText(String.valueOf(vector3.getX2()));
                endPointY3.setText(String.valueOf(vector3.getY2()));

                JLabel l3,x1,x2,y1,y2;

                l3=new JLabel("New Vector");
                x1=new JLabel("Start Point X");
                y1=new JLabel("Start Point Y");
                x2=new JLabel("End point X");
                y2=new JLabel("End point Y");
                l3.setBounds(10, 115, 70, 30);

                x1.setBounds(80,4, 90,30);
                y1.setBounds(180,4, 90,30);
                x2.setBounds(280,4, 90,30);
                y2.setBounds(380,4, 90,30);
                window2.add(x1);
                window2.add(x2);
                window2.add(y1);
                window2.add(y2);
                window2.add(l3);
                window2.add(startPointX3);
                window2.add(startPointY3);
                window2.add(endPointX3);
                window2.add(endPointY3);

                window2.setLayout(null);
                window2.setVisible(true);
                window2.setSize(500,300);
            }
        });


        bMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b[0] =  startPointX.getText();
                b[1] = startPointY.getText();
                b[2] = endPointX.getText();
                b[3] = endPointY.getText();
                b[4] = startPointX2.getText();
                b[5] = startPointY2.getText();
                b[6] = endPointX2.getText();
                b[7] = endPointY2.getText();



                vector1.setX1(Double.parseDouble(b[0]));
                vector1.setY1(Double.parseDouble(b[1]));
                vector1.setX2(Double.parseDouble(b[2]));
                vector1.setY2(Double.parseDouble(b[3]));

                vector2.setX1(Double.parseDouble(b[4]));
                vector2.setY1(Double.parseDouble(b[5]));
                vector2.setX2(Double.parseDouble(b[6]));
                vector2.setY2(Double.parseDouble(b[7]));
                JFrame window2=new JFrame();

                Vector vector3 = vector1.minusVector(vector1,vector2);
                startPointX3.setText(String.valueOf(vector3.getX1()));
                startPointY3.setText(String.valueOf(vector3.getY1()));
                endPointX3.setText(String.valueOf(vector3.getX2()));
                endPointY3.setText(String.valueOf(vector3.getY2()));

                JLabel l3,x1,x2,y1,y2;

                l3=new JLabel("New Vector");
                x1=new JLabel("Start Point X");
                y1=new JLabel("Start Point Y");
                x2=new JLabel("End point X");
                y2=new JLabel("End point Y");
                l3.setBounds(10, 115, 70, 30);

                x1.setBounds(80,4, 90,30);
                y1.setBounds(180,4, 90,30);
                x2.setBounds(280,4, 90,30);
                y2.setBounds(380,4, 90,30);
                window2.add(x1);
                window2.add(x2);
                window2.add(y1);
                window2.add(y2);
                window2.add(l3);
                window2.add(startPointX3);
                window2.add(startPointY3);
                window2.add(endPointX3);
                window2.add(endPointY3);

                window2.setLayout(null);
                window2.setVisible(true);
                window2.setSize(500,300);
            }
        });


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(l1);
        window.add(x1);
        window.add(x2);
        window.add(y1);
        window.add(y2);
        window.add(l2);


        window.add(bSuma);
        window.add(bMinus);

        window.add(startPointX);
        window.add(startPointY);
        window.add(endPointX);
        window.add(endPointY);

        window.add(startPointX2);
        window.add(startPointY2);
        window.add(endPointX2);
        window.add(endPointY2);



        window.setSize(500,300);

        window.setLayout(null);

        window.setVisible(true);

    }
}
