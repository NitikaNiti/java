package LoveBabberArrayVideos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterKeyPadProblem {
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	 public List<String> letterCombinations(String digits) {
	        List<String> answer = new ArrayList<>();
	        if(digits.length() == 0)
	            return answer;
	        
	        int index =0;
	        HashMap<Character,String> mapping = new HashMap<>();
	        mapping.put('2',"abc");
	        mapping.put('3',"def");
	        mapping.put('4',"ghi");
	        mapping.put('5',"jkl");
	        mapping.put('6',"mno");
	        mapping.put('7',"pqrs");
	        mapping.put('8',"tuv");
	        mapping.put('9',"wxyz");
	        
	        backtrack(digits,index,mapping,new StringBuilder(), answer);
	        return answer;          
	    }
	   private static void backtrack(String digits,int index,HashMap<Character,String> mapping,StringBuilder sb, List<String> answer){
	    
	    if(index ==digits.length()){
	        answer.add(sb.toString());
	    return;
	}
	    String value = mapping.get(digits.charAt(index));
	    
	    for(int i=0;i<value.length();i++){
	        sb.append(value.charAt(i));
	        backtrack(digits,index+1,mapping,sb,answer);
	        sb.deleteCharAt(sb.length()-1);
	    }
	}
	
}
	

