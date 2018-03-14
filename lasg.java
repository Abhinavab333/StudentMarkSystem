import java.util.*;
class lasg
{
	public static void main(String args[])
	{
        int a[]=new int[5];
		int sum1[]=new int[5];
		int i,sum=0,j,k,flag=0,s,c=0;
		int b[][]=new int[6][6];
	    System.out.println("Enter the marks of Student");
		for(i=0;i<5;i++)
		{
            System.out.print("Marks of "+(i+1)+" Subject:");
		    Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
			if(i<3)
			{
				if(a[i]>100)
				{
					System.out.println("Incorrect Input");
					flag=1;
				break;
				}
				}
			if(i>=3)
			{
				if(a[i]>50)
				{
					System.out.println("Incorrect Input");
					flag=1;
				break;
				}
				}
			sum=sum+a[i];
		}
		
		for(i=0;i<3;i++)
		{  
			if(flag==1)
			{
				break;
			}

			if(a[i]<33)
			{
				System.out.println("FAIL in "+(i+1)+" Subject");
			}
			else
			{
				System.out.println("PASS in "+(i+1)+" Subject");
			}
			}
		for(i=3;i<5;i++)
		{
			if(flag==1)
			{
				break;
			}
			if(a[i]<17)
			{
				System.out.println("FAIL in "+(i+1)+" Subject");
			}
			else
			{
				System.out.println("PASS in "+(i+1)+" Subject");
			}
			}
			
		System.out.println("\n");
		//Overall Pass or Fail
		if(sum<133)
		{
			System.out.println("Student Fail");
		}
		else
		{
			System.out.println("Student Pass");
		}
		// 5 student 
	    for(j=0;j<5;j++)
		{
			
			System.out.println("Marks of "+(j+1)+" Student"); 
			for(k=0;k<5;k++)
            {
				System.out.print("In "+(k+1)+" Subject:");
				Scanner ab=new Scanner(System.in);
				b[j][k]=ab.nextInt();
				sum=sum+b[j][k];
			}
			sum1[j]=sum;
			//System.out.println(sum1[j]);
			System.out.println("\n");
			}
		for(j=0;j<5;j++)
		{
			if(sum1[j]<133)
			{
				System.out.println("Number "+(j+1)+" Student Fail");
            }
			else
			{
				System.out.println("Number "+(j+1)+" Student Pass");
			}
			}
		for(k=0;k<5;k++)
		{
		for(int m=0;m<5;m++)
		{
			for(j=0;j<5;j++)
			{
				if(b[j][k]<b[j+1][k])
				{
					s=b[j+1][k];
					b[j+1][k]=b[j][k];
					b[j][k]=s;
				}
				}
				}
				}
		System.out.println("Sorted marks are");
				for(k=0;k<5;k++)
				{
				for(j=0;j<5;j++)
				{
					System.out.println("b["+j+"]["+k+"] "+b[j][k]);
				}
				System.out.println("\n");
				}
				for(k=0;k<5;k++)
				{
					
					System.out.println("Highest Marks in "+(k+1)+" Subject is ="+b[0][k]);
				}
					
				
					
					
					
					
					
					
					
					
		
			
		
		
		}
		}
			
			
