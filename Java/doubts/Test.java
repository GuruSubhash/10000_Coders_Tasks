
class StaticExecNoMainMeth {
    static {
        System.out.println("lsdkfjhk");
    }
}
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("StaticExecNoMainMeth"); // This forces class loading
    }
}
