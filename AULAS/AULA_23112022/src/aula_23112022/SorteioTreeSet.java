package aula_23112022;

import java.util.TreeSet;

public class SorteioTreeSet {
    private TreeSet<Integer> nums = new TreeSet<>();

    public void sorteia(){
        int num;
        while(nums.size() < 6){
            num = (int)(Math.random()*10) + 1;
            nums.add(num);
        }
    }
    /* Neste caso os número podem repetir...*/

    public void listaSorteio(){
        System.out.println("Números sorteados");
        int i = 0;
        for(Integer val : nums){
            i++;
            System.out.println(i + ": " + val);
        }
    }

}
