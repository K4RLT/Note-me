package p;
import f.b;
import l1.c;
import q.e;
import q.f;
import q.k1;
import q.l1;
import q.m1;
import q.r0;
import q.z;
import r0.l;
import r0.m;
import r0.r;

import r0.n2;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f22217a = e.r(0.0f, 0.0f, null, 7);

    public static final n2 a(long j10, k1 k1Var, String str, m mVar, int i, int i10) {
        z zVar = k1Var;
        if ((i10 & 2) != 0) {
            zVar = f22217a;
        }
        z zVar2 = zVar;
        if ((i10 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        r rVar = (r) mVar;
        boolean f10 = rVar.f(k1.f(j10));
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            c f11 = k1.f(j10);
            d dVar = d.f22119y;
            c0 c0Var = new c0(0, f11);
            l1 l1Var = m1.f22948a;
            l1 l1Var2 = new l1(dVar, c0Var);
            rVar.k0(l1Var2);
            O = l1Var2;
        }
        return f.b(new k1.r(j10), (l1) O, zVar2, null, str2, rVar, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
