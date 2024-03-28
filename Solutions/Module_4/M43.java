package Solutions.Module_4;
public class M43{
  public static void main(String[] args){
     int length=11;
     for(int i=1; i<=110;i++){
        if(i%3==0){
           System.out.print(" Coza ");
        }
        else if (i%5==0){
           System.out.print(" Loza ");
        }
        else if(i%7==0){
           System.out.print(" Woza ");
        }
        else if(i%3==0 && i%5==0){
           System.out.print(" CozaLoza ");
        }
        else{
           System.out.print(i+" ");
        }

        //Printing a new line 
        if(i%length==0){
           System.out.println();
        }
     }


  }
}
