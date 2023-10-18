package ladder;

import java.util.Random;

public class PlayerRollsAdieBetween1To6 {
	public void start()
	{
		int Position=0;
		int Playerone;
		int Roll_die=0;
		Playerone=Position;
		System.out.println("Player start at zero position" +" "+ Playerone);
		Playerone = Roll_die();
		System.out.println("Player rolled a die and got the position"+" "+Playerone);
	}
	public int Roll_die() {
		Random randomNum = new Random();
		int dice = randomNum. nextInt(1,6);
		//System. out. println("Random number between 1 and 6: " + dice);
		return dice;
	}
	public void board()
	{
		start();
		//Roll_die();
	}
	public static void main(String[] args) {
		PlayerRollsAdieBetween1To6 p= new PlayerRollsAdieBetween1To6();
		p.board();
		//p.Roll_die();
	}

}
