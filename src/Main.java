public class Main {
    public static void main(String[] args) {
        String b = "? ? ? ? ? ?\n? ? ? ? ? ?\n? ? ? 0 ? ?\n? ? ? ? ? ?\n? ? ? ? ? ?\n0 0 0 ? ? ?";
        int n = 2;
//        System.out.println(b);
//        System.out.println("-------------------");

        MineSweeper ms = new MineSweeper(b, n);
        System.out.println(ms.solve());
    }
}

// "0 2 ?\n0 2 ?";
// "? ? ? ? ? ?\n? ? ? ? ? ?\n? ? ? 0 ? ?\n? ? ? ? ? ?\n? ? ? ? ? ?\n0 0 0 ? ? ?"
