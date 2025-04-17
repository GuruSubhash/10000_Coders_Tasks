
public class SecondLargestELe {
    public static void main(String[] args) {
        int []arr = {12,35,1,10,34,1};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;++i) if(max<arr[i]) max=arr[i];
        for(int i=0; i<arr.length;++i) if(secondMax<arr[i]&& arr[i]!=max) secondMax=arr[i];
        System.out.println("Second Largest : "+((secondMax!=Integer.MIN_VALUE)?secondMax:"Not available"));
    }
}
