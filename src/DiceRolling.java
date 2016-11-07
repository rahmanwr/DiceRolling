
import java.util.*;
import java.lang.Math;
import java.lang.*;

// Simulate dice rolling 

public class DiceRolling {
	public static void main(String[] args) {

		Dice D1, D2, D3;
		D1 = new Dice();
		D2 = new Dice();
		D3 = new Dice();
		D3.getSides();

		int firstRoll = D1.roll();
		int secondRoll = D2.roll();
		System.out.println("First die roll results:" + firstRoll);
		System.out.println("Second die roll results:" + secondRoll);
	}
}

class Dice {

	int SideNum; // field value

	public Dice()

	{
		SideNum = 6;
	}

	// get method
	public int getSides() {
		Scanner inputDevice = new Scanner(System.in);

		System.out.println("How many sides should each die have?:");
		SideNum = inputDevice.nextInt();
		return SideNum;
	}

	public void setSides(int Sides) // setmethod
	{
		SideNum = 6;
	}

	public int roll() {
		// return a random-generated integer value between 1 and amount of sides
		int rollResult = ((int) (Math.random() * 100) % SideNum + 1);
		return rollResult;
	}
}
