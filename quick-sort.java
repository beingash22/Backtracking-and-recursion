import java.io.*;

class quick
{
    static int a[]=new int[20];
    static int n;

    public int partition (int start, int end)
    {
        int key=a[end], i, pi=0, temp;

        for (i=0; i<end; i++)
        {
            if (a[i]<key)
            {
                temp=a[i];
                a[i]=a[pi];
                a[pi]=temp;
                pi++;
            }
        }
        temp=a[i];
        a[i]=a[pi];
        a[pi]=temp;

        return pi;
    }

    public void quick_sort(int start, int end)
    {
        int pi;
        if (start<end)
        {
            pi=partition(start, end);
            quick_sort(start, pi-1);
            quick_sort(pi+1, end);
        }
    }
    public void display()
    {
        for (int i=0; i<n; i++)
        System.out.print(a[i]+" ");
    }

    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        n=Integer.parseInt(br.readLine());
        
        for (int i=0; i<n; i++)
        a[i]=Integer.parseInt(br.readLine());

        quick ob=new quick();
        ob.quick_sort(0, n-1);
        ob.display();
    }
}