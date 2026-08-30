package f1;
import d.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import c.f0;
import c2.m2;
import c2.x;
import com.google.android.gms.internal.ads.uv1;
import com.google.android.gms.internal.ads.wd0;
import df.p;
import j2.n;
import j2.o;
import j2.q;
import j2.s;
import j2.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m2.g;
import n.i0;
import n.k;
import n.l;
import n.w;
import rf.h;
import wa.l6;
import ya.jb;

/* loaded from: classes.dex */
public final class d implements androidx.lifecycle.f, View.OnAttachStateChangeListener {
    public w D;
    public long E;
    public final w F;
    public m2 G;
    public boolean H;
    public final a6.e I;

    /* renamed from: u, reason: collision with root package name */
    public final x f16637u;

    /* renamed from: v, reason: collision with root package name */
    public final f0 f16638v;

    /* renamed from: w, reason: collision with root package name */
    public j6.e f16639w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f16640x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final long f16641y = 100;

    /* renamed from: z, reason: collision with root package name */
    public a f16642z = a.f16630u;
    public boolean A = true;
    public final h B = jb.a(1, 6, null);
    public final Handler C = new Handler(Looper.getMainLooper());

    public d(x xVar, f0 f0Var) {
        this.f16637u = xVar;
        this.f16638v = f0Var;
        w wVar = l.f20912a;
        wVar.getClass();
        this.D = wVar;
        this.F = new w();
        this.G = new m2(xVar.getSemanticsOwner().a(), wVar);
        this.I = new a6.e(9, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (pf.b0.j(r7.f16641y, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ve.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f1.c
            if (r0 == 0) goto L13
            r0 = r8
            f1.c r0 = (f1.c) r0
            int r1 = r0.f16636x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16636x = r1
            goto L18
        L13:
            f1.c r0 = new f1.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f16634v
            int r1 = r0.f16636x
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            rf.c r1 = r0.f16633u
            pe.a.e(r8)
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r8)
            r8 = 0
            return r8
        L33:
            rf.c r1 = r0.f16633u
            pe.a.e(r8)
            goto L51
        L39:
            pe.a.e(r8)
            rf.h r8 = r7.B
            r8.getClass()
            rf.c r1 = new rf.c
            r1.<init>(r8)
        L46:
            r0.f16633u = r1
            r0.f16636x = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L51
            goto L7e
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r1.c()
            boolean r8 = r7.e()
            if (r8 == 0) goto L65
            r7.g()
        L65:
            boolean r8 = r7.H
            if (r8 != 0) goto L72
            r7.H = r3
            android.os.Handler r8 = r7.C
            a6.e r5 = r7.I
            r8.post(r5)
        L72:
            r0.f16633u = r1
            r0.f16636x = r2
            long r5 = r7.f16641y
            java.lang.Object r8 = pf.b0.j(r5, r0)
            if (r8 != r4) goto L46
        L7e:
            return r4
        L7f:
            pe.z r8 = pe.z.f22715a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.a(ve.c):java.lang.Object");
    }

    public final void b(k kVar) {
        int[] iArr;
        int[] iArr2;
        long j10;
        char c10;
        long j11;
        int i;
        int i10;
        n nVar;
        long j12;
        g gVar;
        g gVar2;
        long j13;
        g gVar3;
        k kVar2 = kVar;
        int[] iArr3 = kVar2.f20903b;
        long[] jArr = kVar2.f20902a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j14 = jArr[i11];
                char c11 = 7;
                long j15 = -9187201950435737472L;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j14 & 255) < 128) {
                            int i15 = iArr3[(i11 << 3) + i14];
                            c10 = c11;
                            m2 m2Var = (m2) this.F.b(i15);
                            o oVar = (o) kVar2.b(i15);
                            if (oVar != null) {
                                nVar = oVar.f18826a;
                            } else {
                                nVar = null;
                            }
                            if (nVar != null) {
                                j11 = j15;
                                int i16 = nVar.f18825g;
                                i0 i0Var = nVar.f18823d.f18813u;
                                if (m2Var == null) {
                                    Object[] objArr = i0Var.f20893b;
                                    long[] jArr2 = i0Var.f20892a;
                                    int length2 = jArr2.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i17 = i12;
                                        int i18 = 0;
                                        while (true) {
                                            long j16 = jArr2[i18];
                                            j10 = j14;
                                            if ((((~j16) << c10) & j16 & j11) != j11) {
                                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                for (int i20 = 0; i20 < i19; i20++) {
                                                    if ((j16 & 255) < 128) {
                                                        j13 = j16;
                                                        v vVar = (v) objArr[(i18 << 3) + i20];
                                                        v vVar2 = s.A;
                                                        if (kotlin.jvm.internal.l.a(vVar, vVar2)) {
                                                            Object g8 = i0Var.g(vVar2);
                                                            if (g8 == null) {
                                                                g8 = null;
                                                            }
                                                            List list = (List) g8;
                                                            if (list != null) {
                                                                gVar3 = (g) qe.l.x(list);
                                                            } else {
                                                                gVar3 = null;
                                                            }
                                                            i(i16, String.valueOf(gVar3));
                                                        }
                                                    } else {
                                                        j13 = j16;
                                                    }
                                                    j16 = j13 >> i17;
                                                }
                                                if (i19 != i17) {
                                                    break;
                                                }
                                            }
                                            if (i18 == length2) {
                                                break;
                                            }
                                            i18++;
                                            j14 = j10;
                                            i17 = 8;
                                        }
                                    } else {
                                        j10 = j14;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j10 = j14;
                                    Object[] objArr2 = i0Var.f20893b;
                                    long[] jArr3 = i0Var.f20892a;
                                    int length3 = jArr3.length - 2;
                                    if (length3 >= 0) {
                                        long[] jArr4 = jArr3;
                                        int i21 = 0;
                                        while (true) {
                                            long j17 = jArr4[i21];
                                            long[] jArr5 = jArr4;
                                            i = i14;
                                            if ((((~j17) << c10) & j17 & j11) != j11) {
                                                int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                                int i23 = 0;
                                                while (i23 < i22) {
                                                    if ((j17 & 255) < 128) {
                                                        j12 = j17;
                                                        v vVar3 = (v) objArr2[(i21 << 3) + i23];
                                                        v vVar4 = s.A;
                                                        if (kotlin.jvm.internal.l.a(vVar3, vVar4)) {
                                                            Object g10 = m2Var.f3578a.f18813u.g(vVar4);
                                                            if (g10 == null) {
                                                                g10 = null;
                                                            }
                                                            List list2 = (List) g10;
                                                            if (list2 != null) {
                                                                gVar = (g) qe.l.x(list2);
                                                            } else {
                                                                gVar = null;
                                                            }
                                                            Object g11 = i0Var.g(vVar4);
                                                            if (g11 == null) {
                                                                g11 = null;
                                                            }
                                                            List list3 = (List) g11;
                                                            if (list3 != null) {
                                                                gVar2 = (g) qe.l.x(list3);
                                                            } else {
                                                                gVar2 = null;
                                                            }
                                                            if (!kotlin.jvm.internal.l.a(gVar, gVar2)) {
                                                                i(i16, String.valueOf(gVar2));
                                                            }
                                                        }
                                                    } else {
                                                        j12 = j17;
                                                    }
                                                    i23++;
                                                    j17 = j12 >> 8;
                                                }
                                                if (i22 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i21 == length3) {
                                                break;
                                            }
                                            i21++;
                                            i14 = i;
                                            jArr4 = jArr5;
                                        }
                                        i10 = 8;
                                    }
                                }
                                i = i14;
                                i10 = 8;
                            } else {
                                throw wd0.m("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            j10 = j14;
                            c10 = c11;
                            j11 = j15;
                            i = i14;
                            i10 = i12;
                        }
                        j14 = j10 >> i10;
                        i14 = i + 1;
                        i12 = i10;
                        c11 = c10;
                        j15 = j11;
                        iArr3 = iArr2;
                        kVar2 = kVar;
                    }
                    iArr = iArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i11 != length) {
                    i11++;
                    kVar2 = kVar;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void c(n nVar, p pVar) {
        nVar.getClass();
        List j10 = n.j(4, nVar);
        int size = j10.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = j10.get(i10);
            if (d().a(((n) obj).f18825g)) {
                pVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final k d() {
        if (this.A) {
            this.A = false;
            this.D = q.b(this.f16637u.getSemanticsOwner());
            this.E = System.currentTimeMillis();
        }
        return this.D;
    }

    public final boolean e() {
        if (this.f16639w != null) {
            return true;
        }
        return false;
    }

    public final void g() {
        j6.e eVar = this.f16639w;
        if (eVar != null) {
            Object obj = eVar.f18918u;
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f16640x;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        e eVar2 = (e) arrayList.get(i);
                        int ordinal = eVar2.f16645c.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                AutofillId i10 = eVar.i(eVar2.f16643a);
                                if (i10 != null && Build.VERSION.SDK_INT >= 29) {
                                    f2.a.f(uv1.k(obj), i10);
                                }
                            } else {
                                l4.a.o();
                                return;
                            }
                        } else {
                            pd.c cVar = eVar2.f16646d;
                            if (cVar != null) {
                                ViewStructure viewStructure = (ViewStructure) cVar.f22681u;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    f2.a.e(uv1.k(obj), viewStructure);
                                }
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentCaptureSession k3 = uv1.k(obj);
                        z5.h a10 = l6.a((View) eVar.f18919v);
                        Objects.requireNonNull(a10);
                        f2.a.h(k3, ed.h.m(a10.f31922v), new long[]{Long.MIN_VALUE});
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final void h(n nVar, m2 m2Var) {
        c(nVar, new a0.g(m2Var, 8, this));
        List j10 = n.j(4, nVar);
        int size = j10.size();
        for (int i = 0; i < size; i++) {
            n nVar2 = (n) j10.get(i);
            k d2 = d();
            int i10 = nVar2.f18825g;
            if (d2.a(i10)) {
                w wVar = this.F;
                if (wVar.a(i10)) {
                    Object b10 = wVar.b(i10);
                    if (b10 != null) {
                        h(nVar2, (m2) b10);
                    } else {
                        throw wd0.m("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void i(int i, String str) {
        j6.e eVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && (eVar = this.f16639w) != null) {
            AutofillId i11 = eVar.i(i);
            if (i11 != null) {
                if (i10 >= 29) {
                    f2.a.g(uv1.k(eVar.f18918u), i11, str);
                    return;
                }
                return;
            }
            throw wd0.m("Invalid content capture ID");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r7 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r18, j2.n r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.d.j(int, j2.n):void");
    }

    public final void l(n nVar) {
        if (e()) {
            this.f16640x.add(new e(nVar.f18825g, this.E, f.f16648v, null));
            List j10 = n.j(4, nVar);
            int size = j10.size();
            for (int i = 0; i < size; i++) {
                l((n) j10.get(i));
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void m(androidx.lifecycle.w wVar) {
        l(this.f16637u.getSemanticsOwner().a());
        g();
        this.f16639w = null;
    }

    public final void n() {
        w wVar = this.F;
        wVar.c();
        k d2 = d();
        int[] iArr = d2.f20903b;
        Object[] objArr = d2.f20904c;
        long[] jArr = d2.f20902a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            int i12 = (i << 3) + i11;
                            wVar.i(iArr[i12], new m2(((o) objArr[i12]).f18826a, d()));
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.G = new m2(this.f16637u.getSemanticsOwner().a(), d());
    }

    @Override // androidx.lifecycle.f
    public final void o(androidx.lifecycle.w wVar) {
        this.f16639w = (j6.e) this.f16638v.invoke();
        j(-1, this.f16637u.getSemanticsOwner().a());
        g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C.removeCallbacks(this.I);
        this.f16639w = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
