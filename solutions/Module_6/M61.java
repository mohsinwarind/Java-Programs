class swapDemo{
   // This is Module 6 First Task
    int x ,y;
    swapDemo(){
      this.x = 10;
      this.y = 100;
    }
    void swap(int x , int y){
        int temp = this.x; 
        this.x = this.y ;
        this.y = temp;
    }

}
class Light{
    public static void main(String[] args){
    swapDemo swap1 = new swapDemo();
    System.out.println("--Before Swapping--");
    System.out.println("Value of X is : "+swap1.x);
    System.out.println("Value of Y is : "+swap1.y);

    System.out.println("--After Swapping--");
    swap1.swap(swap1.x, swap1.y);
    System.out.println("Value of X is : "+swap1.x);
    System.out.println("Value of Y is : "+swap1.y);
    }
}