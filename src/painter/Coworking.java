package painter;

public class Coworking {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        int figuresCapacity = 100;
        Artist artist = new Artist();

        System.out.println("Prerare figures to draw, capacity is: " + figuresCapacity);
        artist.prepareFig(1);
        //     System.out.println(artist.preparedFigures.get(1).toString());
//        System.out.println("Drawing figures");
//        artist.toDraw(figuresCapacity);

    }


}
