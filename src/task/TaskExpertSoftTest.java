package task;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TaskExpertSoftTest {

    @Test
    public void merge() throws Exception {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(6);
        b.add(8);

        TaskExpertSoft taskExpertSoft = new TaskExpertSoft();
        taskExpertSoft.merge(a, b);

        assertEquals("[1, 2, 3, 5, 6, 8]", a.toString());
        assertEquals("[2, 6, 8]", b.toString());
    }
}