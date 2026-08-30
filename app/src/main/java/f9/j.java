package f9;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.km;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.pu0;
import com.google.android.gms.internal.ads.vi;
import com.google.android.gms.internal.ads.yl;
import fa.y;
import g9.a0;
import g9.c3;
import g9.f3;
import g9.j0;
import g9.n;
import g9.q1;
import g9.u;
import g9.u0;
import g9.v1;
import g9.v2;
import g9.w2;
import g9.x;
import g9.x0;
import g9.z0;
import g9.z1;
import g9.z2;
import java.util.TreeMap;
import wa.f9;

/* loaded from: classes.dex */
public final class j extends j0 {
    public AsyncTask A;

    /* renamed from: u, reason: collision with root package name */
    public final l9.a f16805u;

    /* renamed from: v, reason: collision with root package name */
    public final c3 f16806v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f16807w;

    /* renamed from: x, reason: collision with root package name */
    public final n f16808x;

    /* renamed from: y, reason: collision with root package name */
    public WebView f16809y;

    /* renamed from: z, reason: collision with root package name */
    public x f16810z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, android.view.View$OnTouchListener] */
    public j(Context context, c3 c3Var, String str, l9.a aVar) {
        this.f16807w = context;
        this.f16805u = aVar;
        this.f16806v = c3Var;
        this.f16809y = new WebView(context);
        this.f16808x = new n(context, str);
        v4(0);
        this.f16809y.setVerticalScrollBarEnabled(false);
        this.f16809y.getSettings().setJavaScriptEnabled(true);
        this.f16809y.setWebViewClient(new pu0(2, this));
        this.f16809y.setOnTouchListener(new Object());
    }

    @Override // g9.k0
    public final v1 A() {
        return null;
    }

    @Override // g9.k0
    public final void G3(x xVar) {
        this.f16810z = xVar;
    }

    @Override // g9.k0
    public final void H0(lv lvVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void J() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final boolean L() {
        return false;
    }

    @Override // g9.k0
    public final void L2() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final String M() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // g9.k0
    public final void O0(u0 u0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void S2(yl ylVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final z1 U() {
        return null;
    }

    @Override // g9.k0
    public final void V0(x0 x0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void a() {
        y.d("pause must be called on the main UI thread.");
    }

    @Override // g9.k0
    public final void b() {
        y.d("resume must be called on the main UI thread.");
    }

    @Override // g9.k0
    public final boolean c() {
        return false;
    }

    @Override // g9.k0
    public final void d3(w2 w2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final Bundle f() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void h() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final long i0() {
        return 0L;
    }

    @Override // g9.k0
    public final String j() {
        return null;
    }

    @Override // g9.k0
    public final void l1(f3 f3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final c3 m() {
        return this.f16806v;
    }

    @Override // g9.k0
    public final boolean n1(z2 z2Var) {
        Bundle bundle;
        y.i(this.f16809y, "This Search Ad has already been torn down");
        n nVar = this.f16808x;
        TreeMap treeMap = (TreeMap) nVar.f17680x;
        v2 v2Var = z2Var.D;
        if (v2Var != null) {
            nVar.f17681y = v2Var.f17709u;
        }
        Bundle bundle2 = z2Var.G;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle != null) {
            String str = (String) km.f7804c.p();
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    nVar.f17682z = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f16805u.f20029u);
            if (((Boolean) km.f7802a.p()).booleanValue()) {
                Bundle b10 = f9.b((Context) nVar.f17678v, (String) km.f7803b.p());
                for (String str3 : b10.keySet()) {
                    treeMap.put(str3, b10.get(str3).toString());
                }
            }
        }
        this.A = new i(this).execute(new Void[0]);
        return true;
    }

    @Override // g9.k0
    public final void n3(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void p() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void p2(u uVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void q() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void q2(c3 c3Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // g9.k0
    public final void q4(vi viVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final boolean s() {
        return false;
    }

    @Override // g9.k0
    public final void s1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final void t0(boolean z3) {
        throw new IllegalStateException("Unused method");
    }

    @Override // g9.k0
    public final String v() {
        return null;
    }

    public final void v4(int i) {
        if (this.f16809y == null) {
            return;
        }
        this.f16809y.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public final String w4() {
        String str = (String) this.f16808x.f17682z;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) km.f7805d.p();
        return p.a.o(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // g9.k0
    public final u0 x() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // g9.k0
    public final void y() {
        y.d("destroy must be called on the main UI thread.");
        this.A.cancel(true);
        this.f16809y.destroy();
        this.f16809y = null;
    }

    @Override // g9.k0
    public final x z() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // g9.k0
    public final oa.a zza() {
        y.d("getAdFrame must be called on the main UI thread.");
        return new oa.b(this.f16809y);
    }

    @Override // g9.k0
    public final void B0(long j10) {
    }

    @Override // g9.k0
    public final void F1(q1 q1Var) {
    }

    @Override // g9.k0
    public final void G2(boolean z3) {
    }

    @Override // g9.k0
    public final void r4(oa.a aVar) {
    }

    @Override // g9.k0
    public final void z3(z0 z0Var) {
    }

    @Override // g9.k0
    public final void P0(z2 z2Var, a0 a0Var) {
    }
}
