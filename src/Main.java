public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        String first = "0100"; // 4
        String second = "0101"; // 5

        System.out.println("Сумма цифр в двоичном коде равна - " + binOps.sum(first,second));
        System.out.println("Произведение цифр в двоичном коде равна - " + binOps.mult(first,second));
    }
}