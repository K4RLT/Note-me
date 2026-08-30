package ya;
import g3.a;
import jf.b;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class x0 {
    public static void a(int i) {
        if (2 <= i && i < 37) {
            return;
        }
        StringBuilder m4 = a.m("radix ", i, " was not in valid range ");
        m4.append(new b(2, 36, 1));
        throw new IllegalArgumentException(m4.toString());
    }

    public static final boolean b(char c10, char c11, boolean z3) {
        if (c10 == c11) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static boolean c(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    public static String d(char c10, Locale locale) {
        String valueOf = String.valueOf(c10);
        valueOf.getClass();
        String upperCase = valueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() > 1) {
            if (c10 != 329) {
                char charAt = upperCase.charAt(0);
                String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return charAt + lowerCase;
            }
        } else {
            String valueOf2 = String.valueOf(c10);
            valueOf2.getClass();
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        }
        return upperCase;
    }
}
