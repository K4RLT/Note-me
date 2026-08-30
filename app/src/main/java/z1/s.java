package z1;
import b1.p;
import b1.v;
import h1.h;
import j.f;
import l.a;
import n.d0;
import n.i0;
import n.j0;
import n.w;
import p.d;
import r0.a1;
import r0.f1;
import r0.y;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.ads.zb1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends zb1 implements Runnable, q3.d, View.OnAttachStateChangeListener {
    public final f1 A;
    public final d0 B;
    public final v C;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31883w;

    /* renamed from: x, reason: collision with root package name */
    public int f31884x;

    /* renamed from: y, reason: collision with root package name */
    public q3.q0 f31885y;

    /* renamed from: z, reason: collision with root package name */
    public final i0 f31886z;

    public s() {
        super(1);
        i0 i0Var = new i0(9);
        p1.f31863a.getClass();
        i0Var.m(o1.f31854b, new r1("caption bar"));
        i0Var.m(o1.f31855c, new r1("display cutout"));
        i0Var.m(o1.f31856d, new r1("ime"));
        i0Var.m(o1.e, new r1("mandatory system gestures"));
        i0Var.m(o1.f31857f, new r1("navigation bars"));
        i0Var.m(o1.f31858g, new r1("status bars"));
        i0Var.m(o1.f31859h, new r1("system gestures"));
        i0Var.m(o1.i, new r1("tappable element"));
        i0Var.m(o1.f31860j, new r1("waterfall"));
        this.f31886z = i0Var;
        this.A = new f1(0);
        this.B = new d0(4);
        this.C = new v();
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final void a(q3.a0 a0Var) {
        boolean z3 = false;
        this.f31883w = false;
        int d2 = a0Var.f23378a.d();
        this.f31884x &= ~d2;
        this.f31885y = null;
        p1 p1Var = (p1) androidx.compose.ui.layout.b.f639c.b(d2);
        if (p1Var != null) {
            Object g8 = this.f31886z.g(p1Var);
            g8.getClass();
            r1 r1Var = (r1) g8;
            r1Var.f31876c.i(0.0f);
            r1Var.e.i(1.0f);
            r1Var.f31877d.i(0L);
            r1Var.f31876c.i(0.0f);
            r1Var.f31875b.setValue(Boolean.FALSE);
            r1Var.f31881j = -1L;
            r1Var.f31882k = -1L;
            f1 f1Var = this.A;
            f1Var.i(f1Var.h() + 1);
            synchronized (p.f1387c) {
                j0 j0Var = p.f1392j.f1323h;
                if (j0Var != null) {
                    if (j0Var.h()) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                p.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final void b() {
        this.f31883w = true;
    }

    @Override // q3.d
    public final q3.q0 c(View view, q3.q0 q0Var) {
        if (this.f31883w) {
            this.f31885y = q0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return q0Var;
            }
        } else if (this.f31884x == 0) {
            j(q0Var);
        }
        return q0Var;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final q3.q0 d(q3.q0 q0Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q3.a0 a0Var = (q3.a0) list.get(i);
            p1 p1Var = (p1) androidx.compose.ui.layout.b.f639c.b(a0Var.f23378a.d());
            if (p1Var != null) {
                Object g8 = this.f31886z.g(p1Var);
                g8.getClass();
                r1 r1Var = (r1) g8;
                if (((Boolean) r1Var.f31875b.getValue()).booleanValue()) {
                    q3.z zVar = a0Var.f23378a;
                    r1Var.f31876c.i(zVar.c());
                    r1Var.e.i(zVar.a());
                    r1Var.f31877d.i(zVar.b());
                }
            }
        }
        j(q0Var);
        return q0Var;
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final j6.l e(q3.a0 a0Var, j6.l lVar) {
        q3.q0 q0Var = this.f31885y;
        boolean z3 = false;
        this.f31883w = false;
        this.f31885y = null;
        if (a0Var.f23378a.b() > 0 && q0Var != null) {
            int d2 = a0Var.f23378a.d();
            this.f31884x |= d2;
            p1 p1Var = (p1) androidx.compose.ui.layout.b.f639c.b(d2);
            if (p1Var != null) {
                Object g8 = this.f31886z.g(p1Var);
                g8.getClass();
                r1 r1Var = (r1) g8;
                j3.c g10 = q0Var.f23423a.g(d2);
                long j10 = (g10.f18874a << 48) | (g10.f18875b << 32) | (g10.f18876c << 16) | g10.f18877d;
                long j11 = r1Var.f31880h;
                if (!h(j10, j11)) {
                    r1Var.f31881j = j11;
                    r1Var.f31882k = j10;
                    r1Var.f31875b.setValue(Boolean.TRUE);
                    q3.z zVar = a0Var.f23378a;
                    r1Var.f31876c.i(zVar.c());
                    r1Var.e.i(zVar.a());
                    r1Var.f31877d.i(zVar.b());
                    f1 f1Var = this.A;
                    f1Var.i(f1Var.h() + 1);
                    synchronized (p.f1387c) {
                        j0 j0Var = p.f1392j.f1323h;
                        if (j0Var != null) {
                            if (j0Var.h()) {
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        p.a();
                        return lVar;
                    }
                }
            }
        }
        return lVar;
    }

    public final void j(q3.q0 q0Var) {
        char c10;
        char c11;
        char c12;
        char c13;
        long j10;
        boolean z3;
        boolean z9;
        boolean z10;
        long j11;
        int i;
        int i10;
        int i11;
        int i12;
        long j12;
        List list;
        boolean z11;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i13;
        w wVar = androidx.compose.ui.layout.b.f637a;
        int[] iArr5 = wVar.f20903b;
        Object[] objArr = wVar.f20904c;
        long[] jArr5 = wVar.f20902a;
        int length = jArr5.length - 2;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            z9 = false;
            z10 = false;
            c10 = 7;
            c11 = 16;
            c12 = ' ';
            while (true) {
                long j13 = jArr5[i15];
                c13 = '0';
                j10 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j13 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            int i19 = iArr5[i18];
                            p1 p1Var = (p1) objArr[i18];
                            i13 = i14;
                            j3.c g8 = q0Var.f23423a.g(i19);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j14 = (g8.f18875b << 32) | (g8.f18874a << 48) | (g8.f18876c << 16) | g8.f18877d;
                            Object g10 = this.f31886z.g(p1Var);
                            g10.getClass();
                            r1 r1Var = (r1) g10;
                            if (!h(j14, r1Var.f31880h)) {
                                r1Var.f31880h = j14;
                                z9 = true;
                                if (!h(j14, 0L)) {
                                    z10 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i13 = i14;
                        }
                        j13 >>= i13;
                        i17++;
                        i14 = i13;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z3 = true;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z3 = true;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i14 = 8;
            }
        } else {
            c10 = 7;
            c11 = 16;
            c12 = ' ';
            c13 = '0';
            j10 = -9187201950435737472L;
            z3 = true;
            z9 = false;
            z10 = false;
        }
        w wVar2 = androidx.compose.ui.layout.b.f639c;
        int[] iArr6 = wVar2.f20903b;
        Object[] objArr2 = wVar2.f20904c;
        long[] jArr6 = wVar2.f20902a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j15 = jArr6[i20];
                if ((((~j15) << c10) & j15 & j10) != j10) {
                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                    int i22 = 0;
                    while (i22 < i21) {
                        if ((j15 & 255) < 128) {
                            int i23 = (i20 << 3) + i22;
                            int i24 = iArr6[i23];
                            Object g11 = this.f31886z.g((p1) objArr2[i23]);
                            g11.getClass();
                            r1 r1Var2 = (r1) g11;
                            if (i24 != 8) {
                                j3.c h3 = q0Var.f23423a.h(i24);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j16 = (h3.f18875b << c12) | (h3.f18874a << c13) | (h3.f18876c << c11) | h3.f18877d;
                                if (!h(r1Var2.i, j16)) {
                                    r1Var2.i = j16;
                                    z9 = z3;
                                    if (!h(j16, 0L)) {
                                        z10 = z9;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            r1Var2.f31874a.setValue(Boolean.valueOf(q0Var.f23423a.q(i24)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j15 >>= 8;
                        i22++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i21 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i20 == length2) {
                    break;
                }
                i20++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        q3.c f10 = q0Var.f23423a.f();
        if (f10 == null) {
            j11 = 0;
        } else {
            j3.c a10 = f10.a();
            j11 = (a10.f18874a << c13) | (a10.f18875b << c12) | (a10.f18876c << c11) | a10.f18877d;
        }
        i0 i0Var = this.f31886z;
        p1.f31863a.getClass();
        Object g12 = i0Var.g(o1.f31860j);
        g12.getClass();
        r1 r1Var3 = (r1) g12;
        if (!h(r1Var3.f31880h, j11)) {
            r1Var3.f31880h = j11;
            r1Var3.i = j11;
            z9 = z3;
            if (!h(j11, 0L)) {
                z10 = z9;
            }
        }
        if (f10 == null) {
            j12 = 0;
        } else {
            int i25 = Build.VERSION.SDK_INT;
            if (i25 >= 28) {
                i = f3.k.h(f10.f23387a);
            } else {
                i = 0;
            }
            if (i25 >= 28) {
                i10 = f3.k.j(f10.f23387a);
            } else {
                i10 = 0;
            }
            if (i25 >= 28) {
                i11 = f3.k.i(f10.f23387a);
            } else {
                i11 = 0;
            }
            if (i25 >= 28) {
                i12 = f3.k.g(f10.f23387a);
            } else {
                i12 = 0;
            }
            j12 = i12 | (i10 << c12) | (i << c13) | (i11 << c11);
        }
        Object g13 = this.f31886z.g(o1.f31855c);
        g13.getClass();
        r1 r1Var4 = (r1) g13;
        if (!h(j12, r1Var4.f31880h)) {
            r1Var4.f31880h = j12;
            r1Var4.i = j12;
            z9 = z3;
            if (!h(j12, 0L)) {
                z10 = z9;
            }
        }
        if (f10 == null) {
            d0 d0Var = this.B;
            if (d0Var.f20856b > 0) {
                d0Var.c();
                this.C.clear();
                z9 = z3;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                list = f3.k.c(f10.f23387a);
            } else {
                list = Collections.EMPTY_LIST;
            }
            int size = list.size();
            d0 d0Var2 = this.B;
            if (size < d0Var2.f20856b) {
                d0Var2.k(list.size(), this.B.f20856b);
                this.C.k(list.size(), this.C.size());
                z9 = z3;
            } else {
                int size2 = list.size() - this.B.f20856b;
                int i26 = 0;
                while (i26 < size2) {
                    d0 d0Var3 = this.B;
                    d0Var3.a(y.B(list.get(d0Var3.f20856b)));
                    this.C.add(new r("display cutout rect " + this.B.f20856b));
                    i26++;
                    z9 = z3;
                }
            }
            List list2 = list;
            int size3 = list2.size();
            for (int i27 = 0; i27 < size3; i27++) {
                Rect rect = (Rect) list.get(i27);
                a1 a1Var = (a1) this.B.e(i27);
                if (!kotlin.jvm.internal.a(a1Var.getValue(), rect)) {
                    a1Var.setValue(rect);
                    z9 = z3;
                }
            }
            if (!list2.isEmpty()) {
                z10 = z3;
            }
        }
        if ((z10 || this.A.h() != 0) && z9) {
            f1 f1Var = this.A;
            f1Var.i(f1Var.h() + 1);
            synchronized (p.f1387c) {
                j0 j0Var = p.f1392j.f1323h;
                if (j0Var != null) {
                    boolean z12 = z3;
                    if (j0Var.h() == z12) {
                        z11 = z12;
                    }
                }
                z11 = false;
            }
            if (z11) {
                p.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        boolean z3 = q3.p.f23420a;
        q3.f(view, this);
        q3.d(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        boolean z3 = q3.p.f23420a;
        q3.f(view, null);
        q3.d(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f31883w) {
            this.f31884x = 0;
            this.f31883w = false;
            q3.q0 q0Var = this.f31885y;
            if (q0Var != null) {
                j(q0Var);
                this.f31885y = null;
            }
        }
    }
}
