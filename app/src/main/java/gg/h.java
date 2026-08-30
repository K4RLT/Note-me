package gg;
import m.g;

import a0.f0;
import wa.d6;
import ya.y0;

/* loaded from: classes.dex */
public final class h extends d6 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f17770a;

    public h(f0 f0Var, fg.c cVar) {
        cVar.getClass();
        this.f17770a = f0Var;
    }

    @Override // wa.d6, dg.b
    public final int h() {
        f0 f0Var = this.f17770a;
        String j10 = f0Var.j();
        try {
            j10.getClass();
            pe.s a10 = y0.a(j10);
            if (a10 != null) {
                return a10.f22708u;
            }
            mf.g(j10);
            throw null;
        } catch (IllegalArgumentException unused) {
            f0.u(f0Var, "Failed to parse type 'UInt' for input '" + j10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // wa.d6, dg.b
    public final long n() {
        f0 f0Var = this.f17770a;
        String j10 = f0Var.j();
        try {
            j10.getClass();
            pe.u b10 = y0.b(j10);
            if (b10 != null) {
                return b10.f22710u;
            }
            mf.g(j10);
            throw null;
        } catch (IllegalArgumentException unused) {
            f0.u(f0Var, "Failed to parse type 'ULong' for input '" + j10 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // dg.a
    public final int t(cg.d dVar) {
        dVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: IllegalArgumentException -> 0x0030, TryCatch #0 {IllegalArgumentException -> 0x0030, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001f, B:10:0x0029, B:13:0x002c, B:14:0x002f), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[Catch: IllegalArgumentException -> 0x0030, TryCatch #0 {IllegalArgumentException -> 0x0030, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001f, B:10:0x0029, B:13:0x002c, B:14:0x002f), top: B:2:0x0007 }] */
    @Override // wa.d6, dg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte x() {
        /*
            r6 = this;
            a0.f0 r0 = r6.f17770a
            java.lang.String r1 = r0.j()
            r2 = 0
            r1.getClass()     // Catch: java.lang.IllegalArgumentException -> L30
            pe.s r3 = ya.y0.a(r1)     // Catch: java.lang.IllegalArgumentException -> L30
            if (r3 == 0) goto L26
            int r3 = r3.f22708u     // Catch: java.lang.IllegalArgumentException -> L30
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 ^ r3
            r5 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            int r4 = java.lang.Integer.compare(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L30
            if (r4 <= 0) goto L1f
            goto L26
        L1f:
            byte r3 = (byte) r3     // Catch: java.lang.IllegalArgumentException -> L30
            pe.q r4 = new pe.q     // Catch: java.lang.IllegalArgumentException -> L30
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L30
            goto L27
        L26:
            r4 = r2
        L27:
            if (r4 == 0) goto L2c
            byte r0 = r4.f22706u     // Catch: java.lang.IllegalArgumentException -> L30
            return r0
        L2c:
            mf.g(r1)     // Catch: java.lang.IllegalArgumentException -> L30
            throw r2     // Catch: java.lang.IllegalArgumentException -> L30
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse type 'UByte' for input '"
            r3.<init>(r4)
            r3.append(r1)
            r1 = 39
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            r4 = 6
            a0.f0.u(r0, r1, r3, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.h.x():byte");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: IllegalArgumentException -> 0x0030, TryCatch #0 {IllegalArgumentException -> 0x0030, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001f, B:10:0x0029, B:13:0x002c, B:14:0x002f), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[Catch: IllegalArgumentException -> 0x0030, TryCatch #0 {IllegalArgumentException -> 0x0030, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001f, B:10:0x0029, B:13:0x002c, B:14:0x002f), top: B:2:0x0007 }] */
    @Override // wa.d6, dg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short z() {
        /*
            r6 = this;
            a0.f0 r0 = r6.f17770a
            java.lang.String r1 = r0.j()
            r2 = 0
            r1.getClass()     // Catch: java.lang.IllegalArgumentException -> L30
            pe.s r3 = ya.y0.a(r1)     // Catch: java.lang.IllegalArgumentException -> L30
            if (r3 == 0) goto L26
            int r3 = r3.f22708u     // Catch: java.lang.IllegalArgumentException -> L30
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 ^ r3
            r5 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            int r4 = java.lang.Integer.compare(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L30
            if (r4 <= 0) goto L1f
            goto L26
        L1f:
            short r3 = (short) r3     // Catch: java.lang.IllegalArgumentException -> L30
            pe.x r4 = new pe.x     // Catch: java.lang.IllegalArgumentException -> L30
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L30
            goto L27
        L26:
            r4 = r2
        L27:
            if (r4 == 0) goto L2c
            short r0 = r4.f22713u     // Catch: java.lang.IllegalArgumentException -> L30
            return r0
        L2c:
            mf.g(r1)     // Catch: java.lang.IllegalArgumentException -> L30
            throw r2     // Catch: java.lang.IllegalArgumentException -> L30
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse type 'UShort' for input '"
            r3.<init>(r4)
            r3.append(r1)
            r1 = 39
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            r4 = 6
            a0.f0.u(r0, r1, r3, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.h.z():short");
    }
}
