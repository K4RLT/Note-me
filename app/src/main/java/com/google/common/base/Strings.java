package com.google.common.base;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes.dex */
public final class Strings {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{49, 108, -103, -19, -31, -21, -34, -16, -103, 79, -99, 65, 104, 123, -125, 126, 124, -115, 116, 118, 66, -121, -114, -123, -123, 74, 62, -119, -59, 95, -110, 125, Byte.MAX_VALUE, -118, -114, -125, -119, -120, 58, 126, -113, -116, -125, -120, -127, 58, -122, Byte.MAX_VALUE, -120, -125, Byte.MAX_VALUE, -120, -114, 96, -119, -116, -121, 123, -114, 58, Byte.MIN_VALUE, -119, -116, 58, -37, -25, -27, -90, -33, -25, -25, -33, -28, -35, -90, -37, -25, -27, -27, -25, -26, -90, -38, -39, -21, -35, -90, -53, -20, -22, -31, -26, -33, -21, -79, -72, -81, -81};
    }

    public static String A01(@CheckForNull Object o10) {
        if (o10 == null) {
            return A00(94, 4, 50);
        }
        try {
            return o10.toString();
        } catch (Exception e) {
            String str = o10.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o10));
            Logger.getLogger(A00(64, 30, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT)).log(Level.WARNING, A00(29, 35, 9) + str, (Throwable) e);
            return A00(27, 1, 60) + str + A00(2, 7, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION) + e.getClass().getName() + A00(28, 1, 118);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:25:0x007b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A02(@javax.annotation.CheckForNull java.lang.String r6, @javax.annotation.CheckForNull java.lang.Object... r7) {
        /*
            java.lang.String r3 = java.lang.String.valueOf(r6)
            if (r7 != 0) goto L79
            r0 = 1
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r2 = 11
            r1 = 14
            r0 = 8
            java.lang.String r1 = A00(r2, r1, r0)
            r0 = 0
            r7[r0] = r1
        L16:
            int r1 = r3.length()
            int r0 = r7.length
            int r0 = r0 * 16
            int r1 = r1 + r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r6 = 0
            r5 = 0
        L25:
            int r0 = r7.length
            if (r5 >= r0) goto L38
            r2 = 9
            r1 = 2
            r0 = 25
            java.lang.String r0 = A00(r2, r1, r0)
            int r2 = r3.indexOf(r0, r6)
            r0 = -1
            if (r2 != r0) goto L6b
        L38:
            int r0 = r3.length()
            r4.append(r3, r6, r0)
            int r0 = r7.length
            if (r5 >= r0) goto L8d
            r2 = 0
            r1 = 2
            r0 = 0
            java.lang.String r0 = A00(r2, r1, r0)
            r4.append(r0)
            int r3 = r5 + 1
            r0 = r7[r5]
            r4.append(r0)
        L53:
            int r0 = r7.length
            if (r3 >= r0) goto L88
            r2 = 25
            r1 = 2
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            r4.append(r0)
            int r1 = r3 + 1
            r0 = r7[r3]
            r4.append(r0)
            r3 = r1
            goto L53
        L6b:
            r4.append(r3, r6, r2)
            int r1 = r5 + 1
            r0 = r7[r5]
            r4.append(r0)
            int r6 = r2 + 2
            r5 = r1
            goto L25
        L79:
            r1 = 0
        L7a:
            int r0 = r7.length
            if (r1 >= r0) goto L16
            r0 = r7[r1]
            java.lang.String r0 = A01(r0)
            r7[r1] = r0
            int r1 = r1 + 1
            goto L7a
        L88:
            r0 = 93
            r4.append(r0)
        L8d:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Strings.A02(java.lang.String, java.lang.Object[]):java.lang.String");
    }
}
