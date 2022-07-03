public class BinOps {

    public String sum(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);

        int result = x + y;

        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);

        int result = x * y;

        return Integer.toBinaryString(result);
    }
}
