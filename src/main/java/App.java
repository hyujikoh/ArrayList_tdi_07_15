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
    void add(int element,int index){
        lastindex++;
        if (lastindex==datum.length){
            datum = increaseSize(datum);
        }

        if(datum[index]== 0){
            datum[index] = element;
        }
        if(datum[index]!= 0){
            int[] proxyArray = new int[datum.length + 1];
            for(int i =0,k=0; i<proxyArray.length;i++ ){
                if(i==index){
                    proxyArray[i] =element;
                }
                if(i!=index){
                    proxyArray[i]= datum[k];
                    k++;
                }
            }
            datum = proxyArray;
        }


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
