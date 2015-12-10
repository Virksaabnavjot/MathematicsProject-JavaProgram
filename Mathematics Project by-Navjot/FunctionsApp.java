/*
 *Introduction to Mathematics
 *Question 1
 *FunctionsApp.java
 *@Author:Navjot Singh Virk
 *Student Number: x13112406
 *Date:5/Dec/2013
 */

import javax.swing.JOptionPane;
public class FunctionsApp{
       public static void main(String args[]){

		//declare variables
		int x;
		int ans;
		int option;

		//declare and create objects
		Functions mySelfNavjot = new Functions();

		//input
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Please assign a value for 'x'."));
		option = Integer.parseInt(JOptionPane.showInputDialog(null,"Please select an option \n "+" 1: f o f \n "+" 2: g o g \n "+" 3: f o g \n "+" 4: g o f \n "+" 5: f Inverse o f \n "+" 6: g Inverse o g"));

		mySelfNavjot.setX(x);

		//compute f o f
		if(option==1){
			mySelfNavjot.computeF();
			ans = mySelfNavjot.getAns();

			mySelfNavjot.setX(ans);

			mySelfNavjot.computeF();
			ans = mySelfNavjot.getAns();
		}

		//compute g o g
		else if(option==2){
			mySelfNavjot.computeG();
			ans = mySelfNavjot.getAns();

			mySelfNavjot.setX(ans);

			mySelfNavjot.computeG();
			ans = mySelfNavjot.getAns();
		}

		//compute f o g
		else if(option==3){
			mySelfNavjot.computeG();
			ans = mySelfNavjot.getAns();

			mySelfNavjot.setX(ans);

			mySelfNavjot.computeF();
			ans = mySelfNavjot.getAns();
		}

		//compute g o f
		else if(option==4){
			mySelfNavjot.computeF();
			ans = mySelfNavjot.getAns();

			mySelfNavjot.setX(ans);

			mySelfNavjot.computeG();
			ans = mySelfNavjot.getAns();
		}

		//compute f Inverse o f
		else if(option==5){
			mySelfNavjot.computeF();
			ans = mySelfNavjot.getAns();

			mySelfNavjot.setX(ans);

			mySelfNavjot.computeFInverse();
			ans = mySelfNavjot.getAns();
		}

		//compute g Inverse o g
		else{
			mySelfNavjot.computeG();
			ans = mySelfNavjot.getAns();

			mySelfNavjot.setX(ans);

			mySelfNavjot.computeGInverse();
			ans = mySelfNavjot.getAns();
		}

		//output
		JOptionPane.showMessageDialog(null,"The answer is "+ans+ " ");

	}

}
