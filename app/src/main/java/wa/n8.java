package wa;
import m2.e;
import m2.g;
import m2.h;
import m2.n;

import java.util.List;

/* loaded from: classes.dex */
public abstract class n8 {
    public static final boolean a(g gVar) {
        int length = gVar.f20477v.length();
        List list = gVar.f20476u;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                e eVar = (e) list.get(i);
                if ((eVar.f20451a instanceof n) && h.b(0, length, eVar.f20452b, eVar.f20453c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
