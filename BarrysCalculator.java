import java.util.Scanner;

public class BarrysCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.print("Enter the Celsius temperature: ");
		celsius = keyboard.nextDouble();
		
		fahrenheit = 9.0 / 5.0 * celsius + 32.0;
		
		System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
		System.out.print("Room Temperauture? ");
		System.out.println(fahrenheit < 69.8 + 0.1 && fahrenheit > 69.8 - 0.1);
		
		keyboard.close();
	}
}
