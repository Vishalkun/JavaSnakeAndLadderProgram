package ladder;

import java.util.Random;

public class PlayerWinningExact100 {
	public void start()
    {
        int position;
        int player_one = 3;
        int check_win;

        System.out.println("player one position is {0}"+ player_one);

        while (player_one <= 100)
        {
            check_win = CheckWin(player_one);
            if (check_win == 1)
            {
            	System.out.println("player won the game!!!");
                break;

            }
            if (check_win == 2)
            {
                position = 0;

            }
            else
            {
                position = roll_die();
            }

            if (position == 0)
            {
            	System.out.println("no play");
                player_one += position;

            }
            if (player_one == 0 && position < 0)
            {
            	System.out.println("this is snake bite @ 0");
                player_one = 0;
            }
            if (player_one > 0 && position < 0)
            {
            	System.out.println("this is a sanke bite");
                player_one += position;
                if (player_one < 0)
                {
                    player_one = 0;
                }
            }
            if (position > 0)
            {
            	System.out.println("its a ladder");
                player_one += position;
            }
            if (player_one > 100)
            {

                player_one -= position;
            }
            System.out.println("player one rolls the die and get the position {0}"+ player_one);
        }
    }

    public int CheckWin(int player_one)
    {
        if (player_one == 100)
        {
            return 1;
        }
        if (player_one > 100)
        {
            return 2;
        }
        else
        {
            return 0;
        }

    }

     Random random = new Random();
    int dice_thrown = 0;

    public int roll_die()
    {
        int dice, check;
        dice = random.nextInt(1,7);
        dice_thrown++;
        System.out.println("dice"+ dice);
        check = check_play();

        if (check == 1)
        {
            return -dice;
        }
        if (check == 2)
        {
            return dice;
        }
        else
        {
            return 0;
        }

    }

    public int check_play()
    {
        int check = random.nextInt(1,4);
        return check;
    }
    public void Board()
    {
        start();
        System.out.println("number of time dice thrown is "+ dice_thrown);

    }
	public static void main(String[] args) {
		PlayerWinningExact100 pw = new PlayerWinningExact100();
		pw.Board();
	}

}
