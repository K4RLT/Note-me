package com.google.android.gms.internal.ads;
import mb.a;
import a5.a;
import g5.q;
import g9.r;
import k9.a0;
import l9.i;
import mb.d;
import q.h;
import q.l;
import q.x;
import r.e;
import r0.b;
import r0.j;
import r0.y;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class b80 implements q2 {
    public static final di B;
    public static final q90 E;
    public static final bn0 H;
    public static final ho0 K;
    public static final /* synthetic */ int L = 0;
    public static int M = 2;

    /* renamed from: u, reason: collision with root package name */
    public static ExecutorService f4736u;

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f4737v = {1, 2, 3, 6};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f4738w = {48000, 44100, 32000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f4739x = {24000, 22050, 16000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4740y = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4741z = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] A = {69, 87, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final di C = new di(6);
    public static final di D = new di(17);
    public static final q90 F = new q90(14);
    public static final q90 G = new q90(21);
    public static final bn0 I = new bn0(9);
    public static final bn0 J = new bn0(15);

    static {
        int i = 2;
        byte b10 = 0;
        B = new di(b10);
        E = new q90(i);
        H = new bn0(i);
        K = new ho0(13, b10);
    }

    public static void A(File file, File file2) {
        file.getClass();
        file2.getClass();
        if (!file.equals(file2)) {
            if (!file.renameTo(file2)) {
                if (!file.equals(file2)) {
                    j51 s10 = j51.s(new w61[0]);
                    v61 v61Var = new v61();
                    ArrayDeque arrayDeque = v61Var.f11821u;
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        arrayDeque.addFirst(fileInputStream);
                        FileOutputStream fileOutputStream = new FileOutputStream(file2, s10.contains(w61.f12161u));
                        arrayDeque.addFirst(fileOutputStream);
                        int i = t61.f11261a;
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                        v61Var.close();
                        if (!file.delete()) {
                            if (!file2.delete()) {
                                q.x.p("Unable to delete ".concat(file2.toString()));
                                return;
                            } else {
                                q.x.p("Unable to delete ".concat(file.toString()));
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        try {
                            v61Var.f11822v = th;
                            Object obj = u31.f11530a;
                            if (!IOException.class.isInstance(th)) {
                                if (!(th instanceof RuntimeException)) {
                                    if (!(th instanceof Error)) {
                                        throw new RuntimeException(th);
                                    }
                                    throw ((Error) th);
                                }
                                throw ((RuntimeException) th);
                            }
                            throw ((Throwable) IOException.class.cast(th));
                        } catch (Throwable th2) {
                            v61Var.close();
                            throw th2;
                        }
                    }
                }
                q.x.n(ay0.B("Source %s and destination %s must be different", file, file2));
                return;
            }
            return;
        }
        q.x.n(ay0.B("Source %s and destination %s must be different", file, file2));
    }

    public static byte[] B(byte[] bArr) {
        int length;
        int i = 0;
        int i10 = 0;
        while (true) {
            length = bArr.length;
            if (i10 >= length || bArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == length) {
            i10 = length - 1;
        }
        if ((bArr[i10] & 128) == 128) {
            i = 1;
        }
        int i11 = length - i10;
        byte[] bArr2 = new byte[i11 + i];
        System.arraycopy(bArr, i10, bArr2, i, i11);
        return bArr2;
    }

    public static long C(int i, long j10) {
        if (i == 1) {
            return j10;
        }
        int i10 = i >> 1;
        long j11 = (j10 * j10) % 1073807359;
        if ((i & 1) == 0) {
            return C(i10, j11) % 1073807359;
        }
        return ((C(i10, j11) % 1073807359) * j10) % 1073807359;
    }

    public static void D(int i, String str, boolean z3) {
        if (z3) {
            return;
        }
        q.x.n(ay0.B(str, Integer.valueOf(i)));
    }

    public static void E(Bundle bundle, String str, boolean z3, boolean z9) {
        if (z9) {
            bundle.putBoolean(str, z3);
        }
    }

    public static long F(String[] strArr, int i) {
        long n10 = (xy.n(strArr[0]) + 2147483647L) % 1073807359;
        for (int i10 = 1; i10 < i; i10++) {
            n10 = (((xy.n(strArr[i10]) + 2147483647L) % 1073807359) + ((n10 * 16785407) % 1073807359)) % 1073807359;
        }
        return n10;
    }

    public static void G(long j10, String str, boolean z3) {
        if (z3) {
            return;
        }
        q.x.n(ay0.B(str, Long.valueOf(j10)));
    }

    public static void H(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static int I(int i, int i10) {
        int i11;
        if (i >= 0 && i < 3 && i10 >= 0 && (i11 = i10 >> 1) < 19) {
            int i12 = f4738w[i];
            if (i12 == 44100) {
                int i13 = A[i11] + (i10 & 1);
                return i13 + i13;
            }
            int i14 = f4741z[i11];
            if (i12 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static void J(boolean z3, String str, Object obj) {
        if (z3) {
            return;
        }
        q.x.n(ay0.B(str, obj));
    }

    public static void K(boolean z3) {
        if (z3) {
            return;
        }
        g5.q.l();
    }

    public static void L(String str, boolean z3) {
        if (z3) {
            return;
        }
        q.x.o(str);
    }

    public static void M(Object obj, String str) {
        if (obj != null) {
            return;
        }
        g5.q.h(str);
    }

    public static void N(int i, int i10) {
        String B2;
        if (i >= 0 && i < i10) {
            return;
        }
        if (i >= 0) {
            if (i10 < 0) {
                q.x.n(a5.a.f(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
                return;
            }
            B2 = ay0.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            B2 = ay0.B("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(B2);
    }

    public static void O(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return;
        }
        q.x.l(Q("index", i, i10));
    }

    public static void P(int i, int i10, int i11) {
        String Q;
        if (i >= 0 && i10 >= i && i10 <= i11) {
            return;
        }
        if (i >= 0 && i <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                Q = ay0.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            } else {
                Q = Q("end index", i10, i11);
            }
        } else {
            Q = Q("start index", i, i11);
        }
        throw new IndexOutOfBoundsException(Q);
    }

    public static String Q(String str, int i, int i10) {
        if (i < 0) {
            return ay0.B("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return ay0.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        q.x.n(a5.a.f(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
        return null;
    }

    public static byte a(long j10) {
        boolean z3;
        if ((j10 >> 8) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        G(j10, "out of range: %s", z3);
        return (byte) j10;
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return 0;
        }
        return 4;
    }

    public static Bundle d(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return new Bundle();
        }
        return bundle2;
    }

    public static Bundle e(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) g9.r.e.f17698c.a(sl.J2)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static xa f(eb ebVar) {
        long j10;
        long j11;
        boolean z3;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = ebVar.f5632c;
        if (map != null) {
            String str = (String) map.get("Date");
            if (str != null) {
                j10 = r(str);
            } else {
                j10 = 0;
            }
            String str2 = (String) map.get("Cache-Control");
            int i = 0;
            if (str2 != null) {
                String[] split = str2.split(",", 0);
                z3 = false;
                j12 = 0;
                j13 = 0;
                while (i < split.length) {
                    String trim = split[i].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j13 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j12 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z3 = true;
                        }
                        i++;
                    } else {
                        return null;
                    }
                }
                j11 = 0;
                i = 1;
            } else {
                j11 = 0;
                z3 = false;
                j12 = 0;
                j13 = 0;
            }
            String str3 = (String) map.get("Expires");
            if (str3 != null) {
                j14 = r(str3);
            } else {
                j14 = j11;
            }
            String str4 = (String) map.get("Last-Modified");
            if (str4 != null) {
                j15 = currentTimeMillis;
                j16 = r(str4);
            } else {
                j15 = currentTimeMillis;
                j16 = j11;
            }
            String str5 = (String) map.get("ETag");
            if (i != 0) {
                long j19 = (j13 * 1000) + j15;
                if (z3) {
                    j18 = j19;
                } else {
                    j18 = (j12 * 1000) + j19;
                }
                j17 = j19;
            } else {
                if (j10 > j11 && j14 >= j10) {
                    j17 = (j14 - j10) + j15;
                } else {
                    j17 = j11;
                }
                j18 = j17;
            }
            xa xaVar = new xa();
            xaVar.f12527a = ebVar.f5631b;
            xaVar.f12528b = str5;
            xaVar.f12531f = j17;
            xaVar.e = j18;
            xaVar.f12529c = j10;
            xaVar.f12530d = j16;
            xaVar.f12532g = map;
            xaVar.f12533h = ebVar.f5633d;
            return xaVar;
        }
        return null;
    }

    public static com.google.android.gms.internal.mlkit_vision_digital_ink.gw g(String str) {
        String str2;
        try {
            try {
                byte[] b10 = new p91(new ByteArrayInputStream(str.getBytes(p91.f9449b))).a().b();
                try {
                    wm1 wm1Var = wm1.f12302a;
                    int i = em1.f5727a;
                    nh1 D2 = nh1.D(b10, wm1.f12303b);
                    for (mh1 mh1Var : D2.A()) {
                        if (mh1Var.A().F() == 2 || mh1Var.A().F() == 3 || mh1Var.A().F() == 4) {
                            int F2 = mh1Var.A().F();
                            if (F2 != 2) {
                                if (F2 != 3) {
                                    if (F2 != 4) {
                                        if (F2 != 5) {
                                            if (F2 != 6) {
                                                str2 = "UNRECOGNIZED";
                                            } else {
                                                str2 = "REMOTE";
                                            }
                                        } else {
                                            str2 = "ASYMMETRIC_PUBLIC";
                                        }
                                    } else {
                                        str2 = "ASYMMETRIC_PRIVATE";
                                    }
                                } else {
                                    str2 = "SYMMETRIC";
                                }
                            } else {
                                str2 = "UNKNOWN_KEYMATERIAL";
                            }
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + mh1Var.A().z());
                        }
                    }
                    return com.google.android.gms.internal.mlkit_vision_digital_ink.gw.B(D2);
                } catch (pn1 unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (pn1 unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            androidx.datastore.preferences.protobuf.s1.q("Parse keyset failed");
            return null;
        }
    }

    public static synchronized Executor h() {
        ExecutorService executorService;
        synchronized (b80.class) {
            try {
                if (f4736u == null) {
                    String str = bq0.f4860a;
                    f4736u = Executors.newSingleThreadExecutor(new np0("ExoPlayer:BackgroundExecutor"));
                }
                executorService = f4736u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static void i(m7 m7Var, r7 r7Var) {
        for (int i = 0; i < m7Var.zza(); i++) {
            long w10 = m7Var.w(i);
            ArrayList a10 = m7Var.a(w10);
            if (!a10.isEmpty()) {
                if (i != m7Var.zza() - 1) {
                    long w11 = m7Var.w(i + 1) - m7Var.w(i);
                    if (w11 > 0) {
                        r7Var.mo213l(new l7(a10, w10, w11));
                    }
                } else {
                    g5.q.l();
                    return;
                }
            }
        }
    }

    public static void j(File file, byte[] bArr) {
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, j51.s(new w61[0]).contains(w61.f12161u));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void k(String str) {
        if (((Boolean) en.f5728a.p()).booleanValue()) {
            int i = k9.a0.f19634b;
            l9.i.a(str);
        }
    }

    public static void l(boolean z3) {
        if (z3) {
            return;
        }
        q.x.m();
    }

    public static boolean m(Context context) {
        Display display;
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr && (hdrCapabilities = display.getHdrCapabilities()) != null) {
                for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(com.google.android.gms.internal.ads.o2 r12, boolean r13) {
        /*
            com.google.android.gms.internal.ads.xk0 r0 = new com.google.android.gms.internal.ads.xk0
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.y(r4)
            byte[] r5 = r0.f12580a
            r6 = 0
            boolean r5 = r12.E(r5, r6, r4, r2)
            if (r5 != 0) goto L18
            goto L65
        L18:
            long r7 = r0.P()
            int r5 = r0.b()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L35
            byte[] r7 = r0.f12580a
            boolean r7 = r12.E(r7, r4, r4, r2)
            if (r7 != 0) goto L2f
            goto L65
        L2f:
            long r7 = r0.j()
            r9 = r1
            goto L36
        L35:
            r9 = r4
        L36:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3c
            goto L65
        L3c:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r7 >= r4) goto L48
            goto L65
        L48:
            r3 = 4
            r0.y(r3)
            byte[] r4 = r0.f12580a
            r12.y(r4, r6, r3)
            int r3 = r0.b()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5b
            goto L65
        L5b:
            if (r13 != 0) goto L5e
            goto L6b
        L5e:
            int r7 = r7 + (-4)
            r12.s(r7)
        L63:
            r3 = r6
            goto L9
        L65:
            return r6
        L66:
            r3 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r3) goto L6c
        L6b:
            return r2
        L6c:
            if (r7 == 0) goto L63
            r12.s(r7)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b80.n(com.google.android.gms.internal.ads.o2, boolean):boolean");
    }

    public static byte[] o(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        q.x.n("n must not be negative");
        return null;
    }

    public static int p(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int q(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return p(hashCode);
    }

    public static long r(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                Log.e("Volley", mb.d("Unable to parse dateStr: %s, falling back to 0", str), e);
                return 0L;
            }
            mb.a("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static ECParameterSpec s(uk1 uk1Var) {
        int ordinal = uk1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return qc1.f9816c;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(uk1Var.toString()));
            }
            return qc1.f9815b;
        }
        return qc1.f9814a;
    }

    public static void t(int i, long j10, String str, int i10, PriorityQueue priorityQueue) {
        ni niVar = new ni(str, j10, i10);
        if ((priorityQueue.size() != i || (((ni) priorityQueue.peek()).f8720c <= i10 && ((ni) priorityQueue.peek()).f8718a <= j10)) && !priorityQueue.contains(niVar)) {
            priorityQueue.add(niVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void u(Bundle bundle, String str, String str2, boolean z3) {
        if (z3 && str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void v(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            q.x.p("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void w(String str, boolean z3) {
        if (z3) {
            return;
        }
        q.x.n(str);
    }

    public static byte[] x(BigInteger bigInteger, int i) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length == i) {
                return byteArray;
            }
            int i10 = i + 1;
            if (length <= i10) {
                if (length == i10) {
                    if (byteArray[0] == 0) {
                        return Arrays.copyOfRange(byteArray, 1, length);
                    }
                    androidx.datastore.preferences.protobuf.s1.q("integer too large");
                    return null;
                }
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - length, length);
                return bArr;
            }
            androidx.datastore.preferences.protobuf.s1.q("integer too large");
            return null;
        }
        q.x.n("integer must be nonnegative");
        return null;
    }

    public static String y(String[] strArr, int i, int i10) {
        int i11 = i10 + i;
        if (strArr.length < i11) {
            int i12 = k9.a0.f19634b;
            l9.i.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i11 - 1;
            if (i < i13) {
                sb2.append(strArr[i]);
                sb2.append(' ');
                i++;
            } else {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
        }
    }

    public static void z(Bundle bundle, String str, int i, boolean z3) {
        if (z3) {
            bundle.putInt(str, i);
        }
    }
}
