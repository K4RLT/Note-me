package i0;
import m.h;
import q.x;

import com.google.android.gms.internal.ads.mu;
import g0.e1;
import g0.g2;
import g0.i0;
import java.util.List;
import m2.g0;
import m2.p0;
import pe.z;
import r0.i1;
import r2.b0;
import r2.x;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18045u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f18046v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, j2.j jVar) {
        super(1);
        this.f18045u = 3;
        this.f18046v = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // df.l
    public final Object invoke(Object obj) {
        z zVar;
        int i = this.f18045u;
        boolean z3 = false;
        g gVar = this.f18046v;
        switch (i) {
            case 0:
                i1 i1Var = gVar.M.f17079t;
                Boolean bool = Boolean.TRUE;
                i1Var.setValue(bool);
                gVar.M.f17078s.setValue(bool);
                g.b1(gVar, gVar.M, ((m2.g) obj).f20477v, gVar.N);
                return bool;
            case 1:
                List list = (List) obj;
                if (gVar.M.d() != null) {
                    g2 d2 = gVar.M.d();
                    d2.getClass();
                    list.add(d2.f17113a);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 2:
                g.b1(gVar, gVar.M, ((m2.g) obj).f20477v, gVar.N);
                return Boolean.TRUE;
            default:
                m2.g gVar2 = (m2.g) obj;
                if (!gVar.N) {
                    return Boolean.FALSE;
                }
                b0 b0Var = gVar.M.e;
                StringBuilder sb2 = null;
                if (b0Var != null) {
                    List h3 = qe.h(new Object(), new r2.a(gVar2, 1));
                    e1 e1Var = gVar.M;
                    mu muVar = e1Var.f17065d;
                    i0 i0Var = e1Var.f17081v;
                    x g8 = muVar.g(h3);
                    b0Var.a(null, g8);
                    i0Var.invoke(g8);
                    zVar = z.f22715a;
                } else {
                    zVar = null;
                }
                if (zVar == null) {
                    x xVar = gVar.L;
                    String str = xVar.f24515a.f20477v;
                    long j10 = xVar.f24516b;
                    int i10 = p0.f20545c;
                    int i11 = (int) (j10 >> 32);
                    int i12 = (int) (j10 & 4294967295L);
                    str.getClass();
                    gVar2.getClass();
                    if (i12 >= i11) {
                        sb2 = new StringBuilder();
                        sb2.append((CharSequence) str, 0, i11);
                        sb2.append((CharSequence) gVar2);
                        sb2.append((CharSequence) str, i12, str.length());
                    } else {
                        x.l(g3.a.j("End index (", i12, ") is less than start index (", ").", i11));
                    }
                    String obj2 = sb2.toString();
                    int length = gVar2.f20477v.length() + ((int) (gVar.L.f24516b >> 32));
                    gVar.M.f17081v.invoke(new x(obj2, g0.b(length, length), 4));
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i) {
        super(1);
        this.f18045u = i;
        this.f18046v = gVar;
    }
}
