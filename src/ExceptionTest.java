public class ExceptionTest {
    public static void main(String[] args) {

        try {
            getExceptionB();
        } catch (ExA exa) {
            exa.printStackTrace();
        }

        try {
            getExceptionC();
        } catch (ExA exa) {
            exa.printStackTrace();
        }

    }

    public static void getExceptionB() throws ExB {
        throw new ExB("Exception B");
    }

    public static void getExceptionC() throws ExC {
        throw new ExC("Exception C");
    }
}
