package Solutions.Module_5;

class M51{
    public static void main(String[] args){
       float arr[]={23, 6, 47, 35, 2, 14};
       float sum=0;
       for(float i: arr){
          sum+=i;
       }
       System.out.println("The average of these number are : "+sum/6);
    }
  }
  