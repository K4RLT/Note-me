package ya;
import p5.a;
import p5.c;

import android.database.SQLException;

/* loaded from: classes.dex */
public abstract class n9 {
    public static final void a(a aVar, String str) {
        aVar.getClass();
        c T = aVar.T(str);
        try {
            T.P();
            ug.a.b(T, null);
        } finally {
        }
    }

    public static final void b(int i, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i);
        sb2.append(", message: ".concat(str));
        throw new SQLException(sb2.toString());
    }
}
