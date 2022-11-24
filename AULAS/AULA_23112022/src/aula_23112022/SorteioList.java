package aula_23112022;

import java.sql.Array;
import java.util.ArrayList;

public class SorteioList {
    private ArrayList<Integer> nums = new ArrayList<>();

    public void sorteia(){
        int num;
        while (nums.size() < 6){
            num = (int)(Math.random() * 10) + 1;
            if(!nums.contains(num)){
                nums.add(num);
            }
        }
    }

    public void listaSorteio(){
        System.out.println("Números sorteados");
        int i = 0;
        for(Integer val : nums){
            i++;
            System.out.println(i + ": " + val);
        }
    }
}
