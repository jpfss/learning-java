package algorithm.topic.backtrack;


public class ExhaustiveSubset {
	
	public static void RecSubsets(String soFar, String rest)
	{
		if (rest.length()<=0) {
			if(soFar == "")
				soFar = "%";   // 空集合
	        System.out.println(soFar);
	    } else {
	            RecSubsets(soFar + rest.charAt(0), rest.substring(1));
	            RecSubsets(soFar, rest.substring(1));
	    }
	}
	
	public static void main(String[] args) {
		RecSubsets("", "ABC");
	}

}
