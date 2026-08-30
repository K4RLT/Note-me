package com.google.android.gms.internal.mlkit_vision_digital_ink;
import j.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class nw {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f14722a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f14723b = false;

    public static int A(int i, byte[] bArr, int i10, int i11, un unVar, pm pmVar) {
        pn pnVar = (pn) unVar;
        int y10 = y(bArr, i10, pmVar);
        pnVar.d(pmVar.f14797a);
        while (y10 < i11) {
            int y11 = y(bArr, y10, pmVar);
            if (i != pmVar.f14797a) {
                break;
            }
            y10 = y(bArr, y11, pmVar);
            pnVar.d(pmVar.f14797a);
        }
        return y10;
    }

    public static int B(byte[] bArr, int i, pm pmVar) {
        long j10 = bArr[i];
        int i10 = i + 1;
        if (j10 >= 0) {
            pmVar.f14798b = j10;
            return i10;
        }
        int i11 = i + 2;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        pmVar.f14798b = j11;
        return i11;
    }

    public static int C(Object obj, ro roVar, byte[] bArr, int i, int i10, int i11, pm pmVar) {
        jo joVar = (jo) roVar;
        int i12 = pmVar.e + 1;
        pmVar.e = i12;
        if (i12 < 100) {
            int B = joVar.B(obj, bArr, i, i10, i11, pmVar);
            pmVar.e--;
            pmVar.f14799c = obj;
            return B;
        }
        androidx.datastore.preferences.protobuf.s1.u("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int D(Object obj, ro roVar, byte[] bArr, int i, int i10, pm pmVar) {
        int i11 = i + 1;
        int i12 = bArr[i];
        if (i12 < 0) {
            i11 = z(i12, bArr, i11, pmVar);
            i12 = pmVar.f14797a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = pmVar.e + 1;
            pmVar.e = i14;
            if (i14 < 100) {
                int i15 = i13 + i12;
                roVar.k(obj, bArr, i13, i15, pmVar);
                pmVar.e--;
                pmVar.f14799c = obj;
                return i15;
            }
            androidx.datastore.preferences.protobuf.s1.u("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int E(int i, byte[] bArr, int i10, int i11, pm pmVar) {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                return i10 + 4;
                            }
                            androidx.datastore.preferences.protobuf.s1.u("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i13 = (i & (-8)) | 4;
                        int i14 = 0;
                        while (i10 < i11) {
                            i10 = y(bArr, i10, pmVar);
                            i14 = pmVar.f14797a;
                            if (i14 == i13) {
                                break;
                            }
                            i10 = E(i14, bArr, i10, i11, pmVar);
                        }
                        if (i10 <= i11 && i14 == i13) {
                            return i10;
                        }
                        androidx.datastore.preferences.protobuf.s1.u("Failed to parse the message.");
                        return 0;
                    }
                    return y(bArr, i10, pmVar) + pmVar.f14797a;
                }
                return i10 + 8;
            }
            return B(bArr, i10, pmVar);
        }
        androidx.datastore.preferences.protobuf.s1.u("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static long F(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int b(byte[] bArr, int i, pm pmVar) {
        int y10 = y(bArr, i, pmVar);
        int i10 = pmVar.f14797a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - y10) {
                if (i10 == 0) {
                    pmVar.f14799c = tm.f15012v;
                    return y10;
                }
                pmVar.f14799c = tm.k(bArr, y10, i10);
                return y10 + i10;
            }
            androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static SharedPreferences d(Context context, String str, q2 q2Var) {
        return context.getSharedPreferences(q(str, q2Var), 0);
    }

    public static ls e(or orVar, int i) {
        ks u9 = ls.u();
        String F = orVar.F();
        u9.b();
        ls.B((ls) u9.f14430v, F);
        long v2 = orVar.v();
        u9.b();
        ls.y((ls) u9.f14430v, v2);
        u9.l(f7.m(orVar));
        u9.m(i);
        if (orVar.N()) {
            qq y10 = orVar.y();
            u9.b();
            ls.A((ls) u9.f14430v, y10);
        }
        return (ls) u9.i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0036. Please report as an issue. */
    public static final File f(Context context, Uri uri) {
        File externalFilesDir;
        if (uri.getScheme().equals("android")) {
            if (!uri.getPathSegments().isEmpty()) {
                if (TextUtils.isEmpty(uri.getQuery())) {
                    ArrayList arrayList = new ArrayList(uri.getPathSegments());
                    String str = (String) arrayList.get(0);
                    switch (str.hashCode()) {
                        case -1820761141:
                            if (str.equals("external")) {
                                externalFilesDir = context.getExternalFilesDir(null);
                                return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                            }
                            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
                        case 94416770:
                            if (str.equals("cache")) {
                                externalFilesDir = context.getCacheDir();
                                return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                            }
                            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
                        case 97434231:
                            if (str.equals("files")) {
                                externalFilesDir = gn.k(context);
                                return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                            }
                            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
                        case 835260319:
                            if (str.equals("managed")) {
                                File file = new File(gn.k(context), "managed");
                                if (arrayList.size() >= 3) {
                                    try {
                                        if (!j.f14493a.equals(a((String) arrayList.get(2)))) {
                                            throw new IOException("AccountManager cannot be null");
                                        }
                                    } catch (IllegalArgumentException e) {
                                        throw new IOException(e);
                                    }
                                }
                                externalFilesDir = file;
                                return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                            }
                            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
                        case 988548496:
                            if (str.equals("directboot-cache")) {
                                externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                                return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                            }
                            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
                        case 991565957:
                            if (str.equals("directboot-files")) {
                                externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                                return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                            }
                            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
                        default:
                            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
                    }
                }
                throw new IOException("Did not expect uri to have query");
            }
            throw new IOException(String.format("Path must start with a valid logical location: %s", uri));
        }
        throw new IOException("Scheme must be 'android'");
    }

    public static String g(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static void h(e2 e2Var) {
        l1 l1Var;
        if (!t(e2Var) && (l1Var = ((l1) e2Var).f14585u) != null) {
            h(l1Var);
            r(e2Var);
        } else {
            Trace.beginSection(((l1) e2Var).f14587w);
            r(e2Var);
        }
    }

    public static int i(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }

    public static int j(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static nn k(String str, mo moVar) {
        try {
            byte[] decode = Base64.decode(str, 3);
            bn bnVar = bn.f14099b;
            oo ooVar = oo.f14756c;
            bn bnVar2 = bn.f14100c;
            in inVar = (in) moVar;
            inVar.getClass();
            nn r8 = nn.r(inVar.f14476a, decode, decode.length, bnVar2);
            in.b(r8);
            return r8;
        } catch (IllegalArgumentException e) {
            throw new IOException("Unable to decode to byte array", new IOException(e));
        }
    }

    public static List l(List list) {
        if (list instanceof h4) {
            return ((h4) list).p();
        }
        if (list instanceof t4) {
            return ((t4) list).f15001u;
        }
        if (list instanceof RandomAccess) {
            return new t4(list);
        }
        return new t4(list);
    }

    public static void m(e2 e2Var) {
        if (!t(e2Var)) {
            l1 l1Var = (l1) e2Var;
            if (l1Var.f14585u != null) {
                Trace.endSection();
                m(l1Var.f14585u);
                return;
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public static nn o(SharedPreferences sharedPreferences, String str, mo moVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return k(string, moVar);
        } catch (xn unused) {
            return null;
        }
    }

    public static int p(ro roVar, byte[] bArr, int i, int i10, pm pmVar) {
        Object a10 = roVar.a();
        int D = D(a10, roVar, bArr, i, i10, pmVar);
        roVar.b(a10);
        pmVar.f14799c = a10;
        return D;
    }

    public static String q(String str, q2 q2Var) {
        if (q2Var != null && q2Var.c()) {
            return str.concat((String) q2Var.a());
        }
        return str;
    }

    public static void r(e2 e2Var) {
        String str = ((l1) e2Var).f14588x;
        AtomicReference atomicReference = q1.f14830a;
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static int s(ro roVar, int i, byte[] bArr, int i10, int i11, un unVar, pm pmVar) {
        int p10 = p(roVar, bArr, i10, i11, pmVar);
        unVar.add(pmVar.f14799c);
        while (p10 < i11) {
            int y10 = y(bArr, p10, pmVar);
            if (i != pmVar.f14797a) {
                break;
            }
            p10 = p(roVar, bArr, y10, i11, pmVar);
            unVar.add(pmVar.f14799c);
        }
        return p10;
    }

    public static boolean t(e2 e2Var) {
        if (((l1) e2Var).f14589y != Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static int u(byte[] bArr, int i, un unVar, pm pmVar) {
        pn pnVar = (pn) unVar;
        int y10 = y(bArr, i, pmVar);
        int i10 = pmVar.f14797a + y10;
        while (y10 < i10) {
            y10 = y(bArr, y10, pmVar);
            pnVar.d(pmVar.f14797a);
        }
        if (y10 == i10) {
            return y10;
        }
        androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int v(byte[] bArr, int i, pm pmVar) {
        int y10 = y(bArr, i, pmVar);
        int i10 = pmVar.f14797a;
        if (i10 >= 0) {
            if (i10 == 0) {
                pmVar.f14799c = "";
                return y10;
            }
            pmVar.f14799c = new String(bArr, y10, i10, vn.f15137a);
            return y10 + i10;
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int w(byte[] bArr, int i, pm pmVar) {
        int y10 = y(bArr, i, pmVar);
        int i10 = pmVar.f14797a;
        if (i10 >= 0) {
            if (i10 == 0) {
                pmVar.f14799c = "";
                return y10;
            }
            pmVar.f14799c = fp.d(bArr, y10, i10);
            return y10 + i10;
        }
        androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int x(int i, byte[] bArr, int i10, int i11, yo yoVar, pm pmVar) {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                yoVar.c(i, Integer.valueOf(j(bArr, i10)));
                                return i10 + 4;
                            }
                            androidx.datastore.preferences.protobuf.s1.u("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i13 = (i & (-8)) | 4;
                        yo b10 = yo.b();
                        int i14 = pmVar.e + 1;
                        pmVar.e = i14;
                        if (i14 < 100) {
                            int i15 = 0;
                            while (true) {
                                if (i10 >= i11) {
                                    break;
                                }
                                int y10 = y(bArr, i10, pmVar);
                                int i16 = pmVar.f14797a;
                                if (i16 == i13) {
                                    i15 = i16;
                                    i10 = y10;
                                    break;
                                }
                                i10 = x(i16, bArr, y10, i11, b10, pmVar);
                                i15 = i16;
                            }
                            pmVar.e--;
                            if (i10 <= i11 && i15 == i13) {
                                yoVar.c(i, b10);
                                return i10;
                            }
                            androidx.datastore.preferences.protobuf.s1.u("Failed to parse the message.");
                            return 0;
                        }
                        androidx.datastore.preferences.protobuf.s1.u("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return 0;
                    }
                    int y11 = y(bArr, i10, pmVar);
                    int i17 = pmVar.f14797a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - y11) {
                            if (i17 == 0) {
                                yoVar.c(i, tm.f15012v);
                            } else {
                                yoVar.c(i, tm.k(bArr, y11, i17));
                            }
                            return y11 + i17;
                        }
                        androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    androidx.datastore.preferences.protobuf.s1.u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                yoVar.c(i, Long.valueOf(F(bArr, i10)));
                return i10 + 8;
            }
            int B = B(bArr, i10, pmVar);
            yoVar.c(i, Long.valueOf(pmVar.f14798b));
            return B;
        }
        androidx.datastore.preferences.protobuf.s1.u("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int y(byte[] bArr, int i, pm pmVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 >= 0) {
            pmVar.f14797a = b10;
            return i10;
        }
        return z(b10, bArr, i10, pmVar);
    }

    public static int z(int i, byte[] bArr, int i10, pm pmVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            pmVar.f14797a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            pmVar.f14797a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            pmVar.f14797a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            pmVar.f14797a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                pmVar.f14797a = i19;
                return i20;
            }
        }
    }

    public abstract int a(ha haVar);

    public abstract long c();

    public abstract void n(ha haVar, Set set);
}
