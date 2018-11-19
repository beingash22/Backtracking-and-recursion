import java.io.*;

class find_angle
{
    public static void main(String args[])
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));

        System.out.println("Enter co-ordinates of side AB");
        int x1=Integer.parseInt(br.readLine());
        int y1=Integer.parseInt(br.readLine());

        System.out.println("Enter co-ordinates of side BC");
        int x2=Integer.parseInt(br.readLine());
        int y2=Integer.parseInt(br.readLine());

        System.out.println("Enter co-ordinates of side AC");
        int x3=Integer.parseInt(br.readLine());
        int y3=Integer.parseInt(br.readLine());

        int a=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        int b=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        int c=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}