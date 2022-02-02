import java.util.*;
public class StackDemo
{   int[] arr;
    int top;
    StackDemo()
    {
        arr=new int[5];
        top=-1;

    }
    void push()
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack Full");
        }
        else
        {
            System.out.println("Enter Data");
            Scanner sc=new Scanner(System.in);
            int data=sc.nextInt();

            top=top+1;
            arr[top]=data;
            System.out.println("Data Inserted.......");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Empty");
        }
        else
        {   System.out.println("Deleted..."+arr[top]);
            top=top-1;

        }
    }
    void traverse()
    {   if(top==-1)
    {
        System.out.println("Stack Empty");
    }
    else
    {
        System.out.println("-----------------Stack Element--------------");
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    }
    public static void main(String[] args)
    {
        StackDemo obj=new StackDemo();
        while(true){
            System.out.println("Press 1 for Push");
            System.out.println("\nPress 2 for Pop");
            System.out.println("\nPress 3 for Traverse");
            System.out.println("\nPress 4 for Exit");

            System.out.println("Enter your choice");
            Scanner s=new Scanner(System.in);
            int choice=s.nextInt();

            switch (choice) {
                case 1 -> obj.push();
                case 2 -> obj.pop();
                case 3 -> obj.traverse();
                case 4 -> System.exit(1);
                default -> System.out.println("Wrong Choice");
            }
        }
    }
}
