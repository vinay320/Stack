/// Singly Queue Implimentaion using array.....
import java.util.Scanner;
public class SinglyQueue
{   int[] arr;
    int front,rear;
    SinglyQueue()
    {
        arr =new int[5];
        front=-1;
        rear=-1;
    }
    void insert()
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue full");
        }
        else
        {
            System.out.println("Eneter the element:");
            Scanner s=new Scanner(System.in);
            int data=s.nextInt();
            if(front==-1)
            {
                front=0;
            }
            rear=rear+1;
            arr[rear]=data;
            System.out.println("Data Inserted.....");
        }
    }
    void delete()
    {
        if(front==-1)
        {
            System.out.println("Empty");
        }
        else
        {System.out.println("Deleted..."+ arr[front]);
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else if(front<rear)
            {
                front=front+1;
            }

        }
    }
    void traverse()
    {
        if(front==-1 || rear==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(" "+arr[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        SinglyQueue obj=new SinglyQueue();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("\nPress 2 for delete");
            System.out.println("\nPress 3 for traverse");
            System.out.println("\nPress 4 for exit");

            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch (ch) {
                case 1 -> obj.insert();
                case 2 -> obj.delete();
                case 3 -> obj.traverse();
                case 4 -> System.exit(0);
                default -> System.out.println("Wrong Input.......");
            }

        }
    }
}
