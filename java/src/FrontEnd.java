public class FrontEnd  extends Compiler {

    private static FrontEnd frontEnd = new FrontEnd();

    private FrontEnd(){};

    public static FrontEnd getInstance() {
        return frontEnd;
    }
}
