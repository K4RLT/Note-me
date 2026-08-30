package k9;
import f.a;
import p.l;
import x.n;
import a0.k;
import c.p;
import f.c;
import m.f;
import m.h;
import m.j;
import q.x;
import r.e;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.google.android.gms.internal.ads.a31;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.hg;
import com.google.android.gms.internal.ads.id0;
import com.google.android.gms.internal.ads.jv;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.o31;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.p31;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.qp0;
import com.google.android.gms.internal.ads.s80;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.sp0;
import com.google.android.gms.internal.ads.tu0;
import com.google.android.gms.internal.ads.xe;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wa.k9;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f19676l = new bb.a(Looper.getMainLooper(), 1);

    /* renamed from: g, reason: collision with root package name */
    public String f19682g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f19683h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f19677a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f19678b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f19679c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19680d = new AtomicBoolean();
    public boolean e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19681f = new Object();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19684j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f19685k = Executors.newSingleThreadExecutor();

    public static final String A(Context context, String str) {
        Context context2;
        if (str == null) {
            f9.k.C.f16817h.d("AdUtil.getUserAgent", new Exception("null afmaVersion"));
            if (!((Boolean) g9.e.f17698c.a(sl.f10754h)).booleanValue()) {
                return N();
            }
            str = l9.a().f20029u;
        }
        String str2 = null;
        try {
            boolean z3 = false;
            if (c7.a.f3894w == null) {
                c7.a.f3894w = new c7.a(4, false);
            }
            c7.a aVar = c7.a.f3894w;
            if (TextUtils.isEmpty(aVar.f3896v)) {
                int i = ca.h.e;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                aVar.f3896v = (String) k9.a(context, new xe(22, context2, context, z3));
            }
            str2 = aVar.f3896v;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = N();
        }
        String o10 = a.o(new StringBuilder(String.valueOf(str2).length() + 10 + String.valueOf(str).length()), str2, " (Mobile; ", str);
        try {
            if (na.b.a(context).d()) {
                StringBuilder sb2 = new StringBuilder(o10.length() + 4);
                sb2.append(o10);
                sb2.append(";aia");
                o10 = sb2.toString();
            }
        } catch (Exception e) {
            f9.k.C.f16817h.d("AdUtil.getUserAgent", e);
        }
        return o10.concat(")");
    }

    public static ArrayList H() {
        nl nlVar = sl.f10642a;
        ArrayList H = g9.e.f17696a.H();
        ArrayList arrayList = new ArrayList();
        int size = H.size();
        int i = 0;
        while (i < size) {
            Object obj = H.get(i);
            i++;
            String str = (String) obj;
            mf b10 = mf.b(new a31(','));
            str.getClass();
            Iterator f10 = ((p31) b10.f8338w).f(b10, str);
            while (true) {
                o31 o31Var = (o31) f10;
                if (o31Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) o31Var.next()));
                    } catch (NumberFormatException unused) {
                        k("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static s80 I(Context context) {
        LocaleList systemLocales;
        LocaleList systemLocales2;
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new s80(locale.getLanguage(), locale.getCountry());
        }
        s80 s80Var = new s80(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager a10 = a(context.getSystemService(p.l()));
            if (a10 != null) {
                systemLocales = a10.getSystemLocales();
                if (!systemLocales.isEmpty()) {
                    systemLocales2 = a10.getSystemLocales();
                    Locale locale2 = systemLocales2.get(0);
                    return new s80(locale2.getLanguage(), locale2.getCountry());
                }
            }
            return s80Var;
        } catch (Throwable th) {
            f9.k.C.f16817h.d("AdUtil.getSystemDefaultLocale", th);
            return s80Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean K(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.f0.K(android.view.View):boolean");
    }

    public static final void L(Context context, Intent intent) {
        Bundle bundle;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() != null) {
            bundle = intent.getExtras();
        } else {
            bundle = new Bundle();
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(bundle);
    }

    public static final String M(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return x(y(context));
    }

    public static final String N() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String O() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return a.o(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final HashMap P(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            f9.k.C.f16817h.d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e);
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long Q(View view) {
        float f10;
        float f11 = Float.MAX_VALUE;
        do {
            f10 = 0.0f;
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f11 = Math.min(f11, view2.getAlpha());
            view = view2.getParent();
        } while (f11 > 0.0f);
        if (f11 >= 0.0f) {
            f10 = f11;
        }
        return Math.round(f10 * 100.0f);
    }

    public static final int a(View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            nl nlVar = sl.f10700d9;
            g9.r rVar = g9.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                String str = (String) rVar.f17698c.a(sl.f10714e9);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(",")) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [k9.t, com.google.android.gms.internal.ads.oh] */
    public static final t b(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                int i = a0.f19634b;
                l9.i.c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof t) {
                return (t) queryLocalInterface;
            }
            return new oh(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 0);
        } catch (Exception e) {
            f9.k.C.f16817h.d("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    public static final boolean c(Context context, String str) {
        int i = jv.f7549a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        if (na.b.a(context).f3851u.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean d(Context context) {
        boolean z3;
        try {
            if (la.b.f20069h == null) {
                if (la.b.i() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                la.b.f20069h = Boolean.valueOf(z3);
            }
            return la.b.f20069h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean e(String str) {
        if (l9.c()) {
            nl nlVar = sl.f10697d6;
            g9.r rVar = g9.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                String str2 = (String) rVar.f17698c.a(sl.f10728f6);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            break;
                        }
                    }
                }
                String str4 = (String) g9.e.f17698c.a(sl.f10712e6);
                if (!str4.isEmpty()) {
                    for (String str5 : str4.split(";")) {
                        if (str5.equals(str)) {
                            return true;
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = a0.f19634b;
            l9.i.d("Error loading class.", th);
            f9.k.C.f16817h.d("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        if (powerManager.isScreenOn()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        try {
            Bundle y10 = y(context);
            String string = y10.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(x(y10))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void j(View view, int i) {
        String str;
        int i10;
        int i11;
        int i12;
        String str2;
        String str3;
        String str4;
        qp0 J;
        sp0 A0;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof id0) {
                view2 = ((id0) view2).getChildAt(0);
            }
            if (view2 instanceof q9.e) {
                str = "NATIVE";
                i10 = 1;
            } else {
                str = "UNKNOWN";
                i10 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i12 = rect.width();
                i11 = rect.height();
            } else {
                i11 = 0;
                i12 = 0;
            }
            f0 f0Var = f9.k.C.f16813c;
            long Q = Q(view2);
            view2.getLocationOnScreen(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            String str5 = "none";
            if ((view2 instanceof h00) && (A0 = ((h00) view2).A0()) != null) {
                str3 = A0.f11091b;
                int hashCode = view2.hashCode();
                str2 = str;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(hashCode).length());
                sb2.append(str3);
                sb2.append(":");
                sb2.append(hashCode);
                view2.setContentDescription(sb2.toString());
            } else {
                str2 = str;
                str3 = "none";
            }
            if ((view2 instanceof h00) && (J = ((h00) view2).J()) != null) {
                str4 = qp0.a(J.f9926b);
                i10 = J.e;
                str5 = J.E;
            } else {
                str4 = str2;
            }
            Locale locale = Locale.US;
            String str6 = "<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str5 + ", gwsQueryId=" + str3 + ", format=" + str4 + ", impType=" + i10 + ", class=" + view2.getClass().getName() + ", x=" + i13 + ", y=" + i14 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i12 + ", vHeight=" + i11 + ", alpha=" + Q + ", state=" + Integer.toString(i, 2) + ">";
            int i15 = a0.f19634b;
            l9.i.e(str6);
        } catch (Exception e) {
            int i16 = a0.f19634b;
            l9.i.d("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder k(Context context) {
        eb.y yVar = f9.k.C.f16815f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void l(Context context, qp0 qp0Var, be0 be0Var) {
        String str;
        j6.s a10 = be0Var.a();
        a10.k("action", "can_show");
        f9.k kVar = f9.k.C;
        f0 f0Var = kVar.f16813c;
        String str2 = "0";
        if (true == g(context)) {
            str = "0";
        } else {
            str = "1";
        }
        a10.k("foreground", str);
        if (true == kVar.f16816g.m()) {
            str2 = "1";
        }
        a10.k("fg_al", str2);
        if (qp0Var != null) {
            List list = qp0Var.f9958t;
            if (!list.isEmpty()) {
                a10.k("ancn", (String) list.get(0));
            }
            a10.k("ad_format", qp0.a(qp0Var.f9926b));
        }
        a10.l();
    }

    public static final boolean m(qp0 qp0Var) {
        if (((Boolean) g9.e.f17698c.a(sl.f10705df)).booleanValue() && qp0Var != null && qp0Var.e == 4) {
            return true;
        }
        return false;
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String concat = "Could not parse value:".concat(e.toString());
            int i = a0.f19634b;
            l9.i.f(concat);
            return 0;
        }
    }

    public static final HashMap o(Uri uri) {
        String encodedQuery;
        String decode;
        if (uri == null) {
            return null;
        }
        if (((Boolean) g9.e.f17698c.a(sl.f11007x)).booleanValue()) {
            HashMap hashMap = new HashMap();
            if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
                int i = 0;
                while (true) {
                    int indexOf = encodedQuery.indexOf(38, i);
                    int length = encodedQuery.length();
                    if (indexOf != -1) {
                        length = indexOf;
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i);
                    if (indexOf2 > length || indexOf2 == -1) {
                        indexOf2 = length;
                    }
                    String decode2 = Uri.decode(encodedQuery.substring(i, indexOf2));
                    if (indexOf2 == length) {
                        decode = "";
                    } else {
                        decode = Uri.decode(encodedQuery.substring(indexOf2 + 1, length));
                    }
                    hashMap.put(decode2, decode);
                    if (indexOf == -1) {
                        break;
                    }
                    i = indexOf + 1;
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap2.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap2;
    }

    public static final int[] p(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(R.id.content)) != null) {
            return new int[]{findViewById.getWidth(), findViewById.getHeight()};
        }
        return new int[]{0, 0};
    }

    public static final int[] q(Activity activity) {
        int[] iArr;
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(R.id.content)) != null) {
            iArr = new int[]{findViewById.getTop(), findViewById.getBottom()};
        } else {
            iArr = new int[]{0, 0};
        }
        g9.p pVar = g9.p.f17688g;
        return new int[]{pVar.f17689a.h(activity, iArr[0]), pVar.f17689a.h(activity, iArr[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z3;
        if (f9.k.C.f16813c.e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || K(view)) {
            z3 = true;
        } else {
            z3 = false;
        }
        long Q = Q(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z3)) {
            nl nlVar = sl.T1;
            g9.r rVar = g9.e;
            ql qlVar = rVar.f17698c;
            ql qlVar2 = rVar.f17698c;
            if ((!((Boolean) qlVar.a(nlVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) qlVar2.a(sl.Xb)).booleanValue() || Q >= ((Integer) qlVar2.a(sl.Zb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (((Boolean) g9.e.f17698c.a(sl.f10972uc)).booleanValue()) {
            try {
                try {
                    context.startActivity(intent);
                    return;
                } catch (Throwable unused) {
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
            } catch (SecurityException e) {
                int i = a0.f19634b;
                l9.i.g("", e);
                f9.k.C.f16817h.d("AdUtil.startActivityWithUnknownContext", e);
                return;
            }
        }
        try {
            context.startActivity(intent);
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final void t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            L(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb2.append("Opening ");
            sb2.append(uri2);
            sb2.append(" in a new browser.");
            String sb3 = sb2.toString();
            int i = a0.f19634b;
            l9.i.a(sb3);
        } catch (ActivityNotFoundException e) {
            int i10 = a0.f19634b;
            l9.i.d("No browser is found.", e);
        }
    }

    public static int u(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i > 0) {
            String j10 = a5.a.j(new StringBuilder(String.valueOf(i).length() + 86), "HTTP timeout too low: ", i, " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            int i10 = a0.f19634b;
            l9.i.f(j10);
            return 60000;
        }
        return 60000;
    }

    public static final void v(Context context, Intent intent, be0 be0Var, String str) {
        nl nlVar = sl.Ie;
        g9.r rVar = g9.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue() && (context instanceof d10)) {
            try {
                Uri data = intent.getData();
                if (data != null && data.toString() != null && data.toString().matches((String) qlVar2.a(sl.Ke))) {
                    ((d10) context).a(intent);
                    if (((Boolean) qlVar2.a(sl.Je)).booleanValue() && be0Var != null) {
                        j6.s a10 = be0Var.a();
                        a10.k("action", "hila");
                        if (str == null) {
                            str = "";
                        }
                        a10.k("gqi", str);
                        a10.n();
                        return;
                    }
                    return;
                }
                s(context, intent);
                return;
            } catch (ActivityNotFoundException e) {
                e = e;
                int i = a0.f19634b;
                l9.i.d("Error occurred while starting activity for result", e);
                f9.k.C.f16817h.d("AdUtil.startActivityForResult", e);
                s(context, intent);
                return;
            } catch (SecurityException e8) {
                e = e8;
                int i10 = a0.f19634b;
                l9.i.d("Error occurred while starting activity for result", e);
                f9.k.C.f16817h.d("AdUtil.startActivityForResult", e);
                s(context, intent);
                return;
            } catch (Exception e10) {
                int i11 = a0.f19634b;
                l9.i.d("Error occurred while starting activity for result", e10);
                f9.k.C.f16817h.d("AdUtil.startActivityForResult", e10);
                s(context, intent);
                return;
            }
        }
        s(context, intent);
    }

    public static boolean w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String x(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            if (!TextUtils.isEmpty(string)) {
                if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
                    return string;
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static Bundle y(Context context) {
        try {
            return na.b.a(context).b(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            l("Error getting metadata", e);
            return null;
        }
    }

    public static final void z(com.google.android.gms.internal.ads.d dVar, Bundle bundle) {
        Intent intent = (Intent) dVar.f5230v;
        if (!bundle.isEmpty()) {
            int i = bundle.getInt("h", -1);
            if (i >= 0) {
                if (i > 0) {
                    intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
                    intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
                } else {
                    x.n("Invalid value for the initialHeightPx argument");
                    return;
                }
            }
            int i10 = bundle.getInt("cbp", -1);
            if (i10 >= 0 && i10 <= 2) {
                if (i10 >= 0 && i10 <= 2) {
                    intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
                } else {
                    x.n("Invalid value for the position argument");
                }
            }
        }
    }

    public final void B(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int u9 = u(i);
        String j10 = a5.a.j(new StringBuilder(String.valueOf(u9).length() + 28), "HTTP timeout: ", u9, " milliseconds.");
        int i10 = a0.f19634b;
        l9.i.e(j10);
        httpURLConnection.setConnectTimeout(u9);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(u9);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void C(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        sl.a(context);
        if (((Boolean) g9.e.f17698c.a(sl.f10956tc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new hg(10, this), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new hg(10, this), intentFilter);
        }
        this.i = true;
    }

    public final void D(Context context) {
        if (this.f19684j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        sl.a(context);
        if (((Boolean) g9.e.f17698c.a(sl.f10956tc)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new tu0(1), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new tu0(1), intentFilter);
        }
        this.f19684j = true;
    }

    public final String E(Context context, String str) {
        if (((Boolean) g9.e.f17698c.a(sl.Gc)).booleanValue()) {
            if (this.f19683h != null) {
                return this.f19683h;
            }
            String A = A(context, str);
            if (str != null) {
                this.f19683h = A;
            }
            return A;
        }
        synchronized (this.f19681f) {
            try {
                String str2 = this.f19682g;
                if (str2 != null) {
                    return str2;
                }
                String A2 = A(context, str);
                if (str != null) {
                    this.f19682g = A2;
                }
                return A2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F(String str) {
        return w(str, this.f19677a, (String) g9.e.f17698c.a(sl.M0));
    }

    public final boolean G(String str) {
        return w(str, this.f19678b, (String) g9.e.f17698c.a(sl.N0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (l9.d.q() != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.google.android.gms.internal.ads.cm] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j6.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J(android.content.Context r8, android.net.Uri r9, android.os.Bundle r10) {
        /*
            r7 = this;
            if (r8 != 0) goto L9
            java.lang.String r8 = "Trying to open chrome custom tab on a null context"
            k9.k(r8)
            r8 = 3
            return r8
        L9:
            boolean r0 = r8 instanceof android.app.Activity
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r0 != 0) goto L21
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r2)
            r10.setData(r9)
            r10.addFlags(r1)
            r8.startActivity(r10)
            r8 = 2
            return r8
        L21:
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f11044z5
            g9.r r3 = g9.e
            com.google.android.gms.internal.ads.ql r4 = r3.f17698c
            com.google.android.gms.internal.ads.ql r3 = r3.f17698c
            java.lang.Object r0 = r4.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 5
            if (r0 == 0) goto L87
            com.google.android.gms.internal.ads.d r0 = new com.google.android.gms.internal.ads.d
            f9.k r1 = f9.k.C
            com.google.android.gms.internal.ads.bm r1 = r1.f16822n
            j r2 = r1.f4827y
            if (r2 != 0) goto L4c
            com.google.android.gms.internal.ads.wx r2 = com.google.android.gms.internal.ads.xx.f12651a
            com.google.android.gms.internal.ads.f r5 = new com.google.android.gms.internal.ads.f
            r6 = 13
            r5.<init>(r6, r1)
            r2.execute(r5)
        L4c:
            j r1 = r1.f4827y
            r0.<init>(r1)
            z(r0, r10)
            com.google.android.gms.internal.mlkit_vision_digital_ink.iw r10 = r0.a()
            java.lang.Object r0 = r10.f14489v
            android.content.Intent r0 = (android.content.Intent) r0
            com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.N5
            java.lang.Object r1 = r3.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L75
            g9.p r1 = g9.p.f17688g
            l9.d r1 = r1.f17689a
            boolean r1 = l9.d.q()
            if (r1 == 0) goto L75
            goto Lc0
        L75:
            java.lang.String r1 = com.google.android.gms.internal.ads.so1.a(r8)
            r0.setPackage(r1)
            r0.setData(r9)
            java.lang.Object r9 = r10.f14490w
            android.os.Bundle r9 = (android.os.Bundle) r9
            r8.startActivity(r0, r9)
            return r4
        L87:
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.f11013x5
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc1
            com.google.android.gms.internal.ads.cm r0 = new com.google.android.gms.internal.ads.cm
            r0.<init>()
            j6.i r1 = new j6.i
            r1.<init>()
            r1.f18924u = r0
            r1.f18925v = r10
            r1.f18926w = r8
            r1.f18927x = r9
            r0.f5121d = r1
            android.app.Activity r8 = (android.app.Activity) r8
            h r9 = r0.f5119b
            if (r9 == 0) goto Lb0
            goto Lc0
        Lb0:
            java.lang.String r9 = com.google.android.gms.internal.ads.so1.a(r8)
            if (r9 == 0) goto Lc0
            com.google.android.gms.internal.ads.zr1 r10 = new com.google.android.gms.internal.ads.zr1
            r10.<init>(r0)
            r0.f5120c = r10
            f.a(r8, r9, r10)
        Lc0:
            return r4
        Lc1:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r2)
            r10.setData(r9)
            r10.addFlags(r1)
            r8.startActivity(r10)
            r8 = 9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.f0.J(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}
