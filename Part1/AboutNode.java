package Algorithms.Part1;
public class AboutNode {
    Node node1=new Node();
    AboutNode(Node first){
        node1=first;
    }
    public void deN(int n){
       Node t=new Node();
        while (!(node1.next==null)){
            if (n==2)break;
            node1=node1.next;
            n--;
        }
        t=node1.next;
        node1.next=node1.next.next;
        t=null;

    }
    public static void printNode(Node first,int n){
        //Node t=first;
        System.out.println();
        while (!(first.next==null)){
            System.out.print(first.item+"  ");
            first=first.next;
        }System.out.print(first.item);
    }

    public void deTill(){
        while (!(node1.next.next==null)){
            node1=node1.next;
        }
        node1.next=null;
    }

    public boolean find(Node n,int a){
        while (n!=null){
            if ((int)n.item==a)return true;
            n=n.next;
        }
        return false;
    }

}
