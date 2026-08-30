package wa;
import d.a;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.i;
import q1.l;
import q1.m;
import q1.q;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29804a;

    public static final e a() {
        e eVar = f29804a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.Done", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new m(9.0f, 16.2f));
        arrayList.add(new l(4.8f, 12.0f));
        arrayList.add(new q(-1.4f, 1.4f));
        arrayList.add(new l(9.0f, 19.0f));
        arrayList.add(new l(21.0f, 7.0f));
        arrayList.add(new q(-1.4f, -1.4f));
        arrayList.add(new l(9.0f, 16.2f));
        arrayList.add(i.f23278b);
        d.a(dVar, arrayList, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29804a = b10;
        return b10;
    }
}
