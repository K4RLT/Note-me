package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import b8.l2;
import df.p;
import g9.r;
import g9.y1;
import j6.s;
import k9.l;
import pf.b0;
import pf.z;
import q.x;
import r0.h;
import va.a;

import android.content.Context;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import androidx.ink.storage.DecompressedBytes;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.math.RoundingMode;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public abstract class x21 implements q2, af1 {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f12448h0 = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f12449u = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f12450v = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f12451w = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f12452x = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f12453y = {5, 8, 10, 12};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f12454z = {6, 9, 12, 15};
    public static final int[] A = {2, 4, 6, 8};
    public static final int[] B = {9, 11, 13, 16};
    public static final int[] C = {5, 8, 10, 12};
    public static final nb D = new nb("gads:afs:csa:experiment_id", "", 4);
    public static final nb E = new nb("gads:app_index:experiment_id", "", 4);
    public static final nb F = new nb("gads:block_autoclicks_experiment_id", "", 4);
    public static final nb G = new nb("gads:sdk_core_experiment_id", "", 4);
    public static final nb H = new nb("gads:spam_app_context:experiment_id", "", 4);
    public static final nb I = new nb("gads:temporary_experiment_id:1", "", 4);
    public static final nb J = new nb("gads:temporary_experiment_id:10", "", 4);
    public static final nb K = new nb("gads:temporary_experiment_id:11", "", 4);
    public static final nb L = new nb("gads:temporary_experiment_id:12", "", 4);
    public static final nb M = new nb("gads:temporary_experiment_id:13", "", 4);
    public static final nb N = new nb("gads:temporary_experiment_id:14", "", 4);
    public static final nb O = new nb("gads:temporary_experiment_id:15", "", 4);
    public static final nb P = new nb("gads:temporary_experiment_id:2", "", 4);
    public static final nb Q = new nb("gads:temporary_experiment_id:3", "", 4);
    public static final nb R = new nb("gads:temporary_experiment_id:4", "", 4);
    public static final nb S = new nb("gads:temporary_experiment_id:5", "", 4);
    public static final nb T = new nb("gads:temporary_experiment_id:6", "", 4);
    public static final nb U = new nb("gads:temporary_experiment_id:7", "", 4);
    public static final nb V = new nb("gads:temporary_experiment_id:8", "", 4);
    public static final nb W = new nb("gads:temporary_experiment_id:9", "", 4);
    public static final nb X = new nb("gads:corewebview:experiment_id", "", 4);
    public static final di Y = new di(12);
    public static final di Z = new di(19);

    /* renamed from: a0, reason: collision with root package name */
    public static final q90 f12441a0 = new q90(8);

    /* renamed from: b0, reason: collision with root package name */
    public static final q90 f12442b0 = new q90(16);

    /* renamed from: c0, reason: collision with root package name */
    public static final Object f12443c0 = new Object();

    /* renamed from: d0, reason: collision with root package name */
    public static final bn0 f12444d0 = new bn0(4);

    /* renamed from: e0, reason: collision with root package name */
    public static final bn0 f12445e0 = new bn0(11);

    /* renamed from: f0, reason: collision with root package name */
    public static final bn0 f12446f0 = new bn0(17);

    /* renamed from: g0, reason: collision with root package name */
    public static final String[] f12447g0 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static y1 A(Throwable th, ii0 ii0Var) {
        y1 y1Var;
        y1 g8 = g(th);
        int i = g8.f17714u;
        if ((i == 3 || i == 0) && (y1Var = g8.f17717x) != null && !y1Var.f17716w.equals("com.google.android.gms.ads")) {
            g8.f17717x = null;
        }
        if (ii0Var != null) {
            g8.f17718y = new p60(ii0Var.e, "", ii0Var, ii0Var.f7146d, ii0Var.f7145c);
        }
        return g8;
    }

    public static Object B(g61 g61Var, String str) {
        m51 m51Var = new m51(g61Var, g61Var.f6316u, g61Var.f6317v);
        if (m51Var.hasNext()) {
            return m51Var.next();
        }
        return str;
    }

    public static void C(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void D(String str, String str2) {
        synchronized (f12443c0) {
            Log.i(str, Q(str2, null));
        }
    }

    public static y1 E(int i, y1 y1Var) {
        if (i != 0) {
            if (i == 8) {
                if (((Integer) r.e.f17698c.a(sl.f10984v9)).intValue() <= 0) {
                    i = 8;
                } else {
                    return y1Var;
                }
            }
            return J(i, null, y1Var);
        }
        throw null;
    }

    public static void F(String str, String str2) {
        synchronized (f12443c0) {
            Log.w(str, Q(str2, null));
        }
    }

    public static void G(ArrayList arrayList, nb nbVar) {
        String str = (String) nbVar.p();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
    }

    public static boolean H(int i, xk0 xk0Var, boolean z3) {
        if (xk0Var.B() < 7) {
            if (!z3) {
                int B2 = xk0Var.B();
                StringBuilder sb2 = new StringBuilder(String.valueOf(B2).length() + 18);
                sb2.append("too short header: ");
                sb2.append(B2);
                throw a(null, sb2.toString());
            }
            return false;
        }
        if (xk0Var.K() != i) {
            if (!z3) {
                throw a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i))));
            }
            return false;
        }
        if (xk0Var.K() == 118 && xk0Var.K() == 111 && xk0Var.K() == 114 && xk0Var.K() == 98 && xk0Var.K() == 105 && xk0Var.K() == 115) {
            return true;
        }
        if (z3) {
            return false;
        }
        throw a(null, "expected characters 'vorbis'");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int I(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x21.I(byte[]):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x005b. Please report as an issue. */
    public static y1 J(int i, String str, y1 y1Var) {
        String str2;
        int i10 = i - 1;
        if (str == null) {
            if (i != 0) {
                str = "No fill.";
                switch (i10) {
                    case 1:
                        str = "Invalid request.";
                        break;
                    case 2:
                        break;
                    case 3:
                        str = "App ID missing.";
                        break;
                    case 4:
                        str = "Network error.";
                        break;
                    case 5:
                        str = "Invalid request: Invalid ad unit ID.";
                        break;
                    case 6:
                        str = "Invalid request: Invalid ad size.";
                        break;
                    case 7:
                        str = "A mediation adapter failed to show the ad.";
                        break;
                    case 8:
                        str = "The ad is not ready.";
                        break;
                    case 9:
                        str = "The ad has already been shown.";
                        break;
                    case 10:
                        str = "The ad can not be shown when app is not in foreground.";
                        break;
                    case 11:
                    default:
                        str = "Internal error.";
                        break;
                    case 12:
                        if (((Integer) r.e.f17698c.a(sl.f11033y9)).intValue() <= 0) {
                            str = "The mediation adapter did not return an ad.";
                            break;
                        }
                        break;
                    case 13:
                        str = "Mismatch request IDs.";
                        break;
                    case 14:
                        str = "Invalid ad string.";
                        break;
                    case 15:
                        str = "Ad inspector had an internal error.";
                        break;
                    case 16:
                        str = "Ad inspector failed to load.";
                        break;
                    case 17:
                        str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                        break;
                    case 18:
                        str = "Ad inspector cannot be opened because it is already open.";
                        break;
                }
            } else {
                throw null;
            }
        }
        String str3 = str;
        if (i != 0) {
            int i11 = 0;
            int i12 = 2;
            switch (i10) {
                case 0:
                case 11:
                case 15:
                    i12 = i11;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 1:
                case 5:
                case 6:
                case 9:
                case 16:
                    i12 = 1;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 2:
                case 10:
                case 18:
                    i12 = 3;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 3:
                    i11 = 8;
                    i12 = i11;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 4:
                case 8:
                case 17:
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 7:
                    i11 = 4;
                    i12 = i11;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 12:
                    if (((Integer) r.e.f17698c.a(sl.f11033y9)).intValue() <= 0) {
                        i11 = 9;
                        i12 = i11;
                        return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                    }
                    i12 = 3;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 13:
                    i11 = 10;
                    i12 = i11;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                case 14:
                    i11 = 11;
                    i12 = i11;
                    return new y1(i12, str3, "com.google.android.gms.ads", y1Var, null);
                default:
                    switch (i) {
                        case 1:
                            str2 = "INTERNAL_ERROR";
                            break;
                        case 2:
                            str2 = "INVALID_REQUEST";
                            break;
                        case 3:
                            str2 = "NO_FILL";
                            break;
                        case 4:
                            str2 = "APP_ID_MISSING";
                            break;
                        case 5:
                            str2 = "NETWORK_ERROR";
                            break;
                        case 6:
                            str2 = "INVALID_AD_UNIT_ID";
                            break;
                        case 7:
                            str2 = "INVALID_AD_SIZE";
                            break;
                        case 8:
                            str2 = "MEDIATION_SHOW_ERROR";
                            break;
                        case 9:
                            str2 = "NOT_READY";
                            break;
                        case 10:
                            str2 = "AD_REUSED";
                            break;
                        case 11:
                            str2 = "APP_NOT_FOREGROUND";
                            break;
                        case 12:
                            str2 = "INTERNAL_SHOW_ERROR";
                            break;
                        case 13:
                            str2 = "MEDIATION_NO_FILL";
                            break;
                        case 14:
                            str2 = "REQUEST_ID_MISMATCH";
                            break;
                        case 15:
                            str2 = "INVALID_AD_STRING";
                            break;
                        case 16:
                            str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                            break;
                        case 17:
                            str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                            break;
                        case 18:
                            str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                            break;
                        default:
                            str2 = "AD_INSPECTOR_ALREADY_OPEN";
                            break;
                    }
                    throw new AssertionError("Unknown SdkError: ".concat(str2));
            }
        }
        throw null;
    }

    public static void K(String str, String str2, Throwable th) {
        synchronized (f12443c0) {
            Log.w(str, Q(str2, th));
        }
    }

    public static void L(List list, i31 i31Var, int i, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (i31Var.l(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 >= i) {
                list.remove(i10);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0253, code lost:
    
        if ((h(12) & 256) != 0) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.m2 M(byte[] r27) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x21.M(byte[]):com.google.android.gms.internal.ads.m2");
    }

    public static void N(String str, String str2) {
        synchronized (f12443c0) {
            Log.e(str, Q(str2, null));
        }
    }

    public static int O(int i) {
        if (i != 20) {
            if (i != 30) {
                switch (i) {
                    case 5:
                        return 80000;
                    case 6:
                        return 768000;
                    case 7:
                        return 192000;
                    case 8:
                        return 2250000;
                    case 9:
                        return 40000;
                    case 10:
                        return 100000;
                    case 11:
                        return 16000;
                    case 12:
                        return 7000;
                    default:
                        switch (i) {
                            case 14:
                                return 3062500;
                            case 15:
                                return 8000;
                            case 16:
                                return 256000;
                            case 17:
                                return 336000;
                            case 18:
                                return 768000;
                            default:
                                return -2147483647;
                        }
                }
            }
            return 2250000;
        }
        return 63750;
    }

    public static void P(String str, String str2, Throwable th) {
        synchronized (f12443c0) {
            Log.e(str, Q(str2, th));
        }
    }

    public static String Q(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (f12443c0) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            String replace2 = replace.replace("\n", "\n  ");
            int length = str.length();
            return a.l(new StringBuilder(String.valueOf(replace2).length() + length + 3 + 1), str, "\n  ", replace2, "\n");
        }
        return str;
    }

    public static mw1 R(o2 o2Var, int i, mw1 mw1Var) {
        int i10;
        xk0 xk0Var = new xk0(i);
        if (o2Var.E(xk0Var.f12580a, 0, i, true)) {
            o2Var.h();
            int J2 = xk0Var.J();
            if (t(J2) == 1) {
                if (xk0Var.B() >= 10) {
                    byte[] bArr = new byte[10];
                    xk0Var.H(bArr, 0, 10);
                    int I2 = I(bArr);
                    if (xk0Var.f12582c >= I2 + 4) {
                        xk0Var.E(I2);
                        J2 = xk0Var.J();
                    }
                }
            }
            if (t(J2) == 2 && xk0Var.B() >= 7) {
                int i11 = xk0Var.f12581b;
                byte[] bArr2 = new byte[7];
                xk0Var.H(bArr2, 0, 7);
                xk0Var.E(i11);
                tk0 U2 = U(bArr2);
                U2.f(42);
                if (true != U2.g()) {
                    i10 = 8;
                } else {
                    i10 = 12;
                }
                int h3 = U2.h(i10) + 1;
                if (h3 > 0 && xk0Var.B() >= h3) {
                    byte[] bArr3 = new byte[h3];
                    xk0Var.H(bArr3, 0, h3);
                    String str = M(bArr3).f8206a;
                    String str2 = mw1Var.f8459o;
                    if (str == null) {
                        str = "audio/vnd.dts.hd";
                    }
                    if (!Objects.equals(str2, str)) {
                        rv1 rv1Var = new rv1(mw1Var);
                        rv1Var.e(str);
                        return new mw1(rv1Var);
                    }
                }
            }
        }
        return mw1Var;
    }

    public static int S(int i) {
        int i10 = i & 1;
        if ((i & 2) != 0) {
            i10 += 2;
        }
        if ((i & 4) != 0) {
            i10 += 2;
        }
        if ((i & 8) != 0) {
            i10++;
        }
        if ((i & 16) != 0) {
            i10++;
        }
        if ((i & 32) != 0) {
            i10 += 2;
        }
        if ((i & 64) != 0) {
            i10 += 2;
        }
        if ((i & 128) != 0) {
            i10++;
        }
        if ((i & 256) != 0) {
            i10++;
        }
        if ((i & 512) != 0) {
            i10 += 2;
        }
        if ((i & 1024) != 0) {
            i10 += 2;
        }
        if ((i & 2048) != 0) {
            i10 += 2;
        }
        if ((i & 4096) != 0) {
            i10++;
        }
        if ((i & 8192) != 0) {
            i10 += 2;
        }
        if ((i & 16384) != 0) {
            i10++;
        }
        if ((i & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
            return i10 + 2;
        }
        return i10;
    }

    public static int T(tk0 tk0Var, int[] iArr) {
        int i = 0;
        for (int i10 = 0; i10 < 3 && tk0Var.g(); i10++) {
            i++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            i11 += 1 << iArr[i12];
        }
        return tk0Var.h(iArr[i]) + i11;
    }

    public static tk0 U(byte[] bArr) {
        byte[] bArr2;
        byte b10 = bArr[0];
        if (b10 != Byte.MAX_VALUE && b10 != 100 && b10 != 64 && b10 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b12 = copyOf[i];
                    int i10 = i + 1;
                    copyOf[i] = copyOf[i10];
                    copyOf[i10] = b12;
                }
            }
            int length = copyOf.length;
            tk0 tk0Var = new tk0(copyOf, length);
            if (copyOf[0] == 31) {
                tk0 tk0Var2 = new tk0(copyOf, length);
                while (tk0Var2.b() >= 16) {
                    tk0Var2.f(2);
                    int h3 = tk0Var2.h(14);
                    int min = Math.min(8 - tk0Var.f11367c, 14);
                    int i11 = tk0Var.f11367c;
                    int i12 = (8 - i11) - min;
                    byte[] bArr3 = tk0Var.f11365a;
                    int i13 = tk0Var.f11366b;
                    byte b13 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr3[i13]);
                    bArr3[i13] = b13;
                    int i14 = 14 - min;
                    int i15 = h3 & 16383;
                    bArr3[i13] = (byte) (b13 | ((i15 >>> i14) << i12));
                    int i16 = i13 + 1;
                    while (true) {
                        bArr2 = tk0Var.f11365a;
                        if (i14 > 8) {
                            i14 -= 8;
                            bArr2[i16] = (byte) (i15 >>> i14);
                            i16++;
                        }
                    }
                    byte b14 = (byte) (bArr2[i16] & ((1 << r7) - 1));
                    bArr2[i16] = b14;
                    bArr2[i16] = (byte) (((i15 & ((1 << i14) - 1)) << (8 - i14)) | b14);
                    tk0Var.f(14);
                    tk0Var.m();
                }
            }
            int length2 = copyOf.length;
            tk0Var.f11365a = copyOf;
            tk0Var.f11366b = 0;
            tk0Var.f11367c = 0;
            tk0Var.f11368d = length2;
            return tk0Var;
        }
        return new tk0(bArr, bArr.length);
    }

    public static int a(int i) {
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
            default:
                return 0;
        }
    }

    public static long c(String str) {
        String str2 = bq0.f4860a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str3);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() == 3) {
                j11 += Long.parseLong(trim);
            } else {
                x.n("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
        }
        return j11 * 1000;
    }

    public static je d(Context context, String str, String str2) {
        je jeVar;
        try {
            jeVar = (je) ((LinkedBlockingQueue) new p8(context, str, str2).f9422y).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            jeVar = null;
        }
        if (jeVar == null) {
            return p8.e();
        }
        return jeVar;
    }

    public static r31 f(r31 r31Var) {
        if (!(r31Var instanceof t31)) {
            if (r31Var instanceof s31) {
                return r31Var;
            }
            if (r31Var instanceof Serializable) {
                return new s31(r31Var);
            }
            return new t31(r31Var);
        }
        return r31Var;
    }

    public static y1 g(Throwable th) {
        if (th instanceof hi0) {
            hi0 hi0Var = (hi0) th;
            return E(hi0Var.f5086u, hi0Var.f6823v);
        }
        if (th instanceof cg0) {
            if (th.getMessage() == null) {
                return J(((cg0) th).f5086u, null, null);
            }
            return J(((cg0) th).f5086u, th.getMessage(), null);
        }
        if (th instanceof l) {
            l lVar = (l) th;
            int i = lVar.f19710u;
            String message = lVar.getMessage();
            if (message == null) {
                message = "";
            }
            return new y1(i, message, "com.google.android.gms.ads", null, null);
        }
        return J(1, null, null);
    }

    public static Provider h() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(f12447g0[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static void i(b bVar, String str, Executor executor) {
        bVar.a(new t81(bVar, 0, new ja1(str, 5)), executor);
    }

    public static void j(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(a.f(i, "csd-", new StringBuilder(String.valueOf(i).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f12443c0) {
            Log.d(str, Q(str2, null));
        }
    }

    public static void m(String str, boolean z3) {
        if (z3) {
        } else {
            throw a(null, str);
        }
    }

    public static final void n(z zVar, bl0 bl0Var, p pVar) {
        zVar.getClass();
        bl0Var.getClass();
        b0.e(zVar, new l2(bl0Var, pVar, null), 1);
    }

    public static boolean o(String str) {
        if (!Objects.equals(str, "audio/vnd.dts") && !Objects.equals(str, "audio/vnd.dts.hd")) {
            return false;
        }
        return true;
    }

    public static byte[] p() {
        int i = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i10 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        ByteBuffer allocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ a.w((i12 & (~i11)) | i13, (i11 & i14) | i15, i16, i17));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) i10);
        allocate.putInt(i);
        return allocate.array();
    }

    public static int q(int i) {
        int i10 = 0;
        while (i > 0) {
            i >>>= 1;
            i10++;
        }
        return i10;
    }

    public static boolean r(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i10 = i + 1;
            if (Character.isSurrogate(charAt)) {
                if (Character.isLowSurrogate(charAt) || i10 == length || !Character.isLowSurrogate(str.charAt(i10))) {
                    return false;
                }
                i += 2;
            } else {
                i = i10;
            }
        }
        return true;
    }

    public static float s(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static int t(int i) {
        if (i != 2147385345 && i != -25230976 && i != 536864768 && i != -14745368) {
            if (i != 1683496997 && i != 622876772) {
                if (i != 1078008818 && i != -233094848) {
                    if (i != 1908687592 && i != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static int u(int i, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 != 0) {
            int i11 = i / i10;
            int i12 = i - (i10 * i11);
            if (i12 != 0) {
                int i13 = ((i ^ i10) >> 31) | 1;
                switch (a71.f4404a[roundingMode.ordinal()]) {
                    case 1:
                        an1.v(false);
                        return i11;
                    case 2:
                        return i11;
                    case 3:
                        if (i13 >= 0) {
                            return i11;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i13 <= 0) {
                            return i11;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i12);
                        int abs2 = abs - (Math.abs(i10) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i11;
                        }
                        if (abs2 <= 0) {
                            return i11;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                return i11 + i13;
            }
            return i11;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static long w(xk0 xk0Var, int i, int i10) {
        xk0Var.E(i);
        if (xk0Var.B() >= 5) {
            int b10 = xk0Var.b();
            if ((8388608 & b10) == 0 && ((b10 >> 8) & 8191) == i10 && (b10 & 32) != 0 && xk0Var.K() >= 7 && xk0Var.B() >= 7 && (xk0Var.K() & 16) == 16) {
                byte[] bArr = new byte[6];
                xk0Var.H(bArr, 0, 6);
                long j10 = bArr[0];
                long j11 = bArr[1];
                long j12 = bArr[2];
                long j13 = bArr[3] & 255;
                return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((bArr[4] & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static lt0 x(xk0 xk0Var, boolean z3, boolean z9) {
        if (z3) {
            H(3, xk0Var, false);
        }
        xk0Var.k((int) xk0Var.a(), StandardCharsets.UTF_8);
        long a10 = xk0Var.a();
        String[] strArr = new String[(int) a10];
        for (int i = 0; i < a10; i++) {
            strArr[i] = xk0Var.k((int) xk0Var.a(), StandardCharsets.UTF_8);
        }
        if (z9 && (xk0Var.K() & 1) == 0) {
            throw a(null, "framing bit expected to be set");
        }
        return new lt0(5, strArr);
    }

    public static af1 y(ye1 ye1Var) {
        bl0 bl0Var = ye1Var.Q;
        bf1 bf1Var = new bf1(((gl1) bl0Var.f4819v).b());
        try {
            Provider h3 = h();
            if (h3 != null) {
                Mac.getInstance("AESCMAC", h3);
                return new x90(bf1Var, 10, new s(((gl1) bl0Var.f4819v).b(), h3));
            }
            throw new GeneralSecurityException("Conscrypt not available");
        } catch (GeneralSecurityException unused) {
            return bf1Var;
        }
    }

    public static ll1 z(String str) {
        try {
            return rc1.a(new am1(new StringReader(str)));
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public abstract void k(e81 e81Var, Set set);

    public abstract int v(e81 e81Var);
}
