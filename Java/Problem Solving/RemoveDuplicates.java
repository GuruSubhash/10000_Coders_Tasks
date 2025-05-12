import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr= {1,5,5,2,21,1,1,1,12,5,5,24,27,3,3,1};
        boolean[] b=new boolean[arr.length];
        for(int i=0; i<arr.length-1;++i){
            if(b[i]==true) continue;
            for(int j=i+1; j<arr.length;++j){
                if(arr[i]==arr[j])b[j]=true;
            }
        }
        int count=0;
        for(int k=0; k<b.length;++k) if(b[k]==false) count++;
        int new_arr[]=new int[count];
        int i=0;
        for(int k=0; k<b.length; ++k) if(b[k]==false) new_arr[i++]=arr[k];
        System.out.println(Arrays.toString(new_arr));
    }
}
