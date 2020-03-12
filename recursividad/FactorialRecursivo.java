class FactorialRecursivo{

  public static void main(String args[]){

    int i,factor=1;  
    int numero=4; 
    factor = factorial(numero);

    System.out.println("Factorial of "+numero+" is: "+factor);    
  }  

  static int factorial(int n){   

    if (n == 0){
      System.out.println("1"); 
      return 1;   
    } else {
      System.out.println(n+"factorial("+n+"-1)");    
      int result = (n * factorial(n-1)); 
      System.out.println(n+"factorial("+n+"-1)");
      return result;
    }  
  }
}  