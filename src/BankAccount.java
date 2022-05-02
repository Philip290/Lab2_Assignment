public class BankAccount {
    private String acc_no;
    private  String name;
    private double amount;


    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Incorrect Amount!");
        }
        else {
            this.amount += amount;
        }
    }
    public  void withdraw(double amount){
        if(amount <= this.amount){
            this.amount -= amount;
            System.out.println("WITHDRAW SUCCESSFUL");
        }
        else {
            System.out.println("INSUFFICIENT FUNDS");
        }
    }


    public void displayBalance(){
        System.out.println(this.getName() + "Balance: " + this.getAmount() + "\n");
    }

    public void setAcc_no(String acc_no){
        this.acc_no = acc_no;
    }

    public  void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  this.name;
    }

    public  void  setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }


    public static void main (String[] args){
        BankAccount acc1 = new BankAccount();
        acc1.setAcc_no("1234567890");
        acc1.setName("Acc1");
        acc1.setAmount(0);
        acc1.deposit(10000);
        acc1.withdraw(1000);
        acc1.displayBalance();


        BankAccount acc2 = new BankAccount();
        acc2.setAcc_no("0987654321");
        acc2.setName("Acc2");
        acc2.setAmount(0);
        acc2.deposit(5000);
        acc2.withdraw(2000);
        acc2.displayBalance();

    }

}
