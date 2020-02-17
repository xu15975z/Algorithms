package Algorithms.Part1;

public class Counter {
    int i=0;
    int N,Max;
    public Counter(int n,int max){
        N=n;Max=max;
    }
    public int plus(int c){
        for(;N!=0&&i<Max&&c!=0;i++,N--,c--);
        if (N==0){System.out.println("次数用完不可再次计数  i="+i);}
        return i;
    }
   public int minu(int c){
       for(;N!=0&&i<Max&&c!=0;i--,N--,c--);
        if (N==0){System.out.println("次数用完不可再次计数  i="+i);}
       return i;
    }

    public int getI() {
        return i;
    }
}
