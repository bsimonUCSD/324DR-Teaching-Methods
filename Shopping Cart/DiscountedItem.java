// DiscountedItem inherit from Item
public class DiscountedItem extends Item
{
    // add an instance variable for the discount
    double discount;
		
    // Add constructors that call the super constructor
     public DiscountedItem()
     { 
       super();
     }

    public DiscountedItem(String name, double price, double disc)
    {  
      super(name, price);
      discount = disc;
    }


    // Add get/set methods for discount
    public double getDiscount()
    {
      return discount; // return discount here instead of 0
    }

    public void setDiscrount(double d)
    {
      discount = d;
    }

    // Add a toString() method that returns a call to the super toString
    // and then the discount in parentheses using the super.valueToString() method
      public String toString()
      { 
        return super.toString() + " (" + super.valueToString(discount) + ")";
      }

    

}