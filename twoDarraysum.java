import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.lang.Math;

public class twoDarraysum {
    public static void main(String[] args) {
        
    List<Integer> tempintList = new ArrayList<Integer>();
    List<Integer> finaly = new ArrayList<Integer>();
    List<Integer> answers = new ArrayList<Integer>();
    Scanner gg = new Scanner(System.in);
    int t = gg.nextInt();
    int times = 1;
    while(times<=t){
        String inp = gg.nextLine();
        if(inp.equals(""))
            continue;
        for (String a : inp.split(",")){
            tempintList.add(Integer.parseInt(a));
        }
        if (times%2==0){
            Collections.reverse(tempintList);
        }
        finaly.addAll(tempintList);
        tempintList.clear();
        times++;
    }
    tempintList.clear();
    int size = finaly.size();
    int j=0;
    double tt;
    int tempsum=0,ans=0;
    while(j<size){
        tempsum += finaly.get(j);
        tt=Math.sqrt(tempsum);
        if (tt-Math.floor(tt)==0){
            answers.add(tempsum);
            tempintList.clear();
            tempsum=0;
        }
        j++;
    }
    gg.close();
    if (answers.isEmpty()){
        System.out.println(-1);
        return;
    }

    for (int x : finaly)
        System.out.println(x);
    System.out.println("OUT");
    for (int a:answers)
        ans = Math.max(ans,a);
    System.out.println(ans);
    gg.close();

}
}

