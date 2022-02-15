
import java.util.*;

public class List {
    public static boolean isOperator(char x)
    {
        return switch (x) {
            case '+', '-', '*', '/' -> true;
            default -> false;
        };
    }
    public static String convert(String s)
    {
        Stack<String> stack=new Stack<>();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(isOperator(c)){
                String op1=stack.pop();
                String op2=stack.pop();
                String temp="("+op1+c+op2+")";
                stack.push(temp);
            }
            else
            {
                stack.push(c+"");   // Used to convert char type to string......
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        System.out.println(convert(a));

    }
}