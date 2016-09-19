package painter;

import figures.FigFactory;
import figures.Figure;

import java.util.ArrayList;
import java.util.Random;

public class Artist {
    public static String[] figureKinds = {"Circle", "Square", "Rectangular", "Oval"};
    private static int size = figureKinds.length;
    private static final Random RANDOM = new Random();
    private static final int MAXWIDTH = 100;
    private static final int MAXHEIGHT = 100;
    private static final int MAXPOINTX = 700;
    private static final int MAXPOINTY = 700;
    public static ArrayList preparedFigures = new ArrayList();

    public Figure setRandomFigure() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return FigFactory.getInstance(figureKinds[(RANDOM.nextInt(size))], RANDOM.nextInt(MAXPOINTX), RANDOM.nextInt(MAXPOINTY), RANDOM.nextInt(MAXHEIGHT), RANDOM.nextInt(MAXWIDTH));
    }

    public ArrayList prepareFig(int capacity) throws IllegalAccessException, ClassNotFoundException, InstantiationException {

        for (int i = 0; i < capacity; i++) {
            preparedFigures.add(i, setRandomFigure());
        }
        return preparedFigures;
    }


//    public void toDraw(int figuresCapacity) {
//        for (int i=0;i<preparedFigures.size();i++) {
//            System.out.println(preparedFigures.remove(i).toString());
//                    }
//        }

}

