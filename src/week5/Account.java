package week5;

public class Account {

    long accountNo;
    String name;
    String address;
    String  phoneNo;
    String dOB;
    long balance;

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String  phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // default constructor
    Account(){}

    // Parameterized Constructor for the week5.Account Class
    Account(long accountNo, String name,String address, String phoneNo, String dOB, long balance){

        this.accountNo =accountNo;
        this.name =name;
        this.address =address;
        this.phoneNo =phoneNo;
        this.dOB =dOB;
        this.balance =balance;

    }

    public void closeAccount(){
        System.out.println("week5.Account has been closed...");
    }
}

 class SavingsAccount extends Account{

    SavingsAccount(){

        super(543210,"Vivek","9/22-ABCD - New Delhi","9519747029","01/06/2000",50000);
    }

    public void withDraw(){
        System.out.println("Money withdrawl...");
    }

     public void deposit(){
         System.out.println("Money deposited...");
     }

     public void fixedDeposit(){
         System.out.println("Money deposited in Fixed Deposit week5.Account...");
     }

}

class LoanAccount extends Account{

    LoanAccount(){
        super(543220,"Ram","9/23-ABCD - New Delhi","9519747029","01/06/1999",500000);
    }

    public void payEMI(){
        System.out.println("Proceed for paying the EMI...");
    }

    public void topUpLoan(){
        System.out.println("TopUp for the loan amount...");
    }

    public void rePayment(){
        System.out.println("Proceed for the repayment...");
    }

}

class Test{

    public static void main(String args[]){

        //week5.Account sa1 = new week5.Account(543210,"Vivek","9/22-ABCD - New Delhi","9519747029","01/06/2000",50000);
        SavingsAccount sa1 = new SavingsAccount();
        System.out.println(sa1.name);
        System.out.println(sa1.address);
        System.out.println(sa1.accountNo);
        System.out.println(sa1.phoneNo);
        System.out.println(sa1.dOB);
        System.out.println(sa1.balance);
        sa1.deposit();
        sa1.fixedDeposit();
        sa1.withDraw();

        LoanAccount la1= new LoanAccount();
        System.out.println(la1.name);
        System.out.println(la1.address);
        System.out.println(la1.accountNo);
        System.out.println(la1.phoneNo);
        System.out.println(la1.dOB);
        System.out.println(la1.balance);

        la1.payEMI();
        la1.rePayment();
        la1.topUpLoan();



    }
}

