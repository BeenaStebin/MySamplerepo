package multipleinter;

public class Icecream implements Jam,Juice {
	
   public void flavour()
   {
	   System.out.println("Vanilla & Strawberry");
   }
   public void colour()
   {
	   System.out.println("Pink");
   }
   public static void main(String args[])
   {
   Icecream obj=new Icecream();
   obj.flavour();
   obj.colour();
   }

}
