package Algorithms.Part1;

public class TestNode {



    public static void main(String[] args) {
        final  int N=15;
        Node t=new Node();
        Node []n=new Node[N];
        n[0]=new Node(0);
        for (int i=0;i<N-1;i++){
            n[i+1]=new Node(i+1);
            n[i].next=n[i+1];
        }
        n[N-1].next=null;

        AboutNode de=new AboutNode(n[0]);
        de.printNode(n[0],N);
        de.deN(6);
        de.printNode(n[0],N);
        de.deTill();
        de.printNode(n[0],N);
        if(de.find(n[0],12)) System.out.println("\n存在");;
    }
}

