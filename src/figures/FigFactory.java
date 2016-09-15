package figures;

public class FigFactory {
    private static FigFactory ourInstance = new FigFactory();

    public static FigFactory getInstance() {
        return ourInstance;
    }

    private FigFactory() {
    }
}
