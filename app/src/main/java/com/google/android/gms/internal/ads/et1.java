package com.google.android.gms.internal.ads;
import c4.i;
import g5.q;
import r0.b;
import r0.e;
import r0.z;
import r1.a;
import r2.f;
import r3.a;
import r3.i;
import r3.j;
import r3.m;
import r4.a;
import r6.i;
import r6.k;
import r6.l;
import r7.e;
import r7.h;
import r7.n;
import r9.c;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class et1 implements Handler.Callback, wx1, h1 {

    /* renamed from: y0, reason: collision with root package name */
    public static final long f5778y0 = bq0.t(10000);
    public final io0 A;
    public final tc B;
    public final Looper C;
    public final ah D;
    public final qg E;
    public final long F;
    public final in0 G;
    public final ArrayList H;
    public final s6 I;
    public final to0 J;
    public final nt1 K;
    public final ak0 L;
    public final long M;
    public final tu1 N;
    public final boolean O;
    public final ku1 P;
    public final io0 Q;
    public final boolean R;
    public final vv S;
    public boolean T;
    public du1 U;
    public cu1 V;
    public boolean W;
    public boolean X;
    public dt1 Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public vt1 f5779a0;

    /* renamed from: b0, reason: collision with root package name */
    public w9 f5780b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5781c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f5782d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5783e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f5784f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f5785g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f5786h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f5787i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f5788j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f5789k0;
    public int l0;
    public dt1 m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f5790n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f5791o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f5792p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f5793q0;

    /* renamed from: r0, reason: collision with root package name */
    public ns1 f5794r0;

    /* renamed from: s0, reason: collision with root package name */
    public long f5795s0;

    /* renamed from: t0, reason: collision with root package name */
    public ps1 f5796t0;

    /* renamed from: u, reason: collision with root package name */
    public final bu1[] f5797u;

    /* renamed from: u0, reason: collision with root package name */
    public long f5798u0;

    /* renamed from: v, reason: collision with root package name */
    public final zw1[] f5799v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f5800v0;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f5801w;

    /* renamed from: w0, reason: collision with root package name */
    public float f5802w0;

    /* renamed from: x, reason: collision with root package name */
    public final p f5803x;

    /* renamed from: x0, reason: collision with root package name */
    public final js1 f5804x0;

    /* renamed from: y, reason: collision with root package name */
    public final u f5805y;

    /* renamed from: z, reason: collision with root package name */
    public final ht1 f5806z;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.tc, java.lang.Object] */
    public et1(Context context, zw1[] zw1VarArr, zw1[] zw1VarArr2, p pVar, u uVar, ht1 ht1Var, a0 a0Var, ku1 ku1Var, du1 du1Var, js1 js1Var, long j10, boolean z3, Looper looper, s6 s6Var, to0 to0Var, tu1 tu1Var, boolean z9) {
        boolean z10;
        Looper looper2;
        ps1 ps1Var = ps1.f9591a;
        this.f5798u0 = -9223372036854775807L;
        this.J = to0Var;
        this.f5803x = pVar;
        this.f5805y = uVar;
        this.f5806z = ht1Var;
        boolean z11 = false;
        this.f5787i0 = 0;
        this.f5788j0 = false;
        this.U = du1Var;
        this.f5804x0 = js1Var;
        this.M = j10;
        this.f5782d0 = false;
        this.O = z3;
        this.I = s6Var;
        this.N = tu1Var;
        this.f5796t0 = ps1Var;
        this.P = ku1Var;
        this.f5802w0 = 1.0f;
        this.V = cu1.f5175b;
        this.T = z9;
        this.f5795s0 = -9223372036854775807L;
        this.f5785g0 = -9223372036854775807L;
        this.F = ht1Var.b();
        zf zfVar = uh.f11636a;
        vt1 a10 = vt1.a(uVar);
        this.f5779a0 = a10;
        this.f5780b0 = new w9(a10);
        int length = zw1VarArr.length;
        this.f5799v = new zw1[2];
        this.f5801w = new boolean[2];
        pVar.getClass();
        this.f5797u = new bu1[2];
        boolean z12 = false;
        for (int i = 0; i < 2; i++) {
            zw1 zw1Var = zw1VarArr[i];
            zw1Var.f13320y = i;
            zw1Var.f13322z = tu1Var;
            zw1Var.A = s6Var;
            zw1[] zw1VarArr3 = this.f5799v;
            zw1Var.getClass();
            zw1VarArr3[i] = zw1Var;
            zw1 zw1Var2 = this.f5799v[i];
            synchronized (zw1Var2.f13312u) {
                zw1Var2.M = pVar;
            }
            zw1 zw1Var3 = zw1VarArr2[i];
            if (zw1Var3 != null) {
                zw1Var3.f13320y = i;
                zw1Var3.f13322z = tu1Var;
                zw1Var3.A = s6Var;
                z12 = true;
            }
            this.f5797u[i] = new bu1(zw1VarArr[i], zw1Var3, i);
        }
        this.R = z12;
        this.G = new in0(this);
        this.H = new ArrayList();
        this.D = new ah();
        this.E = new qg();
        if (pVar.f9292a == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b80.K(z10);
        pVar.f9292a = this;
        pVar.f9293b = a0Var;
        this.f5793q0 = true;
        io0 x9 = s6Var.x(looper, null);
        this.Q = x9;
        this.K = new nt1(ku1Var, x9, new bl0(14, this));
        this.L = new ak0(this, ku1Var, x9, tu1Var, a0Var);
        Object obj = new Object();
        obj.f11315v = new Object();
        obj.f11316w = null;
        obj.f11317x = null;
        obj.f11314u = 0;
        this.B = obj;
        synchronized (obj.f11315v) {
            try {
                if (((Looper) obj.f11316w) == null) {
                    if (obj.f11314u == 0 && ((HandlerThread) obj.f11317x) == null) {
                        z11 = true;
                    }
                    b80.K(z11);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    obj.f11317x = handlerThread;
                    handlerThread.start();
                    obj.f11316w = ((HandlerThread) obj.f11317x).getLooper();
                }
                obj.f11314u++;
                looper2 = (Looper) obj.f11316w;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.C = looper2;
        io0 x10 = s6Var.x(looper2, this);
        this.A = x10;
        this.S = new vv(context, looper2, this);
        x10.b(35, new h1() { // from class: com.google.android.gms.internal.ads.at1
            @Override // com.google.android.gms.internal.ads.h1
            public final /* synthetic */ void a(long j11, long j12, mw1 mw1Var, MediaFormat mediaFormat) {
                et1.this.a(j11, j12, mw1Var, mediaFormat);
            }
        }).a();
        x10.b(39, new Object()).a();
    }

    public static final boolean A(lt1 lt1Var) {
        long c10;
        if (lt1Var != null) {
            try {
                rx1 rx1Var = lt1Var.f8136a;
                if (!lt1Var.e) {
                    rx1Var.m();
                } else {
                    sy1[] sy1VarArr = lt1Var.f8138c;
                    for (int i = 0; i < 2; i++) {
                        sy1 sy1Var = sy1VarArr[i];
                        if (sy1Var != null) {
                            sy1Var.zzb();
                        }
                    }
                }
                if (!lt1Var.e) {
                    c10 = 0;
                } else {
                    c10 = rx1Var.c();
                }
                if (c10 != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(ah ahVar, qg qgVar, int i, boolean z3, Object obj, uh uhVar, uh uhVar2) {
        ah ahVar2 = ahVar;
        uh uhVar3 = uhVar;
        Object obj2 = uhVar3.b(uhVar3.o(obj, qgVar).f9841c, ahVar, 0L).f4498a;
        for (int i10 = 0; i10 < uhVar2.a(); i10++) {
            if (uhVar2.b(i10, ahVar, 0L).f4498a.equals(obj2)) {
                return i10;
            }
        }
        int e = uhVar3.e(obj);
        int c10 = uhVar3.c();
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= c10 || i11 != -1) {
                break;
            }
            uh uhVar4 = uhVar3;
            int l10 = uhVar4.l(e, qgVar, ahVar2, i, z3);
            if (l10 == -1) {
                i11 = -1;
                break;
            }
            i11 = uhVar2.e(uhVar4.f(l10));
            i12++;
            uhVar3 = uhVar4;
            e = l10;
            ahVar2 = ahVar;
        }
        if (i11 == -1) {
            return -1;
        }
        return uhVar2.d(i11, qgVar, false).f9841c;
    }

    public static Pair z(uh uhVar, dt1 dt1Var, int i, boolean z3, ah ahVar, qg qgVar) {
        uh uhVar2;
        uh uhVar3 = dt1Var.f5512a;
        if (!uhVar.g()) {
            if (true == uhVar3.g()) {
                uhVar2 = uhVar;
            } else {
                uhVar2 = uhVar3;
            }
            try {
                Pair m4 = uhVar2.m(ahVar, qgVar, dt1Var.f5513b, dt1Var.f5514c);
                if (!uhVar.equals(uhVar2)) {
                    int e = uhVar.e(m4.first);
                    Object obj = m4.first;
                    if (e != -1) {
                        if (uhVar2.o(obj, qgVar).e && uhVar2.b(qgVar.f9841c, ahVar, 0L).f4506k == uhVar2.e(m4.first)) {
                            return uhVar.m(ahVar, qgVar, uhVar.o(m4.first, qgVar).f9841c, dt1Var.f5514c);
                        }
                    } else {
                        int W = W(ahVar, qgVar, i, z3, obj, uhVar2, uhVar);
                        if (W != -1) {
                            return uhVar.m(ahVar, qgVar, W, -9223372036854775807L);
                        }
                        return null;
                    }
                }
                return m4;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public final void B() {
        boolean z3;
        for (int i = 0; i < 2; i++) {
            bu1[] bu1VarArr = this.f5797u;
            int r8 = bu1VarArr[i].r();
            bu1 bu1Var = bu1VarArr[i];
            zw1 zw1Var = bu1Var.f4882a;
            zw1 zw1Var2 = bu1Var.f4884c;
            in0 in0Var = this.G;
            bu1Var.i(zw1Var, in0Var);
            if (zw1Var2 != null) {
                if (zw1Var2.B != 0 && bu1Var.f4885d != 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bu1Var.i(zw1Var2, in0Var);
                bu1Var.j(false);
                if (z3) {
                    zw1 zw1Var3 = bu1Var.f4882a;
                    zw1Var2.getClass();
                    zw1Var2.b(17, zw1Var3);
                }
            }
            bu1Var.f4885d = 0;
            m(i, false);
            this.l0 -= r8;
        }
        this.f5798u0 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: RuntimeException -> 0x0038, TryCatch #0 {RuntimeException -> 0x0038, blocks: (B:38:0x0035, B:18:0x003e, B:16:0x003a, B:30:0x0043), top: B:37:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            r11 = this;
            boolean r0 = r11.R
            if (r0 == 0) goto L6d
            boolean r0 = r11.V()
            if (r0 != 0) goto Lc
            goto L6d
        Lc:
            r0 = 0
            r1 = r0
        Le:
            r2 = 2
            if (r1 >= r2) goto L66
            com.google.android.gms.internal.ads.bu1[] r3 = r11.f5797u
            r3 = r3[r1]
            int r4 = r3.r()
            com.google.android.gms.internal.ads.in0 r5 = r11.G
            boolean r6 = r3.q()
            if (r6 != 0) goto L22
            goto L59
        L22:
            int r6 = r3.f4885d
            r7 = 1
            r8 = 4
            if (r6 == r8) goto L2f
            if (r6 != r2) goto L2c
        L2a:
            r6 = r7
            goto L31
        L2c:
            r2 = r6
            r6 = r0
            goto L31
        L2f:
            r2 = r6
            goto L2a
        L31:
            java.lang.String r9 = "RendererHolder"
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.ads.zw1 r10 = r3.f4882a     // Catch: java.lang.RuntimeException -> L38
            goto L3e
        L38:
            r5 = move-exception
            goto L44
        L3a:
            com.google.android.gms.internal.ads.zw1 r10 = r3.f4884c     // Catch: java.lang.RuntimeException -> L38
            if (r10 == 0) goto L42
        L3e:
            i(r10, r5)     // Catch: java.lang.RuntimeException -> L38
            goto L49
        L42:
            r5 = 0
            throw r5     // Catch: java.lang.RuntimeException -> L38
        L44:
            java.lang.String r10 = "Disable prewarming failed."
            com.google.android.gms.internal.ads.x21.P(r9, r10, r5)
        L49:
            j(r6)     // Catch: java.lang.RuntimeException -> L4d
            goto L53
        L4d:
            r5 = move-exception
            java.lang.String r6 = "Reset prewarming failed."
            com.google.android.gms.internal.ads.x21.P(r9, r6, r5)
        L53:
            if (r2 != r8) goto L56
            goto L57
        L56:
            r7 = r0
        L57:
            r3.f4885d = r7
        L59:
            int r2 = r11.l0
            int r3 = r3.r()
            int r4 = r4 - r3
            int r2 = r2 - r4
            r11.l0 = r2
            int r1 = r1 + 1
            goto Le
        L66:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.f5798u0 = r0
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.C():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.D():void");
    }

    public final boolean E() {
        lt1 lt1Var = this.K.f8856h;
        long j10 = lt1Var.f8141g.e;
        if (lt1Var.e) {
            if (j10 == -9223372036854775807L || this.f5779a0.f12000r < j10 || !T()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(4:104|105|(1:107)(1:138)|108)|(5:(3:129|130|(9:132|133|111|112|113|114|115|116|(1:118)(2:119|(1:121))))|114|115|116|(0)(0))|110|111|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d2, code lost:
    
        r8 = r36;
        r12 = 0;
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0260, code lost:
    
        r13.f9843f.getClass();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03b6 A[Catch: all -> 0x03bc, TRY_ENTER, TryCatch #8 {all -> 0x03bc, blocks: (B:118:0x03b6, B:119:0x03c4, B:121:0x03ca, B:59:0x03de, B:83:0x03ed, B:85:0x03f7, B:87:0x03ff), top: B:57:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c4 A[Catch: all -> 0x03bc, TryCatch #8 {all -> 0x03bc, blocks: (B:118:0x03b6, B:119:0x03c4, B:121:0x03ca, B:59:0x03de, B:83:0x03ed, B:85:0x03f7, B:87:0x03ff), top: B:57:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x042b  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r35v0, types: [com.google.android.gms.internal.ads.et1] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r8v22, types: [com.google.android.gms.internal.ads.zw1] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(com.google.android.gms.internal.ads.uh r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.F(com.google.android.gms.internal.ads.uh, boolean):void");
    }

    public final void G(uh uhVar, yx1 yx1Var, uh uhVar2, yx1 yx1Var2, long j10, boolean z3) {
        Object obj;
        vb vbVar;
        if (!o(uhVar, yx1Var)) {
            if (yx1Var.b()) {
                vbVar = vb.f11869d;
            } else {
                vbVar = this.f5779a0.f11997o;
            }
            in0 in0Var = this.G;
            if (!in0Var.f().equals(vbVar)) {
                this.A.d(16);
                in0Var.a(vbVar);
                K(this.f5779a0.f11997o, vbVar.f11870a, false, false);
                return;
            }
            return;
        }
        Object obj2 = yx1Var.f13003a;
        qg qgVar = this.E;
        int i = uhVar.o(obj2, qgVar).f9841c;
        ah ahVar = this.D;
        uhVar.b(i, ahVar, 0L);
        v1 v1Var = ahVar.f4504h;
        String str = bq0.f4860a;
        js1 js1Var = this.f5804x0;
        js1Var.getClass();
        v1Var.getClass();
        long u9 = bq0.u(-9223372036854775807L);
        js1Var.f7526c = u9;
        js1Var.f7528f = u9;
        js1Var.f7529g = u9;
        js1Var.c();
        if (j10 != -9223372036854775807L) {
            js1Var.f7527d = n(uhVar, obj2, j10);
            js1Var.c();
            return;
        }
        Object obj3 = ahVar.f4498a;
        if (!uhVar2.g()) {
            obj = uhVar2.b(uhVar2.o(yx1Var2.f13003a, qgVar).f9841c, ahVar, 0L).f4498a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z3) {
            return;
        }
        js1Var.f7527d = -9223372036854775807L;
        js1Var.c();
    }

    public final long H(lt1 lt1Var) {
        if (lt1Var == null) {
            return 0L;
        }
        long j10 = lt1Var.f8149p;
        if (lt1Var.e) {
            for (int i = 0; i < 2; i++) {
                bu1[] bu1VarArr = this.f5797u;
                if (bu1VarArr[i].m(lt1Var) != null) {
                    zw1 m4 = bu1VarArr[i].m(lt1Var);
                    Objects.requireNonNull(m4);
                    long j11 = m4.G;
                    if (j11 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(j11, j10);
                }
            }
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.nt1 r0 = r10.K
            z()
            com.google.android.gms.internal.ads.lt1 r0 = r0.f8859l
            if (r0 == 0) goto L90
            com.google.android.gms.internal.ads.rx1 r1 = r0.f8136a
            boolean r2 = r0.f8139d
            if (r2 == 0) goto L13
            boolean r2 = e
            if (r2 == 0) goto L90
        L13:
            boolean r2 = a()
            if (r2 != 0) goto L90
            com.google.android.gms.internal.ads.vt1 r2 = r10.f5779a0
            com.google.android.gms.internal.ads.uh r2 = r2.f11985a
            boolean r2 = e
            if (r2 == 0) goto L24
            r1.zzb()
        L24:
            com.google.android.gms.internal.ads.ht1 r2 = r10.f5806z
            boolean r2 = f()
            if (r2 != 0) goto L2d
            goto L90
        L2d:
            boolean r2 = r0.f8139d
            r3 = 1
            if (r2 != 0) goto L3c
            com.google.android.gms.internal.ads.mt1 r2 = r0.f8141g
            long r4 = r2.f8414b
            r0.f8139d = r3
            r1.d(r10, r4)
            return
        L3c:
            com.google.android.gms.internal.ads.it1 r2 = new com.google.android.gms.internal.ads.it1
            r2.<init>()
            long r4 = r10.f5790n0
            long r6 = r0.f8149p
            long r4 = r4 - r6
            r2.f7220a = r4
            com.google.android.gms.internal.ads.in0 r4 = r10.G
            com.google.android.gms.internal.ads.vb r4 = r4.f()
            float r4 = r4.f11870a
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 0
            if (r5 > 0) goto L5d
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L5f
        L5d:
            r5 = r3
            goto L60
        L5f:
            r5 = r6
        L60:
            com.google.android.gms.internal.ads.b80.l(r5)
            r2.f7221b = r4
            long r4 = r10.f5785g0
            r7 = 0
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L77
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L79
            r4 = r7
        L77:
            r7 = r3
            goto L7a
        L79:
            r7 = r6
        L7a:
            com.google.android.gms.internal.ads.b80.l(r7)
            r2.f7222c = r4
            com.google.android.gms.internal.ads.jt1 r4 = new com.google.android.gms.internal.ads.jt1
            r4.<init>(r2)
            com.google.android.gms.internal.ads.lt1 r0 = r0.f8146m
            if (r0 != 0) goto L89
            goto L8a
        L89:
            r3 = r6
        L8a:
            com.google.android.gms.internal.ads.b80.K(r3)
            r1.f(r4)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.I():void");
    }

    public final void J() {
        lt1 lt1Var = this.K.f8856h;
        boolean z3 = false;
        if (lt1Var != null && lt1Var.f8141g.f8418g && this.f5782d0) {
            z3 = true;
        }
        this.f5783e0 = z3;
    }

    public final void K(vb vbVar, float f10, boolean z3, boolean z9) {
        int i;
        if (z3) {
            if (z9) {
                this.f5780b0.b(1);
            }
            vt1 vt1Var = this.f5779a0;
            this.f5779a0 = new vt1(vt1Var.f11985a, vt1Var.f11986b, vt1Var.f11987c, vt1Var.f11988d, vt1Var.e, vt1Var.f11989f, vt1Var.f11990g, vt1Var.f11991h, vt1Var.i, vt1Var.f11992j, vt1Var.f11993k, vt1Var.f11994l, vt1Var.f11995m, vt1Var.f11996n, vbVar, vt1Var.f11998p, vt1Var.f11999q, vt1Var.f12000r, vt1Var.f12001s);
        }
        float f11 = vbVar.f11870a;
        lt1 lt1Var = this.K.f8856h;
        while (true) {
            i = 0;
            if (lt1Var == null) {
                break;
            }
            r[] rVarArr = (r[]) lt1Var.f8148o.f11499w;
            int length = rVarArr.length;
            while (i < length) {
                r rVar = rVarArr[i];
                i++;
            }
            lt1Var = lt1Var.f8146m;
        }
        bu1[] bu1VarArr = this.f5797u;
        while (i < 2) {
            bu1 bu1Var = bu1VarArr[i];
            bu1Var.f4882a.r(f10, f11);
            zw1 zw1Var = bu1Var.f4884c;
            if (zw1Var != null) {
                zw1Var.r(f10, f11);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.L():void");
    }

    public final void M() {
        lt1 lt1Var = this.K.f8858k;
        boolean z3 = true;
        if (!this.f5786h0 && (lt1Var == null || !lt1Var.f8136a.a())) {
            z3 = false;
        }
        vt1 vt1Var = this.f5779a0;
        if (z3 != vt1Var.f11990g) {
            this.f5779a0 = vt1Var.f(z3);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    public final vt1 N(yx1 yx1Var, long j10, long j11, long j12, boolean z3, int i) {
        boolean z9;
        zy1 zy1Var;
        u uVar;
        List list;
        boolean z10;
        zy1 zy1Var2;
        u uVar2;
        y51 y51Var;
        if (this.f5793q0 || j10 != this.f5779a0.f12000r || !yx1Var.equals(this.f5779a0.f11986b)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f5793q0 = z9;
        J();
        vt1 vt1Var = this.f5779a0;
        zy1 zy1Var3 = vt1Var.f11991h;
        u uVar3 = vt1Var.i;
        List list2 = vt1Var.f11992j;
        if (this.L.f4529u) {
            nt1 nt1Var = this.K;
            lt1 lt1Var = nt1Var.f8856h;
            if (lt1Var == null) {
                zy1Var2 = zy1.f13336d;
            } else {
                zy1Var2 = lt1Var.f8147n;
            }
            if (lt1Var == null) {
                uVar2 = this.f5805y;
            } else {
                uVar2 = lt1Var.f8148o;
            }
            r[] rVarArr = (r[]) uVar2.f11499w;
            y41 y41Var = new y41(4);
            boolean z11 = false;
            for (r rVar : rVarArr) {
                if (rVar != null) {
                    m8 m8Var = rVar.w(0).f8456l;
                    if (m8Var == null) {
                        y41Var.a(new m8(new q7[0]));
                    } else {
                        y41Var.a(m8Var);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                y51Var = y41Var.f();
            } else {
                b51 b51Var = d51.f5314v;
                y51Var = y51.f12781y;
            }
            if (lt1Var != null) {
                mt1 mt1Var = lt1Var.f8141g;
                long j13 = mt1Var.f8416d;
                if (j13 != j11) {
                    if (j11 != j13) {
                        mt1Var = new mt1(mt1Var.f8413a, mt1Var.f8414b, mt1Var.f8415c, j11, mt1Var.e, mt1Var.f8417f, mt1Var.f8418g, mt1Var.f8419h);
                    }
                    lt1Var.f8141g = mt1Var;
                }
            }
            lt1 lt1Var2 = nt1Var.f8856h;
            if (lt1Var2 == nt1Var.i && lt1Var2 != null) {
                u uVar4 = lt1Var2.f8148o;
                int i10 = 0;
                while (true) {
                    bu1[] bu1VarArr = this.f5797u;
                    if (i10 >= 2) {
                        break;
                    }
                    if (uVar4.c(i10)) {
                        if (bu1VarArr[i10].f4882a.f13314v != 1) {
                            break;
                        }
                        ((au1[]) uVar4.f11498v)[i10].getClass();
                    }
                    i10++;
                }
            }
            zy1Var = zy1Var2;
            uVar = uVar2;
            list = y51Var;
        } else {
            if (!yx1Var.equals(vt1Var.f11986b)) {
                uVar3 = this.f5805y;
                zy1Var3 = zy1.f13336d;
                list2 = y51.f12781y;
            }
            zy1Var = zy1Var3;
            uVar = uVar3;
            list = list2;
        }
        if (z3) {
            w9 w9Var = this.f5780b0;
            if (w9Var.f12172c && w9Var.f12173d != 5) {
                if (i == 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b80.l(z10);
            } else {
                w9Var.f12170a = true;
                w9Var.f12172c = true;
                w9Var.f12173d = i;
            }
        }
        vt1 vt1Var2 = this.f5779a0;
        return vt1Var2.b(yx1Var, j10, j11, j12, R(vt1Var2.f11998p), zy1Var, uVar, list);
    }

    public final void O(boolean[] zArr, long j10) {
        bu1[] bu1VarArr;
        long j11;
        lt1 lt1Var = this.K.i;
        u uVar = lt1Var.f8148o;
        int i = 0;
        while (true) {
            bu1VarArr = this.f5797u;
            if (i >= 2) {
                break;
            }
            if (!uVar.c(i)) {
                bu1VarArr[i].b();
            }
            i++;
        }
        int i10 = 0;
        while (i10 < 2) {
            if (!uVar.c(i10) || bu1VarArr[i10].m(lt1Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                P(lt1Var, i10, zArr[i10], j11);
            }
            i10++;
            j10 = j11;
        }
    }

    public final void P(lt1 lt1Var, int i, boolean z3, long j10) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        bu1 bu1Var = this.f5797u[i];
        if (!bu1Var.g()) {
            if (lt1Var == this.K.f8856h) {
                z9 = true;
            } else {
                z9 = false;
            }
            u uVar = lt1Var.f8148o;
            au1 au1Var = ((au1[]) uVar.f11498v)[i];
            r rVar = ((r[]) uVar.f11499w)[i];
            if (T() && this.f5779a0.e == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z3 && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.l0++;
            sy1 sy1Var = lt1Var.f8138c[i];
            long j11 = lt1Var.f8149p;
            yx1 yx1Var = lt1Var.f8141g.f8413a;
            if (rVar != null) {
                i10 = rVar.a();
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            mw1[] mw1VarArr = new mw1[i10];
            while (i11 < i10) {
                rVar.getClass();
                mw1VarArr[i11] = rVar.w(i11);
                i11++;
            }
            int i12 = bu1Var.f4885d;
            in0 in0Var = this.G;
            if (i12 != 0 && i12 != 2 && i12 != 4) {
                bu1Var.f4886f = true;
                zw1 zw1Var = bu1Var.f4884c;
                zw1Var.getClass();
                if (zw1Var.B == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                b80.K(z13);
                zw1Var.f13318x = au1Var;
                zw1Var.K = yx1Var;
                zw1Var.B = 1;
                zw1Var.u0(z11, z9);
                zw1Var.p0(mw1VarArr, sy1Var, j10, j11, yx1Var);
                zw1Var.N(j10, z11, true);
                in0Var.b(zw1Var);
            } else {
                bu1Var.e = true;
                zw1 zw1Var2 = bu1Var.f4882a;
                if (zw1Var2.B == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b80.K(z12);
                zw1Var2.f13318x = au1Var;
                zw1Var2.K = yx1Var;
                zw1Var2.B = 1;
                zw1Var2.u0(z11, z9);
                zw1Var2.p0(mw1VarArr, sy1Var, j10, j11, yx1Var);
                zw1Var2.N(j10, z11, true);
                in0Var.b(zw1Var2);
            }
            zs1 zs1Var = new zs1(this);
            zw1 m4 = bu1Var.m(lt1Var);
            m4.getClass();
            m4.b(11, zs1Var);
            if (z10 && z9) {
                bu1Var.C();
            }
        }
    }

    public final void Q(boolean z3) {
        yx1 yx1Var;
        long d2;
        lt1 lt1Var = this.K.f8858k;
        if (lt1Var == null) {
            yx1Var = this.f5779a0.f11986b;
        } else {
            yx1Var = lt1Var.f8141g.f8413a;
        }
        boolean equals = this.f5779a0.f11993k.equals(yx1Var);
        if (!equals) {
            this.f5779a0 = this.f5779a0.g(yx1Var);
        }
        vt1 vt1Var = this.f5779a0;
        if (lt1Var == null) {
            d2 = vt1Var.f12000r;
        } else {
            d2 = lt1Var.d();
        }
        vt1Var.f11998p = d2;
        vt1 vt1Var2 = this.f5779a0;
        vt1Var2.f11999q = R(vt1Var2.f11998p);
        if ((!equals || z3) && lt1Var != null && lt1Var.e) {
            S(lt1Var.f8141g.f8413a, lt1Var.f8147n, lt1Var.f8148o);
        }
    }

    public final long R(long j10) {
        lt1 lt1Var = this.K.f8858k;
        if (lt1Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.f5790n0 - lt1Var.f8149p));
    }

    public final void S(yx1 yx1Var, zy1 zy1Var, u uVar) {
        long j10;
        lt1 lt1Var = this.K.f8858k;
        lt1Var.getClass();
        long R = R(lt1Var.d());
        if (o(this.f5779a0.f11985a, lt1Var.f8141g.f8413a)) {
            j10 = this.f5804x0.f7530h;
        } else {
            j10 = -9223372036854775807L;
        }
        long j11 = j10;
        uh uhVar = this.f5779a0.f11985a;
        float f10 = this.G.f().f11870a;
        boolean z3 = this.f5779a0.f11994l;
        this.f5806z.a(new gt1(this.N, uhVar, yx1Var, R, f10, this.f5784f0, j11), (r[]) uVar.f11499w);
    }

    public final boolean T() {
        vt1 vt1Var = this.f5779a0;
        if (vt1Var.f11994l && vt1Var.f11996n == 0) {
            return true;
        }
        return false;
    }

    public final void U(int i) {
        bu1 bu1Var = this.f5797u[i];
        try {
            lt1 lt1Var = this.K.f8856h;
            if (lt1Var != null) {
                zw1 m4 = bu1Var.m(lt1Var);
                m4.getClass();
                sy1 sy1Var = m4.C;
                sy1Var.getClass();
                sy1Var.zzb();
                return;
            }
            throw null;
        } catch (IOException | RuntimeException e) {
            int i10 = bu1Var.f4882a.f13314v;
            throw e;
        }
    }

    public final boolean V() {
        if (!this.R) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f5797u[i].q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void a(long j10, long j11, mw1 mw1Var, MediaFormat mediaFormat) {
        if (this.X) {
            Handler handler = this.A.f7185a;
            fo0 g8 = io0.g();
            g8.f6137a = handler.obtainMessage(37);
            g8.a();
        }
    }

    public final void b(IOException iOException, int i) {
        ns1 ns1Var = new ns1(0, iOException, i);
        lt1 lt1Var = this.K.f8856h;
        if (lt1Var != null) {
            ns1Var = ns1Var.a(lt1Var.f8141g.f8413a);
        }
        x21.P("ExoPlayerImplInternal", "Playback error", ns1Var);
        u(false, false);
        this.f5779a0 = this.f5779a0.e(ns1Var);
    }

    public final void c(int i) {
        vt1 vt1Var = this.f5779a0;
        if (vt1Var.e != i) {
            if (i != 2) {
                this.f5795s0 = -9223372036854775807L;
            }
            this.f5779a0 = vt1Var.d(i);
        }
    }

    public final void d(int i) {
        boolean z3;
        w9 w9Var = this.f5780b0;
        vt1 vt1Var = this.f5779a0;
        boolean z9 = w9Var.f12170a;
        boolean z10 = false;
        if (((vt1) w9Var.e) != vt1Var) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z11 = z9 | z3;
        w9Var.f12170a = z11;
        w9Var.e = vt1Var;
        if (z11) {
            if (!vt1Var.f11985a.g()) {
                vt1 vt1Var2 = this.f5779a0;
                if (vt1Var2.f11985a.e(vt1Var2.f11986b.f13003a) != -1) {
                    z10 = true;
                }
                Locale locale = Locale.US;
                vt1 vt1Var3 = this.f5779a0;
                b80.L(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", vt1Var3.f11986b.f13003a, vt1Var3.f11985a.getClass().getName(), Integer.valueOf(this.f5779a0.f11985a.a()), Integer.valueOf(i)), z10);
            }
            w9 w9Var2 = this.f5780b0;
            ys1 ys1Var = (ys1) this.J.f11406v;
            ys1Var.E.e(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(ys1Var, 29, w9Var2));
            this.f5780b0 = new w9(this.f5779a0);
        }
    }

    public final void e(float f10) {
        this.f5802w0 = f10;
        float f11 = f10 * this.S.f12022g;
        for (int i = 0; i < 2; i++) {
            bu1 bu1Var = this.f5797u[i];
            zw1 zw1Var = bu1Var.f4882a;
            if (zw1Var.f13314v == 1) {
                Float valueOf = Float.valueOf(f11);
                zw1Var.b(2, valueOf);
                zw1 zw1Var2 = bu1Var.f4884c;
                if (zw1Var2 != null) {
                    zw1Var2.b(2, valueOf);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r10 == 0) goto La
            if (r7 == r0) goto L9
            r10 = r1
            goto Lb
        L9:
            r7 = r0
        La:
            r10 = r2
        Lb:
            r3 = 2
            if (r7 != r0) goto L10
            r9 = r3
            goto L13
        L10:
            if (r9 != r3) goto L13
            r9 = r1
        L13:
            boolean r0 = r6.W
            if (r7 != 0) goto L19
            r8 = r1
            goto L20
        L19:
            if (r8 != r1) goto L20
            if (r0 == 0) goto L1f
            r8 = 4
            goto L20
        L1f:
            r8 = r2
        L20:
            com.google.android.gms.internal.ads.vt1 r7 = r6.f5779a0
            boolean r0 = r7.f11994l
            if (r0 != r10) goto L2e
            int r0 = r7.f11996n
            if (r0 != r8) goto L2e
            int r0 = r7.f11995m
            if (r0 == r9) goto L8f
        L2e:
            com.google.android.gms.internal.ads.vt1 r7 = h(r9, r8, r10)
            r6.f5779a0 = r7
            r6.y(r2, r2)
            com.google.android.gms.internal.ads.nt1 r7 = r6.K
            com.google.android.gms.internal.ads.lt1 r8 = r7.f8856h
        L3b:
            if (r8 == 0) goto L4f
            com.google.android.gms.internal.ads.u r9 = r8.f8148o
            java.lang.Object r9 = r9.f11499w
            com.google.android.gms.internal.ads.r[] r9 = (com.google.android.gms.internal.ads.r[]) r9
            int r10 = r9.length
            r0 = r2
        L45:
            if (r0 >= r10) goto L4c
            r4 = r9[r0]
            int r0 = r0 + 1
            goto L45
        L4c:
            com.google.android.gms.internal.ads.lt1 r8 = r8.f8146m
            goto L3b
        L4f:
            boolean r8 = r6.T()
            if (r8 != 0) goto L66
            k()
            l()
            com.google.android.gms.internal.ads.vt1 r8 = r6.f5779a0
            r8.getClass()
            long r8 = r6.f5790n0
            n(r8)
            return
        L66:
            com.google.android.gms.internal.ads.vt1 r7 = r6.f5779a0
            int r7 = e
            r8 = 3
            com.google.android.gms.internal.ads.io0 r9 = r6.A
            if (r7 != r8) goto L8a
            com.google.android.gms.internal.ads.in0 r7 = r6.G
            r7.f7179v = r1
            java.lang.Object r7 = r7.f7180w
            com.google.android.gms.internal.ads.fu1 r7 = (com.google.android.gms.internal.ads.fu1) r7
            boolean r8 = r7.f6167v
            if (r8 != 0) goto L83
            long r4 = android.os.SystemClock.elapsedRealtime()
            r7.f6169x = r4
            r7.f6167v = r1
        L83:
            i()
            c(r3)
            return
        L8a:
            if (r7 != r3) goto L8f
            c(r3)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.f(int, int, int, boolean):void");
    }

    public final void g(boolean z3) {
        yx1 yx1Var = this.K.f8856h.f8141g.f8413a;
        long r8 = r(yx1Var, this.f5779a0.f12000r, true, false);
        if (r8 != this.f5779a0.f12000r) {
            vt1 vt1Var = this.f5779a0;
            this.f5779a0 = N(yx1Var, r8, vt1Var.f11987c, vt1Var.f11988d, z3, 5);
        }
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final void h(xx1 xx1Var) {
        this.A.b(8, xx1Var).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:458:0x0aa9, code lost:
    
        if (r6 == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06e0, code lost:
    
        if ((((float) (a() - r36.f5790n0)) / r36.G.f().f11870a) <= 10000000) goto L339;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07c5 A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07df A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, LOOP:6: B:260:0x07da->B:262:0x07df, LOOP_END, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0801 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0836 A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0856 A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0863 A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08cb A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, LOOP:9: B:313:0x08c8->B:315:0x08cb, LOOP_END, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08d9 A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x08ea A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0900 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0a7a A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b4a A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0b5f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0b60 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a9e A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x066f A[Catch: RuntimeException -> 0x060e, IOException -> 0x0613, pg1 -> 0x0618, va -> 0x061d, iw1 -> 0x0622, ns1 -> 0x0627, TryCatch #10 {iw1 -> 0x0622, ns1 -> 0x0627, pg1 -> 0x0618, va -> 0x061d, IOException -> 0x0613, RuntimeException -> 0x060e, blocks: (B:183:0x04fe, B:188:0x0512, B:190:0x051a, B:192:0x0527, B:206:0x056f, B:209:0x0582, B:211:0x0589, B:213:0x058d, B:215:0x0591, B:217:0x0597, B:219:0x059d, B:221:0x05a3, B:223:0x05a9, B:225:0x05b1, B:227:0x05d0, B:229:0x05da, B:230:0x05df, B:232:0x05e3, B:234:0x05e9, B:236:0x05f1, B:238:0x05f9, B:240:0x0633, B:244:0x063a, B:246:0x0645, B:248:0x0653, B:249:0x0665, B:252:0x07bf, B:254:0x07c5, B:256:0x07cb, B:259:0x07d0, B:260:0x07da, B:262:0x07df, B:268:0x0807, B:270:0x080d, B:274:0x081a, B:276:0x0822, B:281:0x0825, B:283:0x082d, B:338:0x0903, B:339:0x0908, B:341:0x0910, B:343:0x0919, B:345:0x0927, B:346:0x0940, B:348:0x0945, B:350:0x094d, B:352:0x0977, B:353:0x0952, B:355:0x095b, B:358:0x0964, B:363:0x0974, B:369:0x0981, B:371:0x0987, B:375:0x0994, B:377:0x09d0, B:379:0x09d7, B:381:0x09db, B:384:0x0a6e, B:386:0x0a7a, B:388:0x0a8b, B:389:0x0a94, B:390:0x0adf, B:393:0x0ae7, B:395:0x0aeb, B:399:0x0af8, B:401:0x0afb, B:405:0x0aff, B:407:0x0b05, B:409:0x0b0e, B:411:0x0b16, B:413:0x0b1c, B:415:0x0b22, B:416:0x0b44, B:418:0x0b4a, B:421:0x0b53, B:424:0x0b6e, B:429:0x0b67, B:431:0x0b6b, B:433:0x0b29, B:436:0x0b37, B:437:0x0b3f, B:438:0x0b40, B:439:0x0a98, B:441:0x0a9e, B:443:0x0aa2, B:446:0x0aab, B:448:0x0abb, B:450:0x0ac1, B:452:0x0acd, B:454:0x0ad2, B:456:0x0ad7, B:457:0x0adc, B:460:0x09e9, B:462:0x09ed, B:464:0x09ff, B:465:0x0a0a, B:467:0x0a12, B:470:0x0a1b, B:472:0x0a25, B:477:0x0a30, B:483:0x099c, B:485:0x09a0, B:486:0x09ba, B:488:0x09c0, B:490:0x097a, B:285:0x0836, B:287:0x083a, B:289:0x0840, B:291:0x0846, B:293:0x0850, B:296:0x0856, B:297:0x085a, B:299:0x0863, B:301:0x0875, B:303:0x087e, B:305:0x0886, B:308:0x0892, B:310:0x08bf, B:312:0x08c5, B:315:0x08cb, B:317:0x08d3, B:319:0x08d9, B:320:0x08dc, B:321:0x08e5, B:323:0x08ea, B:325:0x08f0, B:327:0x08f5, B:335:0x0902, B:496:0x066f, B:498:0x0675, B:500:0x067d, B:503:0x0686, B:505:0x068a, B:507:0x0692, B:510:0x0695, B:512:0x069b, B:514:0x06a5, B:516:0x06ad, B:518:0x06bb, B:520:0x06c3, B:522:0x06e2, B:524:0x0717, B:526:0x071b, B:528:0x072b, B:530:0x072f, B:535:0x0737, B:537:0x073d, B:539:0x075d, B:544:0x0766, B:550:0x078c, B:555:0x076f, B:557:0x0777, B:559:0x077d, B:560:0x0721, B:564:0x0795, B:566:0x079b, B:568:0x079f, B:571:0x07a5, B:577:0x07bc, B:578:0x07b3, B:580:0x07b9, B:587:0x057f), top: B:182:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0c47 A[ADDED_TO_REGION, LOOP:20: B:614:0x0c47->B:617:0x0c4f, LOOP_START, PHI: r2
      0x0c47: PHI (r2v32 com.google.android.gms.internal.ads.lt1) = (r2v30 com.google.android.gms.internal.ads.lt1), (r2v33 com.google.android.gms.internal.ads.lt1) binds: [B:613:0x0c44, B:617:0x0c4f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0bdb  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r37) {
        /*
            Method dump skipped, instructions count: 3408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.handleMessage(android.os.Message):boolean");
    }

    public final void i() {
        lt1 lt1Var = this.K.f8856h;
        if (lt1Var != null) {
            u uVar = lt1Var.f8148o;
            for (int i = 0; i < 2; i++) {
                if (uVar.c(i)) {
                    this.f5797u[i].C();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final /* bridge */ /* synthetic */ void j(ty1 ty1Var) {
        this.A.b(9, (xx1) ty1Var).a();
    }

    public final void k() {
        in0 in0Var = this.G;
        in0Var.f7179v = false;
        fu1 fu1Var = (fu1) in0Var.f7180w;
        if (fu1Var.f6167v) {
            fu1Var.b(fu1Var.e());
            fu1Var.f6167v = false;
        }
        for (int i = 0; i < 2; i++) {
            bu1 bu1Var = this.f5797u[i];
            zw1 zw1Var = bu1Var.f4882a;
            if (bu1.l(zw1Var)) {
                bu1.n(zw1Var);
            }
            zw1 zw1Var2 = bu1Var.f4884c;
            if (zw1Var2 != null && zw1Var2.B != 0) {
                bu1.n(zw1Var2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void l() {
        long j10;
        long j11;
        boolean z3;
        Object r11;
        boolean z9;
        long j12;
        long j13;
        long max;
        nt1 nt1Var = this.K;
        lt1 lt1Var = nt1Var.f8856h;
        if (lt1Var != null) {
            if (lt1Var.e) {
                j10 = lt1Var.f8136a.v();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!lt1Var.b()) {
                    nt1Var.y(lt1Var);
                    C();
                    Q(false);
                    L();
                }
                s(j10, true);
                if (j10 != this.f5779a0.f12000r) {
                    vt1 vt1Var = this.f5779a0;
                    j11 = -9223372036854775807L;
                    r11 = 0;
                    this.f5779a0 = N(vt1Var.f11986b, j10, vt1Var.f11987c, j10, true, 5);
                } else {
                    j11 = -9223372036854775807L;
                    r11 = 0;
                }
            } else {
                j11 = -9223372036854775807L;
                boolean z10 = false;
                in0 in0Var = this.G;
                if (lt1Var != nt1Var.i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                fu1 fu1Var = (fu1) in0Var.f7180w;
                zw1 zw1Var = (zw1) in0Var.f7182y;
                if (zw1Var != null && !zw1Var.J() && ((!z3 || ((zw1) in0Var.f7182y).B == 2) && (((zw1) in0Var.f7182y).I() || (!z3 && !((zw1) in0Var.f7182y).r0())))) {
                    kt1 kt1Var = (kt1) in0Var.f7183z;
                    kt1Var.getClass();
                    long e = kt1Var.e();
                    if (in0Var.f7178u) {
                        if (e < fu1Var.e()) {
                            if (fu1Var.f6167v) {
                                fu1Var.b(fu1Var.e());
                                fu1Var.f6167v = false;
                            }
                        } else {
                            in0Var.f7178u = false;
                            if (in0Var.f7179v && !fu1Var.f6167v) {
                                fu1Var.f6169x = SystemClock.elapsedRealtime();
                                fu1Var.f6167v = true;
                            }
                        }
                    }
                    fu1Var.b(e);
                    vb f10 = kt1Var.f();
                    if (!f10.equals((vb) fu1Var.f6170y)) {
                        fu1Var.a(f10);
                        ((et1) in0Var.f7181x).A.b(16, f10).a();
                    }
                } else {
                    in0Var.f7178u = true;
                    if (in0Var.f7179v && !fu1Var.f6167v) {
                        fu1Var.f6169x = SystemClock.elapsedRealtime();
                        fu1Var.f6167v = true;
                    }
                }
                long e8 = in0Var.e();
                this.f5790n0 = e8;
                long j14 = e8 - lt1Var.f8149p;
                long j15 = this.f5779a0.f12000r;
                ArrayList arrayList = this.H;
                if (!arrayList.isEmpty() && !this.f5779a0.f11986b.b()) {
                    if (this.f5793q0) {
                        this.f5793q0 = false;
                    }
                    vt1 vt1Var2 = this.f5779a0;
                    vt1Var2.f11985a.e(vt1Var2.f11986b.f13003a);
                    int min = Math.min(this.f5792p0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        q.b();
                        return;
                    } else {
                        if (min < arrayList.size() && arrayList.get(min) != null) {
                            q.b();
                            return;
                        }
                        this.f5792p0 = min;
                    }
                }
                if (in0Var.d()) {
                    boolean z11 = !this.f5780b0.f12172c;
                    vt1 vt1Var3 = this.f5779a0;
                    this.f5779a0 = N(vt1Var3.f11986b, j14, vt1Var3.f11987c, j14, z11, 6);
                    r11 = z10;
                } else {
                    vt1 vt1Var4 = this.f5779a0;
                    vt1Var4.f12000r = j14;
                    vt1Var4.f12001s = SystemClock.elapsedRealtime();
                    r11 = z10;
                }
            }
            this.f5779a0.f11998p = nt1Var.f8858k.d();
            vt1 vt1Var5 = this.f5779a0;
            vt1Var5.f11999q = R(vt1Var5.f11998p);
            vt1 vt1Var6 = this.f5779a0;
            if (vt1Var6.f11994l && vt1Var6.e == 3 && o(vt1Var6.f11985a, vt1Var6.f11986b)) {
                vt1 vt1Var7 = this.f5779a0;
                float f11 = 1.0f;
                if (vt1Var7.f11997o.f11870a == 1.0f) {
                    js1 js1Var = this.f5804x0;
                    long n10 = n(vt1Var7.f11985a, vt1Var7.f11986b.f13003a, vt1Var7.f12000r);
                    long j16 = this.f5779a0.f11999q;
                    if (js1Var.f7526c != j11) {
                        long j17 = n10 - j16;
                        long j18 = js1Var.f7532k;
                        if (j18 == j11) {
                            js1Var.f7532k = j17;
                            js1Var.f7533l = 0L;
                            z9 = 2;
                        } else {
                            float f12 = (((float) j17) * 9.999871E-4f) + (((float) j18) * 0.999f);
                            z9 = 2;
                            js1Var.f7532k = Math.max(j17, f12);
                            js1Var.f7533l = (((float) Math.abs(j17 - r12)) * 9.999871E-4f) + (((float) js1Var.f7533l) * 0.999f);
                        }
                        if (js1Var.f7531j != j11) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - js1Var.f7531j < 1000) {
                                f11 = js1Var.i;
                            }
                        } else {
                            j12 = 1000;
                        }
                        js1Var.f7531j = SystemClock.elapsedRealtime();
                        long j19 = (js1Var.f7533l * 3) + js1Var.f7532k;
                        if (js1Var.f7530h > j19) {
                            long u9 = bq0.u(j12);
                            boolean z12 = z9;
                            float f13 = js1Var.i - 1.0f;
                            long j20 = js1Var.e;
                            j13 = n10;
                            float f14 = (float) u9;
                            long j21 = js1Var.f7530h - ((f13 * f14) + (0.029999971f * f14));
                            long[] jArr = new long[3];
                            jArr[r11] = j19;
                            jArr[1] = j20;
                            jArr[z12 ? 1 : 0] = j21;
                            max = jArr[r11];
                            for (int i = 1; i < 3; i++) {
                                long j22 = jArr[i];
                                if (j22 > max) {
                                    max = j22;
                                }
                            }
                            js1Var.f7530h = max;
                        } else {
                            j13 = n10;
                            long j23 = js1Var.f7530h;
                            String str = bq0.f4860a;
                            max = Math.max(j23, Math.min(j13 - (Math.max(0.0f, js1Var.i - 1.0f) / 1.0E-7f), j19));
                            js1Var.f7530h = max;
                            long j24 = js1Var.f7529g;
                            if (j24 != j11 && max > j24) {
                                js1Var.f7530h = j24;
                                max = j24;
                            }
                        }
                        long j25 = j13 - max;
                        if (Math.abs(j25) < js1Var.f7524a) {
                            js1Var.i = 1.0f;
                            f11 = 1.0f;
                        } else {
                            f11 = Math.max(0.97f, Math.min((((float) j25) * 1.0E-7f) + 1.0f, 1.03f));
                            js1Var.i = f11;
                        }
                    }
                    in0 in0Var2 = this.G;
                    if (in0Var2.f().f11870a != f11) {
                        vb vbVar = new vb(f11, this.f5779a0.f11997o.f11871b);
                        this.A.d(16);
                        this.G.a(vbVar);
                        K(this.f5779a0.f11997o, in0Var2.f().f11870a, r11, r11);
                    }
                }
            }
        }
    }

    public final void m(int i, boolean z3) {
        boolean[] zArr = this.f5801w;
        if (zArr[i] != z3) {
            zArr[i] = z3;
            this.Q.e(new i(this, i, z3));
        }
    }

    public final long n(uh uhVar, Object obj, long j10) {
        long elapsedRealtime;
        int i = uhVar.o(obj, this.E).f9841c;
        ah ahVar = this.D;
        uhVar.b(i, ahVar, 0L);
        if (ahVar.f4501d == -9223372036854775807L || !ahVar.b() || !ahVar.f4503g) {
            return -9223372036854775807L;
        }
        long j11 = ahVar.e;
        String str = bq0.f4860a;
        if (j11 == -9223372036854775807L) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j11 + SystemClock.elapsedRealtime();
        }
        return bq0.u(elapsedRealtime - ahVar.f4501d) - j10;
    }

    public final boolean o(uh uhVar, yx1 yx1Var) {
        if (!yx1Var.b() && !uhVar.g()) {
            int i = uhVar.o(yx1Var.f13003a, this.E).f9841c;
            ah ahVar = this.D;
            uhVar.b(i, ahVar, 0L);
            if (ahVar.b() && ahVar.f4503g && ahVar.f4501d != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(long j10) {
        lt1 lt1Var;
        long j11;
        boolean z3 = true;
        if (!this.O) {
            if (!this.W) {
                z3 = false;
            } else {
                this.V.getClass();
            }
        }
        vt1 vt1Var = this.f5779a0;
        long j12 = 1000;
        long j13 = f5778y0;
        if (z3) {
            if (vt1Var.e != 3) {
                j12 = j13;
            }
            for (int i = 0; i < 2; i++) {
                bu1 bu1Var = this.f5797u[i];
                long j14 = this.f5790n0;
                zw1 zw1Var = bu1Var.f4882a;
                if (bu1.l(zw1Var)) {
                    j11 = zw1Var.T(j14);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                zw1 zw1Var2 = bu1Var.f4884c;
                if (zw1Var2 != null && zw1Var2.B != 0) {
                    j11 = Math.min(j11, zw1Var2.T(j14));
                }
                j12 = Math.min(j12, bq0.t(j11));
            }
            if (this.f5779a0.i()) {
                lt1 lt1Var2 = this.K.f8856h;
                if (lt1Var2 != null) {
                    lt1Var = lt1Var2.f8146m;
                } else {
                    lt1Var = null;
                }
                if (lt1Var != null) {
                    if (((float) this.f5790n0) + (((float) bq0.u(j12)) * this.f5779a0.f11997o.f11870a) >= ((float) lt1Var.a())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (vt1Var.e != 3 || T()) {
            j12 = j13;
        }
        this.A.f7185a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void q(dt1 dt1Var) {
        long longValue;
        long j10;
        long j11;
        yx1 E;
        boolean z3;
        long j12;
        int i;
        long j13;
        boolean z9;
        long j14;
        long j15;
        boolean z10;
        boolean z11;
        long j16;
        long j17;
        boolean z12;
        vt1 vt1Var;
        int i10;
        boolean z13 = true;
        if (this.X) {
            if (this.Y != null) {
                this.Z++;
                this.f5780b0.b(1);
            }
            this.Y = dt1Var;
            return;
        }
        this.f5780b0.b(1);
        uh uhVar = this.f5779a0.f11985a;
        int i11 = this.f5787i0;
        boolean z14 = this.f5788j0;
        ah ahVar = this.D;
        qg qgVar = this.E;
        Pair z15 = z(uhVar, dt1Var, i11, z14, ahVar, qgVar);
        if (z15 == null) {
            Pair w10 = w(this.f5779a0.f11985a);
            yx1 yx1Var = (yx1) w10.first;
            longValue = ((Long) w10.second).longValue();
            z3 = !this.f5779a0.f11985a.g();
            E = yx1Var;
            j12 = -9223372036854775807L;
            j10 = -9223372036854775807L;
        } else {
            Object obj = z15.first;
            longValue = ((Long) z15.second).longValue();
            long j18 = dt1Var.f5514c;
            if (j18 == -9223372036854775807L) {
                j11 = -9223372036854775807L;
                j10 = -9223372036854775807L;
            } else {
                j10 = -9223372036854775807L;
                j11 = longValue;
            }
            nt1 nt1Var = this.K;
            long j19 = j11;
            vt1 vt1Var2 = this.f5779a0;
            E = nt1Var.E(vt1Var2, vt1Var2.f11985a, obj, true, false);
            if (E.b()) {
                this.f5779a0.f11985a.o(E.f13003a, qgVar);
                int i12 = E.f13004b;
                a a10 = qgVar.f9843f.a(i12);
                int i13 = 0;
                while (true) {
                    int[] iArr = a10.f4290d;
                    if (i13 >= iArr.length || (i = iArr[i13]) == 0 || i == 1) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 == E.f13005c) {
                    qgVar.f9843f.getClass();
                }
                qgVar.f9843f.a(i12).getClass();
                j12 = Math.max(j19, 0L);
                longValue = 0;
                z3 = true;
            } else {
                if (j18 == -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                j12 = j19;
            }
        }
        try {
            if (this.f5779a0.f11985a.g()) {
                this.m0 = dt1Var;
            } else {
                vt1 vt1Var3 = this.f5779a0;
                if (z15 == null) {
                    if (vt1Var3.e != 1) {
                        c(4);
                    }
                    v(false, true, false, true);
                } else {
                    if (E.equals(vt1Var3.f11986b)) {
                        lt1 lt1Var = this.K.f8856h;
                        if (lt1Var != null && lt1Var.e && longValue != 0) {
                            rx1 rx1Var = lt1Var.f8136a;
                            long j20 = ahVar.f4505j;
                            if (this.W && j20 != j10) {
                                this.V.getClass();
                            }
                            j15 = rx1Var.e(longValue, this.U);
                        } else {
                            j15 = longValue;
                        }
                        if (bq0.t(j15) == bq0.t(this.f5779a0.f12000r) && ((i10 = (vt1Var = this.f5779a0).e) == 2 || i10 == 3)) {
                            longValue = vt1Var.f12000r;
                        }
                    } else {
                        j15 = longValue;
                    }
                    if (this.f5779a0.e == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nt1 nt1Var2 = this.K;
                    if (nt1Var2.f8856h != nt1Var2.i) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long r8 = r(E, j15, z11, z10);
                    if (longValue == r8) {
                        z13 = false;
                    }
                    boolean z16 = z3 | z13;
                    try {
                        vt1 vt1Var4 = this.f5779a0;
                        yx1 yx1Var2 = E;
                        try {
                            uh uhVar2 = vt1Var4.f11985a;
                            long j21 = j12;
                            try {
                                G(uhVar2, yx1Var2, uhVar2, vt1Var4.f11986b, j21, true);
                                E = yx1Var2;
                                j16 = j21;
                                j17 = r8;
                                z12 = z16;
                                this.f5779a0 = N(E, j17, j16, j17, z12, 2);
                            } catch (Throwable th) {
                                th = th;
                                E = yx1Var2;
                                j13 = j21;
                                j14 = r8;
                                z9 = z16;
                                this.f5779a0 = N(E, j14, j13, j14, z9, 2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            E = yx1Var2;
                            j13 = j12;
                            j14 = r8;
                            z9 = z16;
                            this.f5779a0 = N(E, j14, j13, j14, z9, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            z12 = z3;
            j17 = longValue;
            j16 = j12;
            this.f5779a0 = N(E, j17, j16, j17, z12, 2);
        } catch (Throwable th4) {
            th = th4;
            j13 = j12;
            z9 = z3;
            j14 = longValue;
        }
    }

    public final long r(yx1 yx1Var, long j10, boolean z3, boolean z9) {
        boolean z10;
        k();
        boolean z11 = true;
        y(false, true);
        if (z9 || this.f5779a0.e == 3) {
            c(2);
        }
        nt1 nt1Var = this.K;
        lt1 lt1Var = nt1Var.f8856h;
        lt1 lt1Var2 = lt1Var;
        while (lt1Var2 != null && !yx1Var.equals(lt1Var2.f8141g.f8413a)) {
            lt1Var2 = lt1Var2.f8146m;
        }
        if (z3 || lt1Var != lt1Var2 || (lt1Var2 != null && lt1Var2.f8149p + j10 < 0)) {
            B();
            if (lt1Var2 != null) {
                while (nt1Var.f8856h != lt1Var2) {
                    nt1Var.x();
                }
                nt1Var.y(lt1Var2);
                lt1Var2.f8149p = 1000000000000L;
                O(new boolean[2], this.K.i.a());
                lt1Var2.f8142h = true;
            }
        }
        C();
        if (this.W) {
            bu1[] bu1VarArr = this.f5797u;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                bu1 bu1Var = bu1VarArr[i];
                if (bu1Var.g() && bu1Var.f4882a.f13314v == 2) {
                    this.X = true;
                    break;
                }
                i++;
            }
        }
        if (lt1Var2 != null) {
            nt1Var.y(lt1Var2);
            if (!lt1Var2.e) {
                lt1Var2.f8141g = lt1Var2.f8141g.a(j10, -9223372036854775807L);
            } else if (lt1Var2.f8140f) {
                if (this.W) {
                    this.V.getClass();
                    if (!this.f5779a0.f11985a.g() && lt1Var2.f8141g.f8413a.equals(this.f5779a0.f11986b)) {
                        long j11 = lt1Var2.f8149p + j10;
                        bu1[] bu1VarArr2 = this.f5797u;
                        boolean z12 = true;
                        for (int i10 = 0; i10 < 2; i10++) {
                            bu1 bu1Var2 = bu1VarArr2[i10];
                            if (bu1Var2.g()) {
                                zw1 m4 = bu1Var2.m(lt1Var2);
                                if (m4 != null && m4.q(j11)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z12 &= z10;
                            }
                        }
                        if (z12) {
                            rx1 rx1Var = lt1Var2.f8136a;
                            long j12 = this.f5779a0.f12000r;
                            du1 du1Var = du1.f5523b;
                            if (rx1Var.e(j12, du1Var) == rx1Var.e(j10, du1Var)) {
                                z11 = false;
                            }
                        }
                    }
                }
                rx1 rx1Var2 = lt1Var2.f8136a;
                j10 = rx1Var2.b(j10);
                rx1Var2.X(j10 - this.F);
            }
            s(j10, z11);
            L();
        } else {
            nt1Var.B();
            s(j10, true);
        }
        Q(false);
        this.A.c(2);
        return j10;
    }

    public final void s(long j10, boolean z3) {
        long j11;
        lt1 lt1Var = this.K.f8856h;
        if (lt1Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = lt1Var.f8149p;
        }
        long j12 = j10 + j11;
        this.f5790n0 = j12;
        ((fu1) this.G.f7180w).b(j12);
        for (int i = 0; i < 2; i++) {
            bu1 bu1Var = this.f5797u[i];
            long j13 = this.f5790n0;
            zw1 m4 = bu1Var.m(lt1Var);
            if (m4 != null) {
                m4.N(j13, false, z3);
            }
        }
        for (lt1 lt1Var2 = r0.f8856h; lt1Var2 != null; lt1Var2 = lt1Var2.f8146m) {
            for (r rVar : (r[]) lt1Var2.f8148o.f11499w) {
            }
        }
    }

    public final void t() {
        cu1 cu1Var;
        for (int i = 0; i < 2; i++) {
            bu1 bu1Var = this.f5797u[i];
            if (this.W) {
                cu1Var = this.V;
            } else {
                cu1Var = null;
            }
            bu1Var.f4882a.b(18, cu1Var);
            zw1 zw1Var = bu1Var.f4884c;
            if (zw1Var != null) {
                zw1Var.b(18, cu1Var);
            }
        }
    }

    public final void u(boolean z3, boolean z9) {
        boolean z10;
        if (z3 || !this.f5789k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v(z10, false, true, false);
        this.f5780b0.b(z9 ? 1 : 0);
        this.f5806z.g(this.N);
        this.S.b(1, this.f5779a0.f11994l);
        c(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (r2.equals(r33.f5779a0.f11986b) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.v(boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r5.f9843f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair w(com.google.android.gms.internal.ads.uh r13) {
        /*
            r12 = this;
            boolean r0 = r13.g()
            r1 = 0
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.yx1 r13 = com.google.android.gms.internal.ads.vt1.f11984t
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            android.util.Pair r13 = android.util.Pair.create(r13, r0)
            return r13
        L13:
            boolean r0 = r12.f5788j0
            int r6 = r13.k(r0)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.ah r4 = r12.D
            com.google.android.gms.internal.ads.qg r5 = r12.E
            r3 = r13
            android.util.Pair r13 = m(r4, r5, r6, r7)
            com.google.android.gms.internal.ads.vt1 r7 = r12.f5779a0
            java.lang.Object r9 = r13.first
            r10 = 1
            r11 = 0
            com.google.android.gms.internal.ads.nt1 r6 = r12.K
            r8 = r3
            com.google.android.gms.internal.ads.yx1 r0 = r6.E(r7, r8, r9, r10, r11)
            java.lang.Object r13 = r13.second
            java.lang.Long r13 = (java.lang.Long) r13
            long r6 = r13.longValue()
            boolean r13 = b()
            if (r13 == 0) goto L6a
            java.lang.Object r13 = r0.f13003a
            r3.o(r13, r5)
            int r13 = r0.f13005c
            int r3 = r0.f13004b
            com.google.android.gms.internal.ads.eu r4 = r5.f9843f
            com.google.android.gms.internal.ads.a r3 = a(r3)
            r4 = 0
        L52:
            int[] r6 = r3.f4290d
            int r7 = r6.length
            if (r4 >= r7) goto L62
            r6 = r6[r4]
            if (r6 == 0) goto L62
            r7 = 1
            if (r6 != r7) goto L5f
            goto L62
        L5f:
            int r4 = r4 + 1
            goto L52
        L62:
            if (r13 != r4) goto L6b
            com.google.android.gms.internal.ads.eu r13 = r5.f9843f
            r13.getClass()
            goto L6b
        L6a:
            r1 = r6
        L6b:
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            android.util.Pair r13 = android.util.Pair.create(r0, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et1.w(com.google.android.gms.internal.ads.uh):android.util.Pair");
    }

    public final void x(uh uhVar, uh uhVar2) {
        if (uhVar.g() && uhVar2.g()) {
            return;
        }
        ArrayList arrayList = this.H;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            q.b();
        }
    }

    public final void y(boolean z3, boolean z9) {
        this.f5784f0 = z3;
        long j10 = -9223372036854775807L;
        if (z3 && !z9) {
            j10 = SystemClock.elapsedRealtime();
        }
        this.f5785g0 = j10;
    }
}