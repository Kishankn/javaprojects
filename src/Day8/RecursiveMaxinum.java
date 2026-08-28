package Day8;

public class RecursiveMaxinum {
    static int findMax(int[]arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int max=findMax(arr,index+1);
        if(arr[index]>max){
            return arr[index];
        }
        return max;
    }
    public static void main(String[] args){
        int[]arr={510, 20, 30, 7, 40};
        System.out.println("maxinum =" + findMax(arr,0));

    }
}
