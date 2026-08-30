package b8;
import e1.j;
import k1.f;
import p7.e0;
import p7.g0;
import r0.l;
import r0.m;
import r0.r;
import y2.a;
import z.b;

import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class e8 implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2033u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2034v;

    public /* synthetic */ e8(yf.c cVar, yf.b bVar) {
        this.f2033u = 5;
        this.f2034v = cVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        int h3;
        int g8;
        int i;
        boolean z9;
        switch (this.f2033u) {
            case 0:
                g4 g4Var = (g4) this.f2034v;
                f fVar = (f) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (fVar != null) {
                    r rVar = (r) mVar;
                    rVar.a0(1493431680);
                    ya.wa.b(fVar, null, androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.d.f506c, 4), z1.n.f31849b, rVar, (intValue & 14) | 25008, 232);
                    rVar.p(false);
                } else {
                    r rVar2 = (r) mVar;
                    rVar2.a0(1493798007);
                    j(0.0f, 6, 4, g4Var.f2118b, androidx.compose.foundation.layout.d.f506c, rVar2);
                    rVar2.p(false);
                }
                return pe.z.f22715a;
            case 1:
                e0 e0Var = (e0) this.f2034v;
                androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                m mVar2 = (m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                cVar.getClass();
                long j10 = cVar.f503b;
                if ((intValue2 & 6) == 0) {
                    if (((r) mVar2).f(cVar)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar3 = (r) mVar2;
                if (rVar3.R(intValue2 & 1, z3)) {
                    if (a.d(j10) && a.c(j10) && 1 <= (h3 = a.h(j10)) && h3 < 8193 && 1 <= (g8 = a.g(j10)) && g8 < 8193) {
                        rVar3.a0(780935543);
                        boolean h10 = rVar3.h(e0Var);
                        Object O = rVar3.O();
                        if (h10 || O == l.f24285a) {
                            O = new g0(e0Var, 0);
                            rVar3.k0(O);
                        }
                        androidx.compose.ui.viewinterop.a.b((df.l) O, androidx.compose.foundation.layout.d.f506c, null, rVar3, 48, 4);
                    } else {
                        rVar3.a0(730358268);
                    }
                    rVar3.p(false);
                } else {
                    rVar3.U();
                }
                return pe.z.f22715a;
            case 2:
                ((w7.k8) this.f2034v).invoke((Throwable) obj);
                return pe.z.f22715a;
            case 3:
                df.a aVar = (df.a) this.f2034v;
                m mVar3 = (m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((b) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar4 = (r) mVar3;
                if (rVar4.R(intValue3 & 1, z9)) {
                    w7.n4.N0(aVar, null, rVar4, 0);
                } else {
                    rVar4.U();
                }
                return pe.z.f22715a;
            case 4:
                Uri uri = (Uri) obj;
                uri.getClass();
                ((w7.h0) this.f2034v).b(uri, (Float) obj2, (Float) obj3);
                return pe.z.f22715a;
            case 5:
                yf.c cVar2 = (yf.c) this.f2034v;
                yf.c.B.set(cVar2, null);
                cVar2.j(null);
                return pe.z.f22715a;
            default:
                ((yf.g) this.f2034v).b();
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ e8(int i, Object obj) {
        this.f2033u = i;
        this.f2034v = obj;
    }
}
