package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import g3.a;
import p.a;

/* loaded from: classes.dex */
public abstract class j71 extends p81 implements Runnable {
    public static final /* synthetic */ int E = 0;
    public ac.b B;
    public Class C;
    public Object D;

    public j71(ac.b bVar, Class cls, Object obj) {
        bVar.getClass();
        this.B = bVar;
        this.C = cls;
        this.D = obj;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final void f() {
        p(this.B);
        this.B = null;
        this.C = null;
        this.D = null;
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final String h() {
        String str;
        ac.b bVar = this.B;
        Class cls = this.C;
        Object obj = this.D;
        String h3 = super.h();
        if (bVar != null) {
            String obj2 = bVar.toString();
            str = p.a.o(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            int length = str.length();
            String obj3 = cls.toString();
            int length2 = obj3.length();
            String obj4 = obj.toString();
            StringBuilder sb2 = new StringBuilder(obj4.length() + length + 15 + length2 + 13 + 1);
            g3.a.t(sb2, str, "exceptionType=[", obj3, "], fallback=[");
            return a5.a.k(sb2, obj4, "]");
        }
        if (h3 != null) {
            return str.concat(h3);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            ac.b r0 = r10.B
            java.lang.Class r1 = r10.C
            java.lang.Object r2 = r10.D
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto Lb2
            java.lang.Object r3 = r10.f13105u
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.k71
            if (r3 == 0) goto L21
            goto Lb2
        L21:
            r3 = 0
            r10.B = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.z71     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            com.google.android.gms.internal.ads.z71 r4 = (com.google.android.gms.internal.ads.z71) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.c()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.ads.ed1.j0(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L7d
        L3c:
            r5 = r3
            goto L7d
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L7b
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 19
            int r8 = r4.length()
            int r8 = r8 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r8 = r8 + 16
            r7.<init>(r8)
            java.lang.String r8 = "Future type "
            java.lang.String r9 = " threw "
            g3.a.t(r7, r8, r6, r9, r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L7b:
            r4 = r5
            goto L3c
        L7d:
            if (r4 != 0) goto L83
            r10.d(r5)
            return
        L83:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto Laf
            java.lang.Object r0 = r10.v(r2, r4)     // Catch: java.lang.Throwable -> L95
            r10.C = r3
            r10.D = r3
            r10.u(r0)
            return
        L95:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto La1
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La9
            r1.interrupt()     // Catch: java.lang.Throwable -> La9
        La1:
            r10.e(r0)     // Catch: java.lang.Throwable -> La9
            r10.C = r3
            r10.D = r3
            return
        La9:
            r0 = move-exception
            r10.C = r3
            r10.D = r3
            throw r0
        Laf:
            r10.o(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j71.run():void");
    }

    public abstract void u(Object obj);

    public abstract Object v(Object obj, Throwable th);
}
