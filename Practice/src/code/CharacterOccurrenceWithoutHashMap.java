package code;

public class CharacterOccurrenceWithoutHashMap {
	
    public static void main(String[] args) {
      
      String s = "I am Saravanan";
      
      int a[]= new int[256];
      
      for(char c : s.toLowerCase().toCharArray())
      {
        a[c] = a[c]+1;       
      }
      
      for(int i=0; i<a.length; i++)
      {
        if(a[i]>0)
        {
//          if((char)i == ' ')
//          {
//            continue;
//          }
          System.out.println((char)i +"  : "+ a[i]);
        }
        else
        {
          //System.out.println((char)i +"Unique : "+ a[i]);
        }
      }    
      
  }
}
