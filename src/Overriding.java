public class Overriding extends Overloading_Overriding{


    @Override
    public void add(int x, int y) {
        super.add(x, y);
    }

    @Override
    public void add(int x, int y, int z) {
        super.add(x, y, z);
    }

    public static void main(String[] args) {
        Overriding ov = new Overriding();
        ov.add(10,332);
        ov.add(34,322,4333);
    }
}
