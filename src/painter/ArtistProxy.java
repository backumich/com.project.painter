package painter;

import figures.Figure;

import java.util.ArrayList;

public class ArtistProxy implements ArtistInt {
    Artist artist;

    @Override
    public Figure setRandomFigure() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (artist == null) {
            artist = new Artist();
        }
        return artist.setRandomFigure();
    }

    @Override
    public ArrayList prepareFig(int capacity) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        if (artist == null) {
            artist = new Artist();
        }
        return artist.prepareFig(capacity);
    }

    @Override
    public void toDraw(int i) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        if (artist == null) {
            artist = new Artist();
        }
        artist.toDraw(i);
    }
}
