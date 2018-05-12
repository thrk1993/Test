import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.lang.Math;

public class All extends JPanel{

	/*
	 *...DDA Line....
	 *
    public void paint(Graphics g) {
    	double dx,dy,step,xinc,yinc;
    	double x1=21; double y1=22;
    	double x2=200; double y2=366;
    	double x=0; double y=0;
    	
    	dx=x2-x1; dy=y2-y1;
    	
    	if(Math.abs(dx)>Math.abs(dy))
    		step=Math.abs(dx);
    	else
    		step=Math.abs(dy);
    	
    	xinc=dx/step;
    	yinc=dy/step;
    	
    	for(int i=0;i<=step;i++){
    		x=x+xinc;
    		y=y+yinc;
    		g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(x),(int)Math.round(y));
    	}
    		 
    }
    
   */
   
   
   /*
    *....Bresanham_Line....
    *
   	public void paint(Graphics g){
   		int x,y,dx,dy,xend,d,inc1,inc2;
   		int x1=12; int y1=23;
   		int xn=222; int yn=254;
   		
   		dx=Math.abs(xn-x1);
   		dy=Math.abs(yn-y1);
   		d=2*dy-dx;
   		
   		if(x1>xn){
   			x=xn;
   			y=yn;
   			xend=x1;
   		}else{
   			x=x1;
   			y=y1;
   			xend=xn;
   		}
   		g.drawLine((int)x,(int)y,(int)x,(int)y);
   		
   		inc1=2*dy;
   		inc2=2*dy-dx;
   		
   		for(int i=x+1;i<xend;i++){
   			if(dx<0){
   				d=d+inc1;
   				y=y;
   			}else{
   				d=d+inc2;
   				y++;
   			}
   		g.drawLine((int)i,(int)y,(int)i,(int)y);	
   		}
   	}	
    */	
    	
    public static void main (String[] args) {
    JFrame f=new JFrame("T");
    f.setVisible(true);
    f.setBackground(Color.white);
    f.setSize(800,600);
    f.getContentPane().add(new All());
    }
    
}