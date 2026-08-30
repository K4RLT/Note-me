package com.google.android.gms.internal.ads;
import q.x;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class p91 {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f9449b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f9450a;

    public p91(ByteArrayInputStream byteArrayInputStream) {
        this.f9450a = byteArrayInputStream;
    }

    public static int b(ll1 ll1Var) {
        if (ll1Var instanceof pl1) {
            if (ll1Var.d().f9544u instanceof Number) {
                Number g8 = ll1Var.d().g();
                try {
                    if (g8 instanceof sc1) {
                        long parseLong = Long.parseLong(((sc1) g8).f10590u);
                        if (parseLong <= 4294967295L && parseLong >= -2147483648L) {
                            return (int) parseLong;
                        }
                        x.p("invalid key id");
                        return 0;
                    }
                    throw new IllegalArgumentException("does not contain a parsed number.");
                } catch (NumberFormatException e) {
                    throw new IOException(e);
                }
            }
            x.p("invalid key id: not a JSON number");
            return 0;
        }
        x.p("invalid key id: not a JSON primitive");
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x012a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f A[Catch: all -> 0x0031, IllegalStateException -> 0x0034, ol1 -> 0x0037, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:8:0x003a, B:10:0x0053, B:12:0x005b, B:14:0x0065, B:16:0x006f, B:18:0x0082, B:20:0x0088, B:22:0x009a, B:24:0x00a0, B:26:0x00a6, B:28:0x00ac, B:30:0x00b4, B:40:0x00ff, B:46:0x0159, B:48:0x016f, B:50:0x0175, B:52:0x017b, B:58:0x01e8, B:60:0x021b, B:61:0x0224, B:79:0x0225, B:80:0x022c, B:84:0x022d, B:85:0x0236, B:100:0x0237, B:101:0x0240, B:112:0x0241, B:113:0x0248, B:115:0x0249, B:116:0x0250, B:121:0x0251, B:124:0x025b, B:125:0x0262, B:126:0x0263, B:127:0x026a, B:128:0x026b, B:129:0x0272, B:136:0x0273, B:137:0x0278), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.nh1 a() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p91.a():com.google.android.gms.internal.ads.nh1");
    }
}
