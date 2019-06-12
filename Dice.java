import java.util.Scanner;
public class Dice{
	public static void main(String[] args){
        //the dice
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        //the result
        System.out.println("Die 1: " + die1 + ", Die 2: " + die2 + ", total: " + (die1 + die2));
	}
}
