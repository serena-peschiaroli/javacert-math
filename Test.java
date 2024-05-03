public class Test {
    public static void main(String[] args) {
        String[] arr = { "Abc", "e", "fhl", "mnop" };
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            if (i / 2 == 0) {
                str = str + " ";

            } else {
                str = str + arr[i];

            }
        }

        System.out.println(str.charAt(5));

    }
}