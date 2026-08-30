package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import la.a;
import r7.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class me0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8330a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:11:0x001a, B:13:0x001f, B:15:0x0028, B:16:0x002d, B:18:0x0031, B:19:0x0036, B:20:0x0045, B:21:0x0046, B:23:0x0055, B:25:0x005b, B:27:0x0064, B:29:0x006c, B:31:0x0071, B:33:0x007a, B:34:0x007f, B:36:0x0083, B:37:0x0088, B:38:0x0097, B:39:0x0098, B:44:0x00a8, B:46:0x00d6, B:48:0x00e0, B:49:0x00e8, B:50:0x00ef, B:52:0x00f5, B:54:0x00f9, B:56:0x010e, B:57:0x0117, B:59:0x011d, B:62:0x012b, B:65:0x0131, B:66:0x0143, B:68:0x0149, B:71:0x015b, B:74:0x0163, B:86:0x0174, B:89:0x017c, B:92:0x0182, B:95:0x018b, B:104:0x0194, B:107:0x00b7, B:108:0x00c6), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(long r8, int r10, long r11) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.me0.a(long, int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            k r0 = k.C
            a r0 = r0.f16819k
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r2 = r9.f8330a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.le0 r4 = (com.google.android.gms.internal.ads.le0) r4
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            int r4 = r4.f8017b
            r5 = 0
            if (r4 == 0) goto L3c
            r7 = 1
            if (r4 == r7) goto L60
            r7 = 2
            if (r4 == r7) goto L4f
            r7 = 3
            if (r4 == r7) goto L3e
        L3c:
            r7 = r5
            goto L70
        L3e:
            com.google.android.gms.internal.ads.nl r4 = com.google.android.gms.internal.ads.sl.N8
            r r7 = r.e
            com.google.android.gms.internal.ads.ql r7 = r7.f17698c
            java.lang.Object r4 = a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L70
        L4f:
            com.google.android.gms.internal.ads.nl r4 = com.google.android.gms.internal.ads.sl.M8
            r r7 = r.e
            com.google.android.gms.internal.ads.ql r7 = r7.f17698c
            java.lang.Object r4 = a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L70
        L60:
            com.google.android.gms.internal.ads.nl r4 = com.google.android.gms.internal.ads.sl.L8
            r r7 = r.e
            com.google.android.gms.internal.ads.ql r7 = r7.f17698c
            java.lang.Object r4 = a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
        L70:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L78
            r2.remove()
            r7 = r5
        L78:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L15
            java.util.Iterator r4 = r3.iterator()
        L80:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r0 - r5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L9a
            r4.remove()
            goto L80
        L9a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L15
            r2.remove()
            goto L15
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.me0.b():void");
    }
}
