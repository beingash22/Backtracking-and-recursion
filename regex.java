import java.io.*;
import java.util.regex.*;
class check
{
   /* public void match(String pat, String num)
    {
        Patter r=Pattern.compiler(pat);

       // Matcher m=R.Matcher(num);

        System.out.println (Pattern.matches("[0-1]+", "010011");
    }
    */

    public static void main (String args[])
    {
        System.out.println (Pattern.matches("[0-1]+", "010091"));
        System.out.println (Pattern.matches("[0-9A-F]+", "0B80091"));
    }
}