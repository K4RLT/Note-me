package eb;
import x.m;
import b.a;
import d1.d;
import k0.y;
import q.x;
import q1.e;
import q1.i;
import r0.h0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.k10;
import com.google.android.gms.internal.measurement.a8;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class l3 extends k1 {
    public static final String[] D = {"firebase_", "google_", "ga_"};
    public static final String[] E = {"_err"};
    public b5.b A;
    public Boolean B;
    public Integer C;

    /* renamed from: x, reason: collision with root package name */
    public SecureRandom f16225x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicLong f16226y;

    /* renamed from: z, reason: collision with root package name */
    public int f16227z;

    public l3(d1 d1Var) {
        super(d1Var);
        this.C = null;
        this.f16226y = new AtomicLong(0L);
    }

    public static boolean A0(String str) {
        String str2 = (String) v.f16424t0.a(null);
        if (!str2.equals("*") && !Arrays.asList(str2.split(",")).contains(str)) {
            return false;
        }
        return true;
    }

    public static long B(t tVar) {
        long j10 = 0;
        if (tVar == null) {
            return 0L;
        }
        Bundle bundle = tVar.f16371u;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            if (bundle.get(it.next()) instanceof Parcelable[]) {
                j10 += ((Parcelable[]) r3).length;
            }
        }
        return j10;
    }

    public static long C(byte[] bArr) {
        boolean z3;
        fa.y.h(bArr);
        int i = 0;
        if (bArr.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        fa.y.k(z3);
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (bArr[length] & 255) << i;
            i += 8;
        }
        return j10;
    }

    public static boolean C0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean E0(String str) {
        fa.y.e(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static Bundle F(List list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k3 k3Var = (k3) it.next();
                String str = k3Var.f16215y;
                String str2 = k3Var.f16212v;
                if (str != null) {
                    bundle.putString(str2, str);
                } else {
                    Long l10 = k3Var.f16214x;
                    if (l10 != null) {
                        bundle.putLong(str2, l10.longValue());
                    } else {
                        Double d2 = k3Var.A;
                        if (d2 != null) {
                            bundle.putDouble(str2, d2.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static int G0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str)) {
            return 100;
        }
        return 36;
    }

    public static String J(int i, String str, boolean z3) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) > i) {
                if (z3) {
                    return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
                }
                return null;
            }
            return str;
        }
        return null;
    }

    public static MessageDigest J0() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void L(Bundle bundle, int i, String str, Object obj) {
        if (t0(i, bundle)) {
            bundle.putString("_ev", J(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void Y(k2 k2Var, Bundle bundle, boolean z3) {
        if (bundle != null && k2Var != null && (!bundle.containsKey("_sc") || z3)) {
            String str = k2Var.f16206a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = k2Var.f16207b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", k2Var.f16208c);
            return;
        }
        if (bundle != null && k2Var == null && z3) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void Z(n3 n3Var, String str, int i, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        t0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i10);
        }
        n3Var.f0(str, bundle, "_err");
    }

    public static boolean d0(Context context) {
        ActivityInfo receiverInfo;
        fa.y.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean e0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            return false;
        }
        return true;
    }

    public static boolean f0(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean k0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            fa.y.h(str);
            if (str.equals(str2)) {
                return false;
            }
            return true;
        }
        if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (str3.equals(str4)) {
                    return false;
                }
                return true;
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return true;
        }
        if (!isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str4)) {
                if (!TextUtils.isEmpty(str3) && str3.equals(str4)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        if (!TextUtils.isEmpty(str3) && str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public static boolean l0(String str, String[] strArr) {
        fa.y.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] n0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static boolean p0(Context context) {
        ServiceInfo serviceInfo;
        fa.y.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static ArrayList s0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", dVar.f16093u);
            bundle.putString("origin", dVar.f16094v);
            bundle.putLong("creation_timestamp", dVar.f16096x);
            bundle.putString("name", dVar.f16095w.f16212v);
            Object zza = dVar.f16095w.zza();
            fa.y.h(zza);
            e(bundle, zza);
            bundle.putBoolean("active", dVar.f16097y);
            String str = dVar.f16098z;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = dVar.A;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.f16380u);
                t tVar = uVar.f16381v;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.b());
                }
            }
            bundle.putLong("trigger_timeout", dVar.B);
            u uVar2 = dVar.C;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.f16380u);
                t tVar2 = uVar2.f16381v;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.b());
                }
            }
            bundle.putLong("triggered_timestamp", dVar.f16095w.f16213w);
            bundle.putLong("time_to_live", dVar.D);
            u uVar3 = dVar.E;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.f16380u);
                t tVar3 = uVar3.f16381v;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.b());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean t0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A(java.lang.String r12, java.lang.String r13, java.lang.Object r14, android.os.Bundle r15, java.util.List r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.l3.A(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int B0() {
        if (this.C == null) {
            ca.f fVar = ca.f.f4036b;
            Context context = ((d1) this.f3443v).f16102u;
            fVar.getClass();
            this.C = Integer.valueOf(ca.a(context) / AdError.NETWORK_ERROR_CODE);
        }
        return this.C.intValue();
    }

    public final Bundle D(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object r02 = r0(bundle.get(str), str);
                if (r02 == null) {
                    f().F.f(((d1) this.f3443v).G.f(str), "Param value can't be null");
                } else {
                    P(bundle2, str, r02);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long D0() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.l3.D0():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0076, code lost:
    
        if (h0("event param", 40, r2) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle E(java.lang.String r18, android.os.Bundle r19, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.l3.E(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final boolean F0(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (TextUtils.isEmpty(str) || (queryIntentActivities = ((d1) this.f3443v).f16102u.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Bundle G(boolean z3, Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                if (z3) {
                    str5 = uri.getQueryParameter("gbraid");
                } else {
                    str5 = null;
                }
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z3 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z3 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (z3 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            f().D.f(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String, com.google.android.gms.internal.ads.js] */
    public final u H(String str, Bundle bundle, String str2, long j10, boolean z3) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle E2 = E(str, bundle2, Collections.singletonList("_o"), true);
            if (z3) {
                E2 = D(E2);
            }
            fa.y.h(E2);
            return new u(str, new t(E2), str2, j10);
        }
        Object r72 = f().A;
        r72.f(((d1) this.f3443v).G.g(r72), "Invalid conditional property event name");
        x.m();
        return null;
    }

    public final long H0() {
        long andIncrement;
        long j10;
        long j11 = this.f16226y.get();
        AtomicLong atomicLong = this.f16226y;
        if (j11 == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((d1) this.f3443v).H.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.f16227z + 1;
                this.f16227z = i;
                j10 = nextLong + i;
            }
            return j10;
        }
        synchronized (atomicLong) {
            this.f16226y.compareAndSet(-1L, 1L);
            andIncrement = this.f16226y.getAndIncrement();
        }
        return andIncrement;
    }

    public final Object I(int i, Object obj, boolean z3, boolean z9) {
        long j10;
        if (obj != null) {
            if (!(obj instanceof Long)) {
                if (obj instanceof Double) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    return Long.valueOf(((Integer) obj).intValue());
                }
                if (obj instanceof Byte) {
                    return Long.valueOf(((Byte) obj).byteValue());
                }
                if (obj instanceof Short) {
                    return Long.valueOf(((Short) obj).shortValue());
                }
                if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j10 = 1;
                    } else {
                        j10 = 0;
                    }
                    return Long.valueOf(j10);
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (z9) {
                        if ((obj instanceof Bundle[]) || (obj instanceof Parcelable[])) {
                            ArrayList arrayList = new ArrayList();
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (parcelable instanceof Bundle) {
                                    Bundle D2 = D((Bundle) parcelable);
                                    if (!D2.isEmpty()) {
                                        arrayList.add(D2);
                                    }
                                }
                            }
                            return arrayList.toArray(new Bundle[arrayList.size()]);
                        }
                        return null;
                    }
                    return null;
                }
                return J(i, String.valueOf(obj), z3);
            }
            return obj;
        }
        return null;
    }

    public final String I0() {
        byte[] bArr = new byte[16];
        K0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final SecureRandom K0() {
        u();
        if (this.f16225x == null) {
            this.f16225x = new SecureRandom();
        }
        return this.f16225x;
    }

    public final void M(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            f().D.f(Long.valueOf(j11), "Params already contained engagement");
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void O(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    t().P(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void P(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
                return;
            }
            if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                f().F.h("Not putting event parameter. Invalid value type. name, type", ((d1) this.f3443v).G.f(str), str2);
            }
        }
    }

    public final void Q(k10 k10Var, int i) {
        d1 d1Var = (d1) this.f3443v;
        Bundle bundle = (Bundle) k10Var.e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (E0(str) && (i10 = i10 + 1) > i) {
                f().C.h(a.i("Event can't contain more than ", i, " params"), d1Var.G.c((String) k10Var.f7599b), d1Var.G.a(bundle));
                t0(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void R(com.google.android.gms.internal.measurement.t0 t0Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = ((d1) this.f3443v).C;
            d(k0Var);
            k0Var.D.f(e, "Error returning int value to wrapper");
        }
    }

    public final void S(com.google.android.gms.internal.measurement.t0 t0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = ((d1) this.f3443v).C;
            d(k0Var);
            k0Var.D.f(e, "Error returning long value to wrapper");
        }
    }

    public final void T(com.google.android.gms.internal.measurement.t0 t0Var, Bundle bundle) {
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = ((d1) this.f3443v).C;
            d(k0Var);
            k0Var.D.f(e, "Error returning bundle value to wrapper");
        }
    }

    public final void U(com.google.android.gms.internal.measurement.t0 t0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = ((d1) this.f3443v).C;
            d(k0Var);
            k0Var.D.f(e, "Error returning bundle list to wrapper");
        }
    }

    public final void V(com.google.android.gms.internal.measurement.t0 t0Var, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z3);
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = ((d1) this.f3443v).C;
            d(k0Var);
            k0Var.D.f(e, "Error returning boolean value to wrapper");
        }
    }

    public final void X(com.google.android.gms.internal.measurement.t0 t0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = ((d1) this.f3443v).C;
            d(k0Var);
            k0Var.D.f(e, "Error returning byte array to wrapper");
        }
    }

    public final void a0(String str, com.google.android.gms.internal.measurement.t0 t0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            t0Var.k0(bundle);
        } catch (RemoteException e) {
            k0 k0Var = ((d1) this.f3443v).C;
            d(k0Var);
            k0Var.D.f(e, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x009d, code lost:
    
        if (h0("event param", 40, r2) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0081, code lost:
    
        if (h0("event param", 40, r2) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.l3.b0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void c0(Parcelable[] parcelableArr, int i, boolean z3) {
        d1 d1Var = (d1) this.f3443v;
        fa.y.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (E0(str) && !l0(str, q1.f16325d) && (i10 = i10 + 1) > i) {
                    if (z3) {
                        f().C.h(a.i("Param can't contain more than ", i, " item-scoped custom parameters"), d1Var.G.f(str), d1Var.G.a(bundle));
                        t0(28, bundle);
                    } else {
                        f().C.h("Param cannot contain item-scoped custom parameters", d1Var.G.f(str), d1Var.G.a(bundle));
                        t0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean g0(String str, double d2) {
        try {
            SharedPreferences.Editor edit = ((d1) this.f3443v).f16102u.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (RuntimeException e) {
            f().A.f(e, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean h0(String str, int i, String str2) {
        if (str2 == null) {
            f().C.f(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i) {
            f().C.i("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
        return true;
    }

    public final boolean i0(String str, String str2) {
        d1 d1Var = (d1) this.f3443v;
        if (!TextUtils.isEmpty(str)) {
            fa.y.h(str);
            if (!str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                if (TextUtils.isEmpty(d1Var.f16103v)) {
                    f().C.f(y(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                    return false;
                }
            } else {
                return true;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                fa.y.h(str2);
                if (!str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    f().C.f(y(str2), "Invalid admob_app_id. Analytics disabled.");
                    return false;
                }
                return true;
            }
            if (TextUtils.isEmpty(d1Var.f16103v)) {
                f().C.g("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean j0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.codePointCount(0, valueOf.length()) > i) {
            f().F.i("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        }
        return true;
    }

    public final boolean m0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            f().C.f(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(D[i])) {
                f().C.h("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && l0(str2, strArr)) {
            if (strArr2 == null || !l0(str2, strArr2)) {
                f().C.h("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean o0(int i) {
        Boolean bool = ((d1) this.f3443v).p().f16281z;
        if (B0() < i / AdError.NETWORK_ERROR_CODE) {
            if (bool == null || bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int q0(String str) {
        if (!v0("user property", str)) {
            return 6;
        }
        if (!m0("user property", i, null, str)) {
            return 15;
        }
        if (!h0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    public final Object r0(Object obj, String str) {
        int w10;
        d1 d1Var = (d1) this.f3443v;
        if ("_ev".equals(str)) {
            return I(Math.max(d1Var.A.w(null, false), 256), obj, true, true);
        }
        if (C0(str)) {
            w10 = Math.max(d1Var.A.w(null, false), 256);
        } else {
            w10 = d1Var.A.w(null, false);
        }
        return I(w10, obj, false, true);
    }

    public final boolean u0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c10 = na.a(context).c(64, str);
            if (c10 != null && (signatureArr = c10.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            f().A.f(e, "Package name not found");
            return true;
        } catch (CertificateException e8) {
            f().A.f(e8, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean v0(String str, String str2) {
        if (str2 == null) {
            f().C.f(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            f().C.f(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            f().C.h("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                f().C.h("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final Object w0(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return I(G0(str), obj, true, false);
        }
        return I(G0(str), obj, false, false);
    }

    @Override // eb.k1
    public final boolean x() {
        return true;
    }

    public final boolean x0(String str, String str2) {
        if (str2 == null) {
            f().C.f(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            f().C.f(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            f().C.h("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                f().C.h("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final int y(Object obj, String str) {
        boolean j02;
        if ("_ldl".equals(str)) {
            j02 = j0("user property referrer", str, G0(str), obj);
        } else {
            j02 = j0("user property", str, G0(str), obj);
        }
        if (j02) {
            return 0;
        }
        return 7;
    }

    public final boolean y0(String str, String str2) {
        a8.a();
        d1 d1Var = (d1) this.f3443v;
        if (d1Var.A.F(null, v.f16422s0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return d1Var.A.x("debug.firebase.analytics.app").equals(str);
    }

    public final int z(String str) {
        if (!v0("event", str)) {
            return 2;
        }
        if (!m0("event", e, q1.f16326f, str)) {
            return 13;
        }
        if (!h0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    public final boolean z0(String str) {
        u();
        if (na.a(((d1) this.f3443v).f16102u).f3851u.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        f().H.f(str, "Permission not granted");
        return false;
    }
}