package Solutions.Module_5;

public class M52{
    public static void main(String[] args){
      int[] array= {23, 6, 47, 35, 2, 14};
      int max=array[0];
      int min=array[0];
      for(int i : array ){
          if(i>max){
            max=i;
          }
          if(i<min){
            min=i;
          }
      }
     System.out.println("Your Maximum Number in array is : "+max);
     System.out.println("Your Minimum Number in array is : "+min);
    }
   }
   