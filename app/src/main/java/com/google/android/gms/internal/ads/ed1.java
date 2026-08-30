package com.google.android.gms.internal.ads;
import ac.b;
import p.a;
import ab.b;
import b0.a;
import g5.q;
import q.h;
import q.x;
import ya.zb;
import zb.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import com.facebook.ads.AdError;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class ed1 implements q2 {
    public static final q90 E;
    public static final com.google.android.gms.internal.mlkit_vision_digital_ink.iw L;
    public static final /* synthetic */ int N = 0;
    public static final /* synthetic */ int O = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f5659u = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f5660v = {44100, 48000, 32000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f5661w = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f5662x = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f5663y = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f5664z = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] A = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final nb B = new nb("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", 4);
    public static final di C = new di(13);
    public static final di D = new di(28);
    public static final q90 F = new q90(17);
    public static final q90 G = new q90(23);
    public static final bn0 H = new bn0(5);
    public static final bn0 I = new bn0(12);
    public static final bn0 J = new bn0(18);
    public static final mc1 K = new mc1(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] M = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    static {
        int i = 9;
        E = new q90(i);
        L = new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(new hq0(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 22, false), i, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.r71, com.google.android.gms.internal.ads.u81] */
    public static u81 A(Throwable th) {
        th.getClass();
        com.google.android.gms.internal.ads.u81 obj = new Object();
        obj.e(th);
        return obj;
    }

    public static w91 B(int i) {
        int i10 = i - 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return w91.f12181g;
                        }
                        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i10)));
                    }
                    return w91.f12180f;
                }
                return w91.e;
            }
            return w91.f12179d;
        }
        return w91.f12178c;
    }

    public static AbstractList C(List list, f31 f31Var) {
        if (list != null) {
            return new r51(list, f31Var);
        }
        return new s51(list, f31Var);
    }

    public static d5 D(int i, String str, xk0 xk0Var) {
        int b10 = xk0Var.b();
        if (xk0Var.b() == 1684108385) {
            xk0Var.G(8);
            return new d5(str, null, d51.q(xk0Var.l(b10 - 16)));
        }
        x21.F("MetadataUtil", "Failed to parse text attribute: ".concat(iw0.g(i)));
        return null;
    }

    public static h91 E(Callable callable, Executor executor) {
        h91 h91Var = new h91(callable);
        executor.execute(h91Var);
        return h91Var;
    }

    public static x91 F(int i) {
        int i10 = i - 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return x91.f12508h;
                            }
                            throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i10)));
                        }
                        return x91.f12507g;
                    }
                    return x91.f12506f;
                }
                return x91.e;
            }
            return x91.f12505d;
        }
        return x91.f12504c;
    }

    public static void G(byte[] bArr, long j10, int i) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i + i10] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }

    public static boolean H(char c10) {
        if (c10 >= 'A' && c10 <= 'Z') {
            return true;
        }
        return false;
    }

    public static int I(x91 x91Var) {
        if (x91Var.equals(x91.f12504c)) {
            return 2;
        }
        if (x91Var.equals(x91.f12505d)) {
            return 3;
        }
        if (x91Var.equals(x91.e)) {
            return 4;
        }
        if (x91Var.equals(x91.f12506f)) {
            return 5;
        }
        if (x91Var.equals(x91.f12507g)) {
            return 6;
        }
        if (x91Var.equals(x91.f12508h)) {
            return 7;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(x91Var.f12526b));
    }

    public static x4 J(int i, String str, xk0 xk0Var, boolean z3, boolean z9) {
        int N2 = N(xk0Var);
        if (z9) {
            N2 = Math.min(1, N2);
        }
        if (N2 >= 0) {
            if (z3) {
                return new d5(str, null, d51.q(Integer.toString(N2)));
            }
            return new v4("und", str, Integer.toString(N2));
        }
        x21.F("MetadataUtil", "Failed to parse uint8 attribute: ".concat(iw0.g(i)));
        return null;
    }

    public static void K(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static boolean L(CharSequence charSequence, String str) {
        char c10;
        int length = str.length();
        if (str != charSequence) {
            if (length == charSequence.length()) {
                for (int i = 0; i < length; i++) {
                    if (str.charAt(i) == charSequence.charAt(i) || ((c10 = (char) ((r3 | ' ') - 97)) < 26 && c10 == ((char) ((r4 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean M(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        an1.I(jArr2);
        byte[] N2 = an1.N(jArr2);
        for (int i = 0; i < 32; i++) {
            if (N2[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static int N(xk0 xk0Var) {
        int b10 = xk0Var.b();
        if (xk0Var.b() == 1684108385) {
            xk0Var.G(8);
            int i = b10 - 16;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (xk0Var.I() & 128) == 0) {
                            return xk0Var.h();
                        }
                    } else {
                        return xk0Var.O();
                    }
                } else {
                    return xk0Var.L();
                }
            } else {
                return xk0Var.K();
            }
        }
        x21.F("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.h91, java.lang.Object, java.lang.Runnable] */
    public static h91 O(i81 i81Var, Executor executor) {
        java.lang.Runnable obj = new Object();
        obj.B = new g91((h91) obj, i81Var);
        executor.execute(obj);
        return obj;
    }

    public static int P(aq0 aq0Var) {
        int e = ya.zb.e(aq0Var) - 1;
        if (e != 0 && e != 1) {
            return 23;
        }
        return 7;
    }

    public static Cursor Q(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    strArr2[0] = "completed_requests";
                } else {
                    strArr2[0] = "last_successful_request_time";
                }
            } else {
                strArr2[0] = "total_requests";
            }
        } else {
            strArr2[0] = "failed_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static d5 R(int i, String str, xk0 xk0Var) {
        int b10 = xk0Var.b();
        if (xk0Var.b() == 1684108385 && b10 >= 22) {
            xk0Var.G(10);
            int L2 = xk0Var.L();
            if (L2 > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(L2).length());
                sb2.append(L2);
                String sb3 = sb2.toString();
                int L3 = xk0Var.L();
                if (L3 > 0) {
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 1 + String.valueOf(L3).length());
                    sb4.append(sb3);
                    sb4.append("/");
                    sb4.append(L3);
                    sb3 = sb4.toString();
                }
                return new d5(str, null, d51.q(sb3));
            }
        }
        x21.F("MetadataUtil", "Failed to parse index/count attribute: ".concat(iw0.g(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.i71, com.google.android.gms.internal.ads.j71, com.google.android.gms.internal.ads.p81, java.lang.Runnable] */
    public static i71 S(ac.b bVar, Class cls, f31 f31Var, Executor executor) {
        int i = j71.E;
        java.lang.Runnable j71Var = new j71(bVar, cls, f31Var);
        bVar.a(j71Var, an1.G(executor, j71Var));
        return j71Var;
    }

    public static void T(com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar, com.google.android.gms.internal.mlkit_vision_digital_ink.pw pwVar, mc1 mc1Var) {
        hq0 hq0Var = (hq0) pwVar.f14821v;
        hq0 hq0Var2 = (hq0) iwVar.f14489v;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) hq0Var2.f6872v;
        long[] jArr3 = (long[]) hq0Var.f6873w;
        long[] jArr4 = (long[]) hq0Var.f6872v;
        an1.l(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) hq0Var2.f6873w;
        an1.w(jArr5, jArr3, jArr4);
        an1.K(jArr5, jArr5, mc1Var.f8324b);
        long[] jArr6 = mc1Var.f8323a;
        long[] jArr7 = (long[]) hq0Var2.f6874x;
        an1.K(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) iwVar.f14490w;
        an1.K(jArr8, (long[]) pwVar.f14822w, mc1Var.f8325c);
        mc1Var.a(jArr2, (long[]) hq0Var.f6874x);
        an1.l(jArr, jArr2, jArr2);
        an1.w(jArr2, jArr7, jArr5);
        an1.l(jArr5, jArr7, jArr5);
        an1.l(jArr7, jArr, jArr8);
        an1.w(jArr8, jArr, jArr8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.h71, com.google.android.gms.internal.ads.j71, com.google.android.gms.internal.ads.p81, java.lang.Runnable] */
    public static h71 U(ac.b bVar, Class cls, j81 j81Var, Executor executor) {
        int i = j71.E;
        java.lang.Runnable j71Var = new j71(bVar, cls, j81Var);
        bVar.a(j71Var, an1.G(executor, j71Var));
        return j71Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.google.android.gms.internal.ads.mf] */
    public static void V(ac.b bVar, ur0 ur0Var, rr0 rr0Var, boolean z3) {
        if (!((Boolean) rm.f10240c.p()).booleanValue()) {
            return;
        }
        q81 t3 = q81.t(bVar);
        Object obj = new Object();
        obj.f8337v = ur0Var;
        obj.f8338w = rr0Var;
        obj.f8336u = z3;
        t3.a(new t81(t3, 0, (Object) obj), xx.f12657h);
    }

    public static void W(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static void X(com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar, com.google.android.gms.internal.mlkit_vision_digital_ink.pw pwVar, mc1 mc1Var) {
        hq0 hq0Var = (hq0) pwVar.f14821v;
        hq0 hq0Var2 = (hq0) iwVar.f14489v;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) hq0Var2.f6872v;
        long[] jArr3 = (long[]) hq0Var.f6873w;
        long[] jArr4 = (long[]) hq0Var.f6872v;
        an1.l(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) hq0Var2.f6873w;
        an1.w(jArr5, jArr3, jArr4);
        an1.K(jArr5, jArr5, mc1Var.f8323a);
        long[] jArr6 = mc1Var.f8324b;
        long[] jArr7 = (long[]) hq0Var2.f6874x;
        an1.K(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) iwVar.f14490w;
        an1.K(jArr8, (long[]) pwVar.f14822w, mc1Var.f8325c);
        mc1Var.a(jArr2, (long[]) hq0Var.f6874x);
        an1.l(jArr, jArr2, jArr2);
        an1.w(jArr2, jArr7, jArr5);
        an1.l(jArr5, jArr7, jArr5);
        an1.w(jArr7, jArr, jArr8);
        an1.l(jArr8, jArr, jArr8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ac.b, com.google.android.gms.internal.ads.f91] */
    public static ac.b Y(ac.b bVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (bVar.isDone()) {
            return bVar;
        }
        com.google.android.gms.internal.ads.f91 obj = new Object();
        obj.B = bVar;
        qu0 qu0Var = new qu0();
        qu0Var.f9993v = obj;
        obj.C = scheduledExecutorService.schedule(qu0Var, j10, timeUnit);
        bVar.a(qu0Var, o81.f9033u);
        return obj;
    }

    public static void Z(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static int a(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i & (-2097152)) != -2097152 || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = i12 - 1;
        int i17 = f5660v[i13];
        if (i10 == 2) {
            i17 /= 2;
        } else if (i10 == 0) {
            i17 /= 4;
        }
        int i18 = (i >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = f5661w[i16];
            } else {
                i15 = f5662x[i16];
            }
            return (((i15 * 12) / i17) + i18) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = f5663y[i16];
            } else {
                i14 = f5664z[i16];
            }
        } else {
            i14 = A[i16];
        }
        int i19 = 144;
        if (i10 == 3) {
            return ((i14 * 144) / i17) + i18;
        }
        if (i11 == 1) {
            i19 = 72;
        }
        return ((i19 * i14) / i17) + i18;
    }

    public static void a0(hq0 hq0Var, com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar) {
        hq0 hq0Var2 = (hq0) iwVar.f14489v;
        long[] jArr = (long[]) hq0Var2.f6872v;
        long[] jArr2 = (long[]) hq0Var.f6872v;
        long[] jArr3 = new long[10];
        an1.L(jArr, jArr2);
        long[] jArr4 = (long[]) hq0Var2.f6874x;
        long[] jArr5 = (long[]) hq0Var.f6873w;
        an1.L(jArr4, jArr5);
        long[] jArr6 = (long[]) iwVar.f14490w;
        an1.L(jArr6, (long[]) hq0Var.f6874x);
        an1.l(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) hq0Var2.f6873w;
        an1.l(jArr7, jArr2, jArr5);
        an1.L(jArr3, jArr7);
        an1.l(jArr7, jArr4, jArr);
        an1.w(jArr4, jArr4, jArr);
        an1.w(jArr, jArr3, jArr7);
        an1.w(jArr6, jArr6, jArr4);
    }

    public static int b0(int i, int i10) {
        int i11 = (~(i ^ i10)) & 255;
        int i12 = i11 & (i11 << 4);
        int i13 = i12 & (i12 << 2);
        return (i13 & (i13 + i13)) >> 7;
    }

    public static long c(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 != 0) {
            int i = ((int) ((j10 ^ j11) >> 63)) | 1;
            switch (c71.f5024a[roundingMode.ordinal()]) {
                case 1:
                    an1.v(false);
                    return j12;
                case 2:
                    return j12;
                case 3:
                    if (i >= 0) {
                        return j12;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i <= 0) {
                        return j12;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    long abs = Math.abs(j13);
                    long abs2 = abs - (Math.abs(j11) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                            return j12;
                        }
                    } else if (abs2 <= 0) {
                        return j12;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return j12 + i;
        }
        return j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.p81, com.google.android.gms.internal.ads.b81, java.lang.Runnable, com.google.android.gms.internal.ads.d81] */
    public static b81 c0(ac.b bVar, j81 j81Var, Executor executor) {
        int i = d81.D;
        com.google.android.gms.internal.ads.d81 d81Var = new d81(bVar, j81Var);
        bVar.a(d81Var, an1.G(executor, d81Var));
        return d81Var;
    }

    public static wv0 d(Context context, hh hhVar, String str, String str2, cv0 cv0Var) {
        wv0 wv0Var;
        fv0 fv0Var = new fv0(context, hhVar, str, str2, cv0Var);
        try {
            wv0Var = (wv0) ((LinkedBlockingQueue) fv0Var.f6188z).poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            fv0Var.i(AdError.INTERSTITIAL_AD_TIMEOUT, fv0Var.f6183u, e);
            wv0Var = null;
        }
        fv0Var.i(3004, fv0Var.f6183u, null);
        if (wv0Var != null) {
            if (wv0Var.f12339w == 7) {
                cv0.e = 3;
            } else {
                cv0.e = 2;
            }
        }
        if (wv0Var == null) {
            return new wv0();
        }
        return wv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.p81, java.lang.Runnable, com.google.android.gms.internal.ads.c81, com.google.android.gms.internal.ads.d81] */
    public static c81 d0(ac.b bVar, f31 f31Var, Executor executor) {
        int i = d81.D;
        com.google.android.gms.internal.ads.d81 d81Var = new d81(bVar, f31Var);
        bVar.a(d81Var, an1.G(executor, d81Var));
        return d81Var;
    }

    public static v81 e(Object obj) {
        if (obj == null) {
            return v81.f11836v;
        }
        return new v81(obj);
    }

    public static void e0(mc1 mc1Var, int i, byte b10) {
        mc1[][] mc1VarArr = oc1.f9095d;
        int i10 = (b10 & 255) >> 7;
        int i11 = (-i10) & b10;
        int i12 = b10 - (i11 + i11);
        mc1Var.b(mc1VarArr[i][0], b0(i12, 1));
        mc1Var.b(mc1VarArr[i][1], b0(i12, 2));
        mc1Var.b(mc1VarArr[i][2], b0(i12, 3));
        mc1Var.b(mc1VarArr[i][3], b0(i12, 4));
        mc1Var.b(mc1VarArr[i][4], b0(i12, 5));
        mc1Var.b(mc1VarArr[i][5], b0(i12, 6));
        mc1Var.b(mc1VarArr[i][6], b0(i12, 7));
        mc1Var.b(mc1VarArr[i][7], b0(i12, 8));
        long[] jArr = mc1Var.f8325c;
        long[] jArr2 = mc1Var.f8323a;
        long[] jArr3 = mc1Var.f8324b;
        long[] copyOf = Arrays.copyOf(jArr3, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        for (int i13 = 0; i13 < copyOf3.length; i13++) {
            copyOf3[i13] = -copyOf3[i13];
        }
        ay0.k(jArr2, copyOf, i10);
        ay0.k(jArr3, copyOf2, i10);
        ay0.k(jArr, copyOf3, i10);
    }

    public static gl1 f(x91 x91Var, Integer num) {
        String str = x91Var.f12526b;
        if (x91Var == x91.f12506f) {
            if (num == null) {
                return kd1.f7721a;
            }
            androidx.datastore.preferences.protobuf.s1.q("RAW output prefix type cannot have an id requirement");
            return null;
        }
        if (num != null) {
            if (x91Var == x91.f12505d) {
                return kd1.b(num.intValue());
            }
            if (x91Var != x91.e && x91Var != x91.f12507g) {
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(str));
            }
            return kd1.a(num.intValue());
        }
        throw new GeneralSecurityException(p.a.o(new StringBuilder(str.length() + 40), "idRequirement must be non-null for ", str, " type"));
    }

    public static byte[] f0(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr2[i10] = (byte) (1 & ((bArr[i10 >> 3] & 255) >> (i10 & 7)));
        }
        for (int i11 = 0; i11 < 256; i11++) {
            if (bArr2[i11] != 0) {
                for (int i12 = 1; i12 <= 6 && (i = i11 + i12) < 256; i12++) {
                    byte b10 = bArr2[i];
                    if (b10 != 0) {
                        byte b11 = bArr2[i11];
                        int i13 = b10 << i12;
                        int i14 = b11 + i13;
                        if (i14 <= 15) {
                            bArr2[i11] = (byte) i14;
                            bArr2[i] = 0;
                        } else {
                            int i15 = b11 - i13;
                            if (i15 >= -15) {
                                bArr2[i11] = (byte) i15;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static Object g(r31 r31Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return r31Var.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static long g0(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static String h(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (H(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (H(c10)) {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static long h0(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | g0(bArr, i);
    }

    public static ArrayList i(m61 m61Var) {
        ArrayList arrayList = new ArrayList();
        m61Var.getClass();
        while (m61Var.hasNext()) {
            arrayList.add(m61Var.next());
        }
        return arrayList;
    }

    public static void i0(ac.b bVar, s81 s81Var, Executor executor) {
        bVar.a(new t81(bVar, 0, s81Var), executor);
    }

    public static void j(int i, m8 m8Var, rv1 rv1Var, m8 m8Var2, m8... m8VarArr) {
        if (m8Var2 == null) {
            m8Var2 = new m8(new q7[0]);
        }
        if (m8Var != null) {
            b51 b51Var = d51.f5314v;
            u(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i10 = 0;
            for (q7 q7Var : m8Var.f8272a) {
                if (mu0.class.isAssignableFrom(q7Var.getClass())) {
                    q7 q7Var2 = (q7) mu0.class.cast(q7Var);
                    q7Var2.getClass();
                    int length = objArr.length;
                    int i11 = i10 + 1;
                    int d2 = y41.d(length, i11);
                    if (d2 > length) {
                        objArr = Arrays.copyOf(objArr, d2);
                    }
                    objArr[i10] = q7Var2;
                    i10 = i11;
                }
            }
            y51 w10 = d51.w(objArr, i10);
            int i12 = w10.f12783x;
            for (int i13 = 0; i13 < i12; i13++) {
                mu0 mu0Var = (mu0) w10.get(i13);
                if (!mu0Var.f8424a.equals("com.android.capture.fps") || i == 2) {
                    m8Var2 = m8Var2.c(mu0Var);
                }
            }
        }
        for (m8 m8Var3 : m8VarArr) {
            m8Var2 = m8Var2.b(m8Var3);
        }
        if (m8Var2.f8272a.length > 0) {
            rv1Var.f10304k = m8Var2;
        }
    }

    public static Object j0(Future future) {
        if (future.isDone()) {
            return ct.d(future);
        }
        q.x.o(ay0.B("Future was expected to be done: %s", future));
        return null;
    }

    public static void k(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String obj3 = obj.toString();
            g5.q.h(p.a.o(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
            return;
        }
        g5.q.h("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static Object k0(yx yxVar) {
        try {
            return ct.d(yxVar);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new Error((Error) e.getCause());
            }
            throw new ab.b(5, e.getCause());
        }
    }

    public static boolean l(xk0 xk0Var, s2 s2Var, int i, b0.a aVar) {
        boolean z3;
        boolean z9;
        boolean z10;
        long P = xk0Var.P();
        long j10 = P >>> 16;
        if (j10 != i) {
            return false;
        }
        if ((j10 & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j11 = P >> 12;
        long j12 = P >> 8;
        long j13 = P >> 4;
        long j14 = P >> 1;
        long j15 = P & 1;
        int i10 = (int) (j13 & 15);
        if (i10 <= 7) {
            z9 = true;
            if (i10 != s2Var.f10460g - 1) {
                return false;
            }
        } else {
            z9 = true;
            if (i10 > 10 || s2Var.f10460g != 2) {
                return false;
            }
        }
        int i11 = (int) (j14 & 7);
        if ((i11 != 0 && i11 != s2Var.i) || j15 == 1) {
            return false;
        }
        try {
            long o10 = xk0Var.o();
            if (!z3) {
                o10 *= s2Var.f10456b;
            }
            long j16 = s2Var.f10462j;
            if (j16 != 0 && o10 > j16) {
                return false;
            }
            aVar.f1139v = o10;
            int x9 = x((int) (j11 & 15), xk0Var);
            long j17 = s2Var.f10462j;
            if (j17 == 0 || o10 + x9 >= j17) {
                z10 = z9;
            } else {
                z10 = false;
            }
            if (x9 == -1) {
                return false;
            }
            if ((!z10 && x9 < s2Var.f10455a) || x9 > s2Var.f10456b) {
                return false;
            }
            int i12 = s2Var.e;
            int i13 = (int) (j12 & 15);
            if (i13 != 0) {
                if (i13 <= 11) {
                    if (i13 != s2Var.f10459f) {
                        return false;
                    }
                } else if (i13 == 12) {
                    if (xk0Var.K() * AdError.NETWORK_ERROR_CODE != i12) {
                        return false;
                    }
                } else {
                    if (i13 > 14) {
                        return false;
                    }
                    int L2 = xk0Var.L();
                    if (i13 == 14) {
                        L2 *= 10;
                    }
                    if (L2 != i12) {
                        return false;
                    }
                }
            }
            int K2 = xk0Var.K();
            int i14 = xk0Var.f12581b;
            byte[] bArr = xk0Var.f12580a;
            int i15 = i14 - 1;
            int i16 = 0;
            for (int i17 = xk0Var.f12581b; i17 < i15; i17++) {
                i16 = bq0.i[i16 ^ (bArr[i17] & 255)];
            }
            String str = bq0.f4860a;
            if (K2 != i16) {
                return false;
            }
            if (xk0Var.B() != 0) {
                int I2 = xk0Var.I();
                if ((I2 & 128) != 0) {
                    return false;
                }
                int i18 = (I2 & 126) >> 1;
                if ((i18 >= 2 && i18 <= 7) || (i18 >= 13 && i18 <= 31)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i18).length() + 57);
                    sb2.append("Ignoring frame where first subframe has a reserved type: ");
                    sb2.append(i18);
                    x21.D("FlacFrameReader", sb2.toString());
                    return false;
                }
            }
            return z9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] m(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i10 = 0;
        while (true) {
            if (i10 >= 32) {
                break;
            }
            int i11 = i10 + i10;
            bArr2[i11] = (byte) (bArr[i10] & 15);
            bArr2[i11 + 1] = (byte) ((bArr[i10] & 255) >> 4);
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < 63) {
            byte b10 = (byte) (bArr2[i12] + i13);
            bArr2[i12] = b10;
            int i14 = (b10 + 8) >> 4;
            bArr2[i12] = (byte) (b10 - (i14 << 4));
            i12++;
            i13 = i14;
        }
        bArr2[63] = (byte) (bArr2[63] + i13);
        com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(9);
        com.google.android.gms.internal.mlkit_vision_digital_ink.pw pwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(9);
        for (i = 1; i < 64; i += 2) {
            mc1 mc1Var = new mc1();
            e0(mc1Var, i / 2, bArr2[i]);
            com.google.android.gms.internal.mlkit_vision_digital_ink.pw.p(pwVar, iwVar);
            T(iwVar, pwVar, mc1Var);
        }
        hq0 hq0Var = new hq0(22);
        hq0.r(hq0Var, iwVar);
        a0(hq0Var, iwVar);
        hq0.r(hq0Var, iwVar);
        a0(hq0Var, iwVar);
        hq0.r(hq0Var, iwVar);
        a0(hq0Var, iwVar);
        hq0.r(hq0Var, iwVar);
        a0(hq0Var, iwVar);
        for (int i15 = 0; i15 < 64; i15 += 2) {
            mc1 mc1Var2 = new mc1();
            e0(mc1Var2, i15 / 2, bArr2[i15]);
            com.google.android.gms.internal.mlkit_vision_digital_ink.pw.p(pwVar, iwVar);
            T(iwVar, pwVar, mc1Var2);
        }
        hq0 hq0Var2 = new hq0(iwVar);
        long[] jArr = new long[10];
        an1.L(jArr, (long[]) hq0Var2.f6872v);
        long[] jArr2 = new long[10];
        an1.L(jArr2, (long[]) hq0Var2.f6873w);
        long[] jArr3 = new long[10];
        an1.L(jArr3, (long[]) hq0Var2.f6874x);
        long[] jArr4 = new long[10];
        an1.L(jArr4, jArr3);
        long[] jArr5 = new long[10];
        an1.w(jArr5, jArr2, jArr);
        an1.K(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        an1.K(jArr6, jArr, jArr2);
        an1.K(jArr6, jArr6, oc1.f9092a);
        an1.l(jArr6, jArr6, jArr4);
        an1.F(jArr6, jArr6);
        if (MessageDigest.isEqual(an1.N(jArr5), an1.N(jArr6))) {
            return hq0Var2.v();
        }
        q.x.o("arithmetic error in scalar multiplication");
        return null;
    }

    public static byte[] n(byte[] bArr, byte[] bArr2) {
        long r8 = r(bArr, 0) & 67108863;
        int i = 3;
        long r10 = (r(bArr, 3) >> 2) & 67108611;
        long r11 = (r(bArr, 6) >> 4) & 67092735;
        long r12 = (r(bArr, 9) >> 6) & 66076671;
        long r13 = (r(bArr, 12) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i10 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 < length) {
                int min = Math.min(16, length - i10);
                System.arraycopy(bArr2, i10, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, 17, (byte) 0);
                }
                long j15 = r13 * 5;
                long j16 = r12 * 5;
                long j17 = r11 * 5;
                long r14 = j14 + (r(bArr3, 0) & 67108863);
                long r15 = j11 + ((r(bArr3, i) >> 2) & 67108863);
                long r16 = j10 + ((r(bArr3, 6) >> 4) & 67108863);
                long r17 = j12 + ((r(bArr3, 9) >> 6) & 67108863);
                long j18 = r10;
                long r18 = j13 + (((r(bArr3, 12) >> 8) & 67108863) | (bArr3[16] << 24));
                long j19 = r15 * r8;
                long j20 = r15 * j18;
                long j21 = r16 * r8;
                long j22 = r15 * r11;
                long j23 = r16 * j18;
                long j24 = r17 * r8;
                long j25 = r15 * r12;
                long j26 = r16 * r11;
                long j27 = r17 * j18;
                long j28 = r18 * r8;
                long j29 = (r10 * 5 * r18) + (r17 * j17) + (r16 * j16) + (r15 * j15) + (r14 * r8);
                long j30 = j29 & 67108863;
                long j31 = r17 * j16;
                long j32 = j17 * r18;
                long j33 = j32 + j31 + (r16 * j15) + (r14 * j18) + j19 + (j29 >> 26);
                long j34 = j16 * r18;
                long j35 = j34 + (r17 * j15) + (r14 * r11) + j20 + j21 + (j33 >> 26);
                long j36 = (r18 * j15) + (r14 * r12) + j22 + j23 + j24 + (j35 >> 26);
                long j37 = (r14 * r13) + j25 + j26 + j27 + j28 + (j36 >> 26);
                long j38 = ((j37 >> 26) * 5) + j30;
                j11 = (j33 & 67108863) + (j38 >> 26);
                i10 += 16;
                j10 = j35 & 67108863;
                j12 = j36 & 67108863;
                j13 = j37 & 67108863;
                j14 = j38 & 67108863;
                r10 = j18;
                i = 3;
            } else {
                long j39 = j10 + (j11 >> 26);
                long j40 = j39 & 67108863;
                long j41 = j12 + (j39 >> 26);
                long j42 = j41 & 67108863;
                long j43 = j13 + (j41 >> 26);
                long j44 = j43 & 67108863;
                long j45 = ((j43 >> 26) * 5) + j14;
                long j46 = j45 >> 26;
                long j47 = j45 & 67108863;
                long j48 = j47 + 5;
                long j49 = (j11 & 67108863) + j46;
                long j50 = j49 + (j48 >> 26);
                long j51 = j40 + (j50 >> 26);
                long j52 = j42 + (j51 >> 26);
                long j53 = (j44 + (j52 >> 26)) - 67108864;
                long j54 = j53 >> 63;
                long j55 = ~j54;
                long j56 = (j49 & j54) | (j50 & 67108863 & j55);
                long j57 = (j40 & j54) | (j51 & 67108863 & j55);
                long j58 = (j42 & j54) | (j52 & 67108863 & j55);
                long r19 = r(bArr, 16) + (((j48 & 67108863 & j55) | (j47 & j54) | (j56 << 26)) & 4294967295L);
                long r20 = r(bArr, 20);
                long r21 = r(bArr, 24);
                long r22 = r(bArr, 28) + (((j58 >> 18) | (((j44 & j54) | (j53 & j55)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                G(bArr4, r19 & 4294967295L, 0);
                long j59 = r20 + (((j56 >> 6) | (j57 << 20)) & 4294967295L) + (r19 >> 32);
                G(bArr4, j59 & 4294967295L, 4);
                long j60 = r21 + (((j58 << 14) | (j57 >> 12)) & 4294967295L) + (j59 >> 32);
                G(bArr4, j60 & 4294967295L, 8);
                G(bArr4, (r22 + (j60 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    public static int o(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int p(w91 w91Var) {
        if (w91Var.equals(w91.f12178c)) {
            return 2;
        }
        if (w91Var.equals(w91.f12179d)) {
            return 3;
        }
        if (w91Var.equals(w91.e)) {
            return 4;
        }
        if (w91Var.equals(w91.f12180f)) {
            return 5;
        }
        if (w91Var.equals(w91.f12181g)) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(w91Var.f12196b));
    }

    public static long q(long j10, long j11) {
        an1.g(j10, "a");
        an1.g(j11, "b");
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j13 = j11 >> numberOfTrailingZeros2;
        while (j12 != j13) {
            long j14 = j12 - j13;
            long j15 = (j14 >> 63) & j14;
            long j16 = (j14 - j15) - j15;
            j12 = j16 >> Long.numberOfTrailingZeros(j16);
            j13 += j15;
        }
        return j12 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long r(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16)) & 4294967295L;
    }

    public static String s(zk1 zk1Var) {
        int ordinal = zk1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return "SHA-512";
                        }
                        throw new GeneralSecurityException("Unsupported hash ".concat(zk1Var.toString()));
                    }
                    return "SHA-384";
                }
                return "SHA-256";
            }
            return "SHA-224";
        }
        return "SHA-1";
    }

    public static String t(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void u(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void v(ac.b bVar, rr0 rr0Var) {
        if (!((Boolean) rm.f10240c.p()).booleanValue()) {
            return;
        }
        q81 t3 = q81.t(bVar);
        zq0 zq0Var = new zq0(1, rr0Var);
        t3.a(new t81(t3, 0, zq0Var), xx.f12657h);
    }

    public static byte[] w(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) yk1.e.f12905a.o("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static int x(int i, xk0 xk0Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return xk0Var.K() + 1;
            case 7:
                return xk0Var.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static int y(SQLiteDatabase sQLiteDatabase, int i) {
        int i10 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor Q = Q(sQLiteDatabase, i);
        if (Q.getCount() > 0) {
            Q.moveToNext();
            i10 = Q.getInt(Q.getColumnIndexOrThrow("value"));
        }
        Q.close();
        return i10;
    }

    public static long z(long j10, long j11) {
        boolean z3;
        boolean z9;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = j10 ^ j11;
        boolean z10 = false;
        if (numberOfLeadingZeros < 64) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (j10 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (j11 == Long.MIN_VALUE) {
            z10 = true;
        }
        long j13 = (j12 >>> 63) + Long.MAX_VALUE;
        if (!(z3 | (z10 & z9))) {
            long j14 = j10 * j11;
            if (j10 == 0 || j14 / j10 == j11) {
                return j14;
            }
        }
        return j13;
    }
}
