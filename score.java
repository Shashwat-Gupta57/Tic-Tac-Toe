import javax.swing.*;
import java.awt.*;
public class score extends JPanel{
    main m = new main();
    score(){
        setFont(new Font("arial",Font.BOLD,60));
        setSize(500,m.sc.height);
        setLocation(0,0);
        setBackground(Color.black);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.yellow);
        g.setFont(new Font("arial",Font.BOLD,50));
        g.drawString("SCOREBOARD",60,50);
        g.drawString("X",220,150);
        g.drawString("O",400,150);
        g.setColor(Color.white);
        g.drawLine(1,100,499,100);
        g.drawLine(1, 670, 499, 670);
        g.drawLine(165,100,165,670);
        g.drawLine(1,165,499,165);
        g.drawLine(1, 100, 1, 670);
        g.drawLine(330,100,330,670);
        g.drawLine(499, 100, 499, 670);
        g.setColor(Color.yellow);
        g.setFont(new Font("arial",Font.BOLD,30));
        g.drawString("Round no.",10,140);
        g.setFont(new Font("arial",Font.BOLD,40));
        for(int i = 200,j = 1;i < m.sc.height-150 && j < 11;i+=50,j++){
            if(j >= 10){
                g.drawString(""+j,57,i);
            }else{
                g.drawString(""+j,70,i);
            }
        }
        if(m.x || m.o){
            g.setFont(new Font("arial",Font.BOLD,30));
            for(int i = 0;i < 10;i++){
                if(m.wins[i] == 'X'){
                    g.drawString("win",220,50*(i+1)+150);
                    g.drawString("-",410,50*(i+1)+150);
                }else if(m.wins[i] == 'O'){
                    g.drawString("-",245,50*(i+1)+150);
                    g.drawString("win",390,50*(i+1)+150);
                }
            }
            g.setFont(new Font("arial",Font.BOLD,50));
        }
    }
}