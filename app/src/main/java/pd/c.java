package pd;
import c.j;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import b0.k;
import c7.f;
import c7.j;
import c7.n;
import com.facebook.ads.AdView;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.google.android.gms.internal.ads.nv0;
import com.google.android.gms.internal.play_billing.r;
import eb.d1;
import eb.h3;
import eb.m1;
import eb.n3;
import eb.o0;
import eb.o1;
import eb.q0;
import eb.t1;
import eb.v2;
import h9.g;
import ib.o;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l9.i;
import pf.l;
import q.x;
import t0.e;
import wa.h8;
import ya.z;
import z5.h;

/* loaded from: classes.dex */
public final class c implements j, AdViewParentApi, n3, o0, f5.c, nv0, qb.a, ib.a {

    /* renamed from: v, reason: collision with root package name */
    public static volatile c f22680v;

    /* renamed from: u, reason: collision with root package name */
    public Object f22681u;

    public c(int i, boolean z3) {
        switch (i) {
            case 2:
                this.f22681u = new e(new k[16]);
                return;
            case 4:
                this.f22681u = z.a(Looper.getMainLooper());
                return;
            case 27:
                this.f22681u = new c(29, false);
                return;
            case 29:
                this.f22681u = new o();
                return;
            default:
                this.f22681u = new HashSet();
                return;
        }
    }

