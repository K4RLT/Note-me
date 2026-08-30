package i5;
import x.n;
import f.i;
import q.x;

import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import ya.n9;

/* loaded from: classes.dex */
public final class f implements b {
    public final int A;

    /* renamed from: u, reason: collision with root package name */
    public final v f18237u;

    /* renamed from: v, reason: collision with root package name */
    public final v f18238v;

    /* renamed from: w, reason: collision with root package name */
    public final eb.w f18239w;

    /* renamed from: x, reason: collision with root package name */
    public final ThreadLocal f18240x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f18241y;

    /* renamed from: z, reason: collision with root package name */
    public final long f18242z;

    public f(final gw gwVar, final String str, int i) {
        str.getClass();
        this.f18239w = new eb.w(23);
        this.f18240x = new ThreadLocal();
        nf.a aVar = nf.b.f21330v;
        this.f18242z = nf.i(30, nf.d.SECONDS);
        this.A = 2;
        if (i > 0) {
            final int i10 = 0;
            this.f18237u = new v(i, new df.a() { // from class: i5.c
                @Override // df.a
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            p5.a j10 = gwVar.j(str);
                            n9.a(j10, "PRAGMA query_only = 1");
                            return j10;
                        default:
                            return gwVar.j(str);
                    }
                }
            });
            final int i11 = 1;
            this.f18238v = new v(1, new df.a() { // from class: i5.c
                @Override // df.a
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            p5.a j10 = gwVar.j(str);
                            n9.a(j10, "PRAGMA query_only = 1");
                            return j10;
                        default:
                            return gwVar.j(str);
                    }
                }
            });
            return;
        }
        x.n("Maximum number of readers must be greater than 0");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #0 {all -> 0x01a3, blocks: (B:55:0x0120, B:59:0x013c, B:61:0x0147, B:65:0x01a7, B:66:0x01ae), top: B:54:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7 A[Catch: all -> 0x01a3, TRY_ENTER, TryCatch #0 {all -> 0x01a3, blocks: (B:55:0x0120, B:59:0x013c, B:61:0x0147, B:65:0x01a7, B:66:0x01ae), top: B:54:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // i5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(boolean r17, df.p r18, ve.c r19) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.f.F(boolean, df.p, ve.c):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f18241y) {
            this.f18241y = true;
            this.f18237u.c();
            this.f18238v.c();
        }
    }

    public f(gw gwVar) {
        this.f18239w = new eb.w(23);
        this.f18240x = new ThreadLocal();
        nf.a aVar = nf.b.f21330v;
        this.f18242z = nf.i(30, nf.d.SECONDS);
        this.A = 2;
        v vVar = new v(1, new a1.c(21, gwVar));
        this.f18237u = vVar;
        this.f18238v = vVar;
    }
}
