package quiz3Package;
import java.util.Scanner;

public class Quiz3Class 
{
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		int arraySize=0;
		do
		{
			System.out.println("Please enter the number of inputs. (Max of 50)");
			arraySize=input.nextInt();
		}while (arraySize>=50);
		
		double [] inputs = new double [arraySize];
		
		for (int cntr=0; cntr<inputs.length; cntr++)
		{
			System.out.println("Please input a number.");
			inputs[cntr]=input.nextDouble();
		}//end for loop
		
		inputs=sortAscending(inputs);
		System.out.println("Inputs in ascending order:");
		for(int ascending=0; ascending<inputs.length; ascending++)
		{
			System.out.println(inputs[ascending]);
		}//end for loop
		
		inputs=sortDescending(inputs);
		System.out.println("Inputs in descending order:");
		for (int descending=0; descending<inputs.length; descending++)
		{
			System.out.println(inputs[descending]);
		}
		
		
	} //end main
	
	public static double[] sortAscending(double[] array)
	{
		double temp;
		int i;
		int j;
		
		temp=0.0;
		
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array.length;j++)
			{
				if (array[i]<array[j])
				{
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}//end if
			}//end for j
		}//end for i
		
		return(array);
	}//end sortAscending
	
	public static double[] sortDescending(double[] array)
	{
		double temp;
		int i;
		int j;
		
		temp=0.0;
		
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array.length;j++)
			{
				if (array[i]>array[j])
				{
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}//end if
			}//end for j
		}//end for i
		
		return(array);
	}//end sortDescending

}//end Quiz3Class
