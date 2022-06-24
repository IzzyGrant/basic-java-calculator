
// by Izzy G. Osorio <nikaylez@gmail.com>


public class Simplecalc {
    
    //Funcion que hara la operacion. notese que se requeriran de 3 argumentos
    //cuando sea invocado: (double a, double b, char operador) 
    //Tambien queremos que nos devuelva el resultado de la operacion en tipo de 
    //dato double: static private <<double>> operacion
    static private double operacion(double a, double b, char operador){
        
        double resultado = 0; // definimos el tipo de variable que se devolvera
        
        // se hara la operacion dependiendo del argumento (char operador)
        switch(operador){
            case '+':
            resultado = a + b;
            break;
            case '-':
            resultado = a - b;
            break;
            case '*':
            resultado = a * b;
            break;
            case '/':
            resultado = a / b;
            break;
        }
        //despues de haber operado los 2 argumentos dependiendo del operador
        //retornaremos el valor del resultado en un double que usaremos para
        //desplegarlo en el display
        return resultado;
        
        // Esta funcion estara en espera hasta que sea invocado, ejemplo
        // double resultado = operacion(numeroA, numeroB, operador);
        // double resultado = operacion(2.1, 5, '+');
        // resultado tendra el valor de : 7.1
    }
    
    
    public static void main(String[] args) {
        
        // En nuestro display tenemos de ejemplo...
        System.out.println(">>>El usuario ingresa el primer numero: ");
        
        String display = "12.65"; // <<-- Numero ingresado, cambiar para probar -->>
        
        System.out.println("Display: " + display);
        
        // al presionar un boton de operador jalamos el valor previo del display
        // y lo guardamos en un double.
        double numeroA = Double.parseDouble(display);
        
        char operador = '+'; // <<-- operador ingresado, cambiar para probar -->>
        
        System.out.println(">>>Aqui el usuario presiono el boton "+ operador + ": ");
        display = ""; // el display se limpiara permitiendo ingresar otro numero
        System.out.println("Display: " + display);
        
        // En nuestro display tenemos de ejemplo...
        System.out.println(">>>El usuario ingresa el segundo numero: ");
        
        display = "7"; // <<-- Numero ingresado, cambiar para probar -->>
        
        System.out.println("Display: " + display);
        
        // Aqui guardamos el segundo numero cuando el usuario presione "Resultado"
        double numeroB = Double.parseDouble(display);
        
        System.out.println(">>>El usuario ha presionado el boton de 'Resultado' ");
        // Dentro del mismo evento de "Resultado" debemos invocar la funcion de 
        // operacion de valores. Notese que declaramos una variable double
        // donde se hara la invocacion de la funcion con los argumentos que obtuvimos
        // del usuario misma que almacenara el valor retornado, en este caso el resultado.
        double resultadoFinal = operacion(numeroA, numeroB, operador);
        
        // Traducimos el valor de double resultado a tipo String para que pueda
        // ser mostrado en el display.
        display = String.valueOf(resultadoFinal);
        
        // Se muestra resultado final en el display
        System.out.println("Display: " + display);
        
        // Enjoy!
        
    }
}
