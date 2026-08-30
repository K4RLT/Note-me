package j9;

import a6.x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import ba.q;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.ai0;
import com.google.android.gms.internal.ads.be0;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.st0;
import com.google.android.gms.internal.ads.tt0;
import com.google.android.gms.internal.ads.v80;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.yt;
import g9.r;
import j6.s;
import java.util.Collections;
import k9.a0;
import k9.f0;
import org.json.JSONException;
import org.json.JSONObject;
import ya.da;

/* loaded from: classes.dex */
public final class d extends yt {
    public static final int T = Color.argb(0, 0, 0, 0);
    public FrameLayout B;
    public WebChromeClient.CustomViewCallback C;
    public j F;
    public x K;
    public boolean L;
    public boolean M;
    public Toolbar Q;
    public final /* synthetic */ int S;

    /* renamed from: v, reason: collision with root package name */
    public final Activity f19064v;

    /* renamed from: w, reason: collision with root package name */
    public AdOverlayInfoParcel f19065w;

    /* renamed from: x, reason: collision with root package name */
    public h00 f19066x;

    /* renamed from: y, reason: collision with root package name */
    public q f19067y;

    /* renamed from: z, reason: collision with root package name */
    public o f19068z;
    public boolean A = false;
    public boolean D = false;
    public boolean E = false;
    public boolean G = false;
    public int R = 1;
    public int H = 0;
    public final Object I = new Object();
    public final f J = new f(this);
    public boolean N = false;
    public boolean O = false;
    public boolean P = true;

    public d(Activity activity, int i) {
        this.S = i;
        this.f19064v = activity;
    }

