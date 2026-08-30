package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class h81 extends q71 {
    public static final x21 D;
    public static final y81 E = new y81(h81.class, 0);
    public volatile Set B;
    public volatile int C;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.x21] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        Throwable th;
        com.google.android.gms.internal.ads.x21 r02;
        try {
            th = null;
            r02 = new Object();
        } catch (Throwable th2) {
            th = th2;
            r02 = new Object();
        }
        Throwable th3 = th;
        D = r02;
        if (th3 != null) {
            E.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
