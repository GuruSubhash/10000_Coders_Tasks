import java.util.Scanner;
import java.util.Arrays;
public class RemoveEle {
    public static void main(String[] args) {
        int arr []=new int[]{12,34,54,1,-2,21,34,1};
        // Scanner sc = new Scanner(System.in);
        
        // while(sc.hasNext()){
        //     Arrays.stream(arr).filter((i)->i!=sc.nextInt()).toArray().toString();
        // }

        // int noOfEleToDel=sc.nextInt;
        // Arrays.stream(arr).filter((i)->(i!=1 || i!=54)).toArray().toString();
        System.out.println(Arrays.toString(arr));
        int count =0;
        for(int ele: arr) if(ele==1 || ele==54) count++;
        int new_arr []=new int[arr.length-count];
        int j=0;
        for(int i=0; i<arr.length&& j<new_arr.length;++i){
            if(arr[i] !=1 && arr[i] !=54) new_arr[j++]=arr[i];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
