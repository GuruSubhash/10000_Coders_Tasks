public class Frequency {
    public static void main(String[] args) {
        int arr[]={1,5,5,2,21,1,1,1,12,5,5,24,27,3,3,1};
        boolean b[]=new boolean[arr.length];
        for(int i=0; i<arr.length-1;++i){
            if(b[i]==true) continue;
            int count=1;
            for(int j=i+1; j<arr.length;++j){
                if(arr[i]==arr[j]){
                    count++;
                    b[j]=true;
                }
            }
            System.out.println( "Frequency of "+ arr[i] + " is : " + count);
        }
    }
}
