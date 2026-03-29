package code;

public class TwoPointer {

	public static void main(String[] args) {
	      
	      String str = "I am Saravanan";
	      
	      String st[] = str.split(" ");
	      
	      StringBuilder sb = new StringBuilder();
	      
	      for(String s : st)
	      {
	        char c[] = s.toCharArray();
	  
	        int left=0;
	        int right= c.length-1;

	        while(left < right)
	        {
	          char temp = c[left]; 
	          c[left] = c[right];
	          c[right] = temp;
	          left++;
	          right--;

	        }
	        sb.append(c).append(" ");
	      
	      }
	      System.out.println(sb.toString());
	     
	  }

}
