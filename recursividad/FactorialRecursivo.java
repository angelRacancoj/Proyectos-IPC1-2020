class FactorialRecursivo{

  public static void main(String args[]){

    int i,factor=1;  
    int numero=5; 
    factor = factorial(numero);

    System.out.println("Factorial of "+numero+" is: "+factor);    
  }  

  static int factorial(int n){   

    if (n == 0){
      return 1;    
    } else {    
      return(n * factorial(n-1));    
    }  
  }
}  