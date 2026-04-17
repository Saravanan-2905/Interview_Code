package code;

public class ExtractInteger {

	public static void main(String[] args) {
		
		String s[] = {"USD 89,989.00","INR 679,76.899"};
		
		
		// 1. REGEX - Regular Expression :
		
		for(String c : s)
		{
			String num =  c.replaceAll("^[^0-9]", "")
						  .replaceAll("\\..*", "")
						  .replaceAll("[^0-9]", "");
			System.out.println(Integer.parseInt(num));	
		}
		
		
		
//		for(int i=0; i<s.length; i++)
//		{
//			String str[] = s[i].split(" ");
//			
//			String num = s[i];
//			
//			String result = "";
//			
//			for(int j=0; j<num.length(); j++)
//			{
//				char c = num.charAt(j);
//				
//				if(c == '.') break;
//				
//				if(Character.isDigit(c))
//				{
//					result +=c;
//				}
//				
//			}
//			
//			System.out.println(Integer.parseInt(result));
//		}

	}

}
