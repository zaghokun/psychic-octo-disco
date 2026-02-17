public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3 (integer division)
        System.out.println("a % b = " + (a % b));  // 1 (modulus)
        
        // Increment/Decrement
        System.out.println("\n=== Increment/Decrement ===");
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));  // 5, then x becomes 6
        System.out.println("x = " + x);        // 6
        System.out.println("++x = " + (++x));  // 7
        
        // Comparison Operators
        System.out.println("\n=== Comparison Operators ===");
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a > b: " + (a > b));    // true
        System.out.println("a < b: " + (a < b));    // false
        System.out.println("a >= b: " + (a >= b));  // true
        System.out.println("a <= b: " + (a <= b));  // false
        
        // Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean p = true, q = false;
        System.out.println("p && q: " + (p && q));  // AND - false
        System.out.println("p || q: " + (p || q));  // OR - true
        System.out.println("!p: " + (!p));          // NOT - false
        // untuk and dan or dicampur not =
        System.out.println("!(p && q): "+ !(p && q)); // NAND - true
        
        // Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 10;
        c += 5;  // c = c + 5
        System.out.println("c += 5: " + c);  // 15
        c -= 3;  // c = c - 3
        System.out.println("c -= 3: " + c);  // 12
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);  // 24
        c /= 4;  // c = c / 4
        System.out.println("c /= 4: " + c);  // 6
    }
}