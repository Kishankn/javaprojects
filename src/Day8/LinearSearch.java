package Day8;

public class LinearSearch {
    public static void main(String[] args){
        int[]arr={10, 7, 25, 40, 15};
        int target=40;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("found at index"+i);
                return;
            }
        }
        System.out.println("NotFound");
    }
}
