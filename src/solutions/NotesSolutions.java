package solutions;

/**
 * A JavaDoc Comment
 * @author BobSaidHi
 * @since 20210921
 * @version 1.0
 */
public class NotesSolutions {
    /** 
     * @param String[] args
     * @since 1.0
    */
    // Annotation to ignore the "unused" category of annotations, such as unused variables.
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /**
         *    Comments and Print Statements
         */
        
        // This prints something and adds a line
        System.out.println("Hello, World!");

        // This prints out something without adding a line
        System.out.print("String1");
        System.out.print("String2");
        System.out.print("");

        // Concatenation and escape sequences
        System.out.print("The current time is: " + 5 + " PM.\n");

        // Declare an integer
        int i1;
        // Initialize an integer
        i1 = 1;

        // Declare and Initialize an integer
        int i2 = 2;

        // Declare and Initialize a double precision decimal number
        double d1 = 1.0;

        // Declare and Initialize a String object
        String s1 = new String("String3");

        // TODO: += opertors

        // TODO: Type casting

        // TODO: IO

        // Create a random number just for fun
        int i3 = lib.Randomizer.nextInt(-10, 10);

        // Flow Control
        if(i3 == 0) {
            System.out.println("i3 os equal to 0.");
        }
        else if (i3 < 0) {
            System.out.println(i3 + " is less than 0.");
        }
        else {
            System.out.println(i3 + " is greater than 0.");
        }

        /*TODO: switch()
        TODO: case*/
        
        // for loop
        // The x++ operator adds one to the value of a variable, while x-- would do the opposite
        // The ++X operator adds one, but earlier (eg: before a loop runs vs. after);
        // Note that i is a local varibble too this for loop
        for(int i = 0; i < 5; i++) {
            System.out.println("I = " + i);
        }

        // while loop
        // watch out for infinite loops!
        int j = 1;
        while(j <= 5) {
            System.out.println("J = " + j);
            j++;
        }

        //TODO: arrays

    }
}
