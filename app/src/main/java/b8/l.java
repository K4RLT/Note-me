package b8;
import l.f;
import s.f;
import z7.l;
import b0.x;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import f0.e;
import j1.b;
import k1.l0;
import m.d;
import o0.y;
import r0.a1;
import r0.e1;
import r0.e2;
import r0.j;
import r0.l;
import r0.m;
import r0.n2;
import r0.q1;
import r0.s;
import r0.v0;
import r0.w1;
import t.m1;
import u7.m3;
import v.i;
import v1.h0;
import v1.t;
import v1.w;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.LruCache;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2341u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2342v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2343w;

    public /* synthetic */ l(kotlin.jvm.internal.y yVar, h8.f fVar) {
        this.f2341u = 3;
        h8.b bVar = h8.b.f17917u;
        this.f2342v = yVar;
        this.f2343w = fVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        boolean z3;
        boolean z9;
        int i = this.f2341u;
        int i10 = 0;
        pe.z zVar = pe.z.f22715a;
        Object obj3 = this.f2343w;
        Object obj4 = this.f2342v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o.c((Typeface) obj4, (r) obj3, (m) obj, y.L(49));
                return zVar;
            case 1:
                x5 x5Var = (x5) obj3;
                e1 e1Var = x5Var.f2975b;
                e1 e1Var2 = x5Var.f2974a;
                t tVar = (t) obj;
                b bVar = (b) obj2;
                tVar.getClass();
                tVar.a();
                float f10 = ((int) (((h0) ((w) obj4)).S >> 32)) * 0.82f * 0.5f;
                if (f10 < 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = f10 / 0.69f;
                if (f11 < 1.0f) {
                    f11 = 1.0f;
                }
                float d2 = wa.b9.d(Float.intBitsToFloat((int) (bVar.f18762a >> 32)) / f10, -0.35f, 0.35f);
                float d10 = wa.b9.d((-Float.intBitsToFloat((int) (bVar.f18762a & 4294967295L))) / f11, -0.35f, 0.35f);
                e1Var2.i(wa.b9.d(e1Var2.h() + d2, -1.0f, 1.0f));
                e1Var.i(wa.b9.d(e1Var.h() + d10, -1.0f, 1.0f));
                return zVar;
            case 2:
                Context context = (Context) obj4;
                a1 a1Var = (a1) obj3;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                if (intValue >= 3) {
                    string = null;
                } else {
                    string = context.getString(R.string.universe_seeding_progress, num, num2);
                }
                q.t tVar2 = z9.f3099a;
                a1Var.setValue(string);
                return zVar;
            case 3:
                h8.b bVar2 = h8.b.f17917u;
                ((Float) obj2).getClass();
                wa.w7.b((kotlin.jvm.internal.y) obj4, (h8.f) obj3, b.e(((t) obj).f27343c));
                return zVar;
            case 4:
                com.google.android.gms.internal.ads.hb hbVar = (com.google.android.gms.internal.ads.hb) obj4;
                e2 e2Var = (e2) obj3;
                int intValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof j) {
                    ((e) hbVar.f6654z).b((j) obj2);
                } else if (obj2 instanceof w1) {
                    w1 w1Var = (w1) obj2;
                    if (!(w1Var.f24424a instanceof o)) {
                        s.f(e2Var, intValue2, obj2);
                        hbVar.e(w1Var);
                    }
                } else if (obj2 instanceof q1) {
                    s.f(e2Var, intValue2, obj2);
                    ((q1) obj2).c();
                }
                return zVar;
            case 5:
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                ((e1) obj4).i(intValue3);
                ((e1) obj3).i(intValue4);
                return zVar;
            case 6:
                m3 m3Var = (m3) obj4;
                a1 a1Var2 = (a1) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                sf.n0 n0Var = m3Var.f26551y;
                List list = (List) n0Var.getValue();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!kotlin.jvm.internal.a(((c) it.next()).f21854a, str)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                te.c cVar = null;
                if (i10 >= 0 && !kotlin.jvm.internal.a(((c) list.get(i10)).f21855b, str2)) {
                    ArrayList arrayList = new ArrayList(list);
                    c cVar2 = (c) arrayList.get(i10);
                    String str3 = cVar2.f21854a;
                    int i11 = cVar2.f21856c;
                    str3.getClass();
                    arrayList.set(i10, new c(str3, str2, i11));
                    n0Var.k(null, arrayList);
                }
                pf.x(androidx.lifecycle.h(m3Var), null, new m1(m3Var, str, str2, cVar, 10), 3);
                a1Var2.setValue(Boolean.FALSE);
                return zVar;
            case 7:
                t tVar3 = (t) obj;
                tVar3.getClass();
                tVar3.a();
                ((e1) obj3).i((wa.b9.d(Float.intBitsToFloat((int) (tVar3.f27343c >> 32)) / ((int) (((h0) ((w) obj4)).S >> 32)), 0.0f, 1.0f) * 0.11f) + 0.02f);
                return zVar;
            case 8:
                LruCache lruCache = (LruCache) obj4;
                n2 n2Var = (n2) obj3;
                m mVar = (m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue5 & 1, z3)) {
                    w7.n4.x0((List) n2Var.getValue(), lruCache, rVar, 0);
                } else {
                    rVar.U();
                }
                return zVar;
            case 9:
                ((Integer) obj2).getClass();
                w7.n4.N0((df.a) obj4, (e) obj3, (m) obj, y.L(1));
                return zVar;
            case 10:
                a1 a1Var3 = (a1) obj4;
                a1 a1Var4 = (a1) obj3;
                m mVar2 = (m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue6 & 1, z9)) {
                    o oVar = o.f15687a;
                    r a10 = wa.a(androidx.compose.foundation.layout.d.k(oVar, 24), e.f16629a);
                    long j10 = r.f19515d;
                    r b10 = androidx.compose.foundation.a.b(a10, r.c(j10, 0.1f), l0.f19495a);
                    Object O = rVar2.O();
                    v0 v0Var = r0.l.f24285a;
                    if (O == v0Var) {
                        O = a.r(rVar2);
                    }
                    i iVar = (i) O;
                    Object O2 = rVar2.O();
                    if (O2 == v0Var) {
                        O2 = new s6(19, a1Var3, a1Var4);
                        rVar2.k0(O2);
                    }
                    r e = androidx.compose.foundation.a.e(b10, iVar, null, false, null, (df.a) O2, 28);
                    z1.p0 d11 = x.d(c.f15674y, false);
                    int hashCode = Long.hashCode(rVar2.T);
                    g l10 = rVar2.l();
                    r c10 = a.c(e, rVar2);
                    h.f1471d.getClass();
                    b0 b0Var = g.f1462b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(b0Var);
                    } else {
                        rVar2.n0();
                    }
                    y.I(g.e, d11, rVar2);
                    y.I(g.f1464d, l10, rVar2);
                    f fVar = g.f1465f;
                    if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar2, hashCode, fVar);
                    }
                    y.I(g.f1463c, c10, rVar2);
                    y.b(wa.a(), null, androidx.compose.foundation.layout.d.k(oVar, 13), j10, rVar2, 3504, 0);
                    rVar2.p(true);
                } else {
                    rVar2.U();
                }
                return zVar;
            case 11:
                ((df.q) obj4).b((Uri) obj3, (Float) obj, (Float) obj2);
                return zVar;
            case 12:
                ((Integer) obj2).getClass();
                w7.n4.z0((w7.p8) obj4, (LruCache) obj3, (m) obj, y.L(1));
                return zVar;
            case 13:
                ((df.q) obj4).b((w7.ma) obj3, (Float) obj, (Float) obj2);
                return zVar;
            case 14:
                ((df.q) obj4).b((w7.a5) obj3, (Float) obj, (Float) obj2);
                return zVar;
            case 15:
                ((df.q) obj4).b(((w7.p8) obj3).f28914b, (Float) obj, (Float) obj2);
                return zVar;
            case 16:
                ((Integer) obj2).getClass();
                w7.n4.x0((List) obj4, (LruCache) obj3, (m) obj, y.L(1));
                return zVar;
            case 17:
                ((Integer) obj2).getClass();
                w7.b(y.L(1), (r) obj3, (df.a) obj4, (m) obj);
                return zVar;
            default:
                ((Integer) obj2).getClass();
                z7.l.f((String) obj4, (String) obj3, (m) obj, y.L(1));
                return zVar;
        }
    }

    public /* synthetic */ l(Object obj, int i, Object obj2) {
        this.f2341u = i;
        this.f2342v = obj;
        this.f2343w = obj2;
    }

    public /* synthetic */ l(int i, int i10, Object obj, Object obj2) {
        this.f2341u = i10;
        this.f2342v = obj;
        this.f2343w = obj2;
    }
}
