package sf;
import x.o;
import l.a;
import q.x;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25162u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f25163v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f25164w;

    public e(f fVar, kotlin.jvm.internal.y yVar, h hVar) {
        this.f25164w = yVar;
        this.f25163v = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    @Override // sf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r6, te.c r7) {
        /*
            r5 = this;
            int r0 = r5.f25162u
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof sf.o
            if (r0 == 0) goto L18
            r0 = r7
            sf.o r0 = (sf.o) r0
            int r1 = r0.f25219x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f25219x = r1
            goto L1d
        L18:
            sf.o r0 = new sf.o
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f25217v
            int r1 = r0.f25219x
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            sf.e r6 = r0.f25216u
            pe.a.e(r7)     // Catch: java.lang.Throwable -> L2c
            goto L48
        L2c:
            r7 = move-exception
            goto L4d
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            goto L4a
        L35:
            pe.a.e(r7)
            sf.h r7 = r5.f25163v     // Catch: java.lang.Throwable -> L4b
            r0.f25216u = r5     // Catch: java.lang.Throwable -> L4b
            r0.f25219x = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r6 = r7.e(r6, r0)     // Catch: java.lang.Throwable -> L4b
            ue.a r7 = ue.a.f27192u
            if (r6 != r7) goto L48
            r6 = r7
            goto L4a
        L48:
            pe.z r6 = pe.z.f22715a
        L4a:
            return r6
        L4b:
            r7 = move-exception
            r6 = r5
        L4d:
            kotlin.jvm.internal.y r6 = r6.f25164w
            r6.f19787u = r7
            throw r7
        L52:
            boolean r0 = r7 instanceof sf.d
            if (r0 == 0) goto L65
            r0 = r7
            sf.d r0 = (sf.d) r0
            int r1 = r0.f25159w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f25159w = r1
            goto L6a
        L65:
            sf.d r0 = new sf.d
            r0.<init>(r5, r7)
        L6a:
            java.lang.Object r7 = r0.f25157u
            int r1 = r0.f25159w
            pe.z r2 = pe.z.f22715a
            r3 = 1
            if (r1 == 0) goto L80
            if (r1 != r3) goto L79
            pe.a.e(r7)
            goto La0
        L79:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r2 = 0
            goto La0
        L80:
            pe.a.e(r7)
            kotlin.jvm.internal.y r7 = r5.f25164w
            java.lang.Object r1 = r7.f19787u
            c4.s r4 = tf.c.f25716b
            if (r1 == r4) goto L91
            boolean r1 = kotlin.jvm.internal.a(r1, r6)
            if (r1 != 0) goto La0
        L91:
            r7.f19787u = r6
            r0.f25159w = r3
            sf.h r7 = r5.f25163v
            java.lang.Object r6 = r7.e(r6, r0)
            ue.a r7 = ue.a.f27192u
            if (r6 != r7) goto La0
            r2 = r7
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.e.e(java.lang.Object, te.c):java.lang.Object");
    }

    public e(h hVar, kotlin.jvm.internal.y yVar) {
        this.f25163v = hVar;
        this.f25164w = yVar;
    }
}
