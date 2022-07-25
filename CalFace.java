import java.awt.*;
import javax.swing.*;
class CalFace
{
	public static void main(String args[])
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();
		
		FlowLayout fly = new FlowLayout();
		con.setLayout(fly);
		JButton[] fbtn=new JButton[5];
		fbtn[0]=new JButton("+");
		fbtn[1]=new JButton("-");
		fbtn[2]=new JButton("*");
		fbtn[3]=new JButton("/");
		fbtn[4]=new JButton("=");
		for(int i=0;i<fbtn.length;i++)
			con.add(fbtn[i]);
		
		BorderLayout bly = new BorderLayout();
		con.setLayout(bly);
		
		Panel pnl=new Panel();
		pnl.setLayout(new GridLayout(5,3));
		
		TextField txt= new TextField();
		JButton[] btn=new JButton[16];
		btn[0]=new JButton(0+"");
		btn[1]=new JButton("+");
		btn[2]=new JButton("-");
		btn[3]=new JButton("*");
		btn[4]=new JButton("/");
		btn[5]=new JButton("=");
		btn[6]=new JButton("UNDO");
		for(int i=1;i<7;i++)
		{
			pnl.add(btn[i]);
		}
		for(int i=7,j=9;i<btn.length;i++,j--)
		{
			btn[i]=new JButton((j)+"");
			pnl.add(btn[i]);
		}
		con.add(txt,BorderLayout.NORTH);
		con.add(pnl,BorderLayout.CENTER);
		con.add(btn[0],BorderLayout.SOUTH);
		
		frm.setSize(400,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}