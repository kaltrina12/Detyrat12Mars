package ushtrime;
import javax.swing.*;
public class VitiIbrishte {
	public static void main(String[]args)
	{
		String s=JOptionPane.showInputDialog("shkruani nje vit te qfardoshem");
		int viti=new Integer(s).intValue();
		if((viti%4==0)||(viti%100==0)||(viti%400==0))
	{
		
			
				JOptionPane.showMessageDialog(null, "viti "+viti+" -vit i brishte");
	}
		else
		{
			JOptionPane.showMessageDialog(null, "viti "+viti+" -nuk eshte vit i brishte");
		}
	}
}
		
		
	
		
	
	

	
		