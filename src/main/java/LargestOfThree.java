public class LargestOfThree {
    public int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        LargestOfThree obj = new LargestOfThree();
        System.out.println("Largest number = " + obj.largest(10, 30, 20));
    }
}
