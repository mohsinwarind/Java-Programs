package Solutions.Module_5;

import java.util.Scanner;

//Task 5
public class M54{
 public static void main(String[] args){
   Scanner scan= new Scanner(System.in);
   System.out.println("Enter the Number of Rows : ");
   int rows= scan.nextInt();
   System.out.println("Enter the Number of Coloums : ");
   int coloums=scan.nextInt();


   int[][] matrix = new int[rows][coloums];
   for(int i=0 ; i<rows; i++){
     for(int j=0 ;j<coloums;j++){
       System.out.print("Enter the value of ["+i+"]["+j+"] index : ");
       matrix[i][j]=scan.nextInt();
     }
   }
   //Showing the matrix we entered
   System.out.println("---- The Matrix you Entered -----");
   for(int i=0 ;i<rows;i++){
     for(int j=0; j<coloums; j++){
       System.out.print(matrix[i][j]+"  ");
     }
     System.out.println();
   }


   System.out.println("--- Transpose of a Matrix ---");
   for(int j=0;j<coloums;j++){
     for(int i=0;i<rows;i++){
       System.out.print(matrix[i][j]+"  ");
     }
     System.out.println();
   }
   scan.close();
 }
}
