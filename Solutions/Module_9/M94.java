import java.util.Scanner;
class Publication{
    private String title;
    private double price;
    String gettitle(){
        return title;
    }

    void settitle(String title){
        this.title = title;
    }
    
    double getprice(){
        return price;
    }

    void setprice(double price){
        this.price = price;
    }
}
class Books extends Publication{
    private int pages;

    int getpages(){
        return pages;
    }

    void setpages(int pages){
        this.pages = pages;
    }

    void putbooks(){
        System.out.println("Publication Company is : "+gettitle());
        System.out.println("Price is : "+getprice());
        System.out.println("Pages are : "+getpages());
    }
    
}
class Tape extends Publication{
    private double time;

    double getime(){
        return time;
    }

    void settime(double time){
        this.time = time;
    }

    void puttape(){
        System.out.println("Publication Company is : "+gettitle());
        System.out.println("Price is : "+getprice());
        System.out.println("Time is : "+getime());
    }
}


/**
 * M94
 */
public class M94 {
    public static void main(String[] args){
   
    Books book1 = new Books();
    Tape tape1 = new Tape();


    Scanner scan = new Scanner(System.in);


    //Getting and showing the details of books 
    System.out.println("--Book Details--");
    System.out.print("Enter the title of book : ");
    book1.settitle(scan.nextLine());
    
    System.out.print("Enter the Price : ");
    book1.setprice(scan.nextDouble());
    System.out.print("Enter the pages : ");
    book1.setpages(scan.nextInt());


    book1.putbooks();


    System.out.println();
    System.out.println("--Tape Details--");
    System.out.print("Enter the title  : ");
    String title  = scan.nextLine();
    scan.nextLine();
    tape1.settitle(title);
    
    System.out.print("Enter the Price : ");
    tape1.setprice(scan.nextDouble());
    scan.nextLine(); 
    System.out.print("Enter the time : ");
    tape1.settime(scan.nextDouble());
    
    tape1.puttape();
    

    scan.close();
    }
    
}