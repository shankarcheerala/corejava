package core;

/**
 * Created by golagem on 10/3/17.
 */

        import java.util.Locale;
        import java.util.ResourceBundle;

public class InternationalizationDemo {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
        System.out.println("Message in " + Locale.US + ":" + bundle.getString("greeting"));

        //changing the default locale to indonasian
        Locale.setDefault(new Locale("in", "ID"));
        bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in " + Locale.getDefault() + ":" + bundle.getString("greeting"));
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

