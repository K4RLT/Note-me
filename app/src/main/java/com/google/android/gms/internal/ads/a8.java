package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a8 implements p7 {
    public static final byte[] B = {0, 7, 8, 15};
    public static final byte[] C = {0, 119, -120, -1};
    public static final byte[] D = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object A;

    /* renamed from: u, reason: collision with root package name */
    public Object f4405u;

    /* renamed from: v, reason: collision with root package name */
    public Object f4406v;

    /* renamed from: w, reason: collision with root package name */
    public Object f4407w;

    /* renamed from: x, reason: collision with root package name */
    public Object f4408x;

    /* renamed from: y, reason: collision with root package name */
    public Object f4409y;

    /* renamed from: z, reason: collision with root package name */
    public Object f4410z;

    public a8(Context context, lr lrVar, l9.a aVar, Executor executor) {
        this.f4405u = new Object();
        this.f4410z = new AtomicBoolean(false);
        this.f4406v = context.getApplicationContext();
        this.f4409y = aVar;
        this.f4408x = lrVar;
        this.A = executor;
    }

    public static t7 c(tk0 tk0Var, int i) {
        int[] iArr;
        int h3;
        int h10;
        int i10;
        int i11;
        int i12 = 8;
        int h11 = tk0Var.h(8);
        tk0Var.f(8);
        int i13 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] f10 = f();
        int[] i14 = i();
        int i15 = i - 2;
        while (i15 > 0) {
            int h12 = tk0Var.h(i12);
            int h13 = tk0Var.h(i12);
            if ((h13 & 128) != 0) {
                iArr = iArr2;
            } else if ((h13 & 64) != 0) {
                iArr = f10;
            } else {
                iArr = i14;
            }
            if ((h13 & 1) != 0) {
                i10 = tk0Var.h(i12);
                i11 = tk0Var.h(i12);
                h3 = tk0Var.h(i12);
                h10 = tk0Var.h(i12);
                i15 -= 6;
            } else {
                int h14 = tk0Var.h(6) << 2;
                int h15 = tk0Var.h(4) << 4;
                i15 -= 4;
                h3 = tk0Var.h(4) << 4;
                h10 = tk0Var.h(2) << 6;
                i10 = h14;
                i11 = h15;
            }
            if (i10 == 0) {
                h10 = 255;
            }
            if (i10 == 0) {
                h3 = i13;
            }
            if (i10 == 0) {
                i11 = i13;
            }
            double d2 = i10;
            String str = bq0.f4860a;
            double d10 = i11 - 128;
            double d11 = h3 - 128;
            iArr[h12] = j((byte) (255 - (h10 & 255)), Math.max(0, Math.min((int) ((1.402d * d10) + d2), 255)), Math.max(0, Math.min((int) ((d2 - (0.34414d * d11)) - (d10 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d11 * 1.772d) + d2), 255)));
            i13 = 0;
            h11 = h11;
            i14 = i14;
            i12 = 8;
        }
        return new t7(h11, iArr2, f10, i14);
    }

    public static v7 d(tk0 tk0Var) {
        byte[] bArr;
        boolean z3;
        int h3 = tk0Var.h(16);
        tk0Var.f(4);
        int h10 = tk0Var.h(2);
        boolean g8 = tk0Var.g();
        boolean z9 = true;
        tk0Var.f(1);
        byte[] bArr2 = bq0.f4861b;
        if (h10 == 1) {
            tk0Var.f(tk0Var.h(8) * 16);
        } else if (h10 == 0) {
            int h11 = tk0Var.h(16);
            int h12 = tk0Var.h(16);
            if (h11 > 0) {
                bArr2 = new byte[h11];
                if (tk0Var.f11367c == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.K(z3);
                System.arraycopy(tk0Var.f11365a, tk0Var.f11366b, bArr2, 0, h11);
                tk0Var.f11366b += h11;
                tk0Var.m();
            }
            if (h12 > 0) {
                bArr = new byte[h12];
                if (tk0Var.f11367c != 0) {
                    z9 = false;
                }
                b80.K(z9);
                System.arraycopy(tk0Var.f11365a, tk0Var.f11366b, bArr, 0, h12);
                tk0Var.f11366b += h12;
                tk0Var.m();
                return new v7(h3, g8, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new v7(h3, g8, bArr2, bArr);
    }

    public static JSONObject e(Context context, l9.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) wm.f12285f.p()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f20029u);
            jSONObject.put("mf", wm.f12286g.p());
            jSONObject.put("cl", "919173219");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", pa.d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] f() {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            int i15 = i14 & 4;
            int i16 = i14 & 2;
            int i17 = i14 & 1;
            if (i14 < 8) {
                if (1 != i17) {
                    i11 = 0;
                } else {
                    i11 = 255;
                }
                if (i16 != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if (i15 != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                iArr[i14] = j(255, i11, i12, i13);
            } else {
                int i18 = 127;
                if (1 != i17) {
                    i = 0;
                } else {
                    i = 127;
                }
                if (i16 != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if (i15 == 0) {
                    i18 = 0;
                }
                iArr[i14] = j(255, i, i10, i18);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i27 = 0; i27 < 256; i27++) {
            int i28 = 255;
            if (i27 < 8) {
                int i29 = i27 & 2;
                int i30 = i27 & 4;
                if (1 != (i27 & 1)) {
                    i25 = 0;
                } else {
                    i25 = 255;
                }
                if (i29 != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if (i30 == 0) {
                    i28 = 0;
                }
                iArr[i27] = j(63, i25, i26, i28);
            } else {
                int i31 = i27 & 136;
                int i32 = 170;
                int i33 = 85;
                if (i31 != 0) {
                    if (i31 != 8) {
                        int i34 = 43;
                        if (i31 != 128) {
                            if (i31 == 136) {
                                int i35 = i27 & 16;
                                int i36 = i27 & 32;
                                int i37 = i27 & 2;
                                int i38 = i27 & 64;
                                int i39 = i27 & 4;
                                if (1 != (i27 & 1)) {
                                    i21 = 0;
                                } else {
                                    i21 = 43;
                                }
                                if (i35 != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                if (i37 != 0) {
                                    i23 = 43;
                                } else {
                                    i23 = 0;
                                }
                                if (i36 != 0) {
                                    i24 = 85;
                                } else {
                                    i24 = 0;
                                }
                                if (i39 == 0) {
                                    i34 = 0;
                                }
                                if (i38 == 0) {
                                    i33 = 0;
                                }
                                iArr[i27] = j(255, i21 + i22, i23 + i24, i34 + i33);
                            }
                        } else {
                            int i40 = i27 & 16;
                            int i41 = i27 & 32;
                            int i42 = i27 & 2;
                            int i43 = i27 & 64;
                            int i44 = i27 & 4;
                            if (1 != (i27 & 1)) {
                                i17 = 0;
                            } else {
                                i17 = 43;
                            }
                            int i45 = i17 + 127;
                            if (i40 != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            if (i42 != 0) {
                                i19 = 43;
                            } else {
                                i19 = 0;
                            }
                            int i46 = i19 + 127;
                            if (i41 != 0) {
                                i20 = 85;
                            } else {
                                i20 = 0;
                            }
                            if (i44 == 0) {
                                i34 = 0;
                            }
                            int i47 = i34 + 127;
                            if (i43 == 0) {
                                i33 = 0;
                            }
                            iArr[i27] = j(255, i45 + i18, i46 + i20, i47 + i33);
                        }
                    } else {
                        int i48 = i27 & 16;
                        int i49 = i27 & 32;
                        int i50 = i27 & 2;
                        int i51 = i27 & 64;
                        int i52 = i27 & 4;
                        if (1 != (i27 & 1)) {
                            i13 = 0;
                        } else {
                            i13 = 85;
                        }
                        if (i48 != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        if (i50 != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        if (i49 != 0) {
                            i16 = 170;
                        } else {
                            i16 = 0;
                        }
                        if (i52 == 0) {
                            i33 = 0;
                        }
                        if (i51 == 0) {
                            i32 = 0;
                        }
                        iArr[i27] = j(127, i13 + i14, i15 + i16, i33 + i32);
                    }
                } else {
                    int i53 = i27 & 16;
                    int i54 = i27 & 32;
                    int i55 = i27 & 2;
                    int i56 = i27 & 64;
                    int i57 = i27 & 4;
                    if (1 != (i27 & 1)) {
                        i = 0;
                    } else {
                        i = 85;
                    }
                    if (i53 != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    if (i55 != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if (i54 != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    if (i57 == 0) {
                        i33 = 0;
                    }
                    if (i56 == 0) {
                        i32 = 0;
                    }
                    iArr[i27] = j(255, i + i10, i11 + i12, i33 + i32);
                }
            }
        }
        return iArr;
    }

    public static int j(int i, int i10, int i11, int i12) {
        return (i << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201 A[LOOP:3: B:85:0x0163->B:98:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a8.k(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] l(int i, int i10, tk0 tk0Var) {
        byte[] bArr = new byte[i];
        for (int i11 = 0; i11 < i; i11++) {
            bArr[i11] = (byte) tk0Var.h(i10);
        }
        return bArr;
    }

    public ac.b a() {
        Executor executor;
        synchronized (this.f4405u) {
            try {
                if (((SharedPreferences) this.f4407w) == null) {
                    this.f4407w = ((Context) this.f4406v).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f4407w;
        long j10 = 0;
        if (sharedPreferences != null) {
            j10 = sharedPreferences.getLong("js_last_update", 0L);
        }
        f9.k.C.f16819k.getClass();
        if (System.currentTimeMillis() - j10 < ((Long) wm.f12287h.p()).longValue()) {
            return v81.f11836v;
        }
        ac.b a10 = ((lr) this.f4408x).a(e((Context) this.f4406v, (l9.a) this.f4409y));
        cv cvVar = new cv(0, this);
        if (((Boolean) wm.f12291m.p()).booleanValue()) {
            executor = (Executor) this.A;
        } else {
            executor = xx.f12657h;
        }
        return ed1.d0(a10, cvVar, executor);
    }

    public void b() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            g9.c3 b10 = g9.c3.b();
            g9.n nVar = g9.p.f17688g.f17690b;
            Context context = (Context) this.f4406v;
            String str = (String) this.f4407w;
            tr trVar = (tr) this.f4410z;
            nVar.getClass();
            g9.k0 k0Var = (g9.k0) new g9.h(nVar, context, b10, str, trVar).d(context, false);
            this.f4405u = k0Var;
            if (k0Var != null) {
                g9.d2 d2Var = (g9.d2) this.f4408x;
                d2Var.f17607m = currentTimeMillis;
                k0Var.q4(new pi((rf0) this.f4409y, str));
                g9.k0 k0Var2 = (g9.k0) this.f4405u;
                ((g9.b3) this.A).getClass();
                k0Var2.n1(g9.b3.a(context, d2Var));
            }
        } catch (RemoteException e) {
            l9.i.i(e, "#007 Could not call remote method.");
        }
    }

    public qj1 g() {
        to0 to0Var;
        to0 to0Var2;
        rj1 rj1Var = (rj1) this.f4405u;
        if (rj1Var != null) {
            to0 to0Var3 = (to0) this.f4407w;
            if (to0Var3 != null && (to0Var = (to0) this.f4408x) != null) {
                to0 to0Var4 = (to0) this.f4406v;
                if (to0Var4 != null) {
                    to0 to0Var5 = (to0) this.f4409y;
                    if (to0Var5 != null && (to0Var2 = (to0) this.f4410z) != null) {
                        to0 to0Var6 = (to0) this.A;
                        if (to0Var6 != null) {
                            BigInteger bigInteger = rj1Var.P.f9534b;
                            BigInteger bigInteger2 = rj1Var.Q;
                            BigInteger bigInteger3 = (BigInteger) to0Var3.f11406v;
                            BigInteger bigInteger4 = (BigInteger) to0Var.f11406v;
                            BigInteger bigInteger5 = (BigInteger) to0Var4.f11406v;
                            BigInteger bigInteger6 = (BigInteger) to0Var5.f11406v;
                            BigInteger bigInteger7 = (BigInteger) to0Var2.f11406v;
                            BigInteger bigInteger8 = (BigInteger) to0Var6.f11406v;
                            if (bigInteger3.isProbablePrime(10)) {
                                if (bigInteger4.isProbablePrime(10)) {
                                    if (bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
                                        BigInteger bigInteger9 = BigInteger.ONE;
                                        BigInteger subtract = bigInteger3.subtract(bigInteger9);
                                        BigInteger subtract2 = bigInteger4.subtract(bigInteger9);
                                        if (bigInteger.multiply(bigInteger5).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger9)) {
                                            if (bigInteger.multiply(bigInteger6).mod(subtract).equals(bigInteger9)) {
                                                if (bigInteger.multiply(bigInteger7).mod(subtract2).equals(bigInteger9)) {
                                                    if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
                                                        return new qj1((rj1) this.f4405u, (to0) this.f4407w, (to0) this.f4408x, (to0) this.f4406v, (to0) this.f4409y, (to0) this.f4410z, (to0) this.A);
                                                    }
                                                    androidx.datastore.preferences.protobuf.s1.q("qInv is invalid.");
                                                    return null;
                                                }
                                                androidx.datastore.preferences.protobuf.s1.q("dQ is invalid.");
                                                return null;
                                            }
                                            androidx.datastore.preferences.protobuf.s1.q("dP is invalid.");
                                            return null;
                                        }
                                        androidx.datastore.preferences.protobuf.s1.q("D is invalid.");
                                        return null;
                                    }
                                    androidx.datastore.preferences.protobuf.s1.q("Prime p times prime q is not equal to the public key's modulus");
                                    return null;
                                }
                                androidx.datastore.preferences.protobuf.s1.q("q is not a prime");
                                return null;
                            }
                            androidx.datastore.preferences.protobuf.s1.q("p is not a prime");
                            return null;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Cannot build without CRT coefficient");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Cannot build without prime exponents");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("Cannot build without private exponent");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("Cannot build without prime factors");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without a RSA SSA PKCS1 public key");
        return null;
    }

    public wj1 h() {
        to0 to0Var;
        to0 to0Var2;
        xj1 xj1Var = (xj1) this.f4405u;
        if (xj1Var != null) {
            to0 to0Var3 = (to0) this.f4407w;
            if (to0Var3 != null && (to0Var = (to0) this.f4408x) != null) {
                to0 to0Var4 = (to0) this.f4406v;
                if (to0Var4 != null) {
                    to0 to0Var5 = (to0) this.f4409y;
                    if (to0Var5 != null && (to0Var2 = (to0) this.f4410z) != null) {
                        to0 to0Var6 = (to0) this.A;
                        if (to0Var6 != null) {
                            BigInteger bigInteger = xj1Var.P.f11924b;
                            BigInteger bigInteger2 = xj1Var.Q;
                            BigInteger bigInteger3 = (BigInteger) to0Var3.f11406v;
                            BigInteger bigInteger4 = (BigInteger) to0Var.f11406v;
                            BigInteger bigInteger5 = (BigInteger) to0Var4.f11406v;
                            BigInteger bigInteger6 = (BigInteger) to0Var5.f11406v;
                            BigInteger bigInteger7 = (BigInteger) to0Var2.f11406v;
                            BigInteger bigInteger8 = (BigInteger) to0Var6.f11406v;
                            if (bigInteger3.isProbablePrime(10)) {
                                if (bigInteger4.isProbablePrime(10)) {
                                    if (bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
                                        BigInteger bigInteger9 = BigInteger.ONE;
                                        BigInteger subtract = bigInteger3.subtract(bigInteger9);
                                        BigInteger subtract2 = bigInteger4.subtract(bigInteger9);
                                        if (bigInteger.multiply(bigInteger5).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger9)) {
                                            if (bigInteger.multiply(bigInteger6).mod(subtract).equals(bigInteger9)) {
                                                if (bigInteger.multiply(bigInteger7).mod(subtract2).equals(bigInteger9)) {
                                                    if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
                                                        return new wj1((xj1) this.f4405u, (to0) this.f4407w, (to0) this.f4408x, (to0) this.f4406v, (to0) this.f4409y, (to0) this.f4410z, (to0) this.A);
                                                    }
                                                    androidx.datastore.preferences.protobuf.s1.q("qInv is invalid.");
                                                    return null;
                                                }
                                                androidx.datastore.preferences.protobuf.s1.q("dQ is invalid.");
                                                return null;
                                            }
                                            androidx.datastore.preferences.protobuf.s1.q("dP is invalid.");
                                            return null;
                                        }
                                        androidx.datastore.preferences.protobuf.s1.q("D is invalid.");
                                        return null;
                                    }
                                    androidx.datastore.preferences.protobuf.s1.q("Prime p times prime q is not equal to the public key's modulus");
                                    return null;
                                }
                                androidx.datastore.preferences.protobuf.s1.q("q is not a prime");
                                return null;
                            }
                            androidx.datastore.preferences.protobuf.s1.q("p is not a prime");
                            return null;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Cannot build without CRT coefficient");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Cannot build without prime exponents");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("Cannot build without private exponent");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("Cannot build without prime factors");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without a RSA SSA PKCS1 public key");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f5, code lost:
    
        r4.l(r8 - r4.c());
     */
    @Override // com.google.android.gms.internal.ads.p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(int r42, int r43, com.google.android.gms.internal.ads.r7 r44, byte[] r45) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a8.w(int, int, com.google.android.gms.internal.ads.r7, byte[]):void");
    }

    public /* synthetic */ a8(boolean z3) {
        this.f4405u = null;
        this.f4406v = null;
        this.f4407w = null;
        this.f4408x = null;
        this.f4409y = null;
        this.f4410z = null;
        this.A = null;
    }

    public a8() {
        this.f4410z = new n.r0(0);
        this.A = new n.r0(0);
    }

    public a8(Context context, String str, g9.d2 d2Var, rf0 rf0Var) {
        this.f4410z = new tr();
        this.f4406v = context;
        this.f4407w = str;
        this.f4408x = d2Var;
        this.f4409y = rf0Var;
        this.A = g9.b3.f17575u;
    }

    public a8(zt0 zt0Var, WebView webView, String str, String str2, st0 st0Var) {
        this.f4407w = new ArrayList();
        this.f4408x = new HashMap();
        this.f4405u = zt0Var;
        this.f4406v = webView;
        this.A = st0Var;
        this.f4410z = str;
        this.f4409y = str2;
    }
}
