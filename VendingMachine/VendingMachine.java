/*
Mini Project on Vending Machine.. 
Step 1= Show the product that are available in the machine
Step 2 = Ask user to enter product name & quantity
Step 3= 
*/
import java.util.*;
class Chocolate
{
	Scanner sc=new Scanner(System.in);
	
	String choType[]={"\"DairyMilk\"","\"5-Star\"","\"KitKat\"","\"Perk\""};
	String pick;
	static int itemPrice=10;
	static int stockMaintain=20;
	
	void infoCho()
	{
	 System.out.println("Pick the chocolate of Your choice :");
	     System.out.println();
		 for(int i=0;i<choType.length;i++)
	        {
              System.out.print(choType[i]+ " ");
	        }
	 System.out.println();
	 System.out.println("-----------------------------------------");
	 System.out.println("DairyMilk : Rs.10/-");
	 System.out.println("5-Star    : Rs.10/-");
	 System.out.println("KitKat    : Rs.10/-");
	 System.out.println("Perk      : Rs.10/-");
	 System.out.println("-----------------------------------------");
	 System.out.print("your chocolate : ");
	 
	 pick=sc.next(); 	 
	 System.out.println();	 
	}
   void calculator()
   {
	     int change,quantity;
		 int cash;
		                
   if(pick.equalsIgnoreCase("DairyMilk") || pick.equalsIgnoreCase("5-Star") || pick.equalsIgnoreCase("KitKat") || pick.equalsIgnoreCase("Perk"))
   {		
	   System.out.println("Enter the Quantity of item:");
	   quantity=sc.nextInt(); //4
	if(quantity<0)
	   System.out.println("Enter valid quantity..");
	else
	 {
		  if(quantity>20)//
		 {
			 System.out.println("SORRY...!STOCK IS NOT AVAILABLE");
			 System.out.println("WE WILL REFILL IT WITHIN A DAY..");
		 }
		 else
		 {
			 stockMaintain=stockMaintain-quantity;
	         System.out.println("REMAINING STOCK :"+stockMaintain);
	   
	   int billAmt=itemPrice*quantity;  //10*4=40
	   
	   System.out.println("");
	   
	   System.out.println("Your Total Bill Amount : "+ billAmt); //40
	   
	   System.out.println("");
	   
	   System.out.println("Give the CASH you have");
	       cash=sc.nextInt(); //20
	   

	     if (cash<billAmt) //20<40
	    {  
		   System.out.println("please enter valid Cash="+ billAmt);
	    }
	    else if (cash>billAmt)//50>40 
	    { 
	     change=cash-billAmt;  //50-40=10
	        System.out.println("your remaining change :" +change);
	     }
	   else{
		   //(cash==billAmt)
		   System.out.println("Your cash and billing amount matched...!");
		    System.out.println("You have received "+quantity+" "+pick+"'s");
		                       //you have received 4 Perk's
	    	}
	  }
   }
  }
   else
   {
	   System.out.println("Invalide Choice ...!");
   }

  }   
}
class SoftDrink
{ 
	Scanner sc=new Scanner(System.in);
	
	String softType[]={"\"AppleJuice\"","\"Cocacola\"","\"Fruity\"","\"Spirit\""};
	 int quantity;
	 static int itemPrice=50;
	 static int stockMaintain=30;
	 String select;
	 
