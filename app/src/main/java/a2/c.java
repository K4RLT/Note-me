package a2;
import d.b;

import a0.o;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.datastore.preferences.protobuf.s1;
import b2.i0;
import b2.k1;
import b2.n0;
import b2.w0;
import c2.u0;
import c2.v0;
import com.google.android.gms.internal.ads.gl;
import d1.q;
import df.l;
import g0.d2;
import g0.e1;
import i0.r;
import i1.s;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k1.m0;
import kotlin.jvm.internal.m;
import p.a1;
import p.j1;
import pe.z;
import pf.b0;
import q1.c0;
import r.v;
import r0.f1;
import t.z0;
import y2.j;
import y2.k;
import z1.x;

/* loaded from: classes.dex */
public final class c extends m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f227u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f228v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj) {
        super(0);
        this.f227u = i;
        this.f228v = obj;
    }

    @Override // df.a
    public final Object invoke() {
        x parentLayoutCoordinates;
        boolean z3;
        switch (this.f227u) {
            case 0:
                d dVar = (d) this.f228v;
                t0.e eVar = dVar.f231c;
                t0.e eVar2 = dVar.f230b;
                t0.e eVar3 = dVar.e;
                dVar.f233f = false;
                HashSet hashSet = new HashSet();
                t0.e eVar4 = dVar.f232d;
                Object[] objArr = eVar4.f25617u;
                int i = eVar4.f25619w;
                for (int i10 = 0; i10 < i; i10++) {
                    i0 i0Var = (i0) objArr[i10];
                    g gVar = (g) eVar3.f25617u[i10];
                    q qVar = (q) i0Var.Z.A;
                    if (qVar.H) {
                        b(qVar, gVar, hashSet);
                    }
                }
                eVar4.j();
                eVar3.j();
                Object[] objArr2 = eVar2.f25617u;
                int i11 = eVar2.f25619w;
                for (int i12 = 0; i12 < i11; i12++) {
                    b2.c cVar = (b2.c) objArr2[i12];
                    g gVar2 = (g) eVar.f25617u[i12];
                    if (cVar.H) {
                        b(cVar, gVar2, hashSet);
                    }
                }
                eVar2.j();
                eVar.j();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((b2.c) it.next()).a1();
                }
                return z.f22715a;
            case 1:
                n0 n0Var = ((i0) this.f228v).f1478a0;
                n0Var.f1558p.S = true;
                w0 w0Var = n0Var.f1559q;
                if (w0Var != null) {
                    w0Var.M = true;
                }
                return z.f22715a;
            case 2:
                l lVar = (l) this.f228v;
                m0 m0Var = k1.f1522f0;
                lVar.invoke(m0Var);
                m0Var.M = m0Var.G.a(m0Var.I, m0Var.K, m0Var.J);
                return z.f22715a;
            case 3:
                File file = (File) ((o) this.f228v).invoke();
                if (!af.l.d(file).equals("preferences_pb")) {
                    s1.l("File extension for file: ", file, " does not match required extension for Preferences file: preferences_pb");
                    return null;
                }
                return file;
            case 4:
                Object obj = ((List) this.f228v).get(2);
                obj.getClass();
                return (Integer) obj;
            case 5:
                b0.g(((u0) this.f228v).f3654w, null);
                return z.f22715a;
            case 6:
                ((v0) this.f228v).f3664b = null;
                return z.f22715a;
            case 7:
                c3.x xVar = (c3.x) this.f228v;
                parentLayoutCoordinates = xVar.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.i()) {
                    parentLayoutCoordinates = null;
                }
                if (parentLayoutCoordinates != null && xVar.m199getPopupContentSizebOM6tXw() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 8:
                return (j1.c) this.f228v;
            case 9:
                ((e0.b) this.f228v).f15867c0.invoke(Boolean.valueOf(!r0.f15866b0));
                return z.f22715a;
            case 10:
                return new f6.c[((sf.g[]) this.f228v).length];
            case 11:
                return (m2.g) this.f228v;
            case 12:
                return ((e1) this.f228v).d();
            case 13:
                return new d2((z0) this.f228v, 0.0f);
            case 14:
                return new j(((k) this.f228v).c());
            case 15:
                Object systemService = ((View) ((i0.m) this.f228v).f18055w).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 16:
                return new BaseInputConnection(((r) this.f228v).f18073a, false);
            case 17:
                ((s) this.f228v).Z0();
                return z.f22715a;
            case 18:
                j0.o oVar = (j0.o) this.f228v;
                oVar.Z = null;
                b2.l.m(oVar);
                b2.l.l(oVar);
                b2.l.k(oVar);
                return Boolean.TRUE;
            case 19:
                j0.r rVar = (j0.r) this.f228v;
                rVar.T = null;
                b2.l.m(rVar);
                b2.l.l(rVar);
                b2.l.k(rVar);
                return Boolean.TRUE;
            case 20:
                k2.a aVar = (k2.a) this.f228v;
                aVar.f19541g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.a();
                    Trace.endSection();
                    return z.f22715a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case gl.zzm /* 21 */:
                ((n0.a) this.f228v).D.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return z.f22715a;
            case 22:
                b2.l.k((n0.b) this.f228v);
                return z.f22715a;
            case 23:
                ((a1) this.f228v).d();
                return z.f22715a;
            case 24:
                n.i0 i0Var2 = ((j1) this.f228v).D;
                Object[] objArr3 = i0Var2.f20893b;
                Object[] objArr4 = i0Var2.f20894c;
                long[] jArr = i0Var2.f20892a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            int i15 = 0;
                            while (true) {
                                if (i15 < i14) {
                                    if ((255 & j10) < 128) {
                                        int i16 = (i13 << 3) + i15;
                                        Object obj2 = objArr3[i16];
                                        if (!((a1) objArr4[i16]).e()) {
                                        }
                                    }
                                    j10 >>= 8;
                                    i15++;
                                } else if (i14 != 8) {
                                }
                            }
                        }
                        if (i13 != length) {
                            i13++;
                        }
                    }
                }
                return z.f22715a;
            case 25:
                return Float.valueOf(q.e.m(((pf.z) this.f228v).A()));
            case 26:
                c0 c0Var = (c0) this.f228v;
                int i17 = c0Var.f23234k;
                f1 f1Var = c0Var.f23232h;
                if (i17 == f1Var.h()) {
                    f1Var.i(f1Var.h() + 1);
                }
                return z.f22715a;
            case 27:
                ((r.d) this.f228v).P.invoke();
                return Boolean.TRUE;
            case 28:
                df.a aVar2 = ((v) this.f228v).f24151b0;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(s.d1(((r.b0) this.f228v).P));
        }
    }
}
