package Tasks16;

public class Task2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    static String word;

    public static String reverse(String word) {

        StringBuilder st = new StringBuilder(word);
        StringBuilder st1 = st.reverse();
        String reversed = st1.toString();
        for (int i = reversed.length() - 1; i >= 0; i--) {
            return reversed;
        }
        return word;
    }


    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.word="Chicken";
        System.out.println(task2.reverse(word));
    }
}
