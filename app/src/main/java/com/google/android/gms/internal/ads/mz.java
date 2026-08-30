package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class mz extends jz implements as1 {
    public static final AtomicInteger I = new AtomicInteger(0);
    public final f3 A;
    public final b0.a B;
    public ByteBuffer C;
    public boolean D;
    public final Object E;
    public final String F;
    public final int G;
    public boolean H;

    /* renamed from: x, reason: collision with root package name */
    public String f8498x;

    /* renamed from: y, reason: collision with root package name */
    public final qy f8499y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8500z;

    public mz(h00 h00Var, qy qyVar) {
        super(h00Var);
        h31 l31Var;
        this.f8499y = qyVar;
        this.A = new f3(3, (byte) 0);
        this.B = new b0.a(11);
        this.E = new Object();
        String n10 = h00Var.n();
        if (n10 == null) {
            l31Var = y21.f12763u;
        } else {
            l31Var = new l31(n10);
        }
        this.F = (String) l31Var.a();
        this.G = h00Var.q();
        I.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void a() {
        I.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.google.android.gms.internal.ads.wy] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.google.android.gms.internal.ads.as1, com.google.android.gms.internal.ads.jz, com.google.android.gms.internal.ads.mz] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.jz
    public final boolean b(String str) {
        String str2;
        boolean r62;
        tl1 tl1Var;
        long j10;
        String str3 = str;
        this.f8498x = str3;
        String str4 = "error";
        String concat = "cache:".concat(String.valueOf(l9.d.d(str3, "MD5")));
        try {
            z11 z11Var = new z11(9);
            String str5 = this.f7584v;
            qy qyVar = this.f8499y;
            tl1 tl1Var2 = new tl1(str5, qyVar.f10028d, qyVar.e, true, z11Var);
            tl1Var2.b(this);
            if (qyVar.i) {
                tl1Var2 = new wy(this.f7583u, tl1Var2, this.F, this.G);
            }
            tl1Var2.a(new dj1(Uri.parse(str3), 0L, -1L));
            h00 h00Var = (h00) this.f7585w.get();
            if (h00Var != null) {
                h00Var.u0(concat, this);
            }
            f9.k.C.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            nl nlVar = sl.f10770i0;
            g9.r rVar = g9.r.e;
            long longValue = ((Long) rVar.f17698c.a(nlVar)).longValue();
            long longValue2 = ((Long) rVar.f17698c.a(sl.f10755h0)).longValue();
            this.C = ByteBuffer.allocate(qyVar.f10027c);
            byte[] bArr = new byte[8192];
            long j11 = currentTimeMillis;
            while (true) {
                try {
                    int e = tl1Var2.e(bArr, 0, Math.min(this.C.remaining(), 8192));
                    if (e == -1) {
                        this.H = true;
                        str3 = str;
                        l9.d.f20036b.post(new hz((jz) this, str3, concat, (int) this.B.a(this.C)));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        synchronized (this.E) {
                            tl1Var = tl1Var2;
                            try {
                                if (!this.f8500z) {
                                    j10 = currentTimeMillis;
                                    this.C.put(bArr, 0, e);
                                } else {
                                    j10 = currentTimeMillis;
                                }
                            } finally {
                            }
                        }
                        if (this.C.remaining() <= 0) {
                            o();
                            return true;
                        }
                        r62 = this.f8500z;
                        try {
                            if (r62 == 0) {
                                long currentTimeMillis2 = System.currentTimeMillis();
                                if (currentTimeMillis2 - j11 >= longValue) {
                                    o();
                                    j11 = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - j10 <= 1000 * longValue2) {
                                    str4 = str2;
                                    tl1Var2 = tl1Var;
                                    currentTimeMillis = j10;
                                } else {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                                    sb2.append("Timeout exceeded. Limit: ");
                                    sb2.append(longValue2);
                                    sb2.append(" sec");
                                    throw new IOException(sb2.toString());
                                }
                            } else {
                                int limit = this.C.limit();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(limit).length() + 24);
                                sb3.append("Precache abort at ");
                                sb3.append(limit);
                                sb3.append(" bytes");
                                throw new IOException(sb3.toString());
                            }
                        } catch (Exception e8) {
                            e = e8;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String o10 = p.a.o(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                            String l10 = a5.a.l(new StringBuilder(o10.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", o10);
                            int i = k9.a0.f19634b;
                            l9.i.f(l10);
                            m(str3, concat, r62, o10);
                            return false;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        r62 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String o102 = p.a.o(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                        String l102 = a5.a.l(new StringBuilder(o102.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", o102);
                        int i10 = k9.a0.f19634b;
                        l9.i.f(l102);
                        m(str3, concat, r62, o102);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str3 = str;
                    str2 = str4;
                    r62 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String o1022 = p.a.o(new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), canonicalName22, ":", message22);
                    String l1022 = a5.a.l(new StringBuilder(o1022.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", o1022);
                    int i102 = k9.a0.f19634b;
                    l9.i.f(l1022);
                    m(str3, concat, r62, o1022);
                    return false;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final void c(qb1 qb1Var, dj1 dj1Var, boolean z3) {
        if (qb1Var instanceof tl1) {
            ((ArrayList) this.A.f5900w).add((tl1) qb1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void l() {
        this.f8500z = true;
    }

    public final void o() {
        boolean z3;
        f3 f3Var = this.A;
        Iterator it = ((ArrayList) f3Var.f5900w).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((tl1) it.next()).f().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        f3Var.f5899v = Math.max(f3Var.f5899v, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) f3Var.f5899v;
        int a10 = (int) this.B.a(this.C);
        int position = this.C.position();
        int round = Math.round((position / i) * a10);
        int i10 = wz.O.get();
        int i11 = wz.P.get();
        String str = this.f8498x;
        String concat = "cache:".concat(String.valueOf(l9.d.d(str, "MD5")));
        long j10 = round;
        if (round > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        l9.d.f20036b.post(new fz(this, str, concat, position, i, j10, a10, z3, i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final void e(dj1 dj1Var, boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final void k(dj1 dj1Var, boolean z3, int i) {
    }
}
