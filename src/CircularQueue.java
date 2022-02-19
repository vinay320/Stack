import java.util.Scanner;

public class CircularQueue
{   int[] arr;
    int front,rear;
    CircularQueue()
    {
        arr =new int[5];
        front=-1;
        rear=-1;
    }
    void insert()
    {   System.out.println("Enter Value:");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        if((front==0 && rear==arr.length-1)|| (rear+1==front))
        {
            System.out.println("Full");
        }
        else if(front==-1)
            {
                front=0;
                rear=0;
                arr[rear]=data;
            }
        else if(rear==arr.length-1 && front!=0)
            {
                rear=0;
                arr[rear]=data;
                System.out.println("Data Inserted");
            }
            else
            {   rear=rear+1;
                arr[rear]=data;
                System.out.println("Data Inserted");
            }

        }



    void delete()
    {
        if(front==-1)
        {
            System.out.println("Circular Queue Empty");
        }
        else
        {   System.out.println("Deleted..."+arr[front]);
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else if(front==arr.length-1)
            {
                front=0;
            }
            else
        {
            front=front+1;
        }
        }
    }
    void traverse()
    {
        if(rear==-1 || front==-1)
        {
            System.out.println("Circular Queue Empty");
        }
        else
        {
            if(front <= rear)
            {
                for(int i=front;i<=rear;i++)
                {
                    System.out.print(" "+arr[i]);
                }
            }
            else {
                for(int i=front;i<arr.length-1;i++)
                {
                    System.out.print(" "+arr[i]);
                }
                for(int i=0;i<=rear;i++)
                {
                    System.out.print(" "+arr[i]);
                }
            }

        }
    }
    public static void main(String[] args)
    {
        CircularQueue obj=new CircularQueue();
        while(true)
        {
            System.out.println("\nPress 1 for insertion");
            System.out.println("\nPress 2 for deletion");
            System.out.println("\nPress 3 for traversion");
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
