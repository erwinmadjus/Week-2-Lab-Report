import java.util.Arrays;

public class NotesArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        // System.out.println(colors);
        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

        // int[] numbers = new int[2];
        // numbers[0] = 100;
        // numbers[1] = 200; 

        int[] numbers = {100, 200};
        

        // First method that can be used to print out the elements inside of an array
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }


        // Print out the elements inside of an array in the reverse order
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        // 2nd method that can be used to print out the elements inside of an array
        for (String color : colors) {
            System.out.println(color);
        }


        // 3rd method that can be used to print out the elements inside of an array
        Arrays.stream(colors).forEach(System.out::println);


    }
}