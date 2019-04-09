public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 40; i++) {
            String out = "";
            out = fizzbuzz(i, out);
            System.out.println(out);
        }
    }

    static String fizzbuzz(int i, String out) {
        if (i % 3 == 0) {
            out += "fizz2019";
        }


        if (i % 5 == 0) {
            out += "fuzz2019";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            out += i;
        }
        return out;
    }
}
