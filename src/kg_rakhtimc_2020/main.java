package kg_rakhtimc_2020;

import java.util.HashMap;

public class main {
public boolean isOneToOne(String s1,String s2) {
	//hashmap to keep the character to character mapping as s1 as key and s2 as value
	HashMap<Character,Character> map1=new HashMap<>();
    
	//if s1 is larger than s2 then return false as there can't be any one to one mapping.But not vice versa.
	if(s1.length()>s2.length()) {
		return false;
	}
	
	//actual logic.check if the character in s1 is already having a mapping in the hasmap.if so then check if it is consistent.else
	//add it to the map with corresponding value from s2.
    for(int i=0;i<s1.length();i++){
        if(map1.containsKey(s1.charAt(i))){
            if(map1.get(s1.charAt(i))!=s2.charAt(i)){
                return false;
            }
        }else{
        	map1.put(s1.charAt(i),s2.charAt(i));
        }
    }
    
    return true;
}

public static void main(String[] args) {
	//check if the number of arguments passed to the program is correct
	if(args.length!=2) {
		System.out.println("Please provide only two strings as an argument to the program and try again");
		return;
	}
	//create an object of the class
	main isOneToOneObject = new main();
	//basic exception  handling
	try {
		//call the isOneToOne function and print the return value from the function
		boolean answer = isOneToOneObject.isOneToOne(args[0],args[1]);	 
		System.out.println(answer);
	}catch (Exception exception) {
        // Catch unexpected Exceptions.
        System.out.println("Something went wrong with the program.You might get an idea from the description below");
        System.out.println(exception);
    }
}
}
