import java.util.Scanner;
class Palindrome_bet_2num
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
 System.out.println("Enter two number:"); 
 int n1 = s.nextInt();
 int n2 = s.nextInt();
for( int i=n1; i<=n2;i ++)
{
  if(display(i)==1)
     System.out.println(i+ " ");
       
   /*else                                               //this is used to print the result
   System.out.println("no palindrome numbers ");*/      // of each and every number in between 
                                                        //the given numbers
}
}
static int display(int i )
{
 int n = i ;
 int sum =0, rem;
 while(n>0)
{  
  rem = n%10;
  sum = sum*10 + rem;
  n = n/10;
}
  if(i == sum )
   return 1;
  else
   return 0;
}
}
 