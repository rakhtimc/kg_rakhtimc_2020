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
	main isOneToOneObject = new main();
	boolean answer = isOneToOneObject.isOneToOne(args[0],args[1]);	 
	System.out.println(answer);
}
}
