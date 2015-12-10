/*
 *Introduction to Mathematics
 *Question 2
 *PredicateApp.java
 *@Author:Navjot Singh Virk
 *Student Number: x13112406
 *Date:11/Dec/2013
 */

import javax.swing.JOptionPane;
public class PredicateApp {
       public static void main(String[] args) {

		//declare variables
		int x;
		int y;
		boolean xNavjot;
		boolean yNavjot;
		boolean conjunction;
		boolean disjunction;
		boolean negation;

       //declare and Create objects
		Predicate mySelfNavjot = new Predicate();

		//input
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a value to assign for 'x'"));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a value to assign for 'y'"));

		//process
		mySelfNavjot.setX(x);
		mySelfNavjot.setY(y);

		mySelfNavjot.computeX();
		mySelfNavjot.computeY();

		xNavjot = mySelfNavjot.getXNavjot();
        yNavjot = mySelfNavjot.getYNavjot();

		//The conjunction
		if(xNavjot == true && yNavjot == true){
			conjunction = true;
		}
		else{
			conjunction = false;
		}

		//The disjunction
		if(xNavjot == false && yNavjot == false){
			disjunction = false;
		}
		else{
			disjunction = true;
		}

		//The negation
		if (yNavjot == true){
			negation = false;
		}
		else{
			negation = true;
		}

		//Output
		JOptionPane.showMessageDialog(null," When x = "+x+" and y = "+y+",\n (1): The conjunction of P(x is odd)and Q(y > 5) is "+conjunction+".\n (2): The disjunction of P(x is odd) and Q(y > 5) is "+disjunction+".\n (3): The negation of Q(y > 5) is "+negation+".");

	}

}
