package Solutions.Module_5;

//Task 4


import java.util.Scanner;


public class M53{
 public static void main(String[] args){
   Scanner scan= new Scanner(System.in);
     int[] arr= new int[5];
     int index=0;
     for(int i=0; i<5 ;i++){
       int input=0;
      
       do{
         System.out.println("Enter the Number for "+i+" index");
         input= scan.nextInt();
         boolean isDuplicate= false;
         for(int j=0; j<=index ; j++){
           if(arr[j]==input){
             isDuplicate=true;
             break;
           }
         }
         if(input>=10 && input<=100 && !isDuplicate){
           arr[index]=input;
           index++;
           break;
         }
         else{
           System.out.println("Invalid Input ! Please enter the number between 10 to 100.");
         }
       }while(true);
     }
  
    scan.close();
   System.out.println("--- The Unique Number you Entered are -----");
   for(int i=0 ; i<index; i++ ){
     System.out.print(arr[i]+" ");
   }
   System.out.println();
 }
}
