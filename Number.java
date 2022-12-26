import java.util.Scanner;
import java.util.Stack;
import java.lang.Math;
public class Number
{
    public void Reverse(Stack<Integer> sck, Integer sk1)
    {
        while(sk1 != 0)     // Storing a number from the right...
        {
            int num = sk1%10;
            sck.push(num);
            sk1 = (int)(sk1/10);
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();
        int num = -321;
        boolean ch = false;
        if(num < 0)
        {
            ch = true;
            num = -num;     // Changing the signs...
        }
        Number number = new Number();
        number.Reverse(stk, num);       // Function calling...
        int sum = 0, t1 = 0;
        while(!stk.isEmpty())
        {
            int val = stk.pop();
            sum = sum + (int) (val * Math.pow(10, t1));     // Type Casting from Float to Integer...
            t1++;
        }
        if(ch == true)
        {
            sum = -sum;
            System.out.println("The reversed number is : "+sum);
        }
        else
            System.out.println("The reversed number is : "+sum);
        sc.close();
    }
}