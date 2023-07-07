package TikTak;
import java.util.*;

public class DemoTikTak {

	public static void main(String[] args) 
	{ 
		Board b = new Board();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of 1st player");
		String name1=sc.next();
		System.out.println("Enter the Name of 2nd player");
		String name2=sc.next();
		
		
		
		
		while(true)
		{
			System.out.println(name1+" turn ");
			System.out.println("Enter the Position where you want to enter the element");
			int choice=sc.nextInt();
			b.Enter(choice,true);
			if(b.Winner())
			{
				System.out.println(name1+" won");
				break;
			}
			System.out.println(name2+" turn ");
			System.out.println("Enter the Position where you want to enter the element");
			 choice=sc.nextInt();
			b.Enter(choice,false);
			if(b.Winner())
			{
				System.out.println(name2+" won");
				break;
			}
			
			
		}
		
		}

}
