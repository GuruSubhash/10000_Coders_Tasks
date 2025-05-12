import java.util.Arrays;

public class BubbleSort {
    public static int [] ascendingBubble(int []arr){
        boolean swap=false;
        for(int i=0; i<arr.length; ++i){
             swap=false;
            for(int j=0; j<(arr.length-i-1);++j){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
               
            } if(!swap) break;
        }
        return arr;
    }
    public static int [] descendingBubble(int []arr){
        boolean swap=false;
        for(int i=0; i<arr.length; ++i){
             swap=false;
            for(int j=0; j<(arr.length-i-1);++j){
                if(arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
               
            } if(!swap) break;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,12,2,24,3,6,10};
        System.out.println(Arrays.toString(ascendingBubble(arr)));
        System.out.println(Arrays.toString(descendingBubble(arr)));
    }
}
