public class App {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
    }

}
class ArrayList {
    int lastindex = -1;
    int[] datum = new int[3];


    int size(){
        int length = lastindex+1;
        return length;
    }
    void add(int element){
        lastindex++;
        datum[lastindex] = element;
    }
    int get(int index){
        return datum[index];
    }

    public void removeAt(int i) {
    }
}
