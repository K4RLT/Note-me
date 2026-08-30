package com.google.android.gms.internal.ads;
import p.a;
import r2.b;
import r2.f;

import java.math.BigDecimal;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class xl1 {
    public static BigDecimal a(String str) {
        d(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static Date b(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(boolean r4) {
        /*
            r0 = 0
            com.google.android.gms.internal.ads.rv1 r1 = new com.google.android.gms.internal.ads.rv1     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            r1.<init>()     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            java.lang.String r2 = "video/avc"
            r1.e(r2)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            com.google.android.gms.internal.ads.mw1 r2 = new com.google.android.gms.internal.ads.mw1     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            r2.<init>(r1)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            java.lang.String r1 = r2.f8459o     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r1 == 0) goto L86
            java.util.List r1 = com.google.android.gms.internal.ads.gx1.a(r1, r4, r0)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            java.lang.String r2 = com.google.android.gms.internal.ads.gx1.d(r2)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r2 != 0) goto L21
            com.google.android.gms.internal.ads.y51 r4 = com.google.android.gms.internal.ads.y51.f12781y     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            goto L25
        L21:
            java.util.List r4 = com.google.android.gms.internal.ads.gx1.a(r2, r4, r0)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
        L25:
            com.google.android.gms.internal.ads.b51 r2 = com.google.android.gms.internal.ads.d51.f5314v     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            com.google.android.gms.internal.ads.a51 r2 = new com.google.android.gms.internal.ads.a51     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            r3 = 4
            r2.<init>(r3)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            r2.b(r1)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            r2.b(r4)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            com.google.android.gms.internal.ads.y51 r4 = r2.f()     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            r1 = r0
        L38:
            int r2 = r4.f12783x     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r1 >= r2) goto L86
            java.lang.Object r2 = r4.get(r1)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            com.google.android.gms.internal.ads.ww1 r2 = (com.google.android.gms.internal.ads.ww1) r2     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.f12355d     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r2 == 0) goto L83
            java.lang.Object r2 = r4.get(r1)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            com.google.android.gms.internal.ads.ww1 r2 = (com.google.android.gms.internal.ads.ww1) r2     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.f12355d     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r2 == 0) goto L83
            java.util.List r2 = com.google.android.gms.internal.ads.uv1.l(r2)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r2 == 0) goto L83
            boolean r3 = r2.isEmpty()     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r3 != 0) goto L83
            com.google.android.gms.internal.ads.uv1.m()     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = com.google.android.gms.internal.ads.uv1.h()     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            r1 = r0
        L68:
            int r3 = r2.size()     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r1 >= r3) goto L81
            java.lang.Object r3 = r2.get(r1)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = com.google.android.gms.internal.ads.uv1.j(r3)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            boolean r3 = com.google.android.gms.internal.ads.uv1.w(r3, r4)     // Catch: com.google.android.gms.internal.ads.dx1 -> L86
            if (r3 == 0) goto L7e
            r4 = 2
            return r4
        L7e:
            int r1 = r1 + 1
            goto L68
        L81:
            r4 = 1
            return r4
        L83:
            int r1 = r1 + 1
            goto L38
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl1.c(boolean):int");
    }

    public static void d(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException(p.a.o(new StringBuilder(substring.length() + 28), "Number string too large: ", substring, "..."));
    }
}
