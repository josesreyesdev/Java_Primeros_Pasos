import variablesType.Ciclos;
import variablesType.Conditionals;
import variablesType.ExampleScope;
import variablesType.TypeVariable;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ===Hello world!=== ===");

        TypeVariable variable = new TypeVariable();
       // variable.variable();

        System.out.println("==========================");

        Conditionals conditionals = new Conditionals();
        //conditionals.conditionals();
        conditionals.switchControl();

        System.out.println("==========================");

        ExampleScope scope = new ExampleScope();
        scope.descuentos();

        System.out.println("==========================");

        Ciclos ciclos = new Ciclos();
        //ciclos.cicloWhile();
        //ciclos.cicloFor();
        //ciclos.tablaMultiply(3);
        //ciclos.matriz();
        //ciclos.multiplosDeTres();
        ciclos.factorial(5);

        System.out.println("==========================");
    }
}