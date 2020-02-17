import java.util.Scanner;

/**
 *
 * @author angelrg
 */
public class calculadora {

    public static void main(String[] args) {
        //Lo utilizaremos en todos lados para poder leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        //Aqui almacenaremos la operacion en curso
        int operacion;

        //es una bandera para facilitar la reutilizacion del resultado anterior
        //la coloco en false ya que al inicio no existe un valor anterior
        boolean reutilizarResultado = false;
        //por seguridad inicializo con 0
        double resultadoAnterior = 0;

        //Aqui se almacenan los numero ingresados por el usuario
        double numero1 = 0;
        double numero2 = 0;

        //utilizo un ciclo do-while para que se pueda realizar al menos una operacion
        do {
            //se imprime el menu
            System.out.println("--------------------------------");
            System.out.println(">>>>>>>>>>Calculadora<<<<<<<<<<<");
            System.out.println("--------------------------------");
            System.out.println("Que operacion desea utilizar?\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicacion\n"
                    + "4. Division\n"
                    + "5. Salir\n"
                    + "Ingrese el numero de la operacion a realizar:"
            );
            //Obtenemos la opcion elegida por el usuario
            operacion = Integer.parseInt(scanner.nextLine());

            //Segun la opcion elegida por el usuario, se realiza la operacion
            switch (operacion) {
                case 1:
                    System.out.println("------Suma------");
                    break;
                case 2:
                    System.out.println("------Resta------");
                    break;
                case 3:
                    System.out.println("------Multiplicacion------");
                    break;
                case 4:
                    System.out.println("------Division------");
                    break;
            }

            switch (operacion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    //Se utiliza un metodo que devuelve el numero ya verificado, se enviar 1, ya que es el primer numero
            		numero1 = ingresarDato(reutilizarResultado, 1, scanner, resultadoAnterior, operacion);

            		//Se utiliza un metodo que devuelve el numero ya verificado, se envia 2, ya que es el 2do numero
            		numero2 = ingresarDato(reutilizarResultado, 2, scanner, resultadoAnterior, operacion);
                    break;
            }
            

            switch (operacion) {
                case 1:
                    //realizamos la suma
                    resultadoAnterior = numero1 + numero2;
                    System.out.println("El resultado de la suma de " + numero1 + " + " + numero2 + " es: " + resultadoAnterior);

                    //Se guarda modifica la bandera para reutilizar el resultado
                    reutilizarResultado = reutilizarResultadoOperacion(resultadoAnterior, scanner);
                    break;
                case 2:
                    //realizamos la resta
                    resultadoAnterior = numero1 - numero2;
                    System.out.println("El resultado de la resta de " + numero1 + " - " + numero2 + " es: " + resultadoAnterior);

                    //Se guarda modifica la bandera para reutilizar el resultado
                    reutilizarResultado = reutilizarResultadoOperacion(resultadoAnterior, scanner);
                    break;
                case 3:
                    //realizamos la multiplicacion
                    resultadoAnterior = numero1 * numero2;
                    System.out.println("El resultado de la multiplicacion de " + numero1 + " * " + numero2 + " es: " + resultadoAnterior);

                    //Se guarda modifica la bandera para reutilizar el resultado
                    reutilizarResultado = reutilizarResultadoOperacion(resultadoAnterior, scanner);
                    break;
                case 4:
                    //realizamos la division
                    resultadoAnterior = numero1 / numero2;
                    System.out.println("El resultado de la division de " + numero1 + " / " + numero2 + " es: " + resultadoAnterior);

                    //Se guarda modifica la bandera para reutilizar el resultado
                    reutilizarResultado = reutilizarResultadoOperacion(resultadoAnterior, scanner);
                    break;
            }

        } while (operacion < 5 && operacion > 0);

    }

