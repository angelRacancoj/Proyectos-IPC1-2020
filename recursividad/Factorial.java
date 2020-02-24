class Factorial{  

  public static void main(String args[]){  

    int i,resultado=1;  
    int numero=5;

    for(i=1;i<=numero;i++){    
        resultado=resultado*i;    
    }    

    System.out.println("Factorial of "+numero+" is: "+resultado);    
  }  
}  