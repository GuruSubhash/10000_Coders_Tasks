
public class LoanApproval {
    public String checkLoanApproval(double salary, int creditScore){
        if(salary>80000 && creditScore >750) return "Loan Approved Immediately";
        else if(salary>50000 && creditScore>650) return "Loan approved with higher interest rate";
        else if(salary>30000 && creditScore>500) return "Co-signer required";
        else return "Loan rejected";
    }

    public static void main(String[] args) {
        LoanApproval l = new LoanApproval();
        System.out.println("is loan approval with salary 80001 and credit score with 651 :   " + l.checkLoanApproval(80001, 651) );
    }
}
