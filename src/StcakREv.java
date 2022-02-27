// Reverse and Palindrome using Stack....
import java.util.Scanner;

public class StcakREv {
   char[] arr;
   int top;
   StcakREv(int l)
   {
       arr=new char[l];
       top=-1;
   }
void push(char x)
{
    if(top==arr.length-1)
    {
        System.out.println("full");
    }
    else
    {
        top=top+1;
        arr[top]=x;
    }
}
char pop() {
    char a=0;
    if (top == -1) {
        System.out.println("Empty");
    }
    else {
        a = arr[top];
        top = top - 1;
    }
    return a;
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        StcakREv obj=new StcakREv(a.length());
        for (int i = 0; i < a.length(); i++) {
            obj.push(a.charAt(i));
        }
        String s1="";
        for (int i = 0; i < a.length(); i++) {
            s1=s1+obj.pop();
        }
        System.out.println(s1);
        if(a.equalsIgnoreCase(s1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
