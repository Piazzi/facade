public class BackEnd  extends Compiler {

    private static BackEnd backEnd = new BackEnd();

    private BackEnd(){};

    public static BackEnd getInstance() {
        return backEnd;
    }
}
