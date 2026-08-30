package c;
import a.a;
import b0.g;
import c.h;
import n.j0;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b2.f1;
import b2.g2;
import k0.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 extends kotlin.jvm.internal.j implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3230u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i, i10, cls, obj, str, str2);
        this.f3230u = i11;
    }

    @Override // df.a
    public final Object invoke() {
        ContentCaptureSession a10;
        f1 f1Var;
        char c10;
        char c11;
        switch (this.f3230u) {
            case 0:
                ((g0) this.receiver).e();
                return pe.z.f22715a;
            case 1:
                ((g0) this.receiver).e();
                return pe.z.f22715a;
            case 2:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    f2.h(view);
                }
                if (i >= 29 && (a10 = f2.a(view)) != null) {
                    return new j6.e(a10, view);
                }
                return null;
            case 3:
                g5.v vVar = (g5.v) this.receiver;
                uf.c cVar = vVar.f17535a;
                if (cVar != null) {
                    pf.g(cVar, null);
                    vVar.j();
                    g5.p pVar = vVar.e;
                    if (pVar != null) {
                        pVar.f17510f.close();
                        q5.b bVar = pVar.f17511g;
                        if (bVar != null) {
                            bVar.close();
                        }
                        return pe.z.f22715a;
                    }
                    kotlin.jvm.internal.l.h("connectionManager");
                    throw null;
                }
                kotlin.jvm.internal.l.h("coroutineScope");
                throw null;
            case 4:
                i1.g gVar = (i1.g) this.receiver;
                j0 j0Var = gVar.f18103c;
                j0 j0Var2 = gVar.f18104d;
                i1.j jVar = gVar.f18101a;
                i1.s sVar = jVar.f18112h;
                i1.r rVar = i1.r.f18133x;
                if (sVar == null) {
                    Object[] objArr = j0Var2.f20899b;
                    long[] jArr = j0Var2.f20898a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        char c12 = 7;
                        while (true) {
                            long j10 = jArr[i10];
                            if ((((~j10) << c12) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j10 & 255) < 128) {
                                        c11 = c12;
                                        ((i1.e) objArr[(i10 << 3) + i12]).L0(rVar);
                                    } else {
                                        c11 = c12;
                                    }
                                    j10 >>= 8;
                                    i12++;
                                    c12 = c11;
                                }
                                c10 = c12;
                                if (i11 != 8) {
                                }
                            } else {
                                c10 = c12;
                            }
                            if (i10 != length) {
                                i10++;
                                c12 = c10;
                            }
                        }
                    }
                } else if (sVar.H) {
                    if (j0Var.c(sVar)) {
                        sVar.b1();
                    }
                    i1.r a12 = sVar.a1();
                    if (!sVar.f15688u.H) {
                        y1.a.b("visitAncestors called on an unattached node");
                    }
                    d1.q qVar = sVar.f15688u;
                    b2.i0 u9 = b2.l.u(sVar);
                    int i13 = 0;
                    while (u9 != null) {
                        if ((((d1.q) u9.Z.A).f15691x & 5120) != 0) {
                            while (qVar != null) {
                                int i14 = qVar.f15690w;
                                if ((i14 & 5120) != 0) {
                                    if ((i14 & 1024) != 0) {
                                        i13++;
                                    }
                                    if ((qVar instanceof i1.e) && j0Var2.c(qVar)) {
                                        if (i13 <= 1) {
                                            ((i1.e) qVar).L0(a12);
                                        } else {
                                            ((i1.e) qVar).L0(i1.r.f18131v);
                                        }
                                        j0Var2.l(qVar);
                                    }
                                }
                                qVar = qVar.f15692y;
                            }
                        }
                        u9 = u9.v();
                        if (u9 != null && (f1Var = u9.Z) != null) {
                            qVar = (g2) f1Var.f1460z;
                        } else {
                            qVar = null;
                        }
                    }
                    Object[] objArr2 = j0Var2.f20899b;
                    long[] jArr2 = j0Var2.f20898a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr2[i15];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & 255) < 128) {
                                        ((i1.e) objArr2[(i15 << 3) + i17]).L0(rVar);
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                }
                            }
                            if (i15 != length2) {
                                i15++;
                            }
                        }
                    }
                }
                if (jVar.f18112h == null || jVar.f18108c.a1() == rVar) {
                    jVar.d();
                }
                j0Var.b();
                j0Var2.b();
                gVar.e = false;
                return pe.z.f22715a;
            case 5:
                t0 t0Var = (t0) this.receiver;
                t0Var.b();
                t0Var.i();
                return pe.z.f22715a;
            default:
                ((t0) this.receiver).k();
                return pe.z.f22715a;
        }
    }
}
