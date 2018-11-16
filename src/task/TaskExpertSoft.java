package task;

import java.util.ArrayList;

public class TaskExpertSoft {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(8);
        System.out.println(a);
        System.out.println(b);

        merge(a, b);

        System.out.println(a);
        System.out.println(b);
    }

    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int indexA = 0;
        int indexB = 0;
        while (indexB < b.size()) {
            if (indexA < a.size()) {
                if (a.get(indexA) > b.get(indexB)) {
                    a.add(indexA, b.get(indexB++));
                }
            }else{
                a.add(indexA, b.get(indexB++));
            }
            indexA++;
        }
    }
}
