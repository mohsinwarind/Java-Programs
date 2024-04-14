package Module_14;

/**
 * M141
 */
public class M141 {

    public static void main(String[] args){
        int a[] = new int[2];
        try{
            System.out.println("Access Element three : "+ a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown : "+e);
        }finally {
            a[0]  = 6;
            System.out.println("First Element Value : "+a[0]);
            System.out.println("The Finally statment is executed.");
        }
    }
}