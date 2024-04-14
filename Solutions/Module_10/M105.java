package Module_10;
class Bank{

    float getRateofInterest(){
        return 0;
    }
    

}

class SBI extends Bank{
    float getRateofInterest(){
        return 8.0f;
    }
}

class ICICI extends Bank{
    float getRateofInterest(){
        return 7.0f;
    }
}

class AXIS extends Bank {
    float getRateofInterest(){
        return 9.0f;
    }
}


/**
 * M105
 */
public class M105 {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        
        // Print rate of interest for each bank
        System.out.println("Rate of Interest in SBI: " + sbi.getRateofInterest() + " %");
        System.out.println("Rate of Interest in ICICI: " + icici.getRateofInterest() + " %");
        System.out.println("Rate of Interest in AXIS: " + axis.getRateofInterest() + " %");
    }
    
}