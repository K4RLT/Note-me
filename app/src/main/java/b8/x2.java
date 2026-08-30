package b8;
import eb.w;
import j1.b;
import j1.e;
import k1.j0;
import k1.m0;
import k1.r;
import m.h;
import m1.d;
import p.a;
import pa.e;
import r0.n2;
import y2.c;
import y2.j;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2964u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n2 f2965v;

    public /* synthetic */ x2(n2 n2Var, int i) {
        this.f2964u = i;
        this.f2965v = n2Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f2964u) {
            case 0:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.b(((Number) this.f2965v.getValue()).floatValue());
                return pe.z.f22715a;
            case 1:
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                m0Var2.b(1.0f - ((Number) this.f2965v.getValue()).floatValue());
                return pe.z.f22715a;
            case 2:
                m0 m0Var3 = (m0) obj;
                m0Var3.getClass();
                n2 n2Var = this.f2965v;
                m0Var3.i(((Number) a.g((Number) n2Var.getValue(), m0Var3, n2Var)).floatValue());
                return pe.z.f22715a;
            case 3:
                d dVar = (d) obj;
                dVar.getClass();
                n2 n2Var2 = this.f2965v;
                if (((Number) n2Var2.getValue()).floatValue() > 0.01f) {
                    long a10 = b.a(dVar.w0(), 1, (Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) * 0.14f) + Float.intBitsToFloat((int) (dVar.w0() & 4294967295L)));
                    float c10 = 0.8f * e.c(dVar.e());
                    long j10 = kb.f2336c;
                    d.y0(dVar, new j0(qe.h(new r(r.c(j10, ((Number) n2Var2.getValue()).floatValue() * 0.36f)), new r(r.c(j10, 0.0f))), null, a10, c10, 0), c10, a10, 0.0f, null, 120);
                }
                return pe.z.f22715a;
            case 4:
                d dVar2 = (d) obj;
                dVar2.getClass();
                n2 n2Var3 = this.f2965v;
                if (((Number) n2Var3.getValue()).floatValue() > 0.0f) {
                    d.q(dVar2, w.k(qe.h(new r(r.c(pa.f2544d, ((Number) n2Var3.getValue()).floatValue())), new r(r.c(e, ((Number) n2Var3.getValue()).floatValue()))), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 0, 126);
                }
                return pe.z.f22715a;
            case 5:
                ((c) obj).getClass();
                return new j((ff.a.b(((Number) this.f2965v.getValue()).floatValue()) << 32) | (0 & 4294967295L));
            case 6:
                int intValue = ((Integer) obj).intValue();
                n2 n2Var4 = this.f2965v;
                return "recent_" + ((w7.p8) ((List) n2Var4.getValue()).get(intValue)).f28913a + "_" + ((w7.p8) ((List) n2Var4.getValue()).get(intValue)).f28914b;
            case 7:
                m0 m0Var4 = (m0) obj;
                m0Var4.getClass();
                m0Var4.b(((Number) this.f2965v.getValue()).floatValue());
                return pe.z.f22715a;
            case 8:
                m0 m0Var5 = (m0) obj;
                m0Var5.getClass();
                m0Var5.b(((Number) this.f2965v.getValue()).floatValue());
                return pe.z.f22715a;
            default:
                m0 m0Var6 = (m0) obj;
                m0Var6.getClass();
                m0Var6.b(((Number) this.f2965v.getValue()).floatValue());
                return pe.z.f22715a;
        }
    }
}
