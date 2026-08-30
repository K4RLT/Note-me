package ya;
import j.i0;
import nf.a;
import t2.b;
import t2.c;

import android.os.LocaleList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ic {
    public static b a() {
        i0 i0Var = c.f25640a;
        i0Var.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((a) i0Var.f18638x)) {
            try {
                b bVar = (b) i0Var.f18637w;
                if (bVar != null && localeList == ((LocaleList) i0Var.f18636v)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new a(localeList.get(i)));
                }
                b bVar2 = new b(arrayList);
                i0Var.f18636v = localeList;
                i0Var.f18637w = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
