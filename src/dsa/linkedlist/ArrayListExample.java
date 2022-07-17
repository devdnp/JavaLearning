package DSpracto;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<Integer>(10);
                Scanner in = new Scanner(System.in);
              /*ArrayList<Integer> list = new ArrayList<Integer>(10);
              list.add(12); list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
              list.add(7);list.add(8);list.add(9);list.add(10);System.out.println(list);
              System.out.println(list.get(5));*/
                ArrayList<ArrayList<Integer>> list = new ArrayList<>();

                //initialisation
                for(int i=0;i<3;i++){
                    list.add(new ArrayList<>());
                }
                //add elements
                for(int i=0;i<3;i++) {
                    for (int j = 0; j < 3; j++) {
                        list.get(i).add(in.nextInt());
                    }
                }
        System.out.println(list);
    }
}
