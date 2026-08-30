package ya;
import g.b;
import l.a;
import mf.f;
import mf.g;
import qe.l;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class i0 {
    public static final boolean a(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i10++;
                    }
                    i++;
                    i11 = i12;
                } else if (i10 == 0) {
                    return kotlin.jvm.internal.a(f.I(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String b(Collection collection) {
        collection.getClass();
        if (!collection.isEmpty()) {
            return g.b(l.B(collection, ",\n", "\n", "\n", null, 56)).concat("},");
        }
        return " }";
    }

    public static final String c(Collection collection) {
        return g.b(l.B(collection, ",", null, null, null, 62)).concat(g.b(" }"));
    }

    public static final String d(Collection collection) {
        return g.b(l.B(collection, ",", null, null, null, 62)).concat(g.b("},"));
    }
}
