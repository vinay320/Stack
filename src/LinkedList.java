// LinkedList .....
import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class LinkedList
{
    Node head;
    LinkedList()
    {
        head=null;
    }
    void insert()
    {
        System.out.println("Enter Vlaue");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        Node n=new Node();
        n.data=x;
        n.next=null;

        if(head==null)
        {
            head=n;
        }
        else
        {
            Node i;
            for (i =head ;i!=null ;i=i.next) {

            }
            i.next=n;

        }
        System.out.println("Data insertd...");
    }

    void traverse()
    {   if(head==null)
    {
        System.out.println("Empty");
    }
        Node i;
        for (i =head ;i!=null ;i=i.next) {
            System.out.println(" "+i.data);
        }
    }
    void delete()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            if(head.next==null)
            {
                head=null;
            }
            else
            {
                head= head.next;
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
