public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(); // 1

        s.push(23); // 2
        s.push(45); // 3
        s.push(56); // 4

        System.out.println("Ukuran : " + s.size() + " => " + s.toStringAtasKeBawah()); // 5
        System.out.println("Data sudah habis");
        if (s.isEmpty()) { // 6
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toStringAtasKeBawah());
        }
        int e = s.pop(); // 7
        System.out.println("Data yang di pop : " + e);

        if (s.isEmpty()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toStringAtasKeBawah());
            s.push(56);
        }
        // 8
        if (s.isEmpty()) {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toStringAtasKeBawah());
        }
        if (s.isEmpty()) { // 9
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toStringAtasKeBawah());
        }
    }
}
