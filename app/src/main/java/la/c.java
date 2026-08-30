package la;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class c {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