	void infosoftDrink()
	{
	 System.out.println("Pick the SoftDrink of Your choice :");
	     for(int i=0;i<softType.length;i++)
	        {
              System.out.print(softType[i]+" ");
	        }
	 System.out.println();
	 
	 System.out.println("-----------------------------------------");
	 System.out.println("AppleJuice  : Rs.50/-");
	 System.out.println("Cocacola    : Rs.50/-");
	 System.out.println("Fruity      : Rs.50/-");
	 System.out.println("Spirit      : Rs.50/-");
	 System.out.println("-----------------------------------------");
	 
	 System.out.print("Your SoftDrink : ");
	   select=sc.next();
	 
	 System.out.println();
	  
	}
	void calculator()
   {
	     int change,quantity;
		 int cash;
	   
   if(select.equalsIgnoreCase("Cokacola") || select.equalsIgnoreCase("Fruity") || select.equalsIgnoreCase("AppleJuice") || select.equalsIgnoreCase("Spirit"))
   {		
	   System.out.println("Enter the Quantity of item:");
	   quantity=sc.nextInt(); //4
	   
	   if(quantity<0)
	   System.out.println("Enter valid quantity..");
	else
	 {
		  if(quantity>30)//
		 {
			 System.out.println("SORRY...!STOCK IS NOT AVAILABLE");
			 System.out.println("WE WILL REFILL IT WITHIN A DAY..");
		 }
		 else
		 {
			 
			 stockMaintain=stockMaintain-quantity;//30-20=10
	         System.out.println("REMAINING STOCK :"+stockMaintain);
	   
	        int billAmt=itemPrice*quantity;  //10*4=40
	   
	        System.out.println("");
	   
	        System.out.println("Your Total Bill Amount : "+ billAmt); //40
	   
	       System.out.println("");
	                                  
	        System.out.println("Give the CASH you have");
	           cash=sc.nextInt(); //20
	   

	         if (cash<billAmt) //20<40
	        {  
		       System.out.println("please enter valid Cash :"+ billAmt);
	        }
	       else if (cash>billAmt)//50>40 
	        { 
	           change=cash-billAmt;  //50-40=10
	           System.out.println("your remaining change :" +change);
	        }
	      else{
		   //(cash==billAmt)
		   System.out.println("Your cash and billing amount matched...!");
		    System.out.println("You have received "+quantity+" "+select+"'s");
		                       
		   }
		}
	 }
   }
   else
   {
	   System.out.println("Invalide Choice ...!");
   }

  }   
}
class Snack
{
	Scanner sc=new Scanner(System.in);
	String snackType[]={"\"Kurkure\"","\"Chips\"","\"Fries\""};
	 static int itemPrice=20;
	 static int stockMaintain=15;
	 int quantity;
	 String doChoice;
	void infosnack()
	{
	 System.out.println("Pick the snack of Your choice :");
	 for(int i=0;i<snackType.length;i++)
	 {
      	  System.out.print(snackType[i]+" ");
	 }
	 System.out.println();
	 
	 System.out.println("-----------------------------------------");
	 System.out.println("Kurkure  : Rs.20/-");
	 System.out.println("Chips    : Rs.20/-");
	 System.out.println("Fries    : Rs.20/-");
	 System.out.println("-----------------------------------------");
	 
	
	  System.out.print("You choose :");
	   doChoice=sc.next();
	  
	  System.out.println();
	}
	void calculator()
   {
	     int change,quantity;
		 int cash;
	
   if(doChoice.equalsIgnoreCase("Kurkure") || doChoice.equalsIgnoreCase("Chips") || doChoice.equalsIgnoreCase("Fries"))
   {		
	   System.out.println("Enter the Quantity of item:");
	   quantity=sc.nextInt(); 
	   
	   if(quantity<0)
	   System.out.println("Enter valid quantity..");
	else
	 {
		 if(quantity>15)//
		 {
			 System.out.println("SORRY...!STOCK NOT AVAILABLE");
			  System.out.println("WE WILL REFILL IT WITHIN A DAY..");
		 }
		 else
		 {
			 stockMaintain=stockMaintain-quantity;
	         System.out.println("REMAINING STOCK :"+stockMaintain);
	          
			  int billAmt=itemPrice*quantity;  
	   
	          System.out.println("");
	   
	          System.out.println("Your Total Bill Amount : "+ billAmt);
				 
	          System.out.println("");
	   
	           System.out.println("Give the CASH you have");
	             cash=sc.nextInt(); 
	   

	     if (cash<billAmt) 
	    {  
		   System.out.println("please enter valid Cash :"+ billAmt);
	    }
	    else if (cash>billAmt)
	    { 
	     change=cash-billAmt;  
	        System.out.println("your remaining change :" +change);
	     }
	   else{
		   //(cash==billAmt)
		   System.out.println("Your cash and billing amount matched...!");
		    System.out.println("You have received "+quantity+" packets of "+doChoice+"'s");
		                       
		   }
		}
	 }
   }
   else
   {
	   System.out.println("Invalide Choice ...!");
   }

  }   
}
class IceCream 
{
	Scanner sc=new Scanner(System.in);
	String iceCremType[]={"\"ButterScotch\"","\"BlackBerry\"","\"Chocolate\"","\"Vanila\""};
	 static int itemPrice=35;
	static int stockMaintain=10;
	 
