public class MainS {
    public static void main(String[] args) {
        StackA s = new StackA(); // 1
        s.push(23); // 2
        s.push(45); // 3
        s.push(56); // 4

        System.out.println("Ukuran : " + s.size() + " => " + s.toString()); // 5

        if (s.isEmpty()) { // 6
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
        }

        int e = s.pop(); // 7
        System.out.println("Data yang di pop : " + e);

        if (s.isEmpty()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
        }

        s.push(56); // 8

        if (s.isEmpty()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
        }

        if (s.isEmpty()) { // 9
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
        }

        // 10: Cetak isi dari stack setelah perintah no 2 dijalankan
        System.out.println("\nCetak isi stack setelah push 23, 45, 56:");
        System.out.println(s.toString());
    }
}
