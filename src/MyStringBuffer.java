// String Buffer work in Multithreaded Environment
public class MyStringBuffer  {
	
	private int capacity;
	private int length;
	
	private char[] stringBuffer;
	
	MyStringBuffer(){
		this(16);  //Default to 16 characters capacity
	}
	
	public MyStringBuffer(int l) {
	      capacity = l;
	      stringBuffer = new char[capacity];
	      length = 0;
	   }
	
	public void increasecapacity(int newlength){
		int capacity = Math.max(newlength, 2*this.capacity);
		 char[] newArray = new char[capacity];
         for (int i=0; i<length; i++) {
        	 newArray[i] = stringBuffer[i];
         }
         stringBuffer = newArray;
         this.capacity = capacity ;
	}
	
	public synchronized MyStringBuffer append(String str) {
	      if (str==null){ 
	    	  str = "null";
	      }
	      if (length+str.length()>capacity) {
	    	  increasecapacity(length+str.length());
	      }
	      for (int i=0; i<str.length(); i++) {
	         stringBuffer[length+i] = str.charAt(i);
	      }
	      length += str.length();
	      return this;
	   }
	

	public synchronized MyStringBuffer append(char ch) {
	    int newlength=length+1;
	    if(newlength>capacity){
	    	increasecapacity(newlength);
	    }
	    stringBuffer[length]=ch;
	    length++;
	    return this;
	   }
	
	//TODO: other overloaded append
	
	public String toString() {
	      return new String(stringBuffer, 0, length);
	   }

}
