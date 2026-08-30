package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class jt extends mu {
    public final String A;
    public final long B;
    public final long C;
    public final String D;
    public final String E;

    /* renamed from: y, reason: collision with root package name */
    public final Map f7534y;

    /* renamed from: z, reason: collision with root package name */
    public final Activity f7535z;

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jt(com.google.android.gms.internal.ads.h00 r3, java.util.Map r4) {
        /*
            r2 = this;
            java.lang.String r0 = "createCalendarEvent"
            r1 = 5
            r2.<init>(r3, r1, r0)
            r2.f7534y = r4
            android.app.Activity r3 = r3.f()
            r2.f7535z = r3
            java.lang.String r3 = "description"
            java.lang.String r3 = r2.u(r3)
            r2.A = r3
            java.lang.String r3 = "summary"
            java.lang.String r3 = r2.u(r3)
            r2.D = r3
            java.lang.String r3 = "start_ticks"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0 = -1
            if (r3 != 0) goto L2c
        L2a:
            r3 = r0
            goto L30
        L2c:
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L2a
        L30:
            r2.B = r3
            java.lang.String r3 = "end_ticks"
            java.util.Map r4 = r2.f7534y
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L3f
            goto L43
        L3f:
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L43
        L43:
            r2.C = r0
            java.lang.String r3 = "location"
            java.lang.String r3 = r2.u(r3)
            r2.E = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jt.<init>(com.google.android.gms.internal.ads.h00, java.util.Map):void");
    }

    public final String u(String str) {
        Map map = this.f7534y;
        if (TextUtils.isEmpty((CharSequence) map.get(str))) {
            return "";
        }
        return (String) map.get(str);
    }
}
