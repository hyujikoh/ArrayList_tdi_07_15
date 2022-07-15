public class App {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
    }

}
class ArrayList {
    int lastindex = -1;
    int[] datum = new int[2];
    int size(){
        return 0;
    }
    void add(int element){
        lastindex++;
        datum[lastindex] = element;
    }
}
