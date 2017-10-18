import java.io.*;
import java.util.*;

public class Solution {
    Scanner scan=new Scanner(System.in);
    
    public int getN(){
        return scan.nextInt();
    }
    public int getK(){
        return scan.nextInt();
    }
    public int powerUp(int n, int p){
        return (int)java.lang.Math.pow(n,p);
    }
    public void powerFree(int n, int k){
        List<Integer> p_free=new ArrayList<>();
        for(int i=1; i<=n; i++){
            int powerGauge=0;
            for(int j=2; j<=n; j++){
                if(i%(powerUp(j,k))==0){
                    powerGauge++;
                }
            }
            if(powerGauge==0){
                p_free.add(i);
            }
        }
        /*for(Integer element:p_free){
            System.out.print(element+" ");
        }*/
        System.out.println(p_free.size());
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution solve=new Solution();
        solve.powerFree(solve.getN(), solve.getK());
    }
}
