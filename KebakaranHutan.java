public class KebakaranHutan {
    public static void main(String[] args) {
        /*
         * System.out.println("Kebakaran Hutan");
         * System.out.println("Ada asap.");
         * System.out.println("Asap membuat susah bernafas.");
         * System.out.println(13);
         * System.out.println('A');
         */

        // tanda ; setiap argumen dan i++ tidak pakai ;
        int kale = 5;
        for (int i = 1; i <= kale; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}