    public static final void x4(View view, bi0 bi0Var) {
        if (bi0Var != null && view != null) {
            if (((Boolean) r.e.f17698c.a(sl.f10792j6)).booleanValue() && ((st0) bi0Var.f4802b.A) == st0.HTML) {
                return;
            }
            v80 v80Var = f9.k.C.f16832x;
            tt0 tt0Var = bi0Var.f4801a;
            v80Var.getClass();
            v80.i(tt0Var, view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4(boolean r48) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.d.A4(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void D() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
            mVar.R0();
        }
        if (((Boolean) r.e.f17698c.a(sl.Y5)).booleanValue() && this.f19066x != null && (!this.f19064v.isFinishing() || this.f19067y == null)) {
            this.f19066x.onPause();
        }
        s();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: i -> 0x003c, TryCatch #0 {i -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[Catch: i -> 0x003c, TryCatch #0 {i -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f A[Catch: i -> 0x003c, TryCatch #0 {i -> 0x003c, blocks: (B:13:0x0020, B:15:0x002e, B:17:0x0032, B:19:0x0038, B:20:0x003f, B:21:0x0048, B:23:0x0053, B:24:0x0055, B:26:0x005b, B:27:0x0067, B:29:0x006e, B:32:0x0080, B:34:0x0084, B:36:0x0089, B:38:0x0096, B:40:0x009a, B:42:0x00a0, B:48:0x00a8, B:51:0x00ac, B:53:0x00ad, B:55:0x00b3, B:56:0x00b6, B:58:0x00bc, B:60:0x00c0, B:61:0x00c3, B:63:0x00c9, B:64:0x00cc, B:66:0x00d0, B:68:0x00d4, B:69:0x00d7, B:76:0x0102, B:78:0x0106, B:79:0x010d, B:80:0x010e, B:82:0x0112, B:84:0x011f, B:86:0x007a, B:88:0x007e, B:89:0x0092, B:90:0x0123, B:91:0x012a, B:44:0x00a1, B:46:0x00a5), top: B:12:0x0020, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.zt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F0(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.d.F0(android.os.Bundle):void");
    }

    public final void O(int i) {
        int i10;
        Activity activity = this.f19064v;
        int i11 = activity.getApplicationInfo().targetSdkVersion;
        nl nlVar = sl.S6;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (i11 >= ((Integer) qlVar.a(nlVar)).intValue() && activity.getApplicationInfo().targetSdkVersion <= ((Integer) qlVar2.a(sl.T6)).intValue() && (i10 = Build.VERSION.SDK_INT) >= ((Integer) qlVar2.a(sl.U6)).intValue() && i10 <= ((Integer) qlVar2.a(sl.V6)).intValue()) {
            return;
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            f9.k.C.f16817h.e("AdOverlay.setRequestedOrientation", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Q0() {
        this.M = true;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Q1(int i, String[] strArr, int[] iArr) {
        d dVar;
        if (i == 12345) {
            Activity activity = this.f19064v;
            if (activity != null) {
                AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
                if (adOverlayInfoParcel.E == 5) {
                    dVar = this;
                } else {
                    dVar = null;
                }
                try {
                    adOverlayInfoParcel.P.X3(strArr, iArr, new oa.b(new ph0(activity, dVar, null, null)));
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            g5.q.h("Null activity");
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void W3(int i, int i10, Intent intent) {
        be0 be0Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            nl nlVar = sl.Je;
            r rVar = r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i10);
                a0.k(sb2.toString());
                h00 h00Var = this.f19066x;
                if (h00Var != null && h00Var.j0() != null && (be0Var = h00Var.j0().T) != null && (adOverlayInfoParcel = this.f19065w) != null && ((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    s a10 = be0Var.a();
                    a10.k("action", "hilca");
                    String str = adOverlayInfoParcel.K;
                    if (str == null) {
                        str = "";
                    }
                    a10.k("gqi", str);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length());
                    sb3.append(i10);
                    a10.k("hilr", sb3.toString());
                    if (i10 == -1 && intent != null) {
                        String stringExtra = intent.getStringExtra("callerPackage");
                        String stringExtra2 = intent.getStringExtra("loadingStage");
                        if (stringExtra != null) {
                            a10.k("hilcp", stringExtra);
                        }
                        if (stringExtra2 != null) {
                            a10.k("hills", stringExtra2);
                        }
                    }
                    a10.n();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void a() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
            mVar.o3();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final boolean b() {
        this.R = 1;
        if (this.f19066x == null) {
            return true;
        }
        if (((Boolean) r.e.f17698c.a(sl.f10811ka)).booleanValue() && this.f19066x.canGoBack()) {
            this.f19066x.goBack();
            return false;
        }
        boolean o12 = this.f19066x.o1();
        if (!o12) {
            this.f19066x.b("onbackblocked", Collections.EMPTY_MAP);
        }
        return o12;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void c2(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.D);
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void d() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
            mVar.r0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void f() {
        boolean z3;
        int i;
        int i10;
        f9.f fVar;
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
            mVar.v2();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f19065w;
        if (adOverlayInfoParcel2 != null && (fVar = adOverlayInfoParcel2.I) != null && fVar.A) {
            z3 = true;
        } else {
            z3 = false;
        }
        Window window = this.f19064v.getWindow();
        nl nlVar = sl.M1;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            View decorView = window.getDecorView();
            if (true != z3) {
                i10 = 5380;
            } else {
                i10 = 5894;
            }
            decorView.setSystemUiVisibility(i10);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z3) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
        if (((Boolean) qlVar2.a(sl.Ye)).booleanValue() && (i = Build.VERSION.SDK_INT) <= 34 && i >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            da.a(window, false);
        }
        if (!((Boolean) qlVar2.a(sl.Y5)).booleanValue()) {
            h00 h00Var = this.f19066x;
            if (h00Var != null && !h00Var.o0()) {
                this.f19066x.onResume();
            } else {
                int i11 = a0.f19634b;
                l9.i.f("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void f0() {
        m mVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
            mVar.t1();
        }
        h00 h00Var = this.f19066x;
        if (h00Var != null) {
            try {
                this.F.removeView(h00Var.U());
            } catch (NullPointerException unused) {
            }
        }
        s();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void g() {
        m mVar;
        if (((Boolean) r.e.f17698c.a(sl.Y5)).booleanValue()) {
            h00 h00Var = this.f19066x;
            if (h00Var != null && !h00Var.o0()) {
                this.f19066x.onResume();
            } else {
                int i = a0.f19634b;
                l9.i.f("The webview does not exist. Ignoring action.");
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
            mVar.g2();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void i() {
        m mVar;
        y();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
            mVar.T1();
        }
        if (!((Boolean) r.e.f17698c.a(sl.Y5)).booleanValue() && this.f19066x != null && (!this.f19064v.isFinishing() || this.f19067y == null)) {
            this.f19066x.onPause();
        }
        s();
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void k() {
        this.R = 1;
    }

    public final void l() {
        this.R = 3;
        Activity activity = this.f19064v;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.E == 5) {
            activity.overridePendingTransition(0, 0);
            h00 h00Var = this.f19066x;
            if (h00Var != null) {
                h00Var.Y0(null);
            }
        }
    }

    public final void s() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        m mVar;
        if (this.f19064v.isFinishing() && !this.N) {
            this.N = true;
            h00 h00Var = this.f19066x;
            if (h00Var != null) {
                h00Var.Z0(this.R - 1);
                synchronized (this.I) {
                    try {
                        if (!this.L && this.f19066x.i1()) {
                            nl nlVar = sl.X5;
                            r rVar = r.e;
                            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && !this.O && (adOverlayInfoParcel = this.f19065w) != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
                                mVar.u2();
                            }
                            x xVar = new x(24, this);
                            this.K = xVar;
                            f0.f19676l.postDelayed(xVar, ((Long) rVar.f17698c.a(sl.F1)).longValue());
                            return;
                        }
                    } finally {
                    }
                }
            }
            v4();
        }
    }

    public final void v4() {
        h00 h00Var;
        m mVar;
        if (!this.O) {
            this.O = true;
            h00 h00Var2 = this.f19066x;
            if (h00Var2 != null) {
                this.F.removeView(h00Var2.U());
                q qVar = this.f19067y;
                if (qVar != null) {
                    this.f19066x.F0((Context) qVar.f3158v);
                    this.f19066x.m1(false);
                    if (((Boolean) r.e.f17698c.a(sl.f10736fe)).booleanValue() && this.f19066x.getParent() != null) {
                        ((ViewGroup) this.f19066x.getParent()).removeView(this.f19066x.U());
                    }
                    ViewGroup viewGroup = (ViewGroup) this.f19067y.f3160x;
                    View U = this.f19066x.U();
                    q qVar2 = this.f19067y;
                    viewGroup.addView(U, qVar2.f3157u, (ViewGroup.LayoutParams) qVar2.f3159w);
                    this.f19067y = null;
                } else {
                    Activity activity = this.f19064v;
                    if (activity.getApplicationContext() != null) {
                        this.f19066x.F0(activity.getApplicationContext());
                    }
                }
                this.f19066x = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
            if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f4265w) != null) {
                mVar.i4(this.R);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f19065w;
            if (adOverlayInfoParcel2 != null && (h00Var = adOverlayInfoParcel2.f4266x) != null) {
                x4(this.f19065w.f4266x.U(), h00Var.E0());
            }
        }
    }

    public final void w4(View view) {
        bi0 E0;
        ai0 H0;
        h00 h00Var = this.f19066x;
        if (h00Var != null) {
            nl nlVar = sl.f10807k6;
            r rVar = r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && (H0 = h00Var.H0()) != null) {
                synchronized (H0) {
                    xt0 xt0Var = H0.f4516f;
                    if (xt0Var != null) {
                        f9.k.C.f16832x.getClass();
                        v80.p(new ac.a(xt0Var, 19, view));
                        return;
                    }
                    return;
                }
            }
            if (((Boolean) rVar.f17698c.a(sl.f10792j6)).booleanValue() && (E0 = h00Var.E0()) != null && ((st0) E0.f4802b.A) == st0.HTML) {
                v80 v80Var = f9.k.C.f16832x;
                tt0 tt0Var = E0.f4801a;
                v80Var.getClass();
                v80.p(new ac.a(tt0Var, 18, view));
            }
        }
    }

    public final void y() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19065w;
        if (adOverlayInfoParcel != null && this.A) {
            O(adOverlayInfoParcel.D);
        }
        if (this.B != null) {
            this.f19064v.setContentView(this.F);
            this.M = true;
            this.B.removeAllViews();
            this.B = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.C;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.C = null;
        }
        this.A = false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.sl0, java.lang.Object] */
    public final void y4(boolean z3) {
        boolean z9;
        int i;
        int i10;
        if (this.f19065w.Q) {
            return;
        }
        nl nlVar = sl.f10649a6;
        r rVar = r.e;
        int intValue = ((Integer) rVar.f17698c.a(nlVar)).intValue();
        int i11 = 0;
        if (((Boolean) rVar.f17698c.a(sl.I1)).booleanValue() || z3) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object obj = new Object();
        obj.f11054a = 0;
        obj.f11055b = 0;
        obj.f11056c = 0;
        obj.f11057d = 50;
        if (true != z9) {
            i = 0;
        } else {
            i = intValue;
        }
        obj.f11054a = i;
        if (true != z9) {
            i11 = intValue;
        }
        obj.f11055b = i11;
        obj.f11056c = intValue;
        this.f19068z = new o(this.f19064v, obj, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z9) {
            i10 = 9;
        } else {
            i10 = 11;
        }
        layoutParams.addRule(i10);
        z4(z3, this.f19065w.A);
        this.F.addView(this.f19068z, layoutParams);
        w4(this.f19068z);
    }

    public final void z4(boolean z3, boolean z9) {
        boolean z10;
        boolean z11;
        AdOverlayInfoParcel adOverlayInfoParcel;
        f9.f fVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        f9.f fVar2;
        nl nlVar = sl.G1;
        r rVar = r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        boolean booleanValue = ((Boolean) qlVar.a(nlVar)).booleanValue();
        boolean z12 = true;
        if (booleanValue && (adOverlayInfoParcel2 = this.f19065w) != null && (fVar2 = adOverlayInfoParcel2.I) != null && fVar2.B) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((Boolean) qlVar2.a(sl.H1)).booleanValue() && (adOverlayInfoParcel = this.f19065w) != null && (fVar = adOverlayInfoParcel.I) != null && fVar.C) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z3 && z9 && z10 && !z11) {
            h00 h00Var = this.f19066x;
            try {
                JSONObject put = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (h00Var != null) {
                    h00Var.c("onError", put);
                }
            } catch (JSONException e) {
                int i = a0.f19634b;
                l9.i.d("Error occurred while dispatching error event.", e);
            }
        }
        o oVar = this.f19068z;
        if (oVar != null) {
            if (!z11 && (!z9 || z10)) {
                z12 = false;
            }
            ImageButton imageButton = oVar.f19091u;
            if (z12) {
                imageButton.setVisibility(8);
                if (((Long) qlVar2.a(sl.K1)).longValue() > 0) {
                    imageButton.animate().cancel();
                    imageButton.clearAnimation();
                    return;
                }
                return;
            }
            imageButton.setVisibility(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final void Y(oa.a aVar) {
    }
}