    public static c t(String str) {
        m1 m1Var;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            m1Var = o1.b(str.charAt(0));
        } else {
            m1Var = m1.UNINITIALIZED;
        }
        return new c(m1Var);
    }

    @Override // qb.a
    public void K(Bundle bundle) {
        g gVar = (g) this.f22681u;
        if (gVar != null) {
            try {
                gVar.K(bundle);
            } catch (RemoteException e) {
                i.d("RemoteException in onError", e);
            }
        }
    }

    @Override // qb.a
    public void N(Bundle bundle) {
        g gVar = (g) this.f22681u;
        if (gVar != null) {
            try {
                gVar.N(bundle);
            } catch (RemoteException e) {
                i.d("RemoteException in onShown", e);
            }
        }
    }

    @Override // qb.a
    public void W(Bundle bundle) {
        g gVar = (g) this.f22681u;
        if (gVar != null) {
            try {
                gVar.W(bundle);
            } catch (RemoteException e) {
                i.d("RemoteException in onDismissed", e);
            }
        }
    }

    @Override // f5.c
    public void a() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // c7.j
    public void b(f fVar, n nVar) {
        fVar.getClass();
        ((l) this.f22681u).resumeWith(nVar.f3974a);
    }

    @Override // f5.c
    public void c(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f22681u).setResultCode(i);
    }

    @Override // com.google.android.gms.internal.ads.nv0
    public void d(String str, long j10, int i) {
        ((f9.e) this.f22681u).B.e(i, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // eb.o0
    public void e(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((h3) this.f22681u).z(true, i, th, bArr);
    }

    @Override // com.google.android.gms.internal.ads.nv0
    public void f(int i, long j10) {
        ((f9.e) this.f22681u).B.b(i, System.currentTimeMillis() - j10);
    }

    @Override // eb.n3
    public void f0(String str, Bundle bundle, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        t1 t1Var = (t1) this.f22681u;
        d1 d1Var = (d1) t1Var.f3443v;
        if (isEmpty) {
            d1Var.H.getClass();
            t1Var.P("auto", "_err", bundle, true, true, System.currentTimeMillis());
        } else {
            d1Var.getClass();
            x.o("Unexpected call on client side");
        }
    }

    @Override // ib.a
    public /* bridge */ /* synthetic */ Object g(o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.f22681u);
        return h8.e(arrayList);
    }

    public void h() {
        ((o) ((c) this.f22681u).f22681u).r(null);
    }

    public synchronized void i() {
        try {
            long j10 = ((SharedPreferences) this.f22681u).getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f22681u).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f22681u).getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            ((SharedPreferences) this.f22681u).edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(g0.a0 r5, ve.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g5.k
            if (r0 == 0) goto L13
            r0 = r6
            g5.k r0 = (g5.k) r0
            int r1 = r0.f17472w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17472w = r1
            goto L18
        L13:
            g5.k r0 = new g5.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17470u
            int r1 = r0.f17472w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L27
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            return
        L27:
            pe.a.e(r6)
            l4.a.p()
            return
        L2e:
            pe.a.e(r6)
            java.lang.Object r6 = r4.f22681u
            sf.n0 r6 = (sf.n0) r6
            r0.f17472w = r2
            r6.b(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.j(g0.a0, ve.c):void");
    }

    public synchronized void k() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f22681u).edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f22681u).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String m4 = m(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(m4)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(m4);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList l() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f22681u).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new ed.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.f22681u).edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized String m(long j10) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j10).toInstant();
            unused = ZoneOffset.UTC;
            atOffset = instant.atOffset(ZoneOffset.UTC);
            localDateTime = atOffset.toLocalDateTime();
            unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public synchronized String n(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f22681u).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public void o(View view, int i, boolean z3) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f22681u).notifyViewVisibilityChanged(view, i, z3);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        AdView.access$001((AdView) this.f22681u, configuration);
    }

    public synchronized void p(String str) {
        try {
            String n10 = n(str);
            if (n10 == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f22681u).getStringSet(n10, new HashSet()));
            hashSet.remove(str);
            boolean isEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = (SharedPreferences) this.f22681u;
            if (isEmpty) {
                sharedPreferences.edit().remove(n10).commit();
            } else {
                sharedPreferences.edit().putStringSet(n10, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean q(long j10) {
        boolean contains = ((SharedPreferences) this.f22681u).contains("fire-global");
        SharedPreferences sharedPreferences = (SharedPreferences) this.f22681u;
        if (contains) {
            long j11 = sharedPreferences.getLong("fire-global", -1L);
            synchronized (this) {
                if (!m(j11).equals(m(j10))) {
                    ((SharedPreferences) this.f22681u).edit().putLong("fire-global", j10).commit();
                    return true;
                }
                return false;
            }
        }
        sharedPreferences.edit().putLong("fire-global", j10).commit();
        return true;
    }

    public synchronized void r(long j10, String str) {
        String m4 = m(j10);
        if (((SharedPreferences) this.f22681u).getString("last-used-date", "").equals(m4)) {
            String n10 = n(m4);
            if (n10 == null) {
                return;
            }
            if (n10.equals(str)) {
                return;
            }
            s(str, m4);
            return;
        }
        long j11 = ((SharedPreferences) this.f22681u).getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            i();
            j11 = ((SharedPreferences) this.f22681u).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f22681u).getStringSet(str, new HashSet()));
        hashSet.add(m4);
        ((SharedPreferences) this.f22681u).edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", m4).commit();
    }

    public synchronized void s(String str, String str2) {
        p(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f22681u).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f22681u).edit().putStringSet(str, hashSet).commit();
    }

    public void u() {
        v2 v2Var = (v2) this.f22681u;
        v2Var.u();
        q0 s10 = v2Var.s();
        d1 d1Var = (d1) v2Var.f3443v;
        d1Var.H.getClass();
        if (s10.A(System.currentTimeMillis())) {
            v2Var.s().H.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                v2Var.f().I.g("Detected application was in foreground");
                d1Var.H.getClass();
                w(System.currentTimeMillis());
            }
        }
    }

    public void v(long j10) {
        v2 v2Var = (v2) this.f22681u;
        v2Var.u();
        v2Var.B();
        if (v2Var.s().A(j10)) {
            v2Var.s().H.a(true);
            ((d1) v2Var.f3443v).m().D();
        }
        v2Var.s().L.b(j10);
        if (v2Var.s().H.b()) {
            w(j10);
        }
    }

    public void w(long j10) {
        v2 v2Var = (v2) this.f22681u;
        v2Var.u();
        d1 d1Var = (d1) v2Var.f3443v;
        if (d1Var.e()) {
            v2Var.s().L.b(j10);
            d1Var.H.getClass();
            v2Var.f().I.f(Long.valueOf(SystemClock.elapsedRealtime()), "Session started, time");
            long j11 = j10 / 1000;
            v2Var.v().C(j10, Long.valueOf(j11), "auto", "_sid");
            v2Var.s().M.b(j11);
            v2Var.s().H.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            v2Var.v().B(j10, bundle, "auto", "_s");
            String i = v2Var.s().R.i();
            if (!TextUtils.isEmpty(i)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", i);
                v2Var.v().B(j10, bundle2, "auto", "_ssr");
            }
        }
    }

    public /* synthetic */ c(h hVar) {
        this.f22681u = (r) hVar.f31922v;
    }

    public /* synthetic */ c(Object obj) {
        this.f22681u = obj;
    }
}
