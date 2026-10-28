import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.nimbus.*;
public class main{
    static Boolean bx1 = false,bx2 = false,bx3 = false,bx4 = false,bx5 = false,bx6 = false,bx7 = false,bx8 = false,bx9 = false;
    static Boolean bo1 = false,bo2 = false,bo3 = false,bo4 = false,bo5 = false,bo6 = false,bo7 = false,bo8 = false,bo9 = false;
    static Boolean px = true,po = false;
    static Boolean x = false,o = false;
    static char wins[] = new char[10]; 
    static JLabel scoreX,scoreO,xw,ow,scoreB;
    static JButton res,restart;
    static int rn = 0;
    static Dimension sc;
    static score s;
    public static void main(String args[]) throws Exception {
        sc = Toolkit.getDefaultToolkit().getScreenSize();
        s = new score();
        JScrollPane s1 = new JScrollPane(s);
        s1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        s1.getVerticalScrollBar().setUnitIncrement(10);
        s1.setFocusable(false);
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        JButton b[] = new JButton[9];
        res = new JButton("RESET");
        res.setSize(200,40);
        res.setFont(new Font("arial",Font.BOLD,30));
        res.setBackground(Color.gray);
        res.setForeground(Color.black);
        res.setLocation(sc.width-350,100);
        res.setFocusable(false);
        res.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bx1 = false;
                bx2 = false;
                bx3 = false;
                bx4 = false;
                bx5 = false;
                bx6 = false;
                bx7 = false;
                bx8 = false;
                bx9 = false;
                bo1 = false;
                bo2 = false;
                bo3 = false;
                bo4 = false;
                bo5 = false;
                bo6 = false;
                bo7 = false;
                bo8 = false;
                bo9 = false;
                for(int i = 0;i < 9;i++){
                    b[i].setText("");
                    b[i].setBackground(Color.white);
                }
                x = false;
                o = false;
                px = true;
                po = false;
            }
        });
        restart = new JButton("RESTART");
        restart.setSize(200,40);
        restart.setFont(new Font("arial",Font.BOLD,30));
        restart.setBackground(Color.gray);
        restart.setForeground(Color.black);
        restart.setLocation(sc.width-650,100);
        restart.setFocusable(false);
        restart.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bx1 = false;
                bx2 = false;
                bx3 = false;
                bx4 = false;
                bx5 = false;
                bx6 = false;
                bx7 = false;
                bx8 = false;
                bx9 = false;
                bo1 = false;
                bo2 = false;
                bo3 = false;
                bo4 = false;
                bo5 = false;
                bo6 = false;
                bo7 = false;
                bo8 = false;
                bo9 = false;
                for(int i = 0;i < 9;i++){
                    b[i].setText("");
                    b[i].setBackground(Color.white);
                }
                x = false;
                o = false;
                px = true;
                po = false;
                rn   = 0;
                for(int i = 0;i < 10;i++){
                    wins[i] = 'N';
                }
                s.repaint();
            }
        });
        for(int i = 0;i < 10;i++){
            wins[i] = 'N';
        }
        JFrame f = new JFrame("Tic Tac Toe By Shashwat Gupta");
        f.setIconImage(new ImageIcon(System.getProperty("user.dir")+"\\res\\icon.png").getImage());
        f.setSize(sc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        Container c = f.getContentPane();
        c.setLayout(null);
        JPanel p = new JPanel();
        p.setSize(sc.width-600,sc.height-300);
        p.setLocation(sc.width-800,200);
        p.setBackground(Color.gray);
        p.setLayout(new GridLayout(3,3,10,10));
        c.add(s);
        c.add(res);
        c.add(restart);
        for(int i = 0;i < 9;i++){
            b[i] = new JButton();
            b[i].setBackground(Color.white);
            b[i].setFont(new Font("arial",Font.BOLD,120));
            b[i].setFocusable(false);
            b[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(!x && !o){
                        if(e.getSource() == b[0]){
                            if(px && !bx1 && !bo1){
                                px = false;
                                po = true;
                                bx1 = true;
                                b[0].setText("X");
                            }else if(po && !bo1 && !bx1){
                                po = false;
                                px = true;
                                bo1 = true;
                                b[0].setText("O");
                            }
                        }else if(e.getSource() == b[1]){
                            if(px && !bx2 && !bo2){
                                px = false;
                                po = true;
                                bx2 = true;
                                b[1].setText("X");
                            }else if(po && !bo2 && !bx2){
                                po = false;
                                px = true;
                                bo2 = true;
                                b[1].setText("O");
                            }
                        }else if(e.getSource() == b[2]){
                            if(px && !bx3 && !bo3){
                                px = false;
                                po = true;
                                bx3 = true;
                                b[2].setText("X");
                            }else if(po && !bo3 && !bx3){
                                po = false;
                                px = true;
                                bo3 = true;
                                b[2].setText("O");
                            }
                        }else if(e.getSource() == b[3]){
                            if(px && !bx4 && !bo4){
                                px = false;
                                po = true;
                                bx4 = true;
                                b[3].setText("X");
                            }else if(po && !bo4 && !bx4){
                                po = false;
                                px = true;
                                bo4 = true;
                                b[3].setText("O");
                            }
                        }else if(e.getSource() == b[4]){
                            if(px && !bx5 && !bo5){
                                px = false;
                                po = true;
                                bx5 = true;
                                b[4].setText("X");
                            }else if(po && !bo5 && !bx5){
                                po = false;
                                px = true;
                                bo5 = true;
                                b[4].setText("O");
                            }
                        }else if(e.getSource() == b[5]){
                            if(px && !bx6 && !bo6){
                                px = false;
                                po = true;
                                bx6 = true;
                                b[5].setText("X");
                            }else if(po && !bo6 && !bx6){
                                po = false;
                                px = true;
                                bo6 = true;
                                b[5].setText("O");
                            }
                        }else if(e.getSource() == b[6]){
                            if(px && !bx7 && !bo7){
                                px = false;
                                po = true;
                                bx7 = true;
                                b[6].setText("X");
                            }else if(po && !bo7 && !bx7){
                                po = false;
                                px = true;
                                bo7 = true;
                                b[6].setText("O");
                            }
                        }else if(e.getSource() == b[7]){
                            if(px && !bx8 && !bo8){
                                px = false;
                                po = true;
                                bx8 = true;
                                b[7].setText("X");
                            }else if(po && !bo8 && !bx8){
                                po = false;
                                px = true;
                                bo8 = true;
                                b[7].setText("O");
                            }
                        }else if(e.getSource() == b[8]){
                            if(px && !bx9 && !bo9){
                                px = false;
                                po = true;
                                bx9 = true;
                                b[8].setText("X");
                            }else if(po && !bo9 && !bx9){
                                po = false;
                                px = true;
                                bo9 = true;
                                b[8].setText("O");
                            }
                        }
                        if(bx1 && bx4 && bx7){
                            x = true;
                            rn++;
                            b[0].setBackground(Color.green);
                            b[3].setBackground(Color.green);
                            b[6].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bx2 && bx5 && bx8){
                            x = true;
                            rn++;
                            
                            b[1].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[7].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bx3 && bx6 && bx9){
                            x = true;
                            rn++;
                            
                            b[2].setBackground(Color.green);
                            b[5].setBackground(Color.green);
                            b[8].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bx1 && bx2 && bx3){
                            x = true;
                            rn++;
                            
                            b[0].setBackground(Color.green);
                            b[1].setBackground(Color.green);
                            b[2].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bx4 && bx5 && bx6){
                            x = true;
                            rn++;
                            
                            b[3].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[5].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bx7 && bx8 && bx9){
                            x = true;
                            rn++;
                            
                            b[6].setBackground(Color.green);
                            b[7].setBackground(Color.green);
                            b[8].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bx1 && bx5 && bx9){
                            x = true;
                            rn++;
                            
                            b[0].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[8].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bx3 && bx5 && bx7){
                            x = true;
                            rn++;
                            
                            b[2].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[6].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }
                        if(bo1 && bo4 && bo7){
                            o = true;
                            rn++;
                            
                            b[0].setBackground(Color.green);
                            b[3].setBackground(Color.green);
                            b[6].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                            }else if(bo2 && bo5 && bo8){
                            o = true;
                            rn++;
                            
                            b[1].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[7].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bo3 && bo6 && bo9){
                            o = true;
                            rn++;
                            
                            b[2].setBackground(Color.green);
                            b[5].setBackground(Color.green);
                            b[8].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bo1 && bo2 && bo3){
                            o = true;
                            rn++;
                            
                            b[0].setBackground(Color.green);
                            b[1].setBackground(Color.green);
                            b[2].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bo4 && bo5 && bo6){
                            o = true;
                            rn++;
                            
                            b[3].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[5].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bo7 && bo8 && bo9){
                            o = true;
                            rn++;
                            
                            b[6].setBackground(Color.green);
                            b[7].setBackground(Color.green);
                            b[8].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bo1 && bo5 && bo9){
                            o = true;
                            rn++;
                            
                            b[0].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[8].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }else if(bo3 && bo5 && bo7){
                            o = true;
                            rn++;
                            
                            b[2].setBackground(Color.green);
                            b[4].setBackground(Color.green);
                            b[6].setBackground(Color.green);
                            c.repaint();
                            c.revalidate();
                        }
                    }
                    if(x){
                        wins[rn-1] = 'X';
                    }else if(o){
                        wins[rn-1] = 'O';
                    }
                }
            });
            p.add(b[i]);
        }
        c.add(p);
        f.setVisible(true);
    }
}