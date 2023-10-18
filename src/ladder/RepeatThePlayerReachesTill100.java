package ladder;

import java.util.Random;

public class RepeatThePlayerReachesTill100 {
	public void start()
	{
		
            int position;
            int player_one = 3;

            System.out.println("player one position is "+ player_one);

            while (player_one <= 100)
            {
                position = roll_die();
                if (position == 0)
                {
                	System.out.println("no play");
                    player_one += position;

                }
                if (player_one == 0 && position < 0)
                {
                	 System.out.println("this is snake bite  0");
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
                System.out.println("player one rolls the die and get the position "+ player_one);
            }
		}

	Random random = new Random();
    
         public int roll_die()
         {
             int dice, check;
             dice = random.nextInt(1,7);
             System.out.println("dice "+ dice);
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

         }

	public static void main(String[] args) {
		RepeatThePlayerReachesTill100 R = new RepeatThePlayerReachesTill100();
		R.Board();
	}

}
