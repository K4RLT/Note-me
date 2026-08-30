package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
import com.google.android.gms.internal.ads.wd0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static String f13618a;

    /* renamed from: b, reason: collision with root package name */
    public static final j4 f13619b = new j4(21);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String a(android.content.Context r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.consent_sdk.z> r0 = com.google.android.gms.internal.consent_sdk.z.class
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.gms.internal.consent_sdk.z.f13618a     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L4f
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L1e
            if (r6 != 0) goto Lf
            r6 = 0
            goto L15
        Lf:
            java.lang.String r1 = "android_id"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r1)     // Catch: java.lang.Throwable -> L1e
        L15:
            if (r6 == 0) goto L20
            boolean r1 = d()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L22
            goto L20
        L1e:
            r6 = move-exception
            goto L53
        L20:
            java.lang.String r6 = "emulator"
        L22:
            r1 = 0
        L23:
            r2 = 3
            if (r1 >= r2) goto L4b
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            byte[] r3 = r6.getBytes()     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            r2.update(r3)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            java.lang.String r3 = "%032X"
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            byte[] r2 = r2.digest()     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            r5 = 1
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            java.lang.String r6 = java.lang.String.format(r3, r2)     // Catch: java.lang.Throwable -> L1e java.security.NoSuchAlgorithmException -> L48 java.lang.ArithmeticException -> L4b
            goto L4d
        L48:
            int r1 = r1 + 1
            goto L23
        L4b:
            java.lang.String r6 = ""
        L4d:
            com.google.android.gms.internal.consent_sdk.z.f13618a = r6     // Catch: java.lang.Throwable -> L1e
        L4f:
            java.lang.String r6 = com.google.android.gms.internal.consent_sdk.z.f13618a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r6
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.z.a(android.content.Context):java.lang.String");
    }

    public static String b(h5 h5Var) {
        StringBuilder sb2 = new StringBuilder(h5Var.d());
        for (int i = 0; i < h5Var.d(); i++) {
            byte a10 = h5Var.a(i);
            if (a10 != 34) {
                if (a10 != 39) {
                    if (a10 != 92) {
                        switch (a10) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (a10 >= 32 && a10 <= 126) {
                                    sb2.append((char) a10);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((a10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((a10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((a10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static String c(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(e(objArr[i]));
            i10 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb2.append(str2);
                sb2.append(e(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (!str.contains("generic") && !str.contains("emulator") && !Build.HARDWARE.contains("ranchu")) {
                return false;
            }
            return true;
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String n10 = wd0.n(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(n10), (Throwable) e);
            return a5.a.h("<", n10, " threw ", e.getClass().getName(), ">");
        }
    }
}
