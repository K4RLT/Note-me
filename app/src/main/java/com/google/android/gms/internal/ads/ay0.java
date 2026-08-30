package com.google.android.gms.internal.ads;
import g3.a;
import p.a;
import va.b;
import a0.l;
import a5.a;
import d.c;
import f9.k;
import g9.p;
import g9.r;
import k9.a0;
import k9.f0;
import l9.d;
import l9.i;
import n.b;
import q.x;
import r.e;
import vd.n;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ay0 implements q2 {
    public static final ho0 E;
    public static final /* synthetic */ int F = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final q90 f4634z;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4629u = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, AdError.NETWORK_ERROR_CODE, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: v, reason: collision with root package name */
    public static final nb f4630v = new nb("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);

    /* renamed from: w, reason: collision with root package name */
    public static final di f4631w = new di(11);

    /* renamed from: x, reason: collision with root package name */
    public static final di f4632x = new di(18);

    /* renamed from: y, reason: collision with root package name */
    public static final q90 f4633y = new q90(4);
    public static final q90 A = new q90(22);
    public static final bn0 B = new bn0(3);
    public static final bn0 C = new bn0(10);
    public static final bn0 D = new bn0(16);

    static {
        int i = 15;
        f4634z = new q90(i);
        E = new ho0(i, (byte) 0);
    }

    public static String A(Context context, String str) {
        f9.k kVar = f9.k.C;
        String b10 = kVar.f16833y.b(context);
        String c10 = kVar.f16833y.c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(b10)) {
            str = u(str, "gmp_app_id", b10).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(c10)) {
            return u(str, "fbs_aiid", c10).toString();
        }
        return str;
    }

    public static String B(String str, Object... objArr) {
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
            sb2.append(I(objArr[i]));
            i10 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb2.append(str2);
                sb2.append(I(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void C(tk0 tk0Var, z1 z1Var) {
        int h3 = tk0Var.h(5);
        tk0Var.f(2);
        if (tk0Var.g()) {
            tk0Var.f(5);
        }
        if (h3 >= 7 && h3 <= 10) {
            tk0Var.e();
        }
        if (tk0Var.g()) {
            int h10 = tk0Var.h(3);
            if (z1Var.f13029b == -1 && h3 >= 0 && h3 <= 15 && (h10 == 0 || h10 == 1)) {
                z1Var.f13029b = h3;
            }
            if (tk0Var.g()) {
                Q(tk0Var);
            }
        }
    }

    public static double E(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static int F(int i, xk0 xk0Var) {
        byte[] bArr = xk0Var.f12580a;
        int i10 = xk0Var.f12581b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10 + i) {
                if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                    System.arraycopy(bArr, i11 + 2, bArr, i12, (i - (i11 - i10)) - 2);
                    i--;
                }
                i11 = i12;
            } else {
                return i;
            }
        }
    }

    public static TextView G(Context context, String str, int i, int i10, float f10, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        P(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f10, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i10);
        textView.setText(str);
        return textView;
    }

    public static String I(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String o10 = p.a.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o10), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb2 = new StringBuilder(o10.length() + 8 + name2.length() + 1);
            g3.a.t(sb2, "<", o10, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static void J(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static void K(tk0 tk0Var, z1 z1Var) {
        tk0Var.f(2);
        boolean g8 = tk0Var.g();
        int h3 = tk0Var.h(8);
        for (int i = 0; i < h3; i++) {
            tk0Var.f(2);
            if (tk0Var.g()) {
                tk0Var.f(5);
            }
            if (g8) {
                tk0Var.f(24);
            } else {
                if (tk0Var.g()) {
                    if (!tk0Var.g()) {
                        tk0Var.f(4);
                    }
                    z1Var.f13030c = tk0Var.h(6) + 1;
                }
                tk0Var.f(4);
            }
        }
        if (tk0Var.g()) {
            tk0Var.f(3);
            if (tk0Var.g()) {
                Q(tk0Var);
            }
        }
    }

    public static double L(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static int M(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static Charset O(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static void P(View view, int i, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i10;
        view.setLayoutParams(layoutParams2);
    }

    public static void Q(tk0 tk0Var) {
        int h3 = tk0Var.h(6);
        if (h3 >= 2 && h3 <= 42) {
            tk0Var.f(h3 * 8);
            return;
        }
        throw va.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(h3)));
    }

    public static long R(byte b10, byte b11) {
        int i;
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i = 2;
            if (i12 != 1 && i12 != 2) {
                i = b11 & 63;
            }
        } else {
            i = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = 2500 << i14;
        } else if (i13 >= 12) {
            i10 = 10000 << (i13 & 1);
        } else if (i14 == 3) {
            i10 = 60000;
        } else {
            i10 = 10000 << i14;
        }
        return i * i10;
    }

    public static String S(int i, int i10, int i11, int i12, int i13) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int U(byte[] bArr, int i, int i10) {
        int V = V(bArr, i);
        if (i10 == 0 || i10 == 3) {
            return V;
        }
        while (true) {
            int length = bArr.length;
            if (V < length - 1) {
                int i11 = V + 1;
                if ((V - i) % 2 == 0 && bArr[i11] == 0) {
                    return V;
                }
                V = V(bArr, i11);
            } else {
                return length;
            }
        }
    }

    public static int V(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i < length) {
                if (bArr[i] == 0) {
                    return i;
                }
                i++;
            } else {
                return length;
            }
        }
    }

    public static int W(int i) {
        if (i != 0 && i != 3) {
            return 2;
        }
        return 1;
    }

    public static String X(byte[] bArr, int i, int i10, Charset charset) {
        if (i10 > i && i10 <= bArr.length) {
            return new String(bArr, i, i10 - i, charset);
        }
        return "";
    }

    public static long a(double d2) {
        b80.w("not a normal value", r(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits + doubleToRawLongBits;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static long c(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        if (j10 < 0) {
            return j10 + 4294967296L;
        }
        return j10;
    }

    public static o8 d(o8 o8Var, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (o8Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (o8) map.get(strArr[0]);
            }
            if (length2 > 1) {
                o8 o8Var2 = new o8();
                while (i < length2) {
                    o8Var2.d((o8) map.get(strArr[i]));
                    i++;
                }
                return o8Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                o8Var.d((o8) map.get(strArr[0]));
                return o8Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    o8Var.d((o8) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return o8Var;
    }

    public static String e(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static String f(String str, Context context, boolean z3, HashMap hashMap) {
        String d2;
        nl nlVar = sl.X0;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (!((Boolean) qlVar.a(nlVar)).booleanValue() || z3) {
            f9.k kVar = f9.k.C;
            ww wwVar = kVar.f16833y;
            k9.f0 f0Var = kVar.f16813c;
            ww wwVar2 = kVar.f16833y;
            if (wwVar.a(context) && !TextUtils.isEmpty(str) && (d2 = wwVar2.d(context)) != null) {
                String str2 = (String) qlVar2.a(sl.Q0);
                if (((Boolean) qlVar2.a(sl.P0)).booleanValue() && str.contains(str2)) {
                    if (f0Var.F(str)) {
                        Map map = (Map) hashMap.get("_ac");
                        wwVar2.getClass();
                        wwVar2.h(context, "_ac", d2, ww.f(map));
                        return A(context, str).replace(str2, d2);
                    }
                    if (f0Var.G(str)) {
                        Map map2 = (Map) hashMap.get("_ai");
                        wwVar2.getClass();
                        wwVar2.h(context, "_ai", d2, ww.f(map2));
                        return A(context, str).replace(str2, d2);
                    }
                    return str;
                }
                if (!str.contains("fbs_aeid") && !((Boolean) qlVar2.a(sl.O0)).booleanValue()) {
                    if (f0Var.F(str)) {
                        Map map3 = (Map) hashMap.get("_ac");
                        wwVar2.getClass();
                        wwVar2.h(context, "_ac", d2, ww.f(map3));
                        return u(A(context, str), "fbs_aeid", d2).toString();
                    }
                    if (f0Var.G(str)) {
                        Map map4 = (Map) hashMap.get("_ai");
                        wwVar2.getClass();
                        wwVar2.h(context, "_ai", d2, ww.f(map4));
                        return u(A(context, str), "fbs_aeid", d2).toString();
                    }
                    return str;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public static ArrayList g(byte[] bArr) {
        long j10 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j10 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void h(int i, String str, Throwable th) {
        String f10 = a5.a.f(i, "Ad failed to load : ", new StringBuilder(String.valueOf(i).length() + 20));
        int i10 = k9.a0.f19634b;
        l9.i.e(f10);
        k9.a0.l(str, th);
        if (i == 3) {
            return;
        }
        f9.k.C.f16817h.e(str, th);
    }

    public static void i(long j10, xk0 xk0Var, i3[] i3VarArr) {
        int i;
        int i10;
        boolean z3;
        while (true) {
            boolean z9 = true;
            if (xk0Var.B() > 1) {
                int i11 = 0;
                while (true) {
                    if (xk0Var.B() == 0) {
                        i = -1;
                        break;
                    }
                    int K = xk0Var.K();
                    i11 += K;
                    if (K != 255) {
                        i = i11;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (xk0Var.B() == 0) {
                        i12 = -1;
                        break;
                    }
                    int K2 = xk0Var.K();
                    i12 += K2;
                    if (K2 != 255) {
                        break;
                    }
                }
                int i13 = xk0Var.f12581b + i12;
                if (i12 != -1 && i12 <= xk0Var.B()) {
                    if (i == 4 && i12 >= 8) {
                        int K3 = xk0Var.K();
                        int L = xk0Var.L();
                        if (L == 49) {
                            i10 = xk0Var.b();
                            L = 49;
                        } else {
                            i10 = 0;
                        }
                        int K4 = xk0Var.K();
                        if (L == 47) {
                            xk0Var.G(1);
                            L = 47;
                        }
                        if (K3 != 181 || ((L != 49 && L != 47) || K4 != 3)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (L == 49) {
                            if (i10 != 1195456820) {
                                z9 = false;
                            }
                            z3 &= z9;
                        }
                        if (z3) {
                            o(j10, xk0Var, i3VarArr);
                        }
                    }
                } else {
                    x21.F("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i13 = xk0Var.f12582c;
                }
                xk0Var.E(i13);
            } else {
                return;
            }
        }
    }

    public static void k(long[] jArr, long[] jArr2, int i) {
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = (int) jArr[i10];
            jArr[i10] = ((-i) & (((int) jArr2[i10]) ^ i11)) ^ i11;
        }
    }

    public static byte[] l(String str) {
        if ((str.length() & 1) == 0) {
            int length = str.length() >> 1;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i10 = i + i;
                int digit = Character.digit(str.charAt(i10), 16);
                int digit2 = Character.digit(str.charAt(i10 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i] = (byte) ((digit * 16) + digit2);
                } else {
                    q.x.n("input is not hexadecimal");
                    return null;
                }
            }
            return bArr;
        }
        q.x.n("Expected a string of even length");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r10.g() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r10.h(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r10.g() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r10.h(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r10.f(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (true == r10.g()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r10 = r10.h(4);
        r9 = com.google.android.gms.internal.ads.ay0.f4629u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r10 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        r10 = r9[13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        return new com.google.android.gms.internal.ads.x0(r5, r0, r10, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r5 != 48000) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r10 >= 14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        r6 = r9[r10];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r2 == 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r2 == 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if (r2 == 3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r2 == 4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r10 == 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r10 == 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r10 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if (r10 == 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r10 == 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r10 != 8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0056, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r10.h(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r10.h(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.x0 m(com.google.android.gms.internal.ads.tk0 r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.h(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.h(r1)
            boolean r2 = r10.g()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.h(r2)
            boolean r5 = r10.g()
            if (r5 == 0) goto L47
            int r5 = r10.h(r4)
            if (r5 <= 0) goto L47
            r10.f(r1)
        L47:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r7
            goto L57
        L56:
            r5 = r6
        L57:
            int r10 = r10.h(r3)
            int[] r9 = com.google.android.gms.internal.ads.ay0.f4629u
            if (r5 != r7) goto L66
            r7 = 13
            if (r10 != r7) goto L66
            r10 = r9[r7]
            goto L94
        L66:
            r7 = 0
            if (r5 != r6) goto L93
            r6 = 14
            if (r10 >= r6) goto L93
            r6 = r9[r10]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L7e
            goto L91
        L7e:
            if (r10 == r4) goto L84
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
        L84:
            int r10 = r6 + 1
            goto L94
        L87:
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
            goto L84
        L8c:
            if (r10 == r4) goto L84
            if (r10 != r7) goto L91
            goto L84
        L91:
            r10 = r6
            goto L94
        L93:
            r10 = r7
        L94:
            com.google.android.gms.internal.ads.x0 r1 = new com.google.android.gms.internal.ads.x0
            r2 = 0
            r1.<init>(r5, r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ay0.m(com.google.android.gms.internal.ads.tk0):com.google.android.gms.internal.ads.x0");
    }

    public static v91 n(byte[] bArr) {
        try {
            wm1 wm1Var = wm1.f12302a;
            int i = em1.f5727a;
            ih1 B2 = ih1.B(bArr, wm1.f12303b);
            jd1 jd1Var = jd1.f7422b;
            zd1 j10 = zd1.j(B2);
            ee1 ee1Var = (ee1) jd1Var.f7423a.get();
            ee1Var.getClass();
            if (!ee1Var.f5672d.containsKey(new ce1(zd1.class, (gl1) j10.f13142v))) {
                return new dd1(j10);
            }
            return jd1Var.g(j10);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static void o(long j10, xk0 xk0Var, i3[] i3VarArr) {
        boolean z3;
        int K = xk0Var.K();
        if ((K & 64) != 0) {
            int i = K & 31;
            xk0Var.G(1);
            int i10 = xk0Var.f12581b;
            for (i3 i3Var : i3VarArr) {
                int i11 = i * 3;
                xk0Var.E(i10);
                i3Var.a(i11, xk0Var);
                if (j10 != -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.K(z3);
                i3Var.c(j10, 1, i11, 0, null);
            }
        }
    }

    public static void p(Context context, boolean z3) {
        if (z3) {
            int i = k9.a0.f19634b;
            l9.i.e("This request is sent from a test device.");
            return;
        }
        l9.d dVar = g9.p.f17688g.f17689a;
        String c10 = l9.d.c(context);
        String o10 = p.a.o(new StringBuilder(String.valueOf(c10).length() + FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", c10, "\")) to get test ads on this device.");
        int i10 = k9.a0.f19634b;
        l9.i.e(o10);
    }

    public static boolean r(double d2) {
        if (Math.getExponent(d2) <= 1023) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(com.google.android.gms.internal.ads.xk0 r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.f12581b
        L6:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La5
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.P()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.L()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto La9
        L23:
            int r7 = r1.O()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.O()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            goto La5
        L39:
            r7 = 4
            if (r0 != r7) goto L69
            if (r24 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
        L46:
            r4 = r6
            goto La5
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L69:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L70
            goto L71
        L70:
            r4 = r6
        L71:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L95
            goto L46
        L95:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L46
        L9f:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L20
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        La5:
            r1.E(r2)
            return r4
        La9:
            r1.E(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ay0.s(com.google.android.gms.internal.ads.xk0, int, int, boolean):boolean");
    }

    public static byte[] t(String str, boolean z3) {
        p61 p61Var;
        if (z3) {
            p61Var = r61.e;
            if (p61Var.f10132b != null) {
                p61Var = new p61(p61Var.f10131a, (Character) null);
            }
        } else {
            p61Var = r61.f10129d;
        }
        byte[] h3 = p61Var.h(str);
        if (h3.length == 0 && str.length() > 0) {
            q.x.n("Unable to decode ".concat(str));
            return null;
        }
        return h3;
    }

    public static Uri u(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            StringBuilder sb2 = new StringBuilder(str.substring(0, i));
            g3.a.t(sb2, str2, "=", str3, "&");
            sb2.append(str.substring(i));
            return Uri.parse(sb2.toString());
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:79|(2:81|(1:91)(3:86|(1:88)(1:90)|89))|92|(1:93)|(2:95|(7:117|118|119|(4:(6:125|126|(5:128|129|130|(1:132)|133)(2:139|(1:141)(1:142))|134|(1:136)(1:138)|137)|143|144|(2:(1:(1:(1:227)(4:222|(1:224)|225|226))(12:191|(1:193)(1:215)|194|(1:196)|197|198|(4:201|(3:203|204|205)(1:207)|206|199)|208|209|(1:211)(1:214)|212|213))(2:161|(2:163|154)(8:164|(1:166)(1:184)|167|(1:169)(1:183)|170|(4:173|(3:175|176|177)(1:179)|178|171)|180|181))|182)(3:152|(1:155)|154))(9:228|(1:(1:(0)))|143|144|(1:146)|(1:157)|(1:186)|(1:217)|227)|55|(1:57)|58)(2:98|(9:102|103|104|105|(1:107)(1:109)|108|55|(0)|58)(1:101)))|237|118|119|(0)(0)|55|(0)|58) */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0282, code lost:
    
        if (r8 == 67) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.x4 v(int r33, com.google.android.gms.internal.ads.xk0 r34, boolean r35, com.google.android.gms.internal.ads.s6 r36) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ay0.v(int, com.google.android.gms.internal.ads.xk0, boolean, com.google.android.gms.internal.ads.s6):com.google.android.gms.internal.ads.x4");
    }

    public static void w(int i, xk0 xk0Var) {
        xk0Var.y(7);
        byte[] bArr = xk0Var.f12580a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static long y(ByteBuffer byteBuffer) {
        long c10 = c(byteBuffer) << 32;
        if (c10 >= 0) {
            return c(byteBuffer) + c10;
        }
        vd.n.b("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    public static y51 z(byte[] bArr, int i, int i10) {
        if (i10 >= bArr.length) {
            return d51.q("");
        }
        b51 b51Var = d51.f5314v;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int U = U(bArr, i10, i);
        int i11 = 0;
        while (i10 < U) {
            String str = new String(bArr, i10, U - i10, O(i));
            int length = objArr.length;
            int i12 = i11 + 1;
            int d2 = y41.d(length, i12);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i11] = str;
            i10 = W(i) + U;
            U = U(bArr, i10, i);
            i11 = i12;
        }
        y51 w10 = d51.w(objArr, i11);
        if (w10.isEmpty()) {
            return d51.q("");
        }
        return w10;
    }

    public abstract boolean D(r71 r71Var, o71 o71Var, o71 o71Var2);

    public abstract y71 H(r71 r71Var);

    public abstract o71 N(r71 r71Var);

    public abstract boolean T(z71 z71Var, Object obj, Object obj2);

    public abstract void j(y71 y71Var, Thread thread);

    public abstract void q(y71 y71Var, y71 y71Var2);

    public abstract boolean x(z71 z71Var, y71 y71Var, y71 y71Var2);
}
