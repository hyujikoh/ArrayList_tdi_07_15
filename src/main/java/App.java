public class App {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
    }

}
class ArrayList {
    int lastindex = -1;
    int[] datum = new int[2];


    int size(){
        int length = lastindex+1;
        return length;
    }
    void add(int element){
        lastindex++;
        if (lastindex==datum.length){
            datum = increaseSize(datum);
        }

        datum[lastindex] = element;

    }

    private int[] increaseSize(int[] datum) {
        int[] newArr = new int[datum.length*2];
        for(int i = 0; i < datum.length; i++){
            newArr[i] = datum[i];
        }
        return newArr;
     }

    int get(int index){
        return datum[index];
    }

    public void removeAt(int index) {
        int[] proxyArray = new int[datum.length - 1];
        for(int i=0,k=0;i<datum.length;i++){
            if(i==index){
                continue;
            }
            proxyArray[k] = datum[i];
            k++;
        }
        datum = proxyArray;
        lastindex--;
    }

    public int getArrayLength() {
        return datum.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i =0 ; i<=lastindex;i++){
            System.out.println(i+" : "+datum[i]);
        }
    }
}
