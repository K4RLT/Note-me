package com.google.android.gms.internal.ads;
import b0.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i4 implements n2 {

    /* renamed from: b, reason: collision with root package name */
    public p2 f6973b;

    /* renamed from: c, reason: collision with root package name */
    public int f6974c;

    /* renamed from: d, reason: collision with root package name */
    public int f6975d;
    public int e;

    /* renamed from: g, reason: collision with root package name */
    public m4 f6977g;

    /* renamed from: h, reason: collision with root package name */
    public o2 f6978h;
    public f3 i;

    /* renamed from: j, reason: collision with root package name */
    public r6 f6979j;

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f6972a = new xk0(2);

    /* renamed from: f, reason: collision with root package name */
    public long f6976f = -1;

    public final void a() {
        p2 p2Var = this.f6973b;
        p2Var.getClass();
        p2Var.z();
        this.f6973b.B(new r2(-9223372036854775807L, 0L));
        this.f6974c = 6;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        String m4;
        xk0 xk0Var = this.f6972a;
        xk0Var.y(2);
        o2Var.y(xk0Var.f12580a, 0, 2);
        if (xk0Var.L() == 65496) {
            while (true) {
                xk0Var.y(2);
                o2Var.y(xk0Var.f12580a, 0, 2);
                int L = xk0Var.L();
                this.f6975d = L;
                if (L == 65498) {
                    break;
                }
                xk0Var.y(2);
                o2Var.y(xk0Var.f12580a, 0, 2);
                int L2 = xk0Var.L() - 2;
                if (L2 < 0) {
                    break;
                }
                if (this.f6975d != 65505) {
                    o2Var.s(L2);
                } else {
                    xk0Var.y(L2);
                    o2Var.y(xk0Var.f12580a, 0, L2);
                    if (Objects.equals(xk0Var.m(), "http://ns.adobe.com/xap/1.0/") && (m4 = xk0Var.m()) != null) {
                        String[] strArr = an1.f4554v;
                        for (int i = 0; i < 4; i++) {
                            if (m4.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f6973b = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f6974c = 0;
            this.f6979j = null;
        } else if (this.f6974c == 5) {
            r6 r6Var = this.f6979j;
            r6Var.getClass();
            r6Var.g(j10, j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0183, code lost:
    
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.o2 r34, a r35) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i4.h(com.google.android.gms.internal.ads.o2, a):int");
    }
}
