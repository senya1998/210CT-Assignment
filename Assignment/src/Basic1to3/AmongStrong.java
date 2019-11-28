package Basic1to3;

class Armstrong{  
	  public static void main(String[] args)  {
		
	    int c=0,a,temp;  
	    int n=153;//It is the number to check armstrong  
	    temp=n;
	    //do the while loop for checking. 
	    //first time is to find the third number of n and plus to c
	    //second time is to find the second number of n and plus to c
	    //third time is to find the first number of n and plus to c
	    while(n>0)  
	    {  
	    a = n%10; 
	    n = n/10;  
	    c += (a*a*a); 
	        
	    }  
	    //After checking, the value of c should equals to the value of n if n is an amostrong
	    if(temp==c)  
	    System.out.println("It is an armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	}

