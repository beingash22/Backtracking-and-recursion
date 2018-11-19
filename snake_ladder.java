import java.io.*;
import java.util.Random;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

class snake_ladder{

    static int res1=0, res2=0, mv1, mv2;
    static boolean search(int board[], int head)
    {
        for (int i=0; i<30; i++)
        {
            if (head==board[i])
            return false;
        }

        return true;
    }

    static void winner(int[] board, int p1, int p2)
    {
        res1=res1+p1;
        res2=res2+p2;   
    }

    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));

        int n_snake, n_ladder, head, tail;
        boolean loc;
        n_snake=Integer.parseInt(br.readLine());
        n_ladder=Integer.parseInt(br.readLine());
        int board[]=new int[30];

        for (int i=0; i<n_snake; i++)
        {
            head=Integer.parseInt(br.readLine());
            tail=Integer.parseInt(br.readLine());
            board[head]=tail;
        }

        for (int i=0; i<n_ladder; i++)
        {
            head=Integer.parseInt(br.readLine());
            tail=Integer.parseInt(br.readLine());

            loc=search(board, tail);

            if (loc)
            {
                board[tail]=head;
            }

            else if((board[tail]==0) && loc)
            {
                board[tail]=head;
            }
            else
            {
            System.out.println("input wrong");
            System.exit(0);
            }
        }
        Random rand=new Random();
        int ch=1,p1,p2;
        while (true)
        {
            switch(ch)
            {
                case 1:
                {
                    p1=rand.nextInt(5)+1;
                    System.out.println ("roll dice 1="+p1);
                    System.out.println();
                    winner(board, p1, 0);
                    mv1++;
                    if (res1==100)
                    {
                    System.out.println("player 1 wins with "+mv1+"moves");
                    System.exit(0);
                    }
                    ch=2;
                }
                case 2:
                {
                    p2=rand.nextInt(5)+1;
                    winner(board, 0, p2);
                    System.out.println ("roll dice 2="+p2);
                    System.out.println();              

                    if (res2==100)
                    {
                    System.out.println("player 2 wins with "+mv2+"moves");
                    System.exit(0);
                }
                ch=1;
                }
            }
        }
    }
}