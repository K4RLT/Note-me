package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class qf implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9832b;

    public /* synthetic */ qf(int i, Object obj) {
        this.f9831a = i;
        this.f9832b = obj;
    }

    private final Object a() {
        HashMap hashMap;
        me0 me0Var = (me0) ((am0) this.f9832b).f4540c;
        synchronized (me0Var) {
            hashMap = new HashMap();
            if (((Boolean) g9.r.e.f17698c.a(sl.H8)).booleanValue()) {
                me0Var.b();
                for (Map.Entry entry : me0Var.f8330a.entrySet()) {
                    hashMap.put((le0) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new dn0(hashMap, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.U3)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        r9 = com.google.android.gms.internal.ads.jx0.f(r0);
        r12 = ((java.lang.Long) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f10726f4)).longValue();
        r14 = f9.k.C.f16817h.g().t();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.jx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        r5 = r9.a(null, null, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.jx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        if (((java.lang.Boolean) r6.f17698c.a(com.google.android.gms.internal.ads.sl.V3)).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ea, code lost:
    
        r9 = com.google.android.gms.internal.ads.kx0.f(r0);
        r0 = com.google.android.gms.internal.ads.hx0.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
    
        if (((l9.a) r1.e).f20031w < ((java.lang.Integer) r6.f17698c.a(com.google.android.gms.internal.ads.sl.f10663b4)).intValue()) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
    
        r12 = ((java.lang.Long) r6.f17698c.a(com.google.android.gms.internal.ads.sl.f10743g4)).longValue();
        r14 = f9.k.C.f16817h.g().t();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0127, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.kx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
    
        r5 = r9.f7248g;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012f, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.hx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0130, code lost:
    
        r5 = ((android.content.SharedPreferences) ((j6.s) r5.f6914v).f18982w).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013e, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.hx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        if (r5 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        r5 = new com.google.android.gms.internal.ads.f3(5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.kx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015a, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.hx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015b, code lost:
    
        r6 = ((android.content.SharedPreferences) ((j6.s) r0.f6914v).f18982w).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0169, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.hx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0174, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0179, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.hx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017a, code lost:
    
        r4 = ((android.content.SharedPreferences) ((j6.s) r0.f6914v).f18982w).getBoolean("paidv2_user_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.hx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
    
        r5 = r3;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r5 = r9.a(null, null, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.kx0.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e8, code lost:
    
        if (((java.lang.Boolean) r6.f17698c.a(com.google.android.gms.internal.ads.sl.X3)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0063, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.W3)).booleanValue() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qf.b():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qf.c():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x053f -> B:238:0x054b). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 2228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qf.call():java.lang.Object");
    }
}
