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
 * M106
 */
public class M106 {

    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("Rate of Interest in SBI: " + sbi.getRateofInterest() + " %");
        System.out.println("Rate of Interest in ICICI: " + icici.getRateofInterest() + " %");
        System.out.println("Rate of Interest in AXIS: " + axis.getRateofInterest() + " %");
    }
}