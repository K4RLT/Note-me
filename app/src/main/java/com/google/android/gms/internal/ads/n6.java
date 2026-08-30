package com.google.android.gms.internal.ads;
import a5.a;
import b0.a;
import b2.d2;
import g3.a;
import g5.q;
import g6.a;
import r2.i;
import r3.b;
import r3.c;
import r3.d;
import r3.e;
import r3.i;
import r3.j;
import r3.m;
import va.a;
import va.b;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class n6 implements n2 {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final mw1 O;
    public m6 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public p2 G;
    public i3[] H;
    public i3[] I;
    public boolean J;
    public boolean K;
    public long L;
    public long M;

    /* renamed from: a, reason: collision with root package name */
    public final o7 f8550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8551b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8552c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f8556h;
    public final xk0 i;

    /* renamed from: n, reason: collision with root package name */
    public final d2 f8561n;

    /* renamed from: o, reason: collision with root package name */
    public final jk0 f8562o;

    /* renamed from: p, reason: collision with root package name */
    public y51 f8563p;

    /* renamed from: q, reason: collision with root package name */
    public int f8564q;

    /* renamed from: r, reason: collision with root package name */
    public int f8565r;

    /* renamed from: s, reason: collision with root package name */
    public long f8566s;

    /* renamed from: t, reason: collision with root package name */
    public int f8567t;

    /* renamed from: u, reason: collision with root package name */
    public xk0 f8568u;

    /* renamed from: v, reason: collision with root package name */
    public long f8569v;

    /* renamed from: w, reason: collision with root package name */
    public int f8570w;

    /* renamed from: x, reason: collision with root package name */
    public long f8571x;

    /* renamed from: y, reason: collision with root package name */
    public long f8572y;

    /* renamed from: z, reason: collision with root package name */
    public long f8573z;

    /* renamed from: j, reason: collision with root package name */
    public final z11 f8557j = new z11(3);

    /* renamed from: k, reason: collision with root package name */
    public final xk0 f8558k = new xk0(16);
    public final xk0 e = new xk0(xy.I);

    /* renamed from: f, reason: collision with root package name */
    public final xk0 f8554f = new xk0(6);

    /* renamed from: g, reason: collision with root package name */
    public final xk0 f8555g = new xk0();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f8559l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f8560m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f8553d = new SparseArray();

    static {
        rv1 rv1Var = new rv1();
        rv1Var.e("application/x-emsg");
        O = new mw1(rv1Var);
    }

    public n6(o7 o7Var, int i, y51 y51Var) {
        this.f8550a = o7Var;
        this.f8551b = i;
        this.f8552c = Collections.unmodifiableList(y51Var);
        byte[] bArr = new byte[16];
        this.f8556h = bArr;
        this.i = new xk0(bArr);
        b51 b51Var = d51.f5314v;
        this.f8563p = y51.f12781y;
        this.f8572y = -9223372036854775807L;
        this.f8571x = -9223372036854775807L;
        this.f8573z = -9223372036854775807L;
        this.G = p2.f9325f;
        this.H = new i3[0];
        this.I = new i3[0];
        this.f8561n = new d2(new lx0(3, this));
        this.f8562o = new jk0(3);
        this.L = -1L;
        this.M = -1L;
    }

    public static void d(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i);
        throw a(null, sb2.toString());
    }

    public static void i(xk0 xk0Var, int i, y6 y6Var) {
        boolean z3;
        xk0Var.E(i + 8);
        int b10 = xk0Var.b();
        byte[] bArr = g6.f6309a;
        if ((b10 & 1) == 0) {
            if ((b10 & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int h3 = xk0Var.h();
            if (h3 == 0) {
                Arrays.fill(y6Var.f12793l, 0, y6Var.e, false);
                return;
            }
            int i10 = y6Var.e;
            xk0 xk0Var2 = y6Var.f12795n;
            if (h3 == i10) {
                Arrays.fill(y6Var.f12793l, 0, h3, z3);
                xk0Var2.y(xk0Var.B());
                y6Var.f12792k = true;
                y6Var.f12796o = true;
                xk0Var.H(xk0Var2.f12580a, 0, xk0Var2.f12582c);
                xk0Var2.E(0);
                y6Var.f12796o = false;
                return;
            }
            throw a(null, a.f(h3, i10, "Senc sample count ", " is different from fragment sample count", new StringBuilder(String.valueOf(h3).length() + 58 + String.valueOf(i10).length())));
        }
        throw b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair j(long j10, xk0 xk0Var) {
        long j11;
        long j12;
        xk0 xk0Var2 = xk0Var;
        xk0Var2.E(8);
        int a10 = a(xk0Var2.b());
        xk0Var2.G(4);
        long P = xk0Var2.P();
        if (a10 == 0) {
            j11 = xk0Var2.P();
            j12 = xk0Var2.P();
        } else {
            j11 = xk0Var2.j();
            j12 = xk0Var2.j();
        }
        long j13 = j12 + j10;
        long w10 = bq0.w(j11, 1000000L, P, RoundingMode.DOWN);
        xk0Var2.G(2);
        int L = xk0Var2.L();
        int[] iArr = new int[L];
        long[] jArr = new long[L];
        long[] jArr2 = new long[L];
        long[] jArr3 = new long[L];
        long j14 = j13;
        long j15 = w10;
        int i = 0;
        while (i < L) {
            int b10 = xk0Var2.b();
            if ((Integer.MIN_VALUE & b10) == 0) {
                long P2 = xk0Var2.P();
                iArr[i] = b10 & Integer.MAX_VALUE;
                jArr[i] = j14;
                jArr3[i] = j15;
                j11 += P2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long w11 = bq0.w(j11, 1000000L, P, RoundingMode.DOWN);
                jArr4[i] = w11 - jArr5[i];
                xk0Var2.G(4);
                j14 += iArr[i];
                i++;
                L = L;
                xk0Var2 = xk0Var;
                j15 = w11;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(w10), new h2(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.nu1 k(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n6.k(java.util.List):com.google.android.gms.internal.ads.nu1");
    }

    public final void a() {
        this.f8564q = 0;
        this.f8567t = 0;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:401:0x07e5, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x07e8, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0454  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r54) {
        /*
            Method dump skipped, instructions count: 2025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n6.c(long):void");
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        y51 y51Var;
        e3 r8 = ct.r(o2Var, true);
        if (r8 != null) {
            y51Var = d51.q(r8);
        } else {
            b51 b51Var = d51.f5314v;
            y51Var = y51.f12781y;
        }
        this.f8563p = y51Var;
        if (r8 == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        if ((this.f8551b & 32) == 0) {
            p2Var = new d(p2Var, this.f8550a);
        }
        this.G = p2Var;
        a();
        i3[] i3VarArr = new i3[2];
        this.H = i3VarArr;
        int i = 0;
        i3[] i3VarArr2 = (i3[]) bq0.o(i3VarArr, 0);
        this.H = i3VarArr2;
        for (i3 i3Var : i3VarArr2) {
            i3Var.e(O);
        }
        List list = this.f8552c;
        this.I = new i3[list.size()];
        int i10 = 100;
        while (i < this.I.length) {
            int i11 = i10 + 1;
            i3 A = this.G.A(i10, 3);
            A.e((mw1) list.get(i));
            this.I[i] = A;
            i++;
            i10 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        SparseArray sparseArray = this.f8553d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((m6) sparseArray.valueAt(i)).a();
        }
        this.f8560m.clear();
        this.f8570w = 0;
        ((PriorityQueue) this.f8561n.e).clear();
        this.f8571x = j11;
        this.f8559l.clear();
        this.M = -1L;
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x08f3, code lost:
    
        throw com.google.android.gms.internal.ads.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x00db, code lost:
    
        r14 = r3.f8256a;
        r2 = r3.f8257b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x00e6, code lost:
    
        if (r42.f8564q != 3) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x00ea, code lost:
    
        if (r3.f8267n != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x00ec, code lost:
    
        r4 = r3.f8259d.f13089d[r3.f8260f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x00fb, code lost:
    
        r42.B = r4;
        r4 = r3.f8259d.f13086a.f12154g.f8459o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0109, code lost:
    
        if (java.util.Objects.equals(r4, "video/avc") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x010d, code lost:
    
        if ((r13 & 64) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x010f, code lost:
    
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0120, code lost:
    
        r42.E = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0128, code lost:
    
        if (r3.f8260f >= i) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x012a, code lost:
    
        r43.u(r42.B);
        r0 = e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0133, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0136, code lost:
    
        r4 = r2.f12795n;
        r0 = r0.f12472d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x013a, code lost:
    
        if (r0 == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x013c, code lost:
    
        r4.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x013f, code lost:
    
        r0 = r3.f8260f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0143, code lost:
    
        if (r2.f12792k == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0149, code lost:
    
        if (r2.f12793l[r0] == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x014b, code lost:
    
        r4.G(r4.L() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0158, code lost:
    
        if (c() != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x015a, code lost:
    
        r42.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x015d, code lost:
    
        r42.f8564q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0160, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0169, code lost:
    
        if (r3.f8259d.f13086a.f12155h != r31) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x016b, code lost:
    
        r42.B -= 8;
        r43.u(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0176, code lost:
    
        r4 = "audio/ac4".equals(r3.f8259d.f13086a.f12154g.f8459o);
        r8 = r42.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0186, code lost:
    
        if (r4 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0188, code lost:
    
        r42.C = d(r8, 7);
        com.google.android.gms.internal.ads.ay0.w(r42.B, r5);
        r14.a(7, r5);
        r5 = r42.C + 7;
        r42.C = r5;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x01a7, code lost:
    
        r42.B += r5;
        r42.f8564q = 4;
        r42.D = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x019f, code lost:
    
        r4 = 0;
        r5 = d(r8, 0);
        r42.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0112, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0119, code lost:
    
        if (java.util.Objects.equals(r4, "video/hevc") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x011d, code lost:
    
        if ((r13 & 128) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x00f5, code lost:
    
        r4 = r2.f12790h[r3.f8260f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x01b1, code lost:
    
        r4 = r3.f8259d;
        r5 = r4.f13086a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x01b7, code lost:
    
        if (r3.f8267n != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x01b9, code lost:
    
        r8 = r4.f13090f[r3.f8260f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x01c6, code lost:
    
        r2 = r5.f12157k;
        r4 = r5.f12154g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x01ca, code lost:
    
        if (r2 == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x01cc, code lost:
    
        r5 = r42.f8554f;
        r10 = r5.f12580a;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r13 = 4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x01dc, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x01e2, code lost:
    
        if (r42.C >= r42.B) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x01e4, code lost:
    
        r2 = r42.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x01e6, code lost:
    
        if (r2 != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x01eb, code lost:
    
        if (r42.I.length > 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x01ef, code lost:
    
        if (r42.E != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x01f2, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0209, code lost:
    
        r43.v(r10, r13, r16 + r2);
        r5.E(0);
        r17 = r5.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0216, code lost:
    
        if (r17 < 0) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0218, code lost:
    
        r42.D = r17 - r2;
        r15 = r42.e;
        r44 = r13;
        r15.E(0);
        r14.a(4, r15);
        r42.C += 4;
        r42.B += r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0236, code lost:
    
        if (r42.I.length <= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0238, code lost:
    
        if (r2 <= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x023a, code lost:
    
        r13 = com.google.android.gms.internal.ads.xy.f0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x023e, code lost:
    
        if (r13 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0241, code lost:
    
        r15 = r13.hashCode();
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x024a, code lost:
    
        if (r15 == (-1662541442)) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x024f, code lost:
    
        if (r15 == 1331836730) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0254, code lost:
    
        if (r15 == 1331856911) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x025d, code lost:
    
        if (r13.equals("video/vvc") == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0269, code lost:
    
        if (((r10[r29] & 248) >> 3) != 23) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0291, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0298, code lost:
    
        r42.F = r11;
        r14.a(r2, r5);
        r42.C += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02a2, code lost:
    
        if (r2 <= 0) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x02a6, code lost:
    
        if (r42.E != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x02ac, code lost:
    
        if (com.google.android.gms.internal.ads.xy.Q(r10, r2, r4) == false) goto L637;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x02ae, code lost:
    
        r42.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x02b1, code lost:
    
        r13 = r44;
        r2 = r16;
        r11 = r34;
        r23 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0293, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0272, code lost:
    
        if (r13.equals("video/avc") == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x027a, code lost:
    
        if ((r10[4] & 31) != r23) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0283, code lost:
    
        if (r13.equals("video/hevc") == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x028f, code lost:
    
        if (((r10[4] & 126) >> 1) != 39) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0295, code lost:
    
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x02c2, code lost:
    
        throw com.google.android.gms.internal.ads.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x01f4, code lost:
    
        r2 = com.google.android.gms.internal.ads.xy.J(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0204, code lost:
    
        if ((r16 + r2) <= (r42.B - r42.C)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0207, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x02c3, code lost:
    
        r34 = r11;
        r44 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x02c9, code lost:
    
        if (r42.F == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x02cb, code lost:
    
        r11 = r42.f8555g;
        r11.y(r2);
        r43.v(r11.f12580a, 0, r42.D);
        r14.a(r42.D, r11);
        r2 = r42.D;
        r2 = com.google.android.gms.internal.ads.xy.o(r11.f12580a, r11.f12582c);
        r11.E(0);
        r11.C(r2);
        r2 = r4.f8461q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x02f2, code lost:
    
        if (r2 != (-1)) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x02f6, code lost:
    
        if (r12.f1436a == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x02f8, code lost:
    
        r12.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0303, code lost:
    
        r12.d(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x030f, code lost:
    
        if ((b() & 4) == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0311, code lost:
    
        r12.e(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0314, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x031c, code lost:
    
        r42.C += r2;
        r42.D -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x02fe, code lost:
    
        if (r12.f1436a == r2) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0300, code lost:
    
        r12.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0317, code lost:
    
        r2 = r14.d(r43, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0327, code lost:
    
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x036c, code lost:
    
        r0 = b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0372, code lost:
    
        if (r42.E != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0374, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0377, code lost:
    
        r17 = r0;
        r0 = e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x037d, code lost:
    
        if (r0 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x037f, code lost:
    
        r20 = r0.f12471c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0386, code lost:
    
        r15 = r8;
        r14.c(r15, r17, r42.B, 0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0394, code lost:
    
        if (r34.isEmpty() != false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0396, code lost:
    
        r0 = (com.google.android.gms.internal.ads.k6) r34.removeFirst();
        r2 = r42.f8570w;
        r8 = r0.f7665c;
        r42.f8570w = r2 - r8;
        r4 = r0.f7663a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x03a7, code lost:
    
        if (r0.f7664b == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x03a9, code lost:
    
        r4 = r4 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x03aa, code lost:
    
        r5 = r4;
        r0 = r42.H;
        r2 = r0.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x03af, code lost:
    
        if (r11 >= r2) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x03b1, code lost:
    
        r0[r11].c(r5, 1, r8, r42.f8570w, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x03c1, code lost:
    
        if (c() != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x03c3, code lost:
    
        r42.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x03c6, code lost:
    
        r42.f8564q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x03ca, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0384, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x032a, code lost:
    
        r34 = r11;
        r2 = r3.f8265l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x032e, code lost:
    
        if (r2 != null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0337, code lost:
    
        if (com.google.android.gms.internal.ads.x21.o(r4.f8459o) == false) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0339, code lost:
    
        r4 = com.google.android.gms.internal.ads.x21.R(r43, r42.B, r3.f8266m);
        r3.f8266m = r4;
        r4.getClass();
        r5 = new com.google.android.gms.internal.ads.rv1(r4);
        r5.f10311r = r2.f8463s;
        r14.e(new com.google.android.gms.internal.ads.mw1(r5));
        r3.f8265l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x035a, code lost:
    
        r2 = r42.C;
        r4 = r42.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x035e, code lost:
    
        if (r2 >= r4) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0360, code lost:
    
        r42.C += r14.d(r43, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x01c0, code lost:
    
        r8 = i[r3.f8260f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x067c, code lost:
    
        r5 = r42.f8566s - r42.f8567t;
        r3 = r42.f8568u;
        r5 = (int) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0687, code lost:
    
        if (r3 == null) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0689, code lost:
    
        r43.v(r3.f12580a, 8, r5);
        r6 = r42.f8565r;
        r5 = new com.google.android.gms.internal.ads.zv0(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x069b, code lost:
    
        if (r9.isEmpty() != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x069d, code lost:
    
        ((com.google.android.gms.internal.ads.iv0) r9.peek()).f7234d.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x06ad, code lost:
    
        if (r6 != 1936286840) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x06af, code lost:
    
        r3 = j(r43.n(), r3);
        r7.B((com.google.android.gms.internal.ads.h2) r3.second);
        r42.f8573z = ((java.lang.Long) r3.first).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x06ca, code lost:
    
        if (r42.K != false) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x06cc, code lost:
    
        r4 = r42.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x06d7, code lost:
    
        if (((java.util.LinkedHashMap) r7.f7466v).size() != 1) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x06d9, code lost:
    
        r3 = (com.google.android.gms.internal.ads.a3) r3.second;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x06e2, code lost:
    
        r4.B(r3);
        r42.J = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x06de, code lost:
    
        r3 = r7.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x06ec, code lost:
    
        if (r6 != 1701671783) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x06f1, code lost:
    
        if (r42.H.length == 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x06f3, code lost:
    
        r3.E(8);
        r5 = com.google.android.gms.internal.ads.a(b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0705, code lost:
    
        if (r5 == 0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0708, code lost:
    
        if (r5 == 1) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x070a, code lost:
    
        a.t(new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 35), "Skipping unsupported emsg version: ", r5, "FragmentedMp4Extractor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0720, code lost:
    
        r12 = r3.P();
        r8 = j();
        r14 = java.math.RoundingMode.DOWN;
        r4 = com.google.android.gms.internal.ads.bq0.w(r8, 1000000, r12, r14);
        r8 = com.google.android.gms.internal.ads.bq0.w(r3.P(), 1000, r12, r14);
        r10 = r3.P();
        r12 = m();
        r12.getClass();
        r13 = m();
        r13.getClass();
        r16 = -9223372036854775807L;
        r14 = r10;
        r10 = r8;
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0791, code lost:
    
        r6 = new byte[r3.B()];
        r3.H(r6, 0, r3.B());
        r3 = r42.f8557j;
        r7 = (java.io.ByteArrayOutputStream) r3.f13046v;
        r7.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x07ac, code lost:
    
        r3 = (java.io.DataOutputStream) r3.f13047w;
        r3.writeBytes(r12);
        r3.writeByte(0);
        r3.writeBytes(r13);
        r3.writeByte(0);
        r3.writeLong(r10);
        r3.writeLong(r14);
        r3.write(r6);
        r3.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x07cd, code lost:
    
        r2 = new com.google.android.gms.internal.ads.xk0(r7.toByteArray());
        r3 = r2.B();
        r6 = r42.H;
        r7 = r6.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x07d8, code lost:
    
        if (r10 >= r7) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x07da, code lost:
    
        r11 = r6[r10];
        r2.E(0);
        r11.a(r3, r2);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x07e8, code lost:
    
        if (r4 != r16) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x07ea, code lost:
    
        r11.addLast(new com.google.android.gms.internal.ads.k6(r3, r8, true));
        r42.f8570w += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0801, code lost:
    
        if (r11.isEmpty() != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0803, code lost:
    
        r11.addLast(new com.google.android.gms.internal.ads.k6(r3, r4, false));
        r42.f8570w += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0812, code lost:
    
        r2 = r42.H;
        r6 = r2.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0816, code lost:
    
        if (r11 >= r6) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0818, code lost:
    
        r2[r11].c(r4, 1, r3, 0, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x082a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x082b, code lost:
    
        q.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x082f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0754, code lost:
    
        r12 = m();
        r12.getClass();
        r13 = m();
        r13.getClass();
        r18 = r3.P();
        r14 = r3.P();
        r20 = java.math.RoundingMode.DOWN;
        r4 = com.google.android.gms.internal.ads.bq0.w(r14, 1000000, r18, r20);
        r8 = r42.f8573z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0777, code lost:
    
        if (r8 == (-9223372036854775807L)) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0779, code lost:
    
        r8 = r8 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x077c, code lost:
    
        r10 = com.google.android.gms.internal.ads.bq0.w(r3.P(), 1000, r18, r20);
        r14 = r3.P();
        r16 = r8;
        r8 = r4;
        r4 = r16;
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x077b, code lost:
    
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0833, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0833, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0830, code lost:
    
        r43.u(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x05af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0939  */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r43, a r44) {
        /*
            Method dump skipped, instructions count: 2828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n6.h(com.google.android.gms.internal.ads.o2, a):int");
    }

    public final void l(a3 a3Var, a aVar) {
        this.G.B(a3Var);
        this.J = true;
        aVar.f1139v = this.M;
        a();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final /* synthetic */ List zzb() {
        return this.f8563p;
    }
}
