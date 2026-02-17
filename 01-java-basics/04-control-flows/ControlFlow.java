public class ControlFlow {
    public static void main(String[] args) {
        // IF-ELSE Statement
        System.out.println("=== IF-ELSE ===");
        int score = 85;
        
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        // SWITCH Statement
        System.out.println("\n=== SWITCH ===");
        int day = 3;
        String dayName;
        
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is: " + dayName);

        // Fall through
        int month= 3;
        switch(month){
            case 1:
            case 2: 
            case 3:
                System.out.println("Q1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Q2");
                break;
        }
        
        // FOR Loop
        System.out.println("\n=== FOR Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // WHILE Loop
        System.out.println("\n=== WHILE Loop ===");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // DO-WHILE Loop
        System.out.println("\n=== DO-WHILE Loop ===");
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
        
        // BREAK and CONTINUE
        System.out.println("\n=== BREAK and CONTINUE ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping 5");
                continue;  // Skip iteration
            }
            if (i == 8) {
                System.out.println("Breaking at 8");
                break;  // Exit loop
            }
            System.out.println("i = " + i);
        }
    }
}