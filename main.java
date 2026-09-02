import java.util.*;
class Solution{
  public static void main(String[] args){
    int[] org=new int [5];
    int [] prefixSum=new int [5];
    int n=org.length;

    prefixSum[0]=org[0];
    for(int i=1;i<n;i++){
      prefixSum[i]=prefixSum[i-1] + org[i];
    }

    for(int i=0;i<n;i++){
      System.out.print(prefixSum[i]+" ");
    }
  }
}
