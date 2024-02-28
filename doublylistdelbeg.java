public class doublylistdelbeg {
    Node head,tail;
    
    public doublylistdelbeg(){
        head = tail = null;
    }
    public class Node {
        int  data;
        Node next;
        Node prev;
            
        Node(int data){
            this.data= data;
            this.next = null;
            this.prev = null;
        }
    }
    public void create(int value){
        Node newnode = new Node(value);
        if(head==null)
            head = tail = newnode;
        else{
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void display(Node head){
        if(head==null)
            System.out.println("list is empty");
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void delbeg(){
        if(head==null)
            System.out.println("list is empty deletion not possible");
        else if(head.next==null){
            head = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }
    public static void main(String[] args){
        doublylistdelbeg list = new doublylistdelbeg();
        list.create(2);
        list.create(4);
        list.create(6);
        list.display(list.head);
        System.out.println();
        list.delbeg();
        list.display(list.head);
    }
}  

