

class DemoOverloading{
    void test(){}
    void test(int a){} 
    // void test(int a , int b){} Mistake in Module (Not Possible)
    int test(int a , int b){ return a+b;}
    double test(double a){
        return a;
    }
    void test(int a ,  float b){}
    void test(float a , int b){}
    
}

class M63 {
    public static void main(String [] args){
        DemoOverloading demo = new DemoOverloading();
        demo.test();
        demo.test(2);
        demo.test(2, 2);
        demo.test(2 , 2);
        demo.test(23.33f);
        demo.test(1, 2.4f);
        demo.test(2.3f , 43);
    }
}