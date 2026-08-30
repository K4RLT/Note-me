package g0;
import a1.s;
import j2.j;
import k0.e1;
import k1.o0;
import m.a;
import m2.e;
import m2.h0;
import m2.n0;
import m2.n;
import m2.p0;
import t.z0;

import java.util.List;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements df.l {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l D;
    public static final l E;
    public static final l F;
    public static final l G;
    public static final l H;
    public static final l I;
    public static final l J;

    /* renamed from: v, reason: collision with root package name */
    public static final l f17186v;

    /* renamed from: w, reason: collision with root package name */
    public static final l f17187w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f17188x;

    /* renamed from: y, reason: collision with root package name */
    public static final l f17189y;

    /* renamed from: z, reason: collision with root package name */
    public static final l f17190z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17191u;

    static {
        int i = 1;
        f17186v = new l(i, 0);
        f17187w = new l(i, 1);
        f17188x = new l(i, 2);
        f17189y = new l(i, 3);
        f17190z = new l(i, 4);
        A = new l(i, 5);
        B = new l(i, 6);
        C = new l(i, 7);
        D = new l(i, 8);
        E = new l(i, 9);
        F = new l(i, 10);
        G = new l(i, 11);
        H = new l(i, 12);
        I = new l(i, 13);
        J = new l(i, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i10) {
        super(i);
        this.f17191u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        z0 z0Var;
        n0 a10;
        h0 h0Var;
        int i = this.f17191u;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                return zVar;
            case 1:
                return zVar;
            case 2:
                return Long.valueOf(((Number) obj).longValue());
            case 3:
                return zVar;
            case 4:
                return zVar;
            case 5:
                return zVar;
            case 6:
                e1 e1Var = (e1) obj;
                long j10 = e1Var.f19268f;
                int i10 = p0.f20545c;
                return new r2.e(((int) (j10 & 4294967295L)) - a1.v((int) (4294967295L & j10), e1Var.f19269g.f20477v), 0);
            case 7:
                e1 e1Var2 = (e1) obj;
                String str = e1Var2.f19269g.f20477v;
                long j11 = e1Var2.f19268f;
                int i11 = p0.f20545c;
                int s10 = s((int) (j11 & 4294967295L), str);
                if (s10 == -1) {
                    return null;
                }
                return new r2.e(0, s10 - ((int) (4294967295L & e1Var2.f19268f)));
            case 8:
                e1 e1Var3 = (e1) obj;
                Integer e = e1Var3.e();
                if (e == null) {
                    return null;
                }
                int intValue = e.intValue();
                long j12 = e1Var3.f19268f;
                int i12 = p0.f20545c;
                return new r2.e(((int) (4294967295L & j12)) - intValue, 0);
            case 9:
                e1 e1Var4 = (e1) obj;
                Integer d2 = e1Var4.d();
                if (d2 == null) {
                    return null;
                }
                int intValue2 = d2.intValue();
                long j13 = e1Var4.f19268f;
                int i13 = p0.f20545c;
                return new r2.e(0, intValue2 - ((int) (4294967295L & j13)));
            case 10:
                e1 e1Var5 = (e1) obj;
                Integer c10 = e1Var5.c();
                if (c10 == null) {
                    return null;
                }
                int intValue3 = c10.intValue();
                long j14 = e1Var5.f19268f;
                int i14 = p0.f20545c;
                return new r2.e(((int) (4294967295L & j14)) - intValue3, 0);
            case 11:
                e1 e1Var6 = (e1) obj;
                Integer b10 = e1Var6.b();
                if (b10 == null) {
                    return null;
                }
                int intValue4 = b10.intValue();
                long j15 = e1Var6.f19268f;
                int i15 = p0.f20545c;
                return new r2.e(0, intValue4 - ((int) (4294967295L & j15)));
            case 12:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                if (((Boolean) obj2).booleanValue()) {
                    z0Var = z0.f25597u;
                } else {
                    z0Var = z0.f25598v;
                }
                Object obj3 = list.get(0);
                obj3.getClass();
                return new d2(z0Var, ((Float) obj3).floatValue());
            case 13:
                e eVar = (e) obj;
                Object obj4 = eVar.f20451a;
                if ((obj4 instanceof n) && (a10 = ((n) obj4).a()) != null && (a10.f20529a != null || a10.f20530b != null || a10.f20531c != null || a10.f20532d != null)) {
                    Object obj5 = eVar.f20451a;
                    obj5.getClass();
                    n0 a11 = ((n) obj5).a();
                    if (a11 == null || (h0Var = a11.f20529a) == null) {
                        h0Var = new h0(0L, 0L, (q2.s) null, (q2.o) null, (q2.p) null, (q2.i) null, (String) null, 0L, (x2.a) null, (x2.p) null, (t2.b) null, 0L, (x2.l) null, (o0) null, 65535);
                    }
                    return qe.a(eVar, new e(h0Var, eVar.f20452b, eVar.f20453c));
                }
                return qe.a(eVar);
            default:
                ((j) obj).k(s.f18862z, zVar);
                return zVar;
        }
    }
}