	 int quantity;
	 String doselect;
	void infoiceCream()
	{
	 System.out.println("Pick the snack of Your choice :");
	 for(int i=0;i<iceCremType.length;i++)
	 {
      	  System.out.print(iceCremType[i]+" ");
	 }
	 System.out.println();
	 
	 System.out.println("-----------------------------------------");
	 System.out.println("ButterScotch  : Rs.35/-"); //10
	 System.out.println("BlackBerry    : Rs.35/-");
	 System.out.println("Chocolate     : Rs.35/-");
	 System.out.println("Vanila        : Rs.35/-");
	 
	 System.out.println("-----------------------------------------");
	 
	
	  System.out.print("You choose :");
	   doselect=sc.next();
	  
	  
	  System.out.println();
	}
	
	void calculator()
   {
	     int change,quantity;
		 int cash;
	
   if(doselect.equalsIgnoreCase("ButterScotch") || doselect.equalsIgnoreCase("BlackBerry") || doselect.equalsIgnoreCase("Chocolate")||doselect.equalsIgnoreCase("Vanila"))
   {		
	   System.out.println("Enter the Quantity of item:");
	   quantity=sc.nextInt(); 
	   
	   if(quantity<0)
	   System.out.println("Enter valid quantity..");
	else
	 {
		 if(quantity>10)//
		 {
			 System.out.println("SORRY...!STOCK IS NOT AVAILABLE");
			 System.out.println("WE WILL REFILL IT WITHIN A DAY..");
		 }
		 else
		 {
			 stockMaintain=stockMaintain-quantity;
	         System.out.println("REMAINING STOCK :"+stockMaintain);
			 
			 int billAmt=itemPrice*quantity;  
	   
	        System.out.println("");
	   
	         System.out.println("Your Total Bill Amount : "+ billAmt); 
	   
	         System.out.println("");
	   
	          System.out.println("Give the CASH you have");
	           cash=sc.nextInt(); 
	   

	          if (cash<billAmt) 
	          {  
		       System.out.println("please enter valid Cash :"+ billAmt);
	           }
	           else if (cash>billAmt)
	          { 
	              change=cash-billAmt;  
	            System.out.println("your remaining change :" +change);
	           }
	         else{
		            //(cash==billAmt)
		         System.out.println("Your cash and billing amount matched...!");
		         System.out.println("You have received "+quantity+" packets of "+doselect+"'s");
		         }
	        }
	 }
   }
   else
   {
	   System.out.println("Invalide Choice ...!");
   }
  } 
}
class VendingMachine3
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 Chocolate c=new Chocolate();
	 SoftDrink s=new SoftDrink();
	 Snack sna =new  Snack();
	 IceCream ic=new IceCream();
	 
	 int choice;
	 
    System.out.println("***********************************************");
	System.out.println("     Welcome to Vending Machine Services       ");
	System.out.println("************************************************");
	System.out.println();
	
	System.out.println("Select the Product you want to buy : 1)Chocolate 2)SoftDrink 3)Snack 4)Ice-Cream");
	 choice=sc.nextInt();
	
	  switch(choice)
	   {
		case 1: c.infoCho();
				c.calculator();
		          break;
				  
		case 2: s.infosoftDrink();
		        s.calculator();
		         break;
				 
		case 3: sna.infosnack();
		        sna.calculator();
		        break;
				
		case 4: ic.infoiceCream();
		        ic.calculator();
		        break;
	   
	    }
		
   System.out.println("***********************************************");	
   System.out.println("        Thank you using our Services            ");
   System.out.println("***********************************************");
 
 }
}