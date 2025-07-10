
public class Main {

	public static void main(String[] args) {
		
		student [] arr;
		arr=new student[5];
		
		arr[0]=new student("kundan",100);
		arr[1]=new student("Aaditya",101);
		arr[2]=new student("Ram",102);
		arr[3]=new student("umesh",103);
		arr[4]=new student("pappu",104);
		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(arr[i]);
//		}
	    int arr1[][]= {{1,2,3},
	    {8,6},
	    {9,3,5,7},
	    {6,8,5,8},
       };
		jaggedArray obj=new jaggedArray(arr1);
		
		obj.displayjaggedArr();
		
	}
}

