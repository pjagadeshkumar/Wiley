import java.util.HashMap;
import java.util.Map;

public class Assessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "This is is is my java java program";
		
		//Split the sentences and store each each word in a string array
		String[] s = str.split(" ");
		
		//initiating a variable to count the number of occurances
		int count=1;
		
		//creating a hash map to store the word as key and count as value
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//Iterating through the String array to get the count of each word 
		for(int i=0;i<s.length;i++)
		{
			
			//check if the word already exists in the array
			if(!map.containsKey(s[i]))
			{
				map.put(s[i], count);
			}
			else
			{
				//if the word already exists, increment the count
				map.put(s[i], map.get(s[i])+1);
			}
		}
		
		//iterating through the map to get the key and value pairs
		for(String x:map.key)
		{
			//printing the word and the number of times it occurs in the string
			System.out.println("The word is: "+x+ " = "+map.get(x));
		}

	}
	}


