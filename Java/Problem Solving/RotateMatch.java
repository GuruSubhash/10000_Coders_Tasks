public class RotateMatch {
    public static boolean isMatch(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length) return false;
        int ref=arr1[0];
        for(int i=0;i<arr2.length;++i){
            int count=0;
            int t=i;
            if(ref==arr2[i]){
                for(int j=0;j<arr1.length;++j){
                    if(arr2[t]==arr1[j]){
                        count++;
                        if(count==arr1.length) return true;
                        if(t==arr2.length-1) t=0;
                        else t++;
                    }
                    else break;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        System.out.println(isMatch(arr1, arr2));
    }
}
