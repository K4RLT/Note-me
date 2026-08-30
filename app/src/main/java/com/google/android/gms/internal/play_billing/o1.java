package com.google.android.gms.internal.play_billing;
import a4.a;
import a4.b;
import b0.b;
import b0.d;
import o1.b;
import u.c;

import ya.lc;

/* loaded from: classes.dex */
public abstract class o1 {
    public static b a(String str, c cVar) {
        wf.e eVar = pf.l0.f22767a;
        wf.d dVar = wf.d.f29913w;
        pf.t1 d2 = pf.d();
        dVar.getClass();
        uf.c b10 = pf.b(lc.c(dVar, d2));
        str.getClass();
        return new b(str, cVar, a.f237u, b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.k1 b() {
        /*
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            java.lang.Class<com.google.android.gms.internal.play_billing.o1> r1 = com.google.android.gms.internal.play_billing.o1.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<com.google.android.gms.internal.play_billing.k1> r2 = com.google.android.gms.internal.play_billing.k1.class
            boolean r3 = r2.equals(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L13
            goto L2f
        L13:
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r1)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            if (r0 != 0) goto L22
            throw r5
        L22:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.ReflectiveOperationException -> L28
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L28
            throw r0     // Catch: java.lang.ReflectiveOperationException -> L28
        L28:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L2f
            r1.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            throw r1     // Catch: java.lang.ClassNotFoundException -> L2f
        L2f:
            r1 = 0
            com.google.android.gms.internal.play_billing.o1[] r0 = new com.google.android.gms.internal.play_billing.o1[r1]     // Catch: java.lang.Throwable -> La4
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L3f:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L75
            int r0 = r6.size()
            if (r0 != r4) goto L52
            java.lang.Object r0 = r6.get(r1)
            com.google.android.gms.internal.play_billing.k1 r0 = (com.google.android.gms.internal.play_billing.k1) r0
            return r0
        L52:
            int r0 = r6.size()
            if (r0 != 0) goto L59
            return r5
        L59:
            java.lang.String r0 = "combine"
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.reflect.Method r0 = r2.getMethod(r0, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            com.google.android.gms.internal.play_billing.k1 r0 = (com.google.android.gms.internal.play_billing.k1) r0     // Catch: java.lang.ReflectiveOperationException -> L70
            return r0
        L70:
            r0 = move-exception
            androidx.datastore.preferences.protobuf.s1.r(r0)
            return r5
        L75:
            java.lang.Object r0 = r3.next()     // Catch: java.util.ServiceConfigurationError -> L84
            if (r0 != 0) goto L7c
            throw r5
        L7c:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.util.ServiceConfigurationError -> L84
            r0.<init>()     // Catch: java.util.ServiceConfigurationError -> L84
            throw r0     // Catch: java.util.ServiceConfigurationError -> L84
        L82:
            r12 = r0
            goto L86
        L84:
            r0 = move-exception
            goto L82
        L86:
            java.lang.Class<com.google.android.gms.internal.play_billing.i1> r0 = com.google.android.gms.internal.play_billing.i1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r7 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r10 = "load"
            java.lang.String r9 = "Unable to load "
            java.lang.String r11 = r9.concat(r0)
            java.lang.String r9 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            r7.logp(r8, r9, r10, r11, r12)
            goto L3f
        La4:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.b():com.google.android.gms.internal.play_billing.k1");
    }
}
