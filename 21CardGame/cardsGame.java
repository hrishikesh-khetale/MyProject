package card_game;
import java.util.Scanner;

public class cardsGame {
    static int newArr[] = new int[21];
	static int arr1[][] =new int [7][3];
	static int arr[][];
	 static void matrix()
	  {
	     int a = 1;
	      Scanner in=new Scanner(System.in);
	      arr = new int[7][3];//adj mat
	      
	      for(int i =0;i<7;i++)
	      {
	          for(int j=0;j<3;j++)
	          {
	              arr[i][j]=a;
	              a++;    
	          }
	      }
	  }
	 public static void print(int a[][])
	 { 
		 for(int i =0;i<7;i++)
	      {
	          for(int j=0;j<3;j++)
	          {    
	             System.out.print( "   "+a[i][j]+"   ");     
	          }
	          System.out.println();
	      }
	 }
	 public static void shuffle(int group)
	 {
		 
		 if(group==0)
		 {
			 for(int i=0;i<7;i++)
			 { arr1[i][1]= arr[i][0];}
			 for(int i=0;i<7;i++)
			 { arr1[i][0]= arr[i][2];}
			 for(int i=0;i<7;i++)
			 { arr1[i][2]= arr[i][1];}
			 
			  for(int i =0;i<7;i++)
		      {
		          for(int j=0;j<3;j++)
		          {arr[i][j]=arr1[i][j]; }
		      }
			 
		 }
		 
		 if(group==1)
		 {
			 for(int i=0;i<7;i++)
			 { arr1[i][1]= arr[i][1];}
			 for(int i=0;i<7;i++)
			 { arr1[i][2]= arr[i][2];}
			 for(int i=0;i<7;i++)
			 { arr1[i][0]= arr[i][0];}
			 for(int i =0;i<7;i++)
		      {
		          for(int j=0;j<3;j++)
		          {arr[i][j]=arr1[i][j]; }
		      }
			 
		 }
		 
		 if(group==2)
		 {
			 for(int i=0;i<7;i++)
			 { arr1[i][1]= arr[i][2];}
			 for(int i=0;i<7;i++)
			 { arr1[i][0]= arr[i][1];}
			 for(int i=0;i<7;i++)
			 { arr1[i][2]= arr[i][0];}
			 for(int i =0;i<7;i++)
		      {
		          for(int j=0;j<3;j++)
		          {arr[i][j]=arr1[i][j]; }
		      }
		 }
	 }
	 public static void changeMainArr()
	 {
//		  for(int i =0;i<3;i++)
//	      {
//	          for(int j=0;j<7;j++)
//	          {   
//	              arr1[j][i]=arr[j][i];       
//	          }
//	      }
		  int a =0;
		  for(int i =0;i<3;i++)
	      {
	          for(int j=0;j<7;j++)
	          {    
	             newArr[a++] = arr1[j][i];    
	          }
	          
	      }
	 }
	 
	 public static void changeMatrix2()
	 {
		 int a =0;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]= newArr[a++];
			}
		}
	 }
	 
	 public static void magic()
	 {
		 int count =0;
		 for(int i=0;i<7;i++)
			{
				for(int j=0;j<3;j++)
				{
					count++;
					if(count==11)
					{
						System.out.println("---------------  Your selected number is : "+arr[i][j]+"  ---------------");
					    break;
					}
				}
			}
	 }
	 public static void main(String[] args) {
		
		 int a,b,c;
		 Scanner sc = new Scanner(System.in);
		 matrix();
		 print(arr);
		 System.out.println("Enter group number : ");
		 a = sc.nextInt();
		 shuffle(a-1);
		 changeMainArr();
		 changeMatrix2();
		 print(arr);
		 
		 System.out.println("Enter group number : ");
		 b = sc.nextInt();
		 shuffle(b-1);
		 changeMainArr();
		 changeMatrix2();
		 print(arr);
		 
		 System.out.println("Enter group number : ");
		 b = sc.nextInt();
		 shuffle(b-1);
		 changeMainArr();
		 changeMatrix2();
		 print(arr);
		 
		 
		 magic();
	}
}
