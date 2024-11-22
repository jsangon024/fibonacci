package es.iessoterohernandez.daw.endes.fobonacciMain;
import es.iessoterohernandez.daw.endes.fibonacci.*;
import java.util.*;


/**
 * Hello world!
 */
public class FibonacciMain {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Escribe el número de Fibonacci: ");
		int MAX = sc.nextInt();
		Fibonacci.fibonacci(MAX);
    }
}
