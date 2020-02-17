package Algorithms.Part1;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

import java.util.Scanner;

public class QueueK {
   public static String K(Queue q1,int k){
       int c=q1.size()-k;
       System.out.println(q1);
       //System.out.println(c);
       for(;c>0;c--)q1.dequeue();
       //q1.dequeue();
       String str1= (String) q1.peek();

       return str1;
   }

    public static void main(String[] args) {
        Queue<String> Q=new Queue<String>();
        Scanner sca=new Scanner(System.in) ;
     /*   while(sca.hasNext()){
            Q.enqueue(sca.nextLine());
        }*/
        String s2="asd";
        String s3="ddd";
        String s4="aaa";
        String s5="ccc";
        Q.enqueue(s2);
        Q.enqueue(s4);Q.enqueue(s3);Q.enqueue(s5);
        //System.out.println(Q.dequeue());
        System.out.println(K(Q,sca.nextInt()));
    }
}
