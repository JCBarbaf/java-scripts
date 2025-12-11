//Java program that gives the necessary instructions to resolve the towers of hanoi puzzle in the least amount of movements
//Made to practice recursivity
public class hanoiTowers {
    static int counter = 0;
    public static void main(String[] args) {
        towers(5, "a", "b", "c");
        System.out.println(counter);
    }
    public static void towers(int disc_number,String orig, String aux, String dest) {
        if (disc_number == 1) {
            System.out.println(orig + " -> " + dest);
            counter++;
            return;
        }
        towers(disc_number -1 , orig, dest, aux);
        System.out.println(orig + " -> " + dest);
        counter++;
        towers(disc_number -1 , aux, orig, dest);
    }
}
