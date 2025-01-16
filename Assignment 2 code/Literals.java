
public class Literals {
	
    public static void main(String[] args) {
        // Integer Literals
        int decimal = 100;
        int octal = 0100; // 64 in decimal
        int hex = 0x64;   // 100 in decimal
        int binary = 0b1100100; // 100 in decimal

        // Floating-point Literals
        float floatVal = 3.14f;
        double doubleVal = 2.71828;

        // Character Literal
        char character = 'J';

        // String Literal
        String text = "Java Literals ";

        // Boolean Literals
        boolean isJavaFun = true;
        boolean isCodingTough = false;

        // Print all the literals
        System.out.println("Integer Literals: " + decimal + ", " + octal + ", " + hex + ", " + binary);
        System.out.println("Floating-point Literals: " + floatVal + ", " + doubleVal);
        System.out.println("Character Literal: " + character);
        System.out.println("String Literal: " + text);
        System.out.println("Boolean Literals: " + isJavaFun + ", " + isCodingTough);
    }
}


