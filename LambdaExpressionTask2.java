//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

package Java8_Task;

import java.util.List;

public class LambdaExpressionTask2 {
	public static void main(String[] args)
	{
		
		List<String> list=List.of("apple","orange","grapes");
		
		List<String> list1=List.of("APPLE","PINEAPPLE","ORANGE");
		
		list1.stream().map((s)->s.toUpperCase()).forEach(System.out::println);//convert uppercase
		//to convert LowerCase
		list1.stream().map((s)->s.toLowerCase()).forEach(System.out::println);
		

	}

}
