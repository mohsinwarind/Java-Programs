package Solutions.Module_6;
// Solution for Module 6 Task 2

class ShoppingBag{
    int total_num_of_items , total_retail_cost;
    float tax_rate ;
    ShoppingBag(float tax_rate){
        this.tax_rate = tax_rate;
    }
    void place(int total_num_of_items , float cost_of_each_item){
        float total = total_num_of_items*cost_of_each_item;
    }

    float total_cost(){
        
    }
}