//Fatemeh Sedigh Haghighat
package MainPackage;

public class MyInteger {
	public static void main(String[] args){
		int value;
	}
	private static int value;
		public MyInteger(int value){
			this.value=value;
			
		}
	public static Integer getValue(){
		return value;
		
	}
	public boolean isEven(){
		if (value % 2==0){
			return true;
		}
		return false;
	}
	public boolean isOdd(){
		if (value % 2!=0){
			return true;
		}
		return false;
	}
	public boolean isPrime(){
		int factor=0;
		for (factor =2;factor<=value/2;factor++){
			if (value % factor !=0){
			return true;
		}
	}
		return false;
	}	
	public boolean isEven(int value) {
		if (value%2==0){
			return true;
		}
		return false;
	}
	public boolean isOdd(int value) {
		if (value%2!=0){
			return true;
		}
		return false;
	}

	public static boolean isPrime(int value) {
    	if(value<=1){
    	 return false;
    }
    	double x = 0;
		for(int intx = 2; x< Math.sqrt(value);x++){
    		if(value % x==0){
    			return false;
    		}
    		return true;
    	}
		return false;
	}
	public static boolean isEven(MyInteger myInt){
   	 return  (MyInteger.value % 2==0);
   	 
   }
   public static boolean isOdd(MyInteger myInt){
   	 return  (MyInteger.value % 2!=0);
   }
   public static boolean isPrime(MyInteger myInt){
   	 return  MyInteger.isPrime(MyInteger.getValue());
   }
   public boolean equals(int num){
   	if(num==value){
   		return true;
   		
   	}
	return false;
   }
   private boolean equals(MyInteger num){
   	if (num.value==value){
   		return true;
   	}else{
   		return false;
   	}
   
   }
   public static int paseInt(char[] a){
   	int total=0;
   	for(int x=0 ; x<a.length; x++ ){
   		char suml = a[x];
   		int sum = 0;
		sum++;
   	}
   	return total;
   }
   public static int parseInt(String x){
   	return x.length();
   }

}

