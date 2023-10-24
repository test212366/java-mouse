package mouse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class prog13 {

	public static void main(String[] args) {
		 okno window =new okno();

	}
}
class okno extends JFrame{
	public okno() {
		setBounds(40,40,800,600);
		setTitle("”правление с помощью мыши");
		panel pan=new panel();
		Container con= getContentPane();
		con.add(pan);
	
		setVisible(true);
	}
} 

class panel extends JPanel{
	
	Color[] masColor;
	int tCol=0;
	int mX,mY; 
	int col= e.getClickCount();
	int btn=e.getButton();
	Boolean flag=false;

	public void paintComponent(Graphics gr) {
		for (int i=0; i<7; i++) {
	gr.setColor(masColor[i]);
	gr.fillRect(i*100,0,100,50);
}
		addMouseListener(new myMouse1());
		addMouseMotionListener(new myMouse2());	
		setFocusable(true);
		if (flag==true) {
			gr.setColor(masColor[tCol]);
			gr.fillRect(mX,mY,3,3);
		}
		if((tX>0))&&(tX<700)&&(tY>0)&&(tY>50)){
			if(col==1) {
				if (btn==1) {
					tCol=tX/100;
				}
			}
		}
     masColor = new Color[7];
	 masColor[0] = Color.BLACK;
	 masColor[1]=Color.green;
	 masColor[2]=Color.BLUE;
	 masColor[3]=Color.RED;
	 masColor[4]=Color.YELLOW;
	 masColor[5]=Color.WHITE;
	 masColor[6]=Color.ORANGE;
			}

class myMouse1 implements MouseListener{
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
	}
	@Override
	public void mouseExited(MouseEvent e) { 
	}
}
class myMouse2 implements MouseMotionListener{
	@Override
	public void mouseDragged(MouseEvent e) { 
		int tX=e.getX();
		int tY=e.getY();
		if(tY>50) {
			mX=tX;
			mY=tY;
			flag=true;
			repaint;
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) { 
		int tX=e.getX();
		int tY=e.getY();
		if((tX>0))&&(tX<700)&&(tY>0)&&(tY>50)){
			setCursor(new Cursor(cursor.HAND_CURSOR));
		else {
			setCursor(new Cursor(Cursor.CUSTOM_CURSOR));
		}
		}
	System.out.println(e.getX()+" "+e.getY());
	}
	}
	} 


	
	
 
	 
	






