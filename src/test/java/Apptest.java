import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Apptest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();

    }
    @Test
    void size() {
        ArrayList al = new ArrayList();
        assertEquals(1, al.size());
    }
    @Test
    void add() {
        ArrayList al = new ArrayList();
        al.add(100);
    }
    @Test
    void get() {
        ArrayList al = new ArrayList();
        al.add(100);
        int rs = al.get(0);

        assertEquals(100, rs);
        assertEquals(1, al.size());
    }

}
