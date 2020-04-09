package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String args[]) {
    List<ShoppingItem> items=new ArrayList<ShoppingItem>();
    items.add(new Chair("dressing chair",2000));
    items.add(new Table("Dressing Table",4000));
    double sum=0;
    ShoppingCartVisitor visitor=new ShoppingCart();
    for(ShoppingItem i:items)
       {
    	  sum+=i.accept(visitor);
       }
    
    System.out.println(sum);
	}
}
