package painter;

public class Coworking {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        int figuresCapacity = 100;
        int drowingCapacity = 150;
        ArtistProxy artistProxy = new ArtistProxy();

        System.out.println("Prepare figures to draw, capacity is: " + figuresCapacity);
        artistProxy.prepareFig(figuresCapacity);
        System.out.println("Drawing figures:");
        artistProxy.toDraw(drowingCapacity);

    }


}
