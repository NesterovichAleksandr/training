package task;

import java.util.ArrayList;

class TaskExpertSoft {

    void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int indexA = 0;
        int indexB = 0;
        while (indexB < b.size()) {
            if (indexA < a.size()) {
                if (a.get(indexA) > b.get(indexB)) {
                    a.add(indexA, b.get(indexB++));
                }
            } else {
                a.add(indexA, b.get(indexB++));
            }
            indexA++;
        }
    }
}
