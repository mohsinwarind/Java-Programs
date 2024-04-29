package Module_13;

interface Payable{

    double getPaymentMethod();
    

}

class Invoice implements Payable{
    private int itemNumber;
    private String itemDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice(int itemNumber , String itemDescription , int quantity , double pricePerItem ){
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.quantity = quantity ;
        this.pricePerItem = pricePerItem;
    }
    int getItemNumber(){
        return itemNumber;
    }
    void setItemNumber(int itemNumber){
        this.itemNumber = itemNumber;
    }
    String getItemDescription(){
        return itemDescription;
    }

    void setItemDescription(String itemDescription){
        this.itemDescription = itemDescription;
    }

    int getquantity(){
        return quantity;
    }

    void setquantity(int quantity){
        this.quantity = quantity;
    }

    double getPricePerItem(){
        return pricePerItem;

    }
    void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentMethod(){
        System.out.println();
        return 0;
    }
    
}
abstract class Employee implements Payable{

}