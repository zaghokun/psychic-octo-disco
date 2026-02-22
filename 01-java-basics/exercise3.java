public class exercise3{

    // Method 1 
    /*  
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    */

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            String output = "";

            if(i % 3 == 0){
                output += "Fizz";
            }
            if(i % 5 == 0){
                output += "Buzz";
            }

            if(output.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(output);
            }
        }
    }
}