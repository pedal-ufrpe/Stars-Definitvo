package rode.utilitario;

import rode.TryCatch;

import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.ResourceBundle;

public class R {
    private static ResourceBundle bundle;
    static {
        bundle = ResourceBundle.getBundle("messages",new Locale("pt","BR"));
    }
    public static String utf8(String str){
        return new String(str.getBytes(),StandardCharsets.UTF_8);
    }
    public static String txt(String msg){
        return utf8(bundle.getString(msg));
    }

    public static void tryCatch(TryCatch tc){
        try {
            tc.acao();
        }catch (Throwable t){
            var i = t.getStackTrace().length;
            i = i > 10 ? 10 : i;
            var stacks = new StackTraceElement[i];
            System.arraycopy(t.getStackTrace(),0,stacks,0,i);
            JOptionPane.showMessageDialog(null,
                    stacks,
                    "Erro :" + t.getMessage(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
