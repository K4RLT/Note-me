package p;
import g0.e1;
import l.a;
import l.c;
import m1.d;
import q.d1;
import q.e;
import q.z;

import r0.n2;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22212u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f22213v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f22214w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, long j10, int i) {
        super(1);
        this.f22212u = i;
        this.f22213v = obj;
        this.f22214w = j10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long j10;
        z zVar;
        long j11;
        switch (this.f22212u) {
            case 0:
                d1 d1Var = (d1) obj;
                Object a10 = d1Var.a();
                o oVar = (o) this.f22213v;
                long j12 = 0;
                if (kotlin.jvm.internal.a(a10, oVar.K.a())) {
                    if (y2.c(oVar.L, androidx.compose.animation.a.f422a)) {
                        j10 = this.f22214w;
                    } else {
                        j10 = oVar.L;
                    }
                } else {
                    n2 n2Var = (n2) oVar.K.f22222c.g(d1Var.a());
                    if (n2Var != null) {
                        j10 = ((y2.l) n2Var.getValue()).f30813a;
                    } else {
                        j10 = 0;
                    }
                }
                n2 n2Var2 = (n2) oVar.K.f22222c.g(d1Var.c());
                if (n2Var2 != null) {
                    j12 = ((y2.l) n2Var2.getValue()).f30813a;
                }
                s1 s1Var = (s1) oVar.J.getValue();
                if (s1Var == null || (zVar = (z) s1Var.f22252a.invoke(new y2.l(j10), new y2.l(j12))) == null) {
                    return e.r(0.0f, 400.0f, null, 5);
                }
                return zVar;
            case 1:
                o oVar2 = (o) this.f22213v;
                if (kotlin.jvm.internal.a(obj, oVar2.K.a())) {
                    if (y2.c(oVar2.L, androidx.compose.animation.a.f422a)) {
                        j11 = this.f22214w;
                    } else {
                        j11 = oVar2.L;
                    }
                } else {
                    n2 n2Var3 = (n2) oVar2.K.f22222c.g(obj);
                    if (n2Var3 != null) {
                        j11 = ((y2.l) n2Var3.getValue()).f30813a;
                    } else {
                        j11 = 0;
                    }
                }
                return new y2.l(j11);
            default:
                d dVar = (d) obj;
                e1 e1Var = (e1) this.f22213v;
                if (((Boolean) e1Var.f17078s.getValue()).booleanValue() || ((Boolean) e1Var.f17079t.getValue()).booleanValue()) {
                    d.t(dVar, this.f22214w, 0L, 0L, 0.0f, null, 126);
                }
                return pe.z.f22715a;
        }
    }
}
