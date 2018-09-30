import java.util.ArrayList;
import java.util.List;


public class arrayList {
	public static void main(String[] args){
		//initiating a new array list as part of the test
		List<String> aa= new ArrayList<String>();
		aa.add("This is an arrayList");
		aa.add("It is more powerful than an array when you need to continuously add elements to a list");
		aa.add("However you will need to export the elements to an array if you want to call them in your system");
		
		
		//converting the arraylist into an array and printing every element of the array out with a universal for loop
		String[] abo = aa.toArray(new String[aa.size()]);
		for(int i=0;i<aa.size();i++){
			System.out.println(abo[i]);
		}
	}
}
