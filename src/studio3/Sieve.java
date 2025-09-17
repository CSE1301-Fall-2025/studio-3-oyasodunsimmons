import java.util.*;

public class Sieve 
{
public static void main(String[] args) 
{
    
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        boolean array [] = new boolean [n+1];

        in.close();
        for(int i =0; i < array.length; i++ )
        {
            array[i] = true;
        }

        for(int i = 2; i < array.length; i++)
        {
            for( int j = 2*i; array.length >= j; j+=i)
            {
                array[j] = false;
            }

        }

    
        for(int z = 0; z < array.length ; z++)
        {
            if(array[z] == true)
            {
                System.out.println(z);
            }
        }
}

}