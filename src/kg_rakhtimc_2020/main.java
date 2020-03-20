package kg_rakhtimc_2020;

import java.util.HashMap;

public class main {
public boolean isOneToOne(String s1,String s2) {
	HashMap<Character,Character> map1=new HashMap<>();
    
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
	if(args.length!=2) {
		System.out.println("Please provide only two strings as an argument to the program and try again");
		return;
	}
	main isOneToOneObject = new main();
	try {
		boolean answer = isOneToOneObject.isOneToOne(args[0],args[1]);	 
		System.out.println(answer);
	}catch (Exception exception) {
        // Catch unexpected Exceptions.
        System.out.println("Something went wrong with the program.You might get an idea from the description below");
        System.out.println(exception);
    }
}
}
