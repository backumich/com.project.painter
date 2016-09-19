package painter;

import figures.Figure;

import java.util.ArrayList;

public interface ArtistInt {
    Figure setRandomFigure() throws IllegalAccessException, InstantiationException, ClassNotFoundException;

    ArrayList prepareFig(int capacity) throws IllegalAccessException, ClassNotFoundException, InstantiationException;

    void toDraw(int i) throws IllegalAccessException, InstantiationException, ClassNotFoundException;
}
