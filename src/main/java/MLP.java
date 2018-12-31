public class MLP {
    private double[] enters;
    private double[] hidden;
    private double outer;

    private double[][] wEH; // вход - скрытый
    private double[] wHO; // скрытый - выход

    private double[][] patterns = {{0,0},{1,0},{0,1},{1,1}};
    private double[] answere = {0,1,1,0};

    public void init(){

    }

    public MLP() {
        this.enters = new double[patterns[0].length];
        this.hidden = new double[2];

        this.wEH = new double[enters.length][hidden.length];
        this.wHO =  new double[hidden.length];
    }
}
