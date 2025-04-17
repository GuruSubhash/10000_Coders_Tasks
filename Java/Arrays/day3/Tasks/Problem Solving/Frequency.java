
public class Frequency {
    public static void main(String[] args) {
        int [] arr= {1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,6,6,};
        for(int i=0; i<arr.length;){
            System.out.print("frequency of : " +(arr[i]));
            int count =1;
            for(int j=i+1; j<arr.length;++j){
                if(arr[i]==arr[j])count++;
                else break;
            }
            System.out.println(" is "+count);
            i+=count;
        }
    }
}
