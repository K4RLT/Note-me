package ng;
import c.q;
import d.d;

import ig.n;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends a {
    public boolean A;
    public final /* synthetic */ m2.a B;

    /* renamed from: y, reason: collision with root package name */
    public final n f21363y;

    /* renamed from: z, reason: collision with root package name */
    public long f21364z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m2.a aVar, n nVar) {
        super(aVar);
        this.B = aVar;
        this.f21364z = -1L;
        this.A = true;
        this.f21363y = nVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        if (this.f21357v) {
            return;
        }
        if (this.A) {
            try {
                z3 = jg.b.p(this, 100);
            } catch (IOException unused) {
                z3 = false;
            }
            if (!z3) {
                f(false, null);
            }
        }
        this.f21357v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r12.A == false) goto L30;
     */
    @Override // ng.a, sg.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q(sg.f r13, long r14) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto Lbe
            boolean r2 = r12.f21357v
            if (r2 != 0) goto Lb6
            boolean r2 = r12.A
            r3 = -1
            if (r2 != 0) goto L11
            goto L70
        L11:
            long r5 = r12.f21364z
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r7 = 0
            if (r2 == 0) goto L1c
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L71
        L1c:
            m2.a r2 = r12.B
            java.lang.Object r8 = r2.e
            okio.BufferedSource r8 = (okio.BufferedSource) r8
            java.lang.String r9 = "expected chunk size and optional extensions but was \""
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L2b
            r8.I()
        L2b:
            long r5 = r8.S()     // Catch: java.lang.NumberFormatException -> L4e
            r12.f21364z = r5     // Catch: java.lang.NumberFormatException -> L4e
            java.lang.String r5 = r8.I()     // Catch: java.lang.NumberFormatException -> L4e
            java.lang.String r5 = r5.trim()     // Catch: java.lang.NumberFormatException -> L4e
            long r10 = r12.f21364z     // Catch: java.lang.NumberFormatException -> L4e
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 < 0) goto L90
            boolean r6 = r5.isEmpty()     // Catch: java.lang.NumberFormatException -> L4e
            if (r6 != 0) goto L50
            java.lang.String r6 = ";"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.NumberFormatException -> L4e
            if (r6 == 0) goto L90
            goto L50
        L4e:
            r13 = move-exception
            goto Lac
        L50:
            long r5 = r12.f21364z
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L6c
            r12.A = r7
            java.lang.Object r0 = r2.f20436c
            ig.q r0 = (ig.q) r0
            ig.b r0 = r0.C
            ig.n r1 = r12.f21363y
            ig.l r2 = r2.o()
            mg.d(r0, r1, r2)
            r0 = 1
            r1 = 0
            r12.f(r0, r1)
        L6c:
            boolean r0 = r12.A
            if (r0 != 0) goto L71
        L70:
            return r3
        L71:
            long r0 = r12.f21364z
            long r14 = java.lang.Math.min(r14, r0)
            long r13 = super.q(r13, r14)
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 == 0) goto L85
            long r0 = r12.f21364z
            long r0 = r0 - r13
            r12.f21364z = r0
            return r13
        L85:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r14 = "unexpected end of stream"
            r13.<init>(r14)
            r12.f(r7, r13)
            throw r13
        L90:
            java.net.ProtocolException r13 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L4e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L4e
            r14.<init>(r9)     // Catch: java.lang.NumberFormatException -> L4e
            long r0 = r12.f21364z     // Catch: java.lang.NumberFormatException -> L4e
            r14.append(r0)     // Catch: java.lang.NumberFormatException -> L4e
            r14.append(r5)     // Catch: java.lang.NumberFormatException -> L4e
            java.lang.String r15 = "\""
            r14.append(r15)     // Catch: java.lang.NumberFormatException -> L4e
            java.lang.String r14 = r14.toString()     // Catch: java.lang.NumberFormatException -> L4e
            r13.<init>(r14)     // Catch: java.lang.NumberFormatException -> L4e
            throw r13     // Catch: java.lang.NumberFormatException -> L4e
        Lac:
            java.net.ProtocolException r14 = new java.net.ProtocolException
            java.lang.String r13 = r13.getMessage()
            r14.<init>(r13)
            throw r14
        Lb6:
            java.lang.String r13 = "closed"
            q.x.o(r13)
            r13 = 0
            return r13
        Lbe:
            java.lang.String r13 = "byteCount < 0: "
            java.lang.String r13 = g3.a.h(r14, r13)
            q.x.n(r13)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ng.q(sg.f, long):long");
    }
}
