package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;
import p.a;

/* loaded from: classes.dex */
public abstract class g9 extends ma implements Runnable {
    public static final /* synthetic */ int F = 0;
    public ya C;
    public Class D;
    public Object E;

    public g9(ya yaVar, Class cls, Object obj) {
        this.C = yaVar;
        this.D = cls;
        this.E = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final String d() {
        String str;
        ya yaVar = this.C;
        Class cls = this.D;
        Object obj = this.E;
        String d2 = super.d();
        if (yaVar != null) {
            str = p.a.k("inputFuture=[", yaVar.toString(), "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
        }
        if (d2 != null) {
            return str.concat(d2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n9
    public final void e() {
        l(this.C);
        this.C = null;
        this.D = null;
        this.E = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.mlkit_vision_digital_ink.ya r0 = r10.C
            java.lang.Class r1 = r10.D
            java.lang.Object r2 = r10.E
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
            if (r3 != 0) goto L9a
            java.lang.Object r3 = r10.f14968u
            boolean r3 = r3 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.h9
            if (r3 == 0) goto L21
            goto L9a
        L21:
            r3 = 0
            r10.C = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.s9     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            com.google.android.gms.internal.mlkit_vision_digital_ink.s9 r4 = (com.google.android.gms.internal.mlkit_vision_digital_ink.s9) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
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
            java.lang.Object r5 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.r(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L65
        L3c:
            r5 = r3
            goto L65
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L63
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = " threw "
            java.lang.String r8 = " without a cause"
            java.lang.String r9 = "Future type "
            java.lang.String r4 = a5.a.h(r9, r6, r7, r4, r8)
            r5.<init>(r4)
        L63:
            r4 = r5
            goto L3c
        L65:
            if (r4 != 0) goto L6b
            r10.n(r5)
            return
        L6b:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L97
            java.lang.Object r0 = r10.t(r2, r4)     // Catch: java.lang.Throwable -> L7d
            r10.D = r3
            r10.E = r3
            r10.u(r0)
            return
        L7d:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L89
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L91
            r1.interrupt()     // Catch: java.lang.Throwable -> L91
        L89:
            r10.o(r0)     // Catch: java.lang.Throwable -> L91
            r10.D = r3
            r10.E = r3
            return
        L91:
            r0 = move-exception
            r10.D = r3
            r10.E = r3
            throw r0
        L97:
            r10.f(r0)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.g9.run():void");
    }

    public abstract Object t(Object obj, Throwable th);

    public abstract void u(Object obj);
}
