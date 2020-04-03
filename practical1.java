package quest3;
import java.awt.*;
import javax.swing.*;
class CheckBox extends JFrame{
    JPanel btn,north,south,center;
    JLabel label;
    CheckBox(){
        north=new JPanel();
        south=new JPanel();
        center=new JPanel();
        label=new JLabel("White");
        north.add(label);
        add(north,BorderLayout.NORTH);
        label=new JLabel("Black");
        south.add(label);
        add(south,BorderLayout.SOUTH);
        
        for(int i=0; i<8; ++i){
            for(int j=1; j<=8; ++j){
                btn=new JPanel();
                btn.setLayout(new GridBagLayout());
                if(i==0 || i==7){
                    if(j==1||j==8){
                        label=new JLabel("R");
                        btn.add(label);
                    }
                    if(j==2||j==7){
                        label=new JLabel("Kn");
                        btn.add(label);
                    }
                    if(j==3||j==6){
                        label=new JLabel("B");
                        btn.add(label);
                    }
                    if(j==4){
                        label=new JLabel("Q");
                        btn.add(label);
                    }
                    if(j==5){
                        label=new JLabel("Ki");
                        btn.add(label);
                    }
                }
                else if(i==1||i==6){
                    label=new JLabel("P");
                        btn.add(label);
                }
                if(i%2 == 0){
                    if(j%2 != 0){
                        btn.setBackground(Color.BLACK);
                        label.setForeground(Color.white);
                    }
                    else{
                        label.setForeground(Color.BLACK);
                    }
                }
                else{
                    if(j%2 == 0){
                        btn.setBackground(Color.BLACK);
                        label.setForeground(Color.white);
                    }
                    else{
                        label.setForeground(Color.BLACK);
                    }
                        
                }
                
                btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));    
                center.add(btn);
            }
        }
        center.setLayout(new GridLayout(8,8));
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(center,BorderLayout.CENTER);
        
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class practical1 {
    public static void main(String[] args) {
        CheckBox c=new CheckBox();
    }
    
}
