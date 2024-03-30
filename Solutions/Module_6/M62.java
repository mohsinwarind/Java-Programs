package Solutions.Module_6;

class ShoppingBag {
    int total_num_of_items;
    float total_retail_cost;
    float tax_rate;

    ShoppingBag(float tax_rate) {
        this.tax_rate = tax_rate;
        total_num_of_items = 0; 
        total_retail_cost = 0;
    }

    void place(int num_of_items, float cost_of_each_item) {
        total_num_of_items += num_of_items; 
        total_retail_cost += num_of_items * cost_of_each_item; 
    }

    int getNumOfItems() {
        return total_num_of_items;
    }

    float getTotalRetailCost() {
        return total_retail_cost;
    }

    float totalCost() {
        float tax_amount = (tax_rate * total_retail_cost) / 100;
        return total_retail_cost + tax_amount;
    }

    @Override
    public String toString() {
        return String.format("Shopping Bag Summary:\nNumber of Items: %d\nTotal Retail Cost: $%.2f\nTotal Cost (with tax): $%.2f",
                total_num_of_items, total_retail_cost, totalCost());
    }
}

public class Main {
    public static void main(String[] args) {
        
        ShoppingBag myBag = new ShoppingBag(8.5f); 

        // Add items to the bag
        myBag.place(5, 10.5f);
        myBag.place(3, 15.25f);

        // Display bag summary
        System.out.println(myBag);
    }
}
