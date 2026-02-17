public class Variables {
    public static void main(String[] args) {
        // Primitive Data Types
        
        // Integer types
        byte myByte = 127; // -128 to 127
        short myShort = 32000; // -32,768 to 32,767
        int myInt = 2147483647; // -2^31 to 2^31-1
        long myLong = 9223372036854775807L; // -2^63 to 2^63-1
        
        // Floating point types
        float myFloat = 3.14f; // 32-bit IEEE 754
        double myDouble = 3.14159265359; // 64-bit IEEE 754
        
        // Character type
        char myChar = 'A'; // Single character
        
        // Boolean type
        boolean isJavaFun = true;
        boolean IsJavaFun = false;
        
        // Reference type
        String myString = "Halo Jawa";
        
        // Print all variables
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("boolean: " + IsJavaFun);
        System.out.println("String: " + myString);
        
        // Constants (final)
        final double PI = 3.14159;
        System.out.println("PI: " + PI);
    }
}