    /**
     * Esta funcion esta dedicada a pedir el numero al usuario, para no repetir
     * la logica varias veces
     *
     *
     * @param reutilizarResultado
     * @param posicion
     * @param scanner
     * @param resultadoAnterior
     * @param operacion
     * @return
     */
    public static double ingresarDato(boolean reutilizarResultado, int posicion, Scanner scanner, double resultadoAnterior, int operacion) {

        //Verificamos si el usuario indico que deseaba utilizar nuevamente un la respuesta anterior, con la bandera que indicamos al inicio
        if (!reutilizarResultado) {

            //Verificamos si la operacion es una division y se esta ingresando el divisor
            if (operacion == 4 && posicion == 2) {

                //Aqui almacenaremos el vamor ingresado por el usuario
                String valorIngreso = "1";

                //creamos un ciclo para pedir un divisor valido
                do {
                    //utilizamos un if, para imprimir texto amigable para el usuario
                    //Si el usuario ingreso 0, pedira nuevamente el divisor
                    if (Double.parseDouble(valorIngreso) == 0) {
                        System.out.println("Ingrese un valor valido diferente d 0 para el divisor");

                        //aqui pedimos por primera vez el dividente
                    } else {
                        System.out.println("Ingrese el valor " + posicion+":");
                    }
                    //recibimos el divisor ingresado por el usuario
                    valorIngreso = scanner.nextLine();

                    //Si el divisor es 0, no se puede salir del ciclo
                } while (Double.parseDouble(valorIngreso) == 0);

                //devolvemos el divisor valido ingresado por el usuario
                return Double.parseDouble(valorIngreso);
            } else {
                //Para cualquier numero que debe ingresar el usuario
                System.out.println("Ingrese el valor " + posicion + ":");
                double value;
                //Devolvemos el vamor ingresado
                value = Double.parseDouble(scanner.nextLine());
                System.out.println("Valor ingresado:" + value);
                return value;
            }

        } else {
            //Si ya se ha cambiado la bandera "reutilizarResultado" a true, ingresaremos en otra funcion
            //devolvemos el valor ingresado por el usuario
            return reciclarResutlado(resultadoAnterior, scanner, posicion, operacion);
        }
    }

    /**
     * Este metodo nos servira para reciclar el valor ingresado por el usuario,
     * pero se valida el dividendo
     *
     * @param reutResultado
     * @param scanner
     * @param posicion
     * @param operacion
     * @return
     */
    public static double reciclarResutlado(double reutResultado, Scanner scanner, int posicion, int operacion) {
        //imprimimos la pregunta para el usuario
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Si desea utilizar el resultado de la operacion anterior: " + reutResultado
                + "\n en el valor " + posicion + " de operacion ingrese \"S\" de lo "
                + "\ncontrario ingrese el nuevo valor para la operacion:");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        //se recibe la decison del usuario
        String valorIngreso = scanner.nextLine();

        //Si el usuario ingresa "s", se devolvera el resultado de la operacion anterior que esta en "reutResultado"
        if (valorIngreso.replaceAll(" ", "").equalsIgnoreCase("s")) {

            //Si es una division, donde evaluaremos el divisor y el resultado anterior es 0
            if (operacion == 4 && posicion == 2 && reutResultado == 0) {

                //creamos un ciclo para pedir un valor valido al usuario
                do {
                    System.out.println("Ingrese un valor valido diferente d 0 para el divisor");

                    //almacenamos el valor indicado por el usuario
                    valorIngreso = scanner.nextLine();

                    //Se crea un mientras el usuario ingrese 0
                } while (Double.parseDouble(valorIngreso) == 0);

                //devolvemos el valor ingresado por el usuario
                return Double.parseDouble(valorIngreso);
            } else {

                //sino se cumple con los criterios del if, simplemente devolvemos el valor de "reutResultado"
                return reutResultado;
            }

            //Si el usuario decide no utlizar el valor nuevamente
        } else {

            //Si es division y se recibe el divisor
            if (operacion == 4 && posicion == 2) {

                //mientras el valor ingresado al inicio por el usuario es 0, se pedira un valor valido
                while (Double.parseDouble(valorIngreso) == 0) {

                    System.out.println("Ingrese un valor valido diferente d 0 para el divisor");
                    valorIngreso = scanner.nextLine();
                }

                //devolvemos el valor valido ingresado por el usuario
                return Double.parseDouble(valorIngreso);
            } else {

                //se devuelve el vamor ingresado por el usuario
                return Double.parseDouble(valorIngreso);
            }
        }

    }

    /**
     * Este metodo devuelve la decision del usuario, se devuelve un booleano que
     * indica true si en usuario reutilizara el resultado anterior, en caso
     * contrario devuelve false
     *
     * utilizamos "resultadoAnterior" para poder imprimir el resultado de la
     * operacion realizada, para que sea mas amigable con el usuario
     *
     * utilizamos "scanner" para reciclarlo, y no declararlo varias veces y
     * ahorrar codigo
     *
     * @param resultadoAnterior
     * @param scanner
     * @return
     */
    public static boolean reutilizarResultadoOperacion(double resultadoAnterior, Scanner scanner) {
        //imprime la pregunta para el usuario
        System.out.println("\nSi desea reutilizar el resultado: " + resultadoAnterior + " coloque \"s\" en caso contrario coloque \"n\"");

        //recibimos la decision del usuario
        String reutilizar = scanner.nextLine();

        //para devolver algo, se utiliza la palabra reservada "return" seguido de lo que devolveremos
        //para reducir lineas de codigo se puede devolver la operacion directamente, en este caso se sabe que devolvere un valor booleano
        return reutilizar.replaceAll(" ", "").equalsIgnoreCase("s");
    }

}
