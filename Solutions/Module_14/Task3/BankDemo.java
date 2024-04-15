package Module_14.Task3;

/**
 * BankDemo
 */
public class BankDemo {

    public static void main(String[] args) {
        CheckingAccount c  = new CheckingAccount();
        System.out.println("Depositing $500..");
        c.deposit(500.00);
        try {
            System.out.println("\n Withdrawing $100..");
            c.withdraw(100.00);
            System.out.println("\n Withdrawing $600..");
            c.withdraw(600.00);

        } catch (InsufficientFundsException e) {

          System.out.println("Sorry but you are short $"+e.getamount());
          e.printStackTrace();
        }
    }
}