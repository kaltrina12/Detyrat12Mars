package ushtrime;

import javax.swing.*;

public class NotaMestatareMeSwitch {
	public static void main(String[]args)
	{
		String s=JOptionPane.showInputDialog("shkruni numrin e pikeve");
		int piket=new Integer(s).intValue();
		if(piket>100)
		{
			JOptionPane.showMessageDialog(null,"Gabim: testi ka vetem 100 pike");
		}
		else
		{
		switch(piket)
		{
	
		case 50:
	    case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
		case 60:
			JOptionPane.showMessageDialog(null, "nota juaj eshte E");
			break;
		
		
		
	case 61:
	case 62:
	case 63:
	case 64:
	case 65:
	case 66:
	case 67:
	case 68:
	case 69:
	case 70:
		JOptionPane.showMessageDialog(null, "nota juaj eshte E");
		break;
	case 71:
	case 72:
	case 73:
	case 74:
	case 75:
	case 76:
	case 77:
	case 78:
	case 79:
	case 80:
		JOptionPane.showMessageDialog(null, "nota juaj eshte C");
		break;
	case 81:
	case 82:
	case 83:
	case 84:
	case 85:
	case 86:
	case 87:
	case 88:
	case 89:
	case 90:
		JOptionPane.showMessageDialog(null, "nota juaj eshte B");
		break;
	case 91:
	case 92:
	case 93:
	case 94:
	case 95:
	case 96:
	case 97:
	case 98:
	case 99:
	case 100:
		JOptionPane.showMessageDialog(null, "nota juaj eshte A");
		break;
		
		
		default :
			JOptionPane.showMessageDialog(null, "ju keni rene");
			break;
		}
		
		
		
		
		
		
		
		
		
			
		
		
		}
	

	}
}
	

