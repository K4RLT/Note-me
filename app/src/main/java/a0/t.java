package a0;
import x.n;
import x.o;
import q.x;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.a8;
import com.google.android.gms.internal.ads.bi0;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.st0;
import com.google.android.gms.internal.ads.tt0;
import com.google.android.gms.internal.ads.ut0;
import com.google.android.gms.internal.ads.v80;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.xv0;
import com.google.android.gms.internal.ads.yt0;
import com.google.android.gms.internal.ads.zh0;
import com.google.android.gms.internal.ads.zt0;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class t implements zh0 {

    /* renamed from: u, reason: collision with root package name */
    public final int f134u;

    /* renamed from: v, reason: collision with root package name */
    public final int f135v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f136w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f137x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f138y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f139z;

    public /* synthetic */ t(int i, int i10, WebView webView, String str, String str2, String str3) {
        this.f136w = str;
        this.f134u = i;
        this.f137x = str2;
        this.f138y = webView;
        this.f139z = str3;
        this.f135v = i10;
    }

    public long a(int i, int i10) {
        int i11;
        mu muVar = (mu) this.f136w;
        int[] iArr = (int[]) muVar.f8422v;
        if (i10 == 1) {
            i11 = iArr[i];
        } else {
            int i12 = (i10 + i) - 1;
            int[] iArr2 = (int[]) muVar.f8423w;
            i11 = (iArr2[i12] + iArr[i12]) - iArr2[i];
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 < 0) {
            y2.i.a("width must be >= 0");
        }
        return y2.b.h(i11, i11, 0, Integer.MAX_VALUE);
    }

    public b0 b(int i) {
        int i10;
        e0 w10 = ((f0) this.f139z).w(i);
        int i11 = w10.f38a;
        int size = w10.f39b.size();
        int i12 = 0;
        if (size != 0 && i11 + size != this.f134u) {
            i10 = this.f135v;
        } else {
            i10 = 0;
        }
        a0[] a0VarArr = new a0[size];
        int i13 = 0;
        while (true) {
            List list = w10.f39b;
            if (i12 < size) {
                int i14 = (int) ((c) list.get(i12)).f26a;
                int i15 = i10;
                a0 a10 = ((s) this.f138y).a(a(i13, i14), i11 + i12, i13, i14, i15);
                i13 += i14;
                a0VarArr[i12] = a10;
                i12++;
                i10 = i15;
            } else {
                return new b0(i, a0VarArr, (mu) this.f137x, list, i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public Object zza() {
        String str = (String) this.f136w;
        String str2 = (String) this.f137x;
        WebView webView = (WebView) this.f138y;
        String str3 = (String) this.f139z;
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(str)) {
                zt0 zt0Var = new zt0("Google", str);
                yt0 k3 = v80.k("javascript");
                int i = this.f134u;
                ut0 n10 = v80.n(wd0.h(i));
                yt0 yt0Var = yt0.NONE;
                if (k3 == yt0Var) {
                    int i10 = k9.a0.f19634b;
                    l9.i.f("Omid html session error; Unable to parse impression owner: javascript");
                    return null;
                }
                if (n10 == null) {
                    String x9 = wd0.x(i);
                    int i11 = k9.a0.f19634b;
                    l9.i.f("Omid html session error; Unable to parse creative type: ".concat(x9));
                    return null;
                }
                yt0 k4 = v80.k(str2);
                if (n10 == ut0.VIDEO && k4 == yt0Var) {
                    String valueOf = String.valueOf(str2);
                    int i12 = k9.a0.f19634b;
                    l9.i.f("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf));
                    return null;
                }
                a8 a8Var = new a8(zt0Var, webView, str3, "", st0.HTML);
                xv0 a10 = xv0.a(n10, v80.m(wd0.i(this.f135v)), k3, k4, true);
                if (ct.D.f8992v) {
                    return new bi0(new tt0(a10, a8Var, UUID.randomUUID().toString()), a8Var);
                }
                x.o("Method called before OM SDK activation");
                return null;
            }
            x.n("Version is null or empty");
            return null;
        }
        x.n("Name is null or empty");
        return null;
    }

    public t(mu muVar, int i, int i10, s sVar, f0 f0Var) {
        this.f137x = muVar;
        this.f136w = muVar;
        this.f134u = i;
        this.f135v = i10;
        this.f138y = sVar;
        this.f139z = f0Var;
    }
}
