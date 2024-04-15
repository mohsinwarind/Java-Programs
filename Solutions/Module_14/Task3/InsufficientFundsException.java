package Module_14.Task3;

import java.io.*;

/**
 * InsufficientFundsException
 */
public class InsufficientFundsException {

    private double amount;
    public InsufficientFundsException(double amount){
        this.amount  = amount;
    }

    public double getamount(){
        return amount;
    }

   
    
}