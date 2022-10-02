package complejo;

public class ComplejoTest {

    public static void main(String[] args) {
        Complejo num1 = new Complejo();
        Complejo num2 = new Complejo();
        Complejo num3 = new Complejo();

        num1.asignar(3.5, 5.2);
        num2.asignar(5.3, 2.5);
        num3.sumar(num1, num2);

        num1.imprimir(num1);
        num2.imprimir(num2);
        num3.imprimir(num3);
    }
}