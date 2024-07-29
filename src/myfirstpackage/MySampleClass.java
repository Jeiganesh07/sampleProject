package myfirstpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class MySampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sample quotes");
		
		  
		{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		
	}

}
