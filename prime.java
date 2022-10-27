import java .util.*;
class prime
{
  public static void main()
  {
      
      int i,n,c=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number");
      n=sc.nextInt();
      for(i=2;i<=n;i++)
      {
        if(n%i==0)
        {
        c++;
        break;
    }
}
    if(c==0)
      System.out.println("It is a prime number");
    else
      System.out.println("Not a prime number");
    }
}



    
      
      
  
