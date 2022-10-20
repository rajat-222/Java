public class Program4 {
    Integer instancevariable = 40;
    static Integer staticvariable = 45;

    private synchronized void nonstatic()
    {
        instancevariable = 50;
        Integer localvariable = 33;
    }

    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.instancevariable = 66;
    }
}
