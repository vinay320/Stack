// Doubly Linked List...
import java.util.Scanner;

class Noded{
    int data;
    Noded next;
    Noded pre;
}
public class DoublyLinkedList
{
    Noded head;
    DoublyLinkedList()
    {
        head=null;
    }

    void insert()
    {
        System.out.println("Enter Vlaue");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        Noded n=new Noded();
        n.data=x;
        n.next=null;
        n.pre=null;

        if(head==null)
        {
            head=n;

        }
        else
        {
            Noded i=head;
            while(i.next!=null)
            {
                i=i.next;
            }
            i.next=n;
            n.pre=i;
        }
        System.out.println("Data Inserted");
    }
    void traverse()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Noded i=head;
            while(i!=null)
            {
                System.out.println(" "+i.data);
                i=i.next;
            }
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
                head.pre=null;
            }
        }
    }
    void delete_end()
    {

        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {    Noded i=head;
            while (i.next!=null)
            {
                i=i.next;
                if(i.next.next==null)
                    break;

            }
            if(i==head)
                head=null;
            else
                i.next=null;
        }
    }
    public static void main(String[] args)
    {
        DoublyLinkedList obj=new DoublyLinkedList();
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
                case 4 -> obj.delete_end();
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong Input.......");
            }

        }
    }
}
