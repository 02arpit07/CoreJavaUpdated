package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//USED HASHING AS IT IS BETTER APPROACH HERE.
public class IntersectionUnionLL {
    Node head;
    private class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void push(int data)
    {
        Node node =new Node(data);
        node.next=head;
        head=node;

    }
    void append(int data)
    {
        if(head==null)
        {
            Node node=new Node(data);
            head=node;
            return;
        }
        Node temp=head;
        Node node=new Node(data);
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
    }
    //Making a utility function which would help us in operation.
    boolean isPresent(Node head,int data)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    //--------------------------------intersection method----------------------------
    IntersectionUnionLL getIntersection(Node head1,Node head2)
    {
        Node n1=head1;
        Node n2=head2;
        HashSet<Integer> hs=new HashSet<>();
        IntersectionUnionLL  result=new IntersectionUnionLL();

        while(n1!=null)
        {
            if(hs.contains(n1.data))
            {
                hs.add(n1.data);
            }
            else{
                hs.add(n1.data);
            }
            n1=n1.next;
        }
        while(n2!=null)
        {
            if(hs.contains(n2.data))
            {
                result.push(n2.data);
            }
            n2=n2.next;
        }
        return result;
    }
    IntersectionUnionLL getUnion(Node head1,Node head2)
    {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Node n1 = head1;
        Node n2 = head2;
        IntersectionUnionLL result = new IntersectionUnionLL();

        // loop inserts the elements and the count of
        // that element of list1 into the hmap
        while(n1 != null)
        {
            if(hmap.containsKey(n1.data))
            {
                int val = hmap.get(n1.data);
                hmap.put(n1.data, val + 1);
            }
            else
            {
                hmap.put(n1.data, 1);
            }
            n1 = n1.next;
        }

        // loop further adds the elements of list2 with
        // their counts into the hmap
        while(n2 != null)
        {
            if(hmap.containsKey(n2.data))
            {
                int val = hmap.get(n2.data);
                hmap.put(n2.data, val + 1);
            }
            else
            {
                hmap.put(n2.data, 1);
            }
            n2 = n2.next;
        }

        // Eventually add all the elements
        // into the result that are present in the hmap
        for(int a:hmap.keySet())
        {
            result.append(a);
        }
        return result;
    }
    //----------------------    Main Methodddd---------------------------------
    public static void main(String[] args)
    {
        IntersectionUnionLL ll1=new IntersectionUnionLL();
        IntersectionUnionLL ll2=new IntersectionUnionLL();
        IntersectionUnionLL inter=new IntersectionUnionLL();
        IntersectionUnionLL union=new IntersectionUnionLL();

        ll1.push(20);
        ll1.push(4);
        ll1.push(15);
        ll1.push(10);

        ll2.push(10);
        ll2.push(2);
        ll2.push(4);
        ll2.push(8);

        inter=inter.getIntersection(ll1.head,ll2.head);
        union=union.getUnion(ll1.head, ll2.head);
        System.out.println("First List is");
        ll1.printList();

        System.out.println("Second List is");
        ll2.printList();

        System.out.println("Intersection List is");
        inter.printList();

        System.out.println("Union List is");
        union.printList();

    }


}




/*
what is problem with this piece of codeee.........-----
 void getUnion(Node head1,Node head2)
    {
        HashSet<Integer> hm=new HashSet<>();
        Node n1=head1;
        Node n2=head2;
        IntersectionUnionLL result=new IntersectionUnionLL();
        while(n1!=null)
        {
            if(!hm.contains(n1.data))
            {
                hm.add(n1.data);
            }
        }
        while(n2!=null)
        {
            if(!hm.contains(n2.data))
            {
                hm.add(n2.data);
            }
        }
        Iterator<Integer> itr=hm.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr+" ");
        }
    }


    and in mainn
    union.getUnion(ll1.head,ll2.head);
 */
