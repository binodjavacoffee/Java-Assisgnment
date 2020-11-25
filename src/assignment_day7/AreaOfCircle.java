package assignment_day7;

import javax.swing.JOptionPane;
//By using JOptionPane Method
public class AreaOfCircle {

	public static void main(String[] args) {
		
		System.out.println("===========JOptionPane=============");
		final double PI= Math.PI;
		String r = JOptionPane.showInputDialog("Enter the radius");
		double radius = Double.parseDouble(r);	
		double areaOfCircle = PI*Math.pow(radius, 2) ;
		JOptionPane.showMessageDialog(null,"Area of Circle is :" + areaOfCircle);

		
		
	}

}
