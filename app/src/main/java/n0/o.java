package n0;
import b.c;
import l.a;
import n.q;
import p.a;

import b2.l0;
import b2.q;
import c2.x;
import com.google.android.gms.internal.ads.mf;
import j.i0;
import java.util.ArrayList;
import k1.r;
import pf.b0;
import pf.z;
import q.k1;
import q.y;
import v1.t;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21002a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21003b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21004c = q.e.a(0.0f);

    /* renamed from: d, reason: collision with root package name */
    public Object f21005d = new ArrayList();
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(boolean z3, df.a aVar) {
        this.f21002a = z3;
        this.f21003b = (kotlin.jvm.internal.m) aVar;
    }

    public void a(l0 l0Var, float f10, long j10) {
        m1.b bVar = l0Var.f1533u;
        float floatValue = ((Number) ((q.d) this.f21004c).e()).floatValue();
        if (floatValue > 0.0f) {
            long c10 = r.c(j10, floatValue);
            if (this.f21002a) {
                float d2 = j1.e.d(bVar.e());
                float b10 = j1.e.b(bVar.e());
                i0 i0Var = bVar.f20424v;
                long r8 = i0Var.r();
                i0Var.j().l();
                try {
                    ((ic.c) i0Var.f18636v).e(0.0f, 0.0f, d2, b10, 1);
                    m1.d.D(l0Var, c10, f10, 0L, null, 124);
                    return;
                } finally {
                    a.v(i0Var, r8);
                }
            }
            m1.d.D(l0Var, c10, f10, 0L, null, 124);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.m, df.a] */
    public void b(v.h hVar, z zVar) {
        float f10;
        ArrayList arrayList = (ArrayList) this.f21005d;
        boolean z3 = hVar instanceof v.f;
        if (z3) {
            arrayList.add(hVar);
        } else if (hVar instanceof v.g) {
            arrayList.remove(((v.g) hVar).f27256a);
        } else if (hVar instanceof v.d) {
            arrayList.add(hVar);
        } else if (hVar instanceof v.e) {
            arrayList.remove(((v.e) hVar).f27255a);
        } else if (hVar instanceof v.b) {
            arrayList.add(hVar);
        } else if (hVar instanceof v.c) {
            arrayList.remove(((v.c) hVar).f27254a);
        } else if (hVar instanceof v.a) {
            arrayList.remove(((v.a) hVar).f27253a);
        } else {
            return;
        }
        v.h hVar2 = (v.h) qe.l.D(arrayList);
        if (!kotlin.jvm.internal.a((v.h) this.e, hVar2)) {
            te.c cVar = null;
            if (hVar2 != null) {
                e eVar = (e) ((kotlin.jvm.internal.m) this.f21003b).invoke();
                if (z3) {
                    f10 = eVar.f20978c;
                } else if (hVar instanceof v.d) {
                    f10 = eVar.f20977b;
                } else if (hVar instanceof v.b) {
                    f10 = eVar.f20976a;
                } else {
                    f10 = 0.0f;
                }
                k1 k1Var = j.f20992a;
                if (!(hVar2 instanceof v.f)) {
                    if (hVar2 instanceof v.d) {
                        k1Var = new k1(45, y.f23034d, 2);
                    } else if (hVar2 instanceof v.b) {
                        k1Var = new k1(45, y.f23034d, 2);
                    }
                }
                b0.x(zVar, null, new n(this, f10, k1Var, (te.c) null), 3);
            } else {
                v.h hVar3 = (v.h) this.e;
                k1 k1Var2 = j.f20992a;
                if (!(hVar3 instanceof v.f) && !(hVar3 instanceof v.d) && (hVar3 instanceof v.b)) {
                    k1Var2 = new k1(150, y.f23034d, 2);
                }
                b0.x(zVar, null, new l5.a(this, k1Var2, cVar, 2), 3);
            }
            this.e = hVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c(j6.l lVar, x xVar, boolean z3) {
        Object[] objArr;
        int i;
        int i10;
        v1.e eVar = (v1.e) this.f21004c;
        q qVar = (q) this.e;
        if (this.f21002a) {
            return 0;
        }
        try {
            this.f21002a = true;
            mf k3 = ((u.c) this.f21005d).k(lVar, xVar);
            q qVar2 = (q) k3.f8337v;
            int f10 = qVar2.f();
            for (int i11 = 0; i11 < f10; i11++) {
                t tVar = (t) qVar2.g(i11);
                if (!tVar.f27344d && !tVar.f27347h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int f11 = qVar2.f();
            for (int i12 = 0; i12 < f11; i12++) {
                t tVar2 = (t) qVar2.g(i12);
                if (objArr != false || v1.r.b(tVar2)) {
                    ((b2.i0) this.f21003b).A(tVar2.f27343c, (q) this.e, tVar2.i, true);
                    if (!qVar.f1578u.g()) {
                        eVar.a(tVar2.f27341a, qVar, v1.r.b(tVar2));
                        qVar.clear();
                    }
                }
            }
            boolean b10 = eVar.b(k3, z3);
            if (!k3.f8336u) {
                int f12 = qVar2.f();
                for (int i13 = 0; i13 < f12; i13++) {
                    t tVar3 = (t) qVar2.g(i13);
                    if (!j1.c(v1.r.g(tVar3, true), 0L) && tVar3.f()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int f13 = qVar2.f();
            int i14 = 0;
            while (true) {
                if (i14 < f13) {
                    if (((t) qVar2.g(i14)).f()) {
                        i10 = 1;
                        break;
                    }
                    i14++;
                } else {
                    i10 = 0;
                    break;
                }
            }
            int i15 = (b10 ? 1 : 0) | (i << 1) | (i10 << 2);
            this.f21002a = false;
            return i15;
        } catch (Throwable th) {
            this.f21002a = false;
            throw th;
        }
    }
}
