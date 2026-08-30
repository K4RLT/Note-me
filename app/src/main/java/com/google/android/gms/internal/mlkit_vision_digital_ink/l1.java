package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;
import p.a;
import q1.a;
import q1.c;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class l1 implements e2 {

    /* renamed from: u, reason: collision with root package name */
    public final l1 f14585u;

    /* renamed from: v, reason: collision with root package name */
    public final UUID f14586v;

    /* renamed from: w, reason: collision with root package name */
    public final String f14587w;

    /* renamed from: x, reason: collision with root package name */
    public final String f14588x;

    /* renamed from: y, reason: collision with root package name */
    public Thread f14589y;

    public l1(String str, l1 l1Var, d2 d2Var) {
        this.f14588x = str;
        this.f14585u = l1Var;
        this.f14586v = l1Var.f14586v;
        this.f14587w = l1Var.f14587w;
        this.f14589y = Thread.currentThread();
    }

    public static String f(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d2 a10 = a();
        e2 e2Var = a10.f14179b;
        String str = this.f14588x;
        if (e2Var != null) {
            if (this == e2Var) {
                c(a10, ((l1) e2Var).f14585u);
                this.f14589y = null;
                return;
            }
            throw new IllegalStateException(a.h("Tried to end span ", str, ", but that span is not the current span. The current span is ", ((l1) e2Var).f14588x, "."));
        }
        throw new IllegalStateException(a.k("Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        r4 = r4.f14146d;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ac, code lost:
    
        if (r4.containsKey(r10) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ae, code lost:
    
        ((com.google.android.gms.internal.mlkit_vision_digital_ink.c2) r1.f3863g).f14146d.put(r10, new com.google.android.gms.internal.mlkit_vision_digital_ink.c2(r8, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        if (r15 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        r15.f14145c = (com.google.android.gms.internal.mlkit_vision_digital_ink.c2) r1.f3863g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d0, code lost:
    
        if (r15 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d2, code lost:
    
        r15.f14145c = (com.google.android.gms.internal.mlkit_vision_digital_ink.c2) r1.f3863g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d8, code lost:
    
        r1.f3859b = r8;
        r1.f3860c++;
        r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01de, code lost:
    
        if (r1.g(r13, r14, r15, (r15 + r14) - r13) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.l1.toString():java.lang.String");
    }

    public l1(String str, UUID uuid, String str2, d2 d2Var) {
        this.f14588x = str;
        this.f14585u = null;
        this.f14586v = uuid;
        this.f14587w = str2;
        d2Var.getClass();
        this.f14589y = Thread.currentThread();
    }
}
