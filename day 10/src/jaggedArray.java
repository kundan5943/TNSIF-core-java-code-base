
public class jaggedArray {
    int arr[][];
	public jaggedArray(int arr[][]) {
		  
		
		this.arr=arr;
	}

	public void displayjaggedArr()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			  System.out.println();
		}
	}
	
}
