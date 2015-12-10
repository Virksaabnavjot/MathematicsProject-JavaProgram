/*
 *Introduction to Mathematics
 *Question 2
 *Predicate.java
 *@Author:Navjot Singh Virk
 *Student Number: x13112406
 *Date:5/Dec/2013
 */

public class Predicate {

	//declare data members
	private int x;
	private int y;
	private boolean xNavjot;
	private boolean yNavjot;

	//constructor
	public Predicate(){
		x = 0;
		y = 0;
	}

	//set method
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}

	//Compute
	public void computeX(){
		if(x % 2 == 1){
			xNavjot = true;
		}

		else{
			xNavjot = false;
		}
	}

	public void computeY(){
		if(y > 5){
			yNavjot = true;
		}

		else{
			yNavjot = false;
		}
	}

	//get methods
	public boolean getXNavjot(){
		return xNavjot;
	}

	public boolean getYNavjot(){
		return yNavjot;
	}

}
