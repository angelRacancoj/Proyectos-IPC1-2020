public class HelloWorld{
	/**
	* Instrucciones para compilar y ejecutar nuestro HelloWorld
	* javac HelloWorld.java
	* java HelloWorld 
	*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(algo());
        System.out.println("Linea 1");
        System.out.println("Linea 2"); 
        System.out.println("Linea 3");
    }  

    public static String algo(){
    	return "Feliz dia del ingeniero :')";
    }  
}