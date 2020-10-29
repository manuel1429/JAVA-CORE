
package argumentosvariables;


public class ArgumentosVariables {

    
    public static void main(String[] args) {  
        imprimirNumeros(3,4,5);
        imprimirNumeros(2,6,3,7,4,8);
        
        variosParametros("Manuel", 3,4,5,6);
        
        int [] arreglo = {5,3,1,2,3};
        imprimirNumeros(arreglo);
    }
    
    //los argumentos variables deben de ser el ultimo argumento del metodo
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre:" + nombre);
        imprimirNumeros(numeros);
    }
    
    //metodo con argumentos variables
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos:" + numeros[i]);
        }
    }
}
