package wa;
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
public abstract class v9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29839a;

    public static final e a() {
        e eVar = f29839a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.KeyboardArrowRight", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new m(8.59f, 16.59f));
        arrayList.add(new l(13.17f, 12.0f));
        arrayList.add(new l(8.59f, 7.41f));
        arrayList.add(new l(10.0f, 6.0f));
        arrayList.add(new q(6.0f, 6.0f));
        arrayList.add(new q(-6.0f, 6.0f));
        arrayList.add(new q(-1.41f, -1.41f));
        arrayList.add(i.f23278b);
        d.a(dVar, arrayList, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29839a = b10;
        return b10;
    }
}
