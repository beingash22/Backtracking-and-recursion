import java.util.Random;

class board
{
    static int x1=0, y1=0, x2=0, y2=0, res1, res2;
    static int board[][]=new int[5][5];

    static void row_move(int sum)
    {
        res1=sum+x1;
        x1=res1%5;
        y1=res1/5;
        board[x1][y1]=1;

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
                System.out.print (board[i][j]+" ");
            System.out.println ();
        }
        System.out.println ();
        System.out.println ();
    }
    static void col_move(int sum)
    {
        res2=sum+x2;
        x2=res2%5;
        y2=res2/5;
        board[x2][y2]=2;
            
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
                System.out.print (board[i][j]+" ");
            System.out.println ();
        }
        System.out.println ();
        System.out.println ();
    }

    public static void main(String args[])
    {
        int dice1, dice2, sum, ch;
        Random rand=new Random();

        dice1=rand.nextInt(5)+1;
        dice2=rand.nextInt(5)+1;
        sum=dice1+dice2;
        ch=(sum%2==0)?1:2;

        while (true)
        {
            
            switch(ch)
            {
                case 1:
                {
                    row_move(sum);

                    if (res1>25)
                    {
                    System.out.println("player 1 wins");
                    System.exit(0);
                    }
                    dice1=rand.nextInt(5)+1;
                    dice2=rand.nextInt(5)+1;
                    sum=dice1+dice2;
                    ch=(sum%2==0)?1:2;

                    break;
                }
                case 2:
                {
                    col_move(sum);

                    if (res2>25)
                    {
                    System.out.println("player 2 wins");
                    System.exit(0);
                    }
                    dice1=rand.nextInt(5)+1;
                    dice2=rand.nextInt(5)+1;
                    sum=dice1+dice2;
                    ch=(sum%2==0)?1:2;
                    break;
                }
            }
        }
     }
}