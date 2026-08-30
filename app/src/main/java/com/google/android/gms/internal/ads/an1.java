package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class an1 implements q2 {
    public static ib.o E;
    public static x90 F;
    public static final /* synthetic */ int N = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4559u;

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f4554v = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f4555w = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f4556x = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: y, reason: collision with root package name */
    public static final nb f4557y = new nb("gads:pan:experiment_id", "", 4);

    /* renamed from: z, reason: collision with root package name */
    public static final di f4558z = new di(14);
    public static final di A = new di(29);
    public static final q90 B = new q90(10);
    public static final q90 C = new q90(18);
    public static final q90 D = new q90(25);
    public static final Object G = new Object();
    public static final bn0 H = new bn0(13);
    public static final bn0 I = new bn0(19);
    public static final int[] J = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] K = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] L = {67108863, 33554431};
    public static final int[] M = {26, 25};

    public /* synthetic */ an1(boolean z3) {
        this.f4559u = 22;
    }

    public static y51 A(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        b51 b51Var = d51.f5314v;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (y(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String B2 = B(xmlPullParser, concat2);
                String B3 = B(xmlPullParser, concat3);
                String B4 = B(xmlPullParser, concat4);
                String B5 = B(xmlPullParser, concat5);
                if (B2 != null && B3 != null) {
                    long j11 = 0;
                    if (B4 != null) {
                        j10 = Long.parseLong(B4);
                    } else {
                        j10 = 0;
                    }
                    if (B5 != null) {
                        j11 = Long.parseLong(B5);
                    }
                    j4 j4Var = new j4(j10, j11, B2);
                    int length = objArr.length;
                    int i10 = i + 1;
                    int d2 = y41.d(length, i10);
                    if (d2 > length) {
                        objArr = Arrays.copyOf(objArr, d2);
                    }
                    objArr[i] = j4Var;
                    i = i10;
                } else {
                    return y51.f12781y;
                }
            }
        } while (!n(xmlPullParser, str.concat(":Directory")));
        return d51.w(objArr, i);
    }

    public static String B(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static void C(int i) {
        if (i >= 2048) {
            if (lc1.a() && i != 2048 && i != 3072) {
                throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
    }

    public static void D(int i, Object obj, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }

    public static final void E(byte[] bArr, String str, cv0 cv0Var) {
        if (cv0Var == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(System.getProperty("os.arch"));
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        cv0Var.d(4007, sb2.toString());
    }

    public static void F(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
        I(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static Executor G(Executor executor, p81 p81Var) {
        executor.getClass();
        if (executor == o81.f9033u) {
            return executor;
        }
        return new z81(executor, p81Var, 0);
    }

    public static void H(BigInteger bigInteger) {
        if (bigInteger.testBit(0)) {
            if (bigInteger.compareTo(BigInteger.valueOf(65536L)) > 0) {
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("Public exponent must be greater than 65536.");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Public exponent must be odd.");
    }

    public static void I(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j10 = jArr[i];
            long j11 = j10 / 67108864;
            jArr[i] = j10 - (j11 << 26);
            int i10 = i + 1;
            long j12 = jArr[i10] + j11;
            jArr[i10] = j12;
            long j13 = j12 / 33554432;
            jArr[i10] = j12 - (j13 << 25);
            i += 2;
            jArr[i] = jArr[i] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        D(r1, r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int J(java.lang.Object r8, java.lang.Object r9, int r10, java.lang.Object r11, int[] r12, java.lang.Object[] r13, java.lang.Object[] r14) {
        /*
            int r0 = com.google.android.gms.internal.ads.b80.q(r8)
            r1 = r0 & r10
            int r2 = p(r1, r11)
            r3 = -1
            if (r2 == 0) goto L3e
            int r4 = ~r10
            r0 = r0 & r4
            r5 = r3
        L10:
            int r2 = r2 + r3
            r6 = r12[r2]
            r7 = r6 & r10
            r6 = r6 & r4
            if (r6 != r0) goto L39
            r6 = r13[r2]
            boolean r6 = java.util.Objects.equals(r8, r6)
            if (r6 == 0) goto L39
            if (r14 == 0) goto L2a
            r6 = r14[r2]
            boolean r6 = java.util.Objects.equals(r9, r6)
            if (r6 == 0) goto L39
        L2a:
            if (r5 != r3) goto L30
            D(r1, r11, r7)
            return r2
        L30:
            r8 = r12[r5]
            r8 = r8 & r4
            r9 = r7 & r10
            r8 = r8 | r9
            r12[r5] = r8
            return r2
        L39:
            if (r7 == 0) goto L3e
            r5 = r2
            r2 = r7
            goto L10
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.an1.J(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void K(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr2[0];
        long j11 = jArr3[0];
        long j12 = j10 * j11;
        long j13 = jArr3[1];
        long j14 = jArr2[1];
        long j15 = (j14 * j11) + (j10 * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        long j18 = ((j14 + j14) * j13) + (j10 * j16) + (j17 * j11);
        long j19 = jArr3[3];
        long j20 = jArr2[3];
        long j21 = (j14 * j16) + (j17 * j13) + (j10 * j19) + (j20 * j11);
        long j22 = jArr3[4];
        long j23 = jArr2[4];
        long j24 = (j14 * j19) + (j20 * j13);
        long j25 = j24 + j24 + (j17 * j16) + (j10 * j22) + (j23 * j11);
        long j26 = jArr3[5];
        long j27 = jArr2[5];
        long j28 = (j17 * j19) + (j20 * j16) + (j14 * j22) + (j23 * j13) + (j10 * j26) + (j27 * j11);
        long j29 = jArr3[6];
        long j30 = jArr2[6];
        long j31 = (j20 * j19) + (j14 * j26) + (j27 * j13);
        long j32 = j31 + j31 + (j17 * j22) + (j23 * j16) + (j10 * j29) + (j30 * j11);
        long j33 = jArr3[7];
        long j34 = jArr2[7];
        long j35 = (j20 * j22) + (j23 * j19) + (j17 * j26) + (j27 * j16) + (j14 * j29) + (j30 * j13) + (j10 * j33) + (j34 * j11);
        long j36 = jArr3[8];
        long j37 = jArr2[8];
        long j38 = (j20 * j26) + (j27 * j19) + (j14 * j33) + (j34 * j13);
        long j39 = j38 + j38 + (j23 * j22) + (j17 * j29) + (j30 * j16) + (j10 * j36) + (j37 * j11);
        long j40 = jArr3[9];
        long j41 = jArr2[9];
        long j42 = (j23 * j26) + (j27 * j22) + (j20 * j29) + (j30 * j19) + (j17 * j33) + (j34 * j16) + (j14 * j36) + (j37 * j13) + (j10 * j40) + (j11 * j41);
        long j43 = (j27 * j26) + (j20 * j33) + (j34 * j19) + (j14 * j40) + (j13 * j41);
        long j44 = (j27 * j33) + (j34 * j26) + (j20 * j40) + (j19 * j41);
        long j45 = (j34 * j33) + (j27 * j40) + (j26 * j41);
        long j46 = (j34 * j36) + (j37 * j33) + (j30 * j40) + (j29 * j41);
        long j47 = (j33 * j41) + (j34 * j40);
        F(new long[]{j12, j15, j18, j21, j25, j28, j32, j35, j39, j42, j43 + j43 + (j23 * j29) + (j30 * j22) + (j17 * j36) + (j37 * j16), (j27 * j29) + (j30 * j26) + (j23 * j33) + (j34 * j22) + (j20 * j36) + (j37 * j19) + (j17 * j40) + (j16 * j41), j44 + j44 + (j30 * j29) + (j23 * j36) + (j37 * j22), (j30 * j33) + (j34 * j29) + (j27 * j36) + (j37 * j26) + (j23 * j40) + (j22 * j41), j45 + j45 + (j30 * j36) + (j37 * j29), j46, j47 + j47 + (j37 * j36), (j36 * j41) + (j37 * j40), (j41 + j41) * j40}, jArr);
    }

    public static void L(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = j10 * j10;
        long j12 = jArr2[1];
        long j13 = (j10 + j10) * j12;
        long j14 = jArr2[2];
        long j15 = (j10 * j14) + (j12 * j12);
        long j16 = jArr2[3];
        long j17 = (j10 * j16) + (j12 * j14);
        long j18 = jArr2[4];
        long j19 = (j14 * j14) + (j12 * 4 * j16) + ((j10 + j10) * j18);
        long j20 = jArr2[5];
        long j21 = (j14 * j16) + (j12 * j18) + (j10 * j20);
        long j22 = jArr2[6];
        long j23 = (j16 * j16) + (j14 * j18) + (j10 * j22) + ((j12 + j12) * j20);
        long j24 = jArr2[7];
        long j25 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j24);
        long j26 = jArr2[8];
        long j27 = (j16 * j20) + (j12 * j24);
        long j28 = j27 + j27 + (j14 * j22) + (j10 * j26);
        long j29 = j28 + j28 + (j18 * j18);
        long j30 = jArr2[9];
        long j31 = (j18 * j20) + (j16 * j22) + (j14 * j24) + (j12 * j26) + (j10 * j30);
        long j32 = (j12 * j30) + (j16 * j24);
        long j33 = j32 + j32 + (j20 * j20) + (j18 * j22) + (j14 * j26);
        long j34 = (j20 * j22) + (j18 * j24) + (j16 * j26) + (j14 * j30);
        long j35 = (j16 * j30) + (j20 * j24);
        long j36 = j35 + j35 + (j18 * j26);
        long j37 = j36 + j36 + (j22 * j22);
        long j38 = (j22 * j24) + (j20 * j26) + (j18 * j30);
        long j39 = (j24 * j24) + (j22 * j26) + ((j20 + j20) * j30);
        long j40 = (j22 * j30) + (j24 * j26);
        F(new long[]{j11, j13, j15 + j15, j17 + j17, j19, j21 + j21, j23 + j23, j25 + j25, j29, j31 + j31, j33 + j33, j34 + j34, j37, j38 + j38, j39 + j39, j40 + j40, (j24 * 4 * j30) + (j26 * j26), (j26 + j26) * j30, (j30 + j30) * j30}, jArr);
    }

    public static long[] M(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i10 = J[i];
            jArr[i] = (((((bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8)) | ((bArr[i10 + 2] & 255) << 16)) | ((bArr[i10 + 3] & 255) << 24)) >> K[i]) & L[i & 1];
        }
        return jArr;
    }

    public static byte[] N(long[] jArr) {
        long j10;
        int[] iArr;
        int i;
        int[] iArr2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            j10 = 19;
            iArr = M;
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j11 = copyOf[i12];
                int i13 = -((int) (((j11 >> 31) & j11) >> iArr[i12 & 1]));
                copyOf[i12] = j11 + (i13 << r15);
                i12++;
                copyOf[i12] = copyOf[i12] - i13;
            }
            long j12 = copyOf[9];
            copyOf[9] = j12 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j12 >> 31) & j12) >> 25))) * 19);
            i11++;
        }
        long j13 = copyOf[0];
        copyOf[0] = j13 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j13 >> 31) & j13) >> 26)));
        int i14 = 0;
        while (true) {
            iArr2 = L;
            if (i14 >= 2) {
                break;
            }
            int i15 = i10;
            while (i15 < 9) {
                long j14 = copyOf[i15];
                int i16 = i10;
                long j15 = j14 >> iArr[i15 & 1];
                copyOf[i15] = iArr2[r16] & j14;
                i15++;
                copyOf[i15] = copyOf[i15] + ((int) j15);
                i10 = i16;
                i14 = i14;
                j10 = j10;
            }
            i14++;
        }
        int i17 = i10;
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[i17] = (((int) (r2 >> 25)) * j10) + copyOf[i17];
        int i18 = ~((((int) r4) - 67108845) >> 31);
        for (int i19 = 1; i19 < 10; i19++) {
            int i20 = ~(((int) copyOf[i19]) ^ iArr2[i19 & 1]);
            int i21 = i20 & (i20 << 16);
            int i22 = i21 & (i21 << 8);
            int i23 = i22 & (i22 << 4);
            int i24 = i23 & (i23 << 2);
            i18 &= (i24 & (i24 + i24)) >> 31;
        }
        copyOf[i17] = copyOf[i17] - (67108845 & i18);
        long j16 = 33554431 & i18;
        copyOf[1] = copyOf[1] - j16;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - (67108863 & i18);
            int i25 = i + 1;
            copyOf[i25] = copyOf[i25] - j16;
        }
        for (int i26 = i17; i26 < 10; i26++) {
            copyOf[i26] = copyOf[i26] << K[i26];
        }
        byte[] bArr = new byte[32];
        for (int i27 = i17; i27 < 10; i27++) {
            int i28 = J[i27];
            long j17 = bArr[i28];
            long j18 = copyOf[i27];
            bArr[i28] = (byte) (j17 | (j18 & 255));
            bArr[i28 + 1] = (byte) (bArr[r5] | ((j18 >> 8) & 255));
            bArr[i28 + 2] = (byte) (bArr[r5] | ((j18 >> 16) & 255));
            bArr[i28 + 3] = (byte) (bArr[r4] | ((j18 >> 24) & 255));
        }
        return bArr;
    }

    public static dc1 a(com.google.android.gms.internal.mlkit_vision_digital_ink.gw gwVar, wd1 wd1Var) {
        gl1 g02;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) gwVar.f14386v).size(); i++) {
            s91 H2 = gwVar.H(i);
            if (H2.f10567b.equals(q91.f9787w)) {
                xy xyVar = H2.f10566a;
                if (xyVar instanceof ca1) {
                    g02 = ((ca1) xyVar).g0();
                } else if (xyVar instanceof cd1) {
                    g02 = ((cd1) xyVar).g0();
                } else {
                    String name = xyVar.getClass().getName();
                    String valueOf = String.valueOf(xyVar.s());
                    throw new GeneralSecurityException(a5.a.l(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                }
                cc1 cc1Var = new cc1((o91) wd1Var.e(H2), H2.f10568c);
                byte[] bArr = g02.f6427a;
                if (bArr.length != 0 && bArr.length != 5) {
                    androidx.datastore.preferences.protobuf.s1.q("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (hashMap.containsKey(g02)) {
                    arrayList = (List) hashMap.get(g02);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(g02, arrayList);
                }
                arrayList.add(cc1Var);
            }
        }
        if (((Map) gwVar.f14387w).get(ed1.class) == null) {
            gwVar.G();
            return new dc1(new rd1(hashMap));
        }
        g5.q.b();
        return null;
    }

    public static Object c(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        q.x.n(a5.a.f(i, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i).length() + 41)));
        return null;
    }

    public static String d(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z3 = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((z6) obj).f13086a.f12154g.f8459o;
            if (ha.b(str2)) {
                return "video/mp4";
            }
            if (ha.a(str2)) {
                z3 = true;
            } else if (ha.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z3) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }

    public static void f(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void g(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 17);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void h(Context context, boolean z3) {
        synchronized (G) {
            try {
                if (F == null) {
                    F = new x90(context, 19);
                }
                ib.o oVar = E;
                if (oVar == null || ((oVar.k() && !E.l()) || (z3 && E.k()))) {
                    try {
                        x90 x90Var = F;
                        fa.y.i(x90Var, "the appSetIdClient shouldn't be null");
                        E = x90Var.a();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 31);
                        sb2.append("Failed to get app set ID info: ");
                        sb2.append(message);
                        k9.a0.k(sb2.toString());
                        E = wa.h8.d(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i10, 33);
    }

    public static void j(wl wlVar, ul ulVar, String... strArr) {
        if (ulVar == null) {
            return;
        }
        f9.k.C.f16819k.getClass();
        wlVar.a(ulVar, SystemClock.elapsedRealtime(), strArr);
    }

    public static void k(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static boolean m(hh hhVar) {
        int ordinal = hhVar.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return true;
        }
        return false;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static byte[] o(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            int i = 0;
            while (i < 16) {
                int i10 = i + 1;
                byte b10 = bArr[i];
                byte b11 = (byte) ((b10 + b10) & 254);
                bArr2[i] = b11;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i10] >> 7) & 1) | b11);
                }
                i = i10;
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        q.x.n("value must be a block.");
        return null;
    }

    public static int p(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.hh q(android.content.Context r14, com.google.android.gms.internal.ads.cv0 r15) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.an1.q(android.content.Context, com.google.android.gms.internal.ads.cv0):com.google.android.gms.internal.ads.hh");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.wm1 r() {
        /*
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            java.lang.Class<com.google.android.gms.internal.ads.an1> r1 = com.google.android.gms.internal.ads.an1.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<com.google.android.gms.internal.ads.wm1> r2 = com.google.android.gms.internal.ads.wm1.class
            boolean r3 = r2.equals(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L13
            goto L2f
        L13:
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r1)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            if (r0 != 0) goto L22
            throw r5
        L22:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.ReflectiveOperationException -> L28
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L28
            throw r0     // Catch: java.lang.ReflectiveOperationException -> L28
        L28:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L2f
            r1.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            throw r1     // Catch: java.lang.ClassNotFoundException -> L2f
        L2f:
            r1 = 0
            com.google.android.gms.internal.ads.an1[] r0 = new com.google.android.gms.internal.ads.an1[r1]     // Catch: java.lang.Throwable -> La4
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L3f:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L75
            int r0 = r6.size()
            if (r0 != r4) goto L52
            java.lang.Object r0 = r6.get(r1)
            com.google.android.gms.internal.ads.wm1 r0 = (com.google.android.gms.internal.ads.wm1) r0
            return r0
        L52:
            int r0 = r6.size()
            if (r0 != 0) goto L59
            return r5
        L59:
            java.lang.String r0 = "combine"
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.reflect.Method r0 = r2.getMethod(r0, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            com.google.android.gms.internal.ads.wm1 r0 = (com.google.android.gms.internal.ads.wm1) r0     // Catch: java.lang.ReflectiveOperationException -> L70
            return r0
        L70:
            r0 = move-exception
            androidx.datastore.preferences.protobuf.s1.r(r0)
            return r5
        L75:
            java.lang.Object r0 = r3.next()     // Catch: java.util.ServiceConfigurationError -> L84
            if (r0 != 0) goto L7c
            throw r5
        L7c:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.util.ServiceConfigurationError -> L84
            r0.<init>()     // Catch: java.util.ServiceConfigurationError -> L84
            throw r0     // Catch: java.util.ServiceConfigurationError -> L84
        L82:
            r12 = r0
            goto L86
        L84:
            r0 = move-exception
            goto L82
        L86:
            java.lang.Class<com.google.android.gms.internal.ads.um1> r0 = com.google.android.gms.internal.ads.um1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r7 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r10 = "load"
            java.lang.String r9 = "Unable to load "
            java.lang.String r11 = r9.concat(r0)
            java.lang.String r9 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            r7.logp(r8, r9, r10, r11, r12)
            goto L3f
        La4:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.an1.r():com.google.android.gms.internal.ads.wm1");
    }

    public static HashMap s(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
            return null;
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("an1", "decode object failure");
            return null;
        }
    }

    public static void t(zk1 zk1Var) {
        int ordinal = zk1Var.ordinal();
        if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zk1Var.name())));
        }
    }

    public static void u(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static void v(boolean z3) {
        if (z3) {
        } else {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static boolean x(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static x90 z(xk0 xk0Var) {
        xk0Var.G(1);
        int O = xk0Var.O();
        long j10 = xk0Var.f12581b;
        long j11 = O;
        int i = O / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                break;
            }
            long d2 = xk0Var.d();
            if (d2 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = d2;
            jArr2[i10] = xk0Var.d();
            xk0Var.G(2);
            i10++;
        }
        xk0Var.G((int) ((j10 + j11) - xk0Var.f12581b));
        return new x90(jArr, 3, jArr2);
    }

    public abstract HashMap e();

    public String toString() {
        switch (this.f4559u) {
            case 16:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(e());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ an1(int i) {
        this.f4559u = i;
    }
}
