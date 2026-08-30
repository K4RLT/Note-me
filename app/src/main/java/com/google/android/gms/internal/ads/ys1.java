package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ys1 extends um1 {

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f12938v0 = 0;
    public final eu1 A;
    public final zw1[] B;
    public final zw1[] C;
    public final p D;
    public final io0 E;
    public final to0 F;
    public final et1 G;
    public final ig0 H;
    public final qg I;
    public final ArrayList J;
    public final boolean K;
    public final ku1 L;
    public final Looper M;
    public final a0 N;
    public final s6 O;
    public final rs1 P;
    public final o0 Q;
    public final is0 R;
    public final o6 S;
    public final long T;
    public final b2.d2 U;
    public final com.google.android.gms.internal.mlkit_vision_digital_ink.lw V;
    public final zd1 W;
    public final com.google.android.gms.internal.mlkit_vision_digital_ink.pw X;
    public final com.google.android.gms.internal.mlkit_vision_digital_ink.pw Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f12939a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f12940b0;

    /* renamed from: c0, reason: collision with root package name */
    public final cu1 f12941c0;

    /* renamed from: d0, reason: collision with root package name */
    public hd f12942d0;

    /* renamed from: e0, reason: collision with root package name */
    public a7 f12943e0;

    /* renamed from: f0, reason: collision with root package name */
    public Object f12944f0;

    /* renamed from: g0, reason: collision with root package name */
    public Surface f12945g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f12946h0;

    /* renamed from: i0, reason: collision with root package name */
    public jl0 f12947i0;

    /* renamed from: j0, reason: collision with root package name */
    public final l50 f12948j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f12949k0;
    public boolean l0;
    public final boolean m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f12950n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f12951o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f12952p0;

    /* renamed from: q0, reason: collision with root package name */
    public a7 f12953q0;

    /* renamed from: r0, reason: collision with root package name */
    public vt1 f12954r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f12955s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f12956t0;

    /* renamed from: u0, reason: collision with root package name */
    public uy1 f12957u0;

    /* renamed from: w, reason: collision with root package name */
    public final u f12958w;

    /* renamed from: x, reason: collision with root package name */
    public final hd f12959x;

    /* renamed from: y, reason: collision with root package name */
    public final qb0 f12960y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f12961z;

    static {
        t5.a("media3.exoplayer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [b2.d2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.qb0, java.lang.Object] */
    public ys1(os1 os1Var, eu1 eu1Var) {
        super(6);
        os1 os1Var2;
        Handler.Callback callback;
        boolean z3;
        zd1 zd1Var;
        Looper looper = os1Var.f9214h;
        this.f12960y = new Object();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = bq0.f4860a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.10.1] [");
            sb2.append(str);
            sb2.append("]");
            x21.D("ExoPlayerImpl", sb2.toString());
            Context context = os1Var.f9208a;
            s6 s6Var = os1Var.f9209b;
            this.f12961z = context.getApplicationContext();
            this.L = new ku1(s6Var);
            this.f12951o0 = os1Var.i;
            this.f12948j0 = os1Var.f9215j;
            this.f12946h0 = os1Var.f9216k;
            this.l0 = false;
            this.T = os1Var.f9221p;
            rs1 rs1Var = new rs1(this);
            this.P = rs1Var;
            this.Q = new o0(1);
            Handler handler = new Handler(looper);
            lt0 lt0Var = os1Var.f9210c;
            int i = os1.A;
            this.B = ((hx0) lt0Var.f8135v).f(handler, rs1Var, rs1Var);
            this.C = new zw1[2];
            int i10 = 0;
            while (true) {
                zw1[] zw1VarArr = this.C;
                int length = zw1VarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zw1 zw1Var = this.B[i10];
                zw1VarArr[i10] = null;
                i10++;
            }
            p pVar = (p) os1Var.e.zza();
            this.D = pVar;
            os1Var.f9211d.zza();
            a0 a0Var = (a0) os1Var.f9213g.zza();
            this.N = a0Var;
            this.K = os1Var.f9217l;
            du1 du1Var = os1Var.f9218m;
            this.f12941c0 = os1Var.f9219n;
            this.M = looper;
            this.O = s6Var;
            this.A = eu1Var;
            this.H = new ig0(new CopyOnWriteArraySet(), looper, looper.getThread(), s6Var, new tn1(14, this), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.J = new ArrayList();
            this.f12957u0 = new uy1();
            int length2 = this.B.length;
            u uVar = new u(new au1[2], new r[2], fo.f6135b, null);
            this.f12958w = uVar;
            this.I = new qg();
            lc lcVar = new lc();
            c7.f0 f0Var = lcVar.f8006a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            f0Var.getClass();
            int i11 = 0;
            for (int i12 = 20; i11 < i12; i12 = 20) {
                f0Var.p(iArr[i11]);
                i11++;
            }
            pVar.getClass();
            lcVar.a(29, true);
            jv1 u9 = f0Var.u();
            this.f12959x = new hd(u9);
            c7.f0 f0Var2 = new lc().f8006a;
            SparseBooleanArray sparseBooleanArray = u9.f7550a;
            for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
                b80.N(i13, sparseBooleanArray.size());
                f0Var2.p(sparseBooleanArray.keyAt(i13));
            }
            f0Var2.p(4);
            f0Var2.p(10);
            this.f12942d0 = new hd(f0Var2.u());
            this.E = s6Var.x(looper, null);
            to0 to0Var = new to0(11, this);
            this.F = to0Var;
            this.f12954r0 = vt1.a(uVar);
            this.L.y(eu1Var, looper);
            tu1 tu1Var = new tu1(os1Var.f9228w);
            et1 et1Var = new et1(this.f12961z, this.B, this.C, pVar, uVar, (ht1) os1Var.f9212f.zza(), a0Var, this.L, du1Var, os1Var.f9231z, os1Var.f9220o, os1Var.f9229x, looper, s6Var, to0Var, tu1Var, os1Var.f9230y);
            Looper looper2 = et1Var.C;
            io0 io0Var = et1Var.A;
            this.G = et1Var;
            this.f12949k0 = 1.0f;
            a7 a7Var = a7.C;
            this.f12943e0 = a7Var;
            this.f12953q0 = a7Var;
            this.f12955s0 = -1;
            n41 n41Var = m50.f8250a;
            this.m0 = true;
            ku1 ku1Var = this.L;
            ku1Var.getClass();
            this.H.a(ku1Var);
            Handler handler2 = new Handler(looper);
            ku1 ku1Var2 = this.L;
            a0Var.getClass();
            ku1Var2.getClass();
            hx0 hx0Var = a0Var.f4295w;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hx0Var.f6914v;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                if (yVar.f12674b == ku1Var2) {
                    yVar.f12675c = true;
                    copyOnWriteArrayList.remove(yVar);
                }
            }
            ((CopyOnWriteArrayList) hx0Var.f6914v).add(new y(handler2, ku1Var2));
            copyOnWriteArraySet.add(this.P);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 31) {
                os1Var2 = os1Var;
                callback = null;
                s6Var.x(looper2, null).e(new ba.k(this.f12961z, os1Var2.f9226u, this, tu1Var));
            } else {
                os1Var2 = os1Var;
                callback = null;
            }
            int i15 = 9;
            lt0 lt0Var2 = new lt0(i15, this);
            Object obj = new Object();
            obj.f1437b = s6Var.x(looper2, callback);
            obj.f1438c = s6Var.x(looper, callback);
            obj.e = 0;
            obj.f1440f = 0;
            obj.f1439d = lt0Var2;
            this.U = obj;
            qu0 qu0Var = new qu0(12, this);
            io0 io0Var2 = (io0) obj.f1437b;
            if (io0Var2.f7185a.getLooper().getThread().isAlive()) {
                io0Var2.e(qu0Var);
            }
            fp fpVar = new fp(i15);
            context.getApplicationContext();
            s6Var.x(looper2, callback);
            new hg(fpVar, s6Var.x(looper, callback));
            if (os1Var2.f9223r != Integer.MAX_VALUE && os1Var2.f9224s != Integer.MAX_VALUE) {
                z3 = true;
            } else {
                z3 = false;
            }
            is0 is0Var = new is0(context, looper2, s6Var);
            this.R = is0Var;
            if (is0Var.f7204u != z3) {
                is0Var.f7204u = z3;
                is0Var.e(z3, is0Var.f7205v);
            }
            o6 o6Var = new o6(3);
            context.getApplicationContext();
            s6Var.x(looper2, callback);
            s6Var.x(Looper.getMainLooper(), callback);
            this.S = o6Var;
            int i16 = ft1.f6164a;
            ir irVar = ir.f7193d;
            this.f12947i0 = jl0.f7473c;
            if (i14 >= 34) {
                zd1Var = new zd1(this, context);
            } else {
                zd1Var = callback;
            }
            this.W = zd1Var;
            this.X = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(this);
            this.Y = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(this);
            this.V = new com.google.android.gms.internal.mlkit_vision_digital_ink.lw(this, this.P, s6Var, os1Var2.f9222q, os1Var2.f9223r, os1Var2.f9224s, os1Var2.f9225t);
            io0Var.b(38, this.f12941c0).a();
            l50 l50Var = this.f12948j0;
            Handler handler3 = io0Var.f7185a;
            fo0 g8 = io0.g();
            g8.f6137a = handler3.obtainMessage(31, 0, 0, l50Var);
            g8.a();
            k2(1, this.f12948j0, 3);
            k2(2, Integer.valueOf(this.f12946h0), 4);
            k2(2, 0, 5);
            k2(1, Boolean.valueOf(this.l0), 9);
            k2(6, this.Q, 8);
            k2(-1, Integer.valueOf(this.f12951o0), 16);
            this.f12960y.a();
        } catch (Throwable th) {
            this.f12960y.a();
            throw th;
        }
    }

    public static long d2(vt1 vt1Var) {
        ah ahVar = new ah();
        qg qgVar = new qg();
        uh uhVar = vt1Var.f11985a;
        uhVar.o(vt1Var.f11986b.f13003a, qgVar);
        long j10 = vt1Var.f11987c;
        if (j10 == -9223372036854775807L) {
            uhVar.b(qgVar.f9841c, ahVar, 0L).getClass();
            return 0L;
        }
        return j10;
    }

    public static vt1 f2(vt1 vt1Var, int i) {
        vt1 d2 = vt1Var.d(i);
        if (i != 1 && i != 4) {
            return d2;
        }
        return d2.f(false);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final int A1() {
        Q0();
        return this.f12954r0.f11996n;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final boolean E1() {
        Q0();
        return this.f12954r0.f11994l;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void G1() {
        Q0();
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final uh J1() {
        Q0();
        return this.f12954r0.f11985a;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final int N1() {
        Q0();
        int Z1 = Z1(this.f12954r0);
        if (Z1 == -1) {
            return 0;
        }
        return Z1;
    }

    public final void Q0() {
        IllegalStateException illegalStateException;
        this.f12960y.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.M;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = bq0.f4860a;
            Locale locale = Locale.US;
            String h3 = a5.a.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.m0) {
                if (this.f12950n0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                x21.K("ExoPlayerImpl", h3, illegalStateException);
                this.f12950n0 = true;
                return;
            }
            q.x.o(h3);
        }
    }

    public final void U1(float f10) {
        Q0();
        String str = bq0.f4860a;
        float max = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.f12949k0 == max) {
            return;
        }
        this.f12949k0 = max;
        this.G.A.b(32, Float.valueOf(max)).a();
        tn1 tn1Var = new tn1(max);
        ig0 ig0Var = this.H;
        ig0Var.c(22, tn1Var);
        ig0Var.d();
    }

    public final void V1(hu1 hu1Var) {
        this.L.f7885f.a(hu1Var);
    }

    public final void W1(wz wzVar) {
        Q0();
        this.L.f7885f.b(wzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.android.gms.internal.ads.qb0, java.lang.Object] */
    public final void X1() {
        String str;
        boolean z3;
        Context context;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = bq0.f4860a;
        HashSet hashSet = t5.f11251a;
        synchronized (t5.class) {
            str = t5.f11252b;
        }
        boolean z9 = true;
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 34 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        g3.a.t(sb2, "Release ", hexString, " [AndroidXMedia3/1.10.1] [", str2);
        sb2.append("] [");
        sb2.append(str);
        sb2.append("]");
        x21.D("ExoPlayerImpl", sb2.toString());
        Q0();
        this.R.b(false);
        o6 o6Var = this.S;
        if (o6Var.f8992v) {
            o6Var.f8992v = false;
        }
        zd1 zd1Var = this.W;
        if (zd1Var != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) zd1Var.f13142v).get()) != null) {
            context.unregisterDeviceIdChangeListener((xs1) zd1Var.f13143w);
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = this.V;
        ((io0) lwVar.f14647y).f7185a.removeCallbacksAndMessages(null);
        ys1 ys1Var = (ys1) lwVar.f14643u;
        vl0 vl0Var = (vl0) lwVar.f14644v;
        ys1Var.Q0();
        vl0Var.getClass();
        ys1Var.H.b(vl0Var);
        et1 et1Var = this.G;
        if (!et1Var.f5781c0 && et1Var.C.getThread().isAlive()) {
            et1Var.f5781c0 = true;
            Object obj = new Object();
            et1Var.A.b(7, obj).a();
            z3 = obj.c(et1Var.M);
        } else {
            z3 = true;
        }
        if (!z3) {
            ig0 ig0Var = this.H;
            ig0Var.c(10, tn1.f11403x);
            ig0Var.d();
        }
        this.H.e();
        this.E.f7185a.removeCallbacksAndMessages(null);
        a0 a0Var = this.N;
        ku1 ku1Var = this.L;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) a0Var.f4295w.f6914v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.f12674b == ku1Var) {
                yVar.f12675c = true;
                copyOnWriteArrayList.remove(yVar);
            }
        }
        this.f12954r0.getClass();
        vt1 f22 = f2(this.f12954r0, 1);
        this.f12954r0 = f22;
        vt1 g8 = f22.g(f22.f11986b);
        this.f12954r0 = g8;
        g8.f11998p = g8.f12000r;
        this.f12954r0.f11999q = 0L;
        io0 io0Var = ku1Var.f7887h;
        io0Var.getClass();
        io0Var.e(new qu0(15, ku1Var));
        Surface surface = this.f12945g0;
        if (surface != null) {
            surface.release();
            this.f12945g0 = null;
        }
        n41 n41Var = m50.f8250a;
        this.f12952p0 = true;
        if (!this.f12954r0.f11985a.g()) {
            vt1 vt1Var = this.f12954r0;
            if (vt1Var.f11985a.e(vt1Var.f11986b.f13003a) == -1) {
                z9 = false;
            }
            Locale locale = Locale.US;
            vt1 vt1Var2 = this.f12954r0;
            b80.L(String.format(locale, "periodUid %s not found in timeline %s with size %d", vt1Var2.f11986b.f13003a, vt1Var2.f11985a.getClass().getName(), Integer.valueOf(this.f12954r0.f11985a.a())), z9);
        }
    }

    public final void Y1(ns1 ns1Var) {
        vt1 vt1Var = this.f12954r0;
        vt1 g8 = vt1Var.g(vt1Var.f11986b);
        g8.f11998p = g8.f12000r;
        g8.f11999q = 0L;
        vt1 f22 = f2(g8, 1);
        if (ns1Var != null) {
            f22 = f22.e(ns1Var);
        }
        vt1 vt1Var2 = f22;
        this.Z++;
        Handler handler = this.G.A.f7185a;
        fo0 g10 = io0.g();
        g10.f6137a = handler.obtainMessage(6);
        g10.a();
        c2(vt1Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    public final int Z1(vt1 vt1Var) {
        uh uhVar = vt1Var.f11985a;
        if (uhVar.g()) {
            return this.f12955s0;
        }
        return uhVar.o(vt1Var.f11986b.f13003a, this.I).f9841c;
    }

    public final long a2(vt1 vt1Var) {
        long t3 = bq0.t(0L);
        yx1 yx1Var = vt1Var.f11986b;
        if (yx1Var.b()) {
            uh uhVar = vt1Var.f11985a;
            uhVar.o(yx1Var.f13003a, this.I);
            long j10 = vt1Var.f11987c;
            if (j10 == -9223372036854775807L) {
                uhVar.b(Z1(vt1Var), (ah) this.f11688u, 0L).getClass();
                return t3;
            }
            return bq0.t(j10) + t3;
        }
        return bq0.t(b2(vt1Var));
    }

    public final long b2(vt1 vt1Var) {
        uh uhVar = vt1Var.f11985a;
        if (uhVar.g()) {
            return bq0.u(this.f12956t0);
        }
        long j10 = vt1Var.f12000r;
        yx1 yx1Var = vt1Var.f11986b;
        if (yx1Var.b()) {
            return j10;
        }
        uhVar.o(yx1Var.f13003a, this.I);
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0598 A[LOOP:0: B:112:0x0592->B:114:0x0598, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0505  */
    /* JADX WARN: Type inference failed for: r11v58, types: [com.google.android.gms.internal.ads.ig0] */
    /* JADX WARN: Type inference failed for: r12v29, types: [com.google.android.gms.internal.ads.nb, com.google.android.gms.internal.ads.ie0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.google.android.gms.internal.ads.is0] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [int] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v17, types: [android.util.SparseBooleanArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c2(final com.google.android.gms.internal.ads.vt1 r32, int r33, boolean r34, int r35, long r36, int r38) {
        /*
            Method dump skipped, instructions count: 1599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ys1.c2(com.google.android.gms.internal.ads.vt1, int, boolean, int, long, int):void");
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void e0(int i, long j10) {
        boolean z3;
        Q0();
        if (i != -1) {
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.l(z3);
            uh uhVar = this.f12954r0.f11985a;
            if (!uhVar.g() && i >= uhVar.a()) {
                return;
            }
            ku1 ku1Var = this.L;
            if (!ku1Var.i) {
                gu1 r8 = ku1Var.r();
                ku1Var.i = true;
                ku1Var.p(r8, -1, new tn1(23, (byte) 0));
            }
            this.Z++;
            if (s2()) {
                x21.F("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                w9 w9Var = new w9(this.f12954r0);
                w9Var.b(1);
                ys1 ys1Var = (ys1) this.F.f11406v;
                ys1Var.E.e(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(ys1Var, 29, w9Var));
                return;
            }
            vt1 vt1Var = this.f12954r0;
            int i10 = vt1Var.e;
            if (i10 == 3 || (i10 == 4 && !uhVar.g())) {
                vt1Var = this.f12954r0.d(2);
            }
            int N1 = N1();
            vt1 e22 = e2(vt1Var, uhVar, h2(uhVar, i, j10));
            long u9 = bq0.u(j10);
            et1 et1Var = this.G;
            et1Var.getClass();
            et1Var.A.b(3, new dt1(uhVar, i, u9)).a();
            c2(e22, 0, true, 1, b2(e22), N1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.vt1 e2(com.google.android.gms.internal.ads.vt1 r23, com.google.android.gms.internal.ads.uh r24, android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ys1.e2(com.google.android.gms.internal.ads.vt1, com.google.android.gms.internal.ads.uh, android.util.Pair):com.google.android.gms.internal.ads.vt1");
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void h() {
        Q0();
    }

    public final Pair h2(uh uhVar, int i, long j10) {
        if (uhVar.g()) {
            this.f12955s0 = i;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f12956t0 = j10;
            return null;
        }
        if (i == -1 || i >= uhVar.a()) {
            i = uhVar.k(false);
            uhVar.b(i, (ah) this.f11688u, 0L).getClass();
            j10 = bq0.t(0L);
        }
        return uhVar.m((ah) this.f11688u, this.I, i, bq0.u(j10));
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.android.gms.internal.ads.qb0, java.lang.Object] */
    public final void i2(Surface surface) {
        long j10;
        Object obj = this.f12944f0;
        boolean z3 = false;
        boolean z9 = true;
        if (obj != null && obj != surface) {
            z3 = true;
        }
        if (z3) {
            j10 = this.T;
        } else {
            j10 = -9223372036854775807L;
        }
        et1 et1Var = this.G;
        if (!et1Var.f5781c0 && et1Var.C.getThread().isAlive()) {
            Object obj2 = new Object();
            et1Var.A.b(30, new Pair(surface, obj2)).a();
            if (j10 != -9223372036854775807L) {
                z9 = obj2.c(j10);
            }
        }
        if (z3) {
            Object obj3 = this.f12944f0;
            Surface surface2 = this.f12945g0;
            if (obj3 == surface2) {
                surface2.release();
                this.f12945g0 = null;
            }
        }
        this.f12944f0 = surface;
        if (!z9) {
            Y1(new ns1(2, new ab.b("Detaching surface timed out.", 7), 1003));
        }
    }

    public final void j2(int i, int i10) {
        jl0 jl0Var = this.f12947i0;
        if (i == jl0Var.f7474a && i10 == jl0Var.f7475b) {
            return;
        }
        this.f12947i0 = new jl0(i, i10);
        tn1 tn1Var = new tn1(i, i10);
        ig0 ig0Var = this.H;
        ig0Var.c(24, tn1Var);
        ig0Var.d();
        k2(2, new jl0(i, i10), 14);
    }

    public final void k2(int i, Object obj, int i10) {
        et1 et1Var;
        zw1[] zw1VarArr = this.B;
        int length = zw1VarArr.length;
        int i11 = 0;
        while (true) {
            et1Var = this.G;
            if (i11 >= 2) {
                break;
            }
            zw1 zw1Var = zw1VarArr[i11];
            if (i == -1 || zw1Var.f13314v == i) {
                Z1(this.f12954r0);
                uh uhVar = this.f12954r0.f11985a;
                xt1 xt1Var = new xt1(et1Var, zw1Var, et1Var.C);
                b80.K(!xt1Var.f12628f);
                xt1Var.f12626c = i10;
                b80.K(!xt1Var.f12628f);
                xt1Var.f12627d = obj;
                xt1Var.a();
            }
            i11++;
        }
        zw1[] zw1VarArr2 = this.C;
        int length2 = zw1VarArr2.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zw1 zw1Var2 = zw1VarArr2[i12];
            if (zw1Var2 != null && (i == -1 || zw1Var2.f13314v == i)) {
                Z1(this.f12954r0);
                uh uhVar2 = this.f12954r0.f11985a;
                xt1 xt1Var2 = new xt1(et1Var, zw1Var2, et1Var.C);
                b80.K(!xt1Var2.f12628f);
                xt1Var2.f12626c = i10;
                b80.K(!xt1Var2.f12628f);
                xt1Var2.f12627d = obj;
                xt1Var2.a();
            }
        }
    }

    public final void l2(boolean z3) {
        Q0();
        vt1 vt1Var = this.f12954r0;
        int i = vt1Var.f11996n;
        int i10 = 0;
        if (i == 1) {
            if (!z3) {
                i = 1;
                i10 = 1;
            } else {
                i = 1;
            }
        }
        if (vt1Var.f11994l == z3 && i == i10 && vt1Var.f11995m == 1) {
            return;
        }
        this.Z++;
        vt1 h3 = vt1Var.h(1, i10, z3);
        int i11 = (i10 << 4) | 1;
        Handler handler = this.G.A.f7185a;
        fo0 g8 = io0.g();
        g8.f6137a = handler.obtainMessage(1, z3 ? 1 : 0, i11);
        g8.a();
        c2(h3, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void m2() {
        Q0();
        Y1(null);
        y51 y51Var = y51.f12781y;
        long j10 = this.f12954r0.f12000r;
        new m50(y51Var);
    }

    public final int n2() {
        Q0();
        if (this.f12954r0.f11985a.g()) {
            int i = this.f12955s0;
            if (i == -1) {
                return 0;
            }
            return i;
        }
        vt1 vt1Var = this.f12954r0;
        return vt1Var.f11985a.e(vt1Var.f11986b.f13003a);
    }

    public final long o2() {
        Q0();
        if (!s2()) {
            uh J1 = J1();
            if (J1.g()) {
                return -9223372036854775807L;
            }
            return bq0.t(J1.b(N1(), (ah) this.f11688u, 0L).f4505j);
        }
        vt1 vt1Var = this.f12954r0;
        yx1 yx1Var = vt1Var.f11986b;
        uh uhVar = vt1Var.f11985a;
        Object obj = yx1Var.f13003a;
        qg qgVar = this.I;
        uhVar.o(obj, qgVar);
        return bq0.t(qgVar.b(yx1Var.f13004b, yx1Var.f13005c));
    }

    public final long p2() {
        Q0();
        return bq0.t(b2(this.f12954r0));
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final int q0() {
        Q0();
        if (s2()) {
            return this.f12954r0.f11986b.f13004b;
        }
        return -1;
    }

    public final long q2() {
        Q0();
        if (s2()) {
            vt1 vt1Var = this.f12954r0;
            if (vt1Var.f11993k.equals(vt1Var.f11986b)) {
                return bq0.t(this.f12954r0.f11998p);
            }
            return o2();
        }
        Q0();
        if (this.f12954r0.f11985a.g()) {
            return this.f12956t0;
        }
        vt1 vt1Var2 = this.f12954r0;
        long j10 = 0;
        if (vt1Var2.f11993k.f13006d != vt1Var2.f11986b.f13006d) {
            return bq0.t(vt1Var2.f11985a.b(N1(), (ah) this.f11688u, 0L).f4505j);
        }
        long j11 = vt1Var2.f11998p;
        if (this.f12954r0.f11993k.b()) {
            vt1 vt1Var3 = this.f12954r0;
            qg o10 = vt1Var3.f11985a.o(vt1Var3.f11993k.f13003a, this.I);
            o10.f9843f.a(this.f12954r0.f11993k.f13004b).getClass();
        } else {
            j10 = j11;
        }
        vt1 vt1Var4 = this.f12954r0;
        vt1Var4.f11985a.o(vt1Var4.f11993k.f13003a, this.I);
        return bq0.t(j10);
    }

    public final long r2() {
        Q0();
        return bq0.t(this.f12954r0.f11999q);
    }

    public final boolean s2() {
        Q0();
        return this.f12954r0.f11986b.b();
    }

    public final int t2() {
        Q0();
        if (s2()) {
            return this.f12954r0.f11986b.f13005c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final int x1() {
        Q0();
        return this.f12954r0.e;
    }
}
