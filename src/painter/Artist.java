package painter;

import figures.FigFactory;
import figures.Figure;

import java.util.ArrayList;
import java.util.Random;

public class Artist implements ArtistInt {
    private static final Random RANDOM = new Random();
    private static final int MAXWIDTH = 100;
    private static final int MAXHEIGHT = 100;
    private static final int MAXPOINTX = 700;
    private static final int MAXPOINTY = 700;
    public static String[] figureKinds = {"Circle", "Square", "Rectangular", "Oval"};
    public static ArrayList preparedFigures = new ArrayList();
    private static int size = figureKinds.length;

    public Figure setRandomFigure() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return FigFactory.getInstance(figureKinds[(RANDOM.nextInt(size))], RANDOM.nextInt(MAXPOINTX), RANDOM.nextInt(MAXPOINTY), RANDOM.nextInt(MAXHEIGHT), RANDOM.nextInt(MAXWIDTH));
    }

    public ArrayList prepareFig(int capacity) throws IllegalAccessException, ClassNotFoundException, InstantiationException {

        for (int i = 0; i < capacity; i++) {
            preparedFigures.add(setRandomFigure());
        }
        return preparedFigures;
    }


    public void toDraw(int figuresCapacity) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Figure figure;
        int figuresLeft;
        for (int i = 0; i < preparedFigures.size(); i++) {
            if (!preparedFigures.isEmpty()) {
                figure = (Figure) preparedFigures.remove(i);
                System.out.println("Drawing figure " + figure.getClass().getName() + " Point(x,y): " + figure.getPointX() + "," + figure.getPointY() + " Height: " + figure.getHeight() + " Width: " + figure.getWidth());
            } else {
                System.out.println("No one figures in basket, adding more...");
                figuresLeft = preparedFigures.size() - i;
                prepareFig(figuresLeft);
            }
        }
    }

}

