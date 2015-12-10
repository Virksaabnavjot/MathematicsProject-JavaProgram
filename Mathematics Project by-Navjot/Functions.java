/*
 *Introduction to Mathematics
 *Question 1
 *Functions.java
 *@Author:Navjot Singh Virk
 *Student Number: x13112406
 *Date:5/Dec/2013
 */

public class Functions{

	//declare data members
	private int x;
	private int ans;

	//constructor
	public Functions(){
		x = 0;
		ans = 0;
	}

	// set method
	public void setX(int x){
		this.x = x;
	}

	//compute
	public void computeF(){
		ans = (3 * (x) + 2);
	}

	public void computeFInverse(){
		ans = ((x - 2) / 3);
	}

	public void computeG(){
		ans = (int)(8 * Math.pow(x,3));
	}

	public void computeGInverse(){
		ans = (int)(Math.cbrt(x) /8);
	}

	//get method
	public int getAns(){
		return ans;
	}

}
