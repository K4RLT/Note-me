package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r6 implements n2 {
    public static final /* synthetic */ int G = 0;
    public int A;
    public long B;
    public p2 C;
    public q6[] D;
    public long[][] E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public final o7 f10103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10104b;

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f10105c;

    /* renamed from: d, reason: collision with root package name */
    public final xk0 f10106d;
    public final xk0 e;

    /* renamed from: f, reason: collision with root package name */
    public final xk0 f10107f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10108g;

    /* renamed from: h, reason: collision with root package name */
    public final u6 f10109h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10110j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10111k;

    /* renamed from: l, reason: collision with root package name */
    public y51 f10112l;

    /* renamed from: m, reason: collision with root package name */
    public int f10113m;

    /* renamed from: n, reason: collision with root package name */
    public int f10114n;

    /* renamed from: o, reason: collision with root package name */
    public long f10115o;

    /* renamed from: p, reason: collision with root package name */
    public int f10116p;

    /* renamed from: q, reason: collision with root package name */
    public xk0 f10117q;

    /* renamed from: r, reason: collision with root package name */
    public int f10118r;

    /* renamed from: s, reason: collision with root package name */
    public int f10119s;

    /* renamed from: t, reason: collision with root package name */
    public int f10120t;

    /* renamed from: u, reason: collision with root package name */
    public int f10121u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10122v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10123w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10124x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10125y;

    /* renamed from: z, reason: collision with root package name */
    public int f10126z;

    static {
        int i = ct.G;
    }

    public r6(o7 o7Var, int i) {
        this.f10103a = o7Var;
        this.f10104b = i;
        b51 b51Var = d51.f5314v;
        this.f10112l = y51.f12781y;
        this.f10113m = 0;
        this.f10109h = new u6();
        this.i = new ArrayList();
        this.f10107f = new xk0(16);
        this.f10108g = new ArrayDeque();
        this.f10105c = new xk0(xy.I);
        this.f10106d = new xk0(6);
        this.e = new xk0();
        this.f10118r = -1;
        this.C = p2.f9325f;
        this.D = new q6[0];
        this.f10110j = new ArrayList();
        this.f10111k = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (((com.google.android.gms.internal.ads.mu0) r12).f8424a.equals("auxiliary.tracks.interleaved") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (((com.google.android.gms.internal.ads.mu0) r12).f8424a.equals("auxiliary.tracks.map") != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r46) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r6.a(long):void");
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        y51 y51Var;
        e3 r8 = ct.r(o2Var, false);
        if (r8 != null) {
            y51Var = d51.q(r8);
        } else {
            b51 b51Var = d51.f5314v;
            y51Var = y51.f12781y;
        }
        this.f10112l = y51Var;
        if (r8 != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        if ((this.f10104b & 16) == 0) {
            p2Var = new d(p2Var, this.f10103a);
        }
        this.C = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        this.f10108g.clear();
        this.f10116p = 0;
        this.f10118r = -1;
        this.f10119s = 0;
        this.f10120t = 0;
        this.f10121u = 0;
        this.f10122v = false;
        this.f10126z = 0;
        this.A = 0;
        this.f10110j.clear();
        this.f10111k.clear();
        if (j10 == 0) {
            if (this.f10113m != 3) {
                this.f10113m = 0;
                this.f10116p = 0;
                return;
            } else {
                u6 u6Var = this.f10109h;
                u6Var.f11556a.clear();
                u6Var.f11557b = 0;
                this.i.clear();
                return;
            }
        }
        for (q6 q6Var : this.D) {
            z6 z6Var = q6Var.f9761b;
            int a10 = z6Var.a(j11);
            if (a10 == -1) {
                a10 = z6Var.b(j11);
            }
            q6Var.e = a10;
            j3 j3Var = q6Var.f9763d;
            if (j3Var != null) {
                j3Var.f7302b = false;
                j3Var.f7303c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x065a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x03a0, code lost:
    
        if (r11 < r31) goto L154;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:225:0x017d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x065a A[EDGE_INSN: B:154:0x065a->B:155:0x065a BREAK  A[LOOP:0: B:2:0x0006->B:55:0x0006], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, com.google.android.gms.internal.ads.y2] */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r38, b0.a r39) {
        /*
            Method dump skipped, instructions count: 2058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r6.h(com.google.android.gms.internal.ads.o2, b0.a):int");
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final /* synthetic */ List zzb() {
        return this.f10112l;
    }

    public r6() {
        this(o7.f8995g, 16);
    }
}
