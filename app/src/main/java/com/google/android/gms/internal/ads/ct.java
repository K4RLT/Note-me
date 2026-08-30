package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class ct implements q2 {
    public static final o6 D;
    public static final /* synthetic */ int G = 0;
    public static final /* synthetic */ int H = 0;
    public static final /* synthetic */ int I = 0;
    public static UiModeManager J;

    /* renamed from: w, reason: collision with root package name */
    public static final fp f5155w;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f5153u = {-75, 0, 60, 0, 1, 4};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f5154v = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: x, reason: collision with root package name */
    public static final di f5156x = new di(15);

    /* renamed from: y, reason: collision with root package name */
    public static final q90 f5157y = new q90(0);

    /* renamed from: z, reason: collision with root package name */
    public static final q90 f5158z = new q90(12);
    public static final q90 A = new q90(19);
    public static final q90 B = new q90(26);
    public static final bn0 C = new bn0(7);
    public static final bn0 E = new bn0(20);
    public static final int[] F = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    static {
        int i = 4;
        f5155w = new fp(i);
        D = new o6(i);
    }

    public static boolean A(File file) {
        boolean z3;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z3 = true;
            for (File file2 : listFiles) {
                if (file2 != null && A(file2) && z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        } else {
            z3 = true;
        }
        if (file.delete() && z3) {
            return true;
        }
        return false;
    }

    public static byte[][] B(int[] iArr, qa[] qaVarArr) {
        long j10;
        int i;
        int length;
        char c10;
        int i10 = 0;
        long j11 = 0;
        while (true) {
            j10 = 1048576;
            if (i10 >= 3) {
                break;
            }
            j11 += (qaVarArr[i10].mo212zza() + 1048575) / 1048576;
            i10++;
        }
        if (j11 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i11 = 0;
            while (true) {
                length = iArr.length;
                c10 = 5;
                if (i11 >= length) {
                    break;
                }
                int i12 = (int) j11;
                byte[] bArr2 = new byte[(H(iArr[i11]) * i12) + 5];
                bArr2[0] = 90;
                M(bArr2, i12);
                bArr[i11] = bArr2;
                i11++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                String F2 = F(iArr[i13]);
                try {
                    messageDigestArr[i13] = MessageDigest.getInstance(F2);
                } catch (NoSuchAlgorithmException e) {
                    l4.a.k(F2.concat(" digest not supported"), e);
                    return null;
                }
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (i = 3; i14 < i; i = 3) {
                qa qaVar = qaVarArr[i14];
                int i17 = i14;
                long mo212zza = qaVar.mo212zza();
                long j12 = 0;
                while (mo212zza > 0) {
                    char c11 = c10;
                    int i18 = i15;
                    int min = (int) Math.min(mo212zza, j10);
                    M(bArr3, min);
                    for (int i19 = 0; i19 < length; i19++) {
                        messageDigestArr[i19].update(bArr3);
                    }
                    try {
                        qaVar.b(messageDigestArr, j12, min);
                        int i20 = 0;
                        while (i20 < iArr.length) {
                            int i21 = iArr[i20];
                            byte[] bArr4 = bArr[i20];
                            int H2 = H(i21);
                            qa qaVar2 = qaVar;
                            MessageDigest messageDigest = messageDigestArr[i20];
                            long j13 = mo212zza;
                            int digest = messageDigest.digest(bArr4, (i18 * H2) + 5, H2);
                            if (digest == H2) {
                                i20++;
                                qaVar = qaVar2;
                                mo212zza = j13;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                                sb2.append("Unexpected output size of ");
                                sb2.append(algorithm);
                                sb2.append(" digest: ");
                                sb2.append(digest);
                                throw new RuntimeException(sb2.toString());
                            }
                        }
                        qa qaVar3 = qaVar;
                        long j14 = min;
                        j12 += j14;
                        mo212zza -= j14;
                        i15 = i18 + 1;
                        c10 = c11;
                        qaVar = qaVar3;
                        j10 = 1048576;
                    } catch (IOException e8) {
                        throw new DigestException(g3.a.f(i18, i16, "Failed to digest chunk #", " of section #", new StringBuilder(String.valueOf(i18).length() + 37 + String.valueOf(i16).length())), e8);
                    }
                }
                i16++;
                i14 = i17 + 1;
                j10 = 1048576;
            }
            byte[][] bArr5 = new byte[iArr.length];
            for (int i22 = 0; i22 < iArr.length; i22++) {
                int i23 = iArr[i22];
                byte[] bArr6 = bArr[i22];
                String F3 = F(i23);
                try {
                    bArr5[i22] = MessageDigest.getInstance(F3).digest(bArr6);
                } catch (NoSuchAlgorithmException e10) {
                    l4.a.k(F3.concat(" digest not supported"), e10);
                    return null;
                }
            }
            return bArr5;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 17);
        sb3.append("Too many chunks: ");
        sb3.append(j11);
        throw new DigestException(sb3.toString());
    }

    public static int C(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            q.x.n("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                            return 0;
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    public static boolean D(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        z("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        z("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            if (eglQueryString == null || !eglQueryString.contains(str)) {
                return false;
            }
            return true;
        }
        throw new dd0("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(eglGetError))), d51.q(Integer.valueOf(eglGetError)));
    }

    public static int[] E(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof f71) {
            f71 f71Var = (f71) abstractCollection;
            return Arrays.copyOfRange(f71Var.f5960u, f71Var.f5961v, f71Var.f5962w);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static String F(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            q.x.n(a5.a.f(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
            return null;
        }
        return "SHA-256";
    }

    public static List G(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new f71(iArr, 0, length);
    }

    public static int H(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            q.x.n(a5.a.f(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
            return 0;
        }
        return 32;
    }

    public static Integer I(String str) {
        byte b10;
        Long valueOf;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i10 = i + 1;
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    b10 = g71.f6324a[charAt2];
                } else {
                    byte[] bArr = g71.f6324a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j10 = -b10;
                    while (true) {
                        if (i10 < str.length()) {
                            int i11 = i10 + 1;
                            char charAt3 = str.charAt(i10);
                            if (charAt3 < 128) {
                                b11 = g71.f6324a[charAt3];
                            } else {
                                byte[] bArr2 = g71.f6324a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j10 < -922337203685477580L) {
                                break;
                            }
                            long j11 = j10 * 10;
                            long j12 = b11;
                            if (j11 < Long.MIN_VALUE + j12) {
                                break;
                            }
                            j10 = j11 - j12;
                            i10 = i11;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j10);
                        } else if (j10 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j10);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static ByteBuffer J(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i10 = i + position;
        if (i10 >= position && i10 <= limit) {
            byteBuffer.limit(i10);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i10);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    public static ByteBuffer K(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return J(i, byteBuffer);
                }
                int remaining = byteBuffer.remaining();
                q.x.p(g3.a.f(i, remaining, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ", new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(remaining).length())));
                return null;
            }
            q.x.n("Negative length");
            return null;
        }
        int remaining2 = byteBuffer.remaining();
        q.x.p(a5.a.f(remaining2, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(remaining2).length() + 82)));
        return null;
    }

    public static byte[] L(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            int remaining = byteBuffer.remaining();
            q.x.p(g3.a.f(i, remaining, "Underflow while reading length-prefixed value. Length: ", ", available: ", new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(remaining).length())));
            return null;
        }
        q.x.p("Negative length");
        return null;
    }

    public static void M(byte[] bArr, int i) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static int a(long j10) {
        boolean z3;
        int i = (int) j10;
        if (i == j10) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.G(j10, "Out of range: %s", z3);
        return i;
    }

    public static File c(String str, String str2, File file) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new File(s(file, str), str2);
        }
        return null;
    }

    public static Object d(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.ads.r71] */
    public static String e(Context context, String str, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        ?? obj = new Object();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new we(1, obj));
        return (String) obj.get();
    }

    public static ArrayList f(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            try {
                byte b10 = asReadOnlyBuffer.get();
                int i = b10 >> 3;
                if (((b10 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b10 >> 1) & 1) != 0) {
                    remaining = v(asReadOnlyBuffer);
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                duplicate.limit(asReadOnlyBuffer.position());
                ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                duplicate2.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new q31(i & 15, duplicate2));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void g(AtomicReference atomicReference, so0 so0Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            so0Var.l(obj);
        } catch (RemoteException e) {
            int i = k9.a0.f19634b;
            l9.i.i(e, "#007 Could not call remote method.");
        } catch (NullPointerException e8) {
            int i10 = k9.a0.f19634b;
            l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }

    public static void h(Object[] objArr, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            n(i10, objArr[i10]);
        }
    }

    public static boolean i(int i) {
        Boolean bool;
        if (i - 1 != 0) {
            if (lc1.a()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                } catch (Exception unused) {
                    lc1.f8011a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (!lc1.a()) {
            return true;
        }
        return false;
    }

    public static boolean j(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) {
            if (i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                return false;
            }
            return D("EGL_EXT_protected_content");
        }
        return false;
    }

    public static X509Certificate[][] k(String str) {
        RandomAccessFile randomAccessFile;
        Pair R;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                R = null;
            } else {
                R = xy.R(randomAccessFile2, 0);
                if (R == null) {
                    R = xy.R(randomAccessFile2, 65535);
                }
            }
        } catch (Throwable th) {
            th = th;
            randomAccessFile = randomAccessFile2;
        }
        try {
            if (R != null) {
                ByteBuffer byteBuffer = (ByteBuffer) R.first;
                long longValue = ((Long) R.second).longValue();
                long j10 = (-20) + longValue;
                if (j10 >= 0) {
                    randomAccessFile2.seek(j10);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new Exception("ZIP64 APK not supported");
                    }
                }
                xy.W(byteBuffer);
                long j11 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
                if (j11 < longValue) {
                    xy.W(byteBuffer);
                    if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j11 == longValue) {
                        if (j11 >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile2.seek(j11 - allocate.capacity());
                            randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                long j12 = allocate.getLong(0);
                                if (j12 >= allocate.capacity() && j12 <= 2147483639) {
                                    int i = (int) (8 + j12);
                                    long j13 = j11 - i;
                                    if (j13 >= 0) {
                                        ByteBuffer allocate2 = ByteBuffer.allocate(i);
                                        allocate2.order(byteOrder);
                                        randomAccessFile2.seek(j13);
                                        long j14 = j11;
                                        randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                        long j15 = allocate2.getLong(0);
                                        if (j15 == j12) {
                                            Pair create = Pair.create(allocate2, Long.valueOf(j13));
                                            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                            long longValue2 = ((Long) create.second).longValue();
                                            if (byteBuffer2.order() == byteOrder) {
                                                int capacity = byteBuffer2.capacity() - 24;
                                                randomAccessFile = randomAccessFile2;
                                                if (capacity >= 8) {
                                                    int capacity2 = byteBuffer2.capacity();
                                                    if (capacity <= byteBuffer2.capacity()) {
                                                        int limit = byteBuffer2.limit();
                                                        int position = byteBuffer2.position();
                                                        try {
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(capacity);
                                                            byteBuffer2.position(8);
                                                            ByteBuffer slice = byteBuffer2.slice();
                                                            slice.order(byteBuffer2.order());
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(limit);
                                                            byteBuffer2.position(position);
                                                            int i10 = 0;
                                                            while (slice.hasRemaining()) {
                                                                i10++;
                                                                if (slice.remaining() >= 8) {
                                                                    long j16 = slice.getLong();
                                                                    if (j16 >= 4 && j16 <= 2147483647L) {
                                                                        int i11 = (int) j16;
                                                                        int position2 = slice.position() + i11;
                                                                        if (i11 <= slice.remaining()) {
                                                                            if (slice.getInt() == 1896449818) {
                                                                                X509Certificate[][] p10 = p(randomAccessFile.getChannel(), new sa(J(i11 - 4, slice), longValue2, j14, longValue, byteBuffer));
                                                                                randomAccessFile.close();
                                                                                try {
                                                                                    randomAccessFile.close();
                                                                                } catch (IOException unused) {
                                                                                }
                                                                                return p10;
                                                                            }
                                                                            long j17 = j14;
                                                                            slice.position(position2);
                                                                            j14 = j17;
                                                                        } else {
                                                                            int remaining = slice.remaining();
                                                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 45 + String.valueOf(i11).length() + 13 + String.valueOf(remaining).length());
                                                                            sb2.append("APK Signing Block entry #");
                                                                            sb2.append(i10);
                                                                            sb2.append(" size out of range: ");
                                                                            sb2.append(i11);
                                                                            sb2.append(", available: ");
                                                                            sb2.append(remaining);
                                                                            throw new Exception(sb2.toString());
                                                                        }
                                                                    } else {
                                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 45 + String.valueOf(j16).length());
                                                                        sb3.append("APK Signing Block entry #");
                                                                        sb3.append(i10);
                                                                        sb3.append(" size out of range: ");
                                                                        sb3.append(j16);
                                                                        throw new Exception(sb3.toString());
                                                                    }
                                                                } else {
                                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 59);
                                                                    sb4.append("Insufficient data to read size of APK Signing Block entry #");
                                                                    sb4.append(i10);
                                                                    throw new Exception(sb4.toString());
                                                                }
                                                            }
                                                            throw new Exception("No APK Signature Scheme v2 block in APK Signing Block");
                                                        } catch (Throwable th2) {
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(limit);
                                                            byteBuffer2.position(position);
                                                            throw th2;
                                                        }
                                                    }
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                                                    sb5.append("end > capacity: ");
                                                    sb5.append(capacity);
                                                    sb5.append(" > ");
                                                    sb5.append(capacity2);
                                                    throw new IllegalArgumentException(sb5.toString());
                                                }
                                                StringBuilder sb6 = new StringBuilder(String.valueOf(capacity).length() + 17);
                                                sb6.append("end < start: ");
                                                sb6.append(capacity);
                                                sb6.append(" < 8");
                                                throw new IllegalArgumentException(sb6.toString());
                                            }
                                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                        }
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(j15).length() + 63 + String.valueOf(j12).length());
                                        sb7.append("APK Signing Block sizes in header and footer do not match: ");
                                        sb7.append(j15);
                                        sb7.append(" vs ");
                                        sb7.append(j12);
                                        throw new Exception(sb7.toString());
                                    }
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(j13).length() + 39);
                                    sb8.append("APK Signing Block offset out of range: ");
                                    sb8.append(j13);
                                    throw new Exception(sb8.toString());
                                }
                                StringBuilder sb9 = new StringBuilder(String.valueOf(j12).length() + 37);
                                sb9.append("APK Signing Block size out of range: ");
                                sb9.append(j12);
                                throw new Exception(sb9.toString());
                            }
                            throw new Exception("No APK Signing Block before ZIP Central Directory");
                        }
                        StringBuilder sb10 = new StringBuilder(String.valueOf(j11).length() + 67);
                        sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb10.append(j11);
                        throw new Exception(sb10.toString());
                    }
                    throw new Exception("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                StringBuilder sb11 = new StringBuilder(String.valueOf(j11).length() + 82 + String.valueOf(longValue).length());
                sb11.append("ZIP Central Directory offset out of range: ");
                sb11.append(j11);
                sb11.append(". ZIP End of Central Directory offset: ");
                sb11.append(longValue);
                throw new Exception(sb11.toString());
            }
            long length = randomAccessFile2.length();
            StringBuilder sb12 = new StringBuilder(String.valueOf(length).length() + 82);
            sb12.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
            sb12.append(length);
            sb12.append(" bytes");
            throw new Exception(sb12.toString());
        } catch (Throwable th3) {
            th = th3;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static int l(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            if (i != 5) {
                return 0;
            }
            return 7;
        }
        return 6;
    }

    public static int m(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static void n(int i, Object obj) {
        if (obj != null) {
            return;
        }
        g5.q.h(a5.a.f(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }

    public static boolean o(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                la.b.d(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                la.b.d(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                la.b.d(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static X509Certificate[][] p(FileChannel fileChannel, sa saVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer K = K((ByteBuffer) saVar.f10574d);
                int i = 0;
                while (K.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(u(K(K), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(a5.a.j(new StringBuilder(String.valueOf(i).length() + 37), "Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        long j10 = saVar.f10571a;
                        long j11 = saVar.f10572b;
                        long j12 = saVar.f10573c;
                        ByteBuffer byteBuffer = (ByteBuffer) saVar.e;
                        if (!hashMap.isEmpty()) {
                            ra raVar = new ra(fileChannel, 0L, j10);
                            ra raVar2 = new ra(fileChannel, j11, j12 - j11);
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                            xy.W(duplicate);
                            int position = duplicate.position() + 16;
                            if (j10 >= 0 && j10 <= 4294967295L) {
                                duplicate.putInt(duplicate.position() + position, (int) j10);
                                hx0 hx0Var = new hx0(duplicate);
                                int size = hashMap.size();
                                int[] iArr = new int[size];
                                Iterator it = hashMap.keySet().iterator();
                                int i10 = 0;
                                while (it.hasNext()) {
                                    iArr[i10] = ((Integer) it.next()).intValue();
                                    i10++;
                                }
                                try {
                                    byte[][] B2 = B(iArr, new qa[]{raVar, raVar2, hx0Var});
                                    for (int i11 = 0; i11 < size; i11++) {
                                        int i12 = iArr[i11];
                                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i12)), B2[i11])) {
                                            throw new SecurityException(F(i12).concat(" digest of contents did not verify"));
                                        }
                                    }
                                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                                } catch (DigestException e8) {
                                    throw new SecurityException("Failed to compute digest(s) of contents", e8);
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27);
                            sb2.append("uint32 value of out range: ");
                            sb2.append(j10);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        throw new SecurityException("No digests provided");
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            l4.a.k("Failed to obtain X.509 CertificateFactory", e11);
            return null;
        }
    }

    public static final ResolveInfo q(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            f9.k.C.f16817h.d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00cd, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0088, code lost:
    
        return new com.google.android.gms.internal.ads.b6(r3, r13, r15);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.e3 r(com.google.android.gms.internal.ads.o2 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ct.r(com.google.android.gms.internal.ads.o2, boolean):com.google.android.gms.internal.ads.e3");
    }

    public static File s(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        x(file2, false);
        return file2;
    }

    public static final void t(StringBuilder sb2, Iterator it, String str) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e) {
            g5.q.f(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = C(r6);
        r12 = C(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate[] u(java.nio.ByteBuffer r22, java.util.HashMap r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ct.u(java.nio.ByteBuffer, java.util.HashMap, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static int v(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            byte b10 = byteBuffer.get();
            i |= (b10 & Byte.MAX_VALUE) << (i10 * 7);
            if ((b10 & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    public static final Intent w(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static void x(File file, boolean z3) {
        if (z3 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static int y(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static void z(String str, boolean z3) {
        if (z3) {
            return;
        }
        b51 b51Var = d51.f5314v;
        throw new dd0(str, y51.f12781y);
    }
}
