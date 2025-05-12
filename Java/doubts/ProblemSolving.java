public class ProblemSolving {
    public static void main(String[] args) {
        int num=9;
        String s="";
        StringBuilder str=new StringBuilder();
        for(int i=1;i<=num;i++){ 
            s+=i; 
            System.out.println(s);
        }

        System.out.println("----------------------------------------------------------");
        for(int i=1; i<num;i++){
            System.out.println((int)(11)/9);
        }
        System.out.println("---------------------------------------------------------------------");
        int n=1;
        for(int i=0; i<10;){
            int j_num=0;
            for(int j=1; j<=i; ++j){
                System.out.print(i+j);
                j_num=j+i;
            }
            i=i+j_num;
            System.out.println();
        }   
        
    }
}
