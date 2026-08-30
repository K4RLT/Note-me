package com.google.android.gms.internal.ads;
import f9.k;
import g9.k0;
import g9.s1;
import g9.v1;
import l9.i;
import m9.a;
import oa.a;
import oa.b;
import q9.b;
import q9.e;
import z8.i;
import z8.l;
import z8.q;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.daren.scraply.R;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class wf0 extends ph implements g9.s1 {

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f12226u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f12227v;

    /* renamed from: w, reason: collision with root package name */
    public final WeakReference f12228w;

    /* renamed from: x, reason: collision with root package name */
    public final qf0 f12229x;

    /* renamed from: y, reason: collision with root package name */
    public final wx f12230y;

    /* renamed from: z, reason: collision with root package name */
    public nf0 f12231z;

    public wf0(Context context, WeakReference weakReference, qf0 qf0Var, wx wxVar) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f12226u = new HashMap();
        this.f12227v = context;
        this.f12228w = weakReference;
        this.f12229x = qf0Var;
        this.f12230y = wxVar;
    }

    public static String z4(Object obj) {
        z8.q c10;
        g9.v1 v1Var;
        if (obj instanceof z8.l) {
            c10 = ((z8.l) obj).e;
        } else {
            g9.v1 v1Var2 = null;
            if (obj instanceof qi) {
                try {
                    v1Var2 = ((qi) obj).f9848a.e();
                } catch (RemoteException e) {
                    l9.i.i(e, "#007 Could not call remote method.");
                }
                c10 = new z8.q(v1Var2);
            } else if (obj instanceof m9.a) {
                try {
                    g9.k0 k0Var = ((pq) ((m9.a) obj)).f9583c;
                    if (k0Var != null) {
                        v1Var2 = k0Var.A();
                    }
                } catch (RemoteException e8) {
                    l9.i.i(e8, "#007 Could not call remote method.");
                }
                c10 = new z8.q(v1Var2);
            } else if (obj instanceof fw) {
                try {
                    wv wvVar = ((fw) obj).f6189a;
                    if (wvVar != null) {
                        v1Var2 = wvVar.h();
                    }
                } catch (RemoteException e10) {
                    l9.i.i(e10, "#007 Could not call remote method.");
                }
                c10 = new z8.q(v1Var2);
            } else if (obj instanceof lw) {
                try {
                    wv wvVar2 = ((lw) obj).f8162a;
                    if (wvVar2 != null) {
                        v1Var2 = wvVar2.h();
                    }
                } catch (RemoteException e11) {
                    l9.i.i(e11, "#007 Could not call remote method.");
                }
                c10 = new z8.q(v1Var2);
            } else if (obj instanceof z8.i) {
                c10 = ((z8.i) obj).getResponseInfo();
            } else if (obj instanceof NativeAd) {
                c10 = ((NativeAd) obj).c();
            } else {
                return "";
            }
        }
        if (c10 != null && (v1Var = c10.f31997a) != null) {
            try {
                return v1Var.f();
            } catch (RemoteException unused) {
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.widget.FrameLayout, q9.b, android.view.View] */
    @Override // g9.s1
    public final void E1(String str, oa.a aVar, oa.a aVar2) {
        String string;
        String string2;
        String string3;
        Context context = (Context) oa.b.z1(aVar);
        ViewGroup viewGroup = (ViewGroup) oa.b.z1(aVar2);
        if (context != null && viewGroup != null) {
            HashMap hashMap = this.f12226u;
            Object obj = hashMap.get(str);
            if (obj != null) {
                hashMap.remove(str);
            }
            if (obj instanceof z8.i) {
                z8.i iVar = (z8.i) obj;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setTag("layout");
                ay0.P(linearLayout, -1, -1);
                linearLayout.setGravity(17);
                linearLayout.addView(iVar);
                iVar.setTag("ad_view");
                viewGroup.addView(linearLayout);
                return;
            }
            if (obj instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) obj;
                q9.e eVar = new q9.e(context);
                eVar.setTag("ad_view_tag");
                ay0.P(eVar, -1, -1);
                viewGroup.addView(eVar);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setTag("layout_tag");
                linearLayout2.setOrientation(1);
                ay0.P(linearLayout2, -1, -1);
                linearLayout2.setBackgroundColor(-1);
                eVar.addView(linearLayout2);
                Resources c10 = f9.k.C.f16817h.c();
                if (c10 == null) {
                    string = "Headline";
                } else {
                    string = c10.getString(R.string.native_headline);
                }
                linearLayout2.addView(ay0.G(context, string, android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
                String b10 = nativeAd.b();
                if (b10 == null) {
                    b10 = "";
                }
                TextView G = ay0.G(context, b10, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
                eVar.setHeadlineView(G);
                linearLayout2.addView(G);
                if (c10 == null) {
                    string2 = "Body";
                } else {
                    string2 = c10.getString(R.string.native_body);
                }
                linearLayout2.addView(ay0.G(context, string2, android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
                String a10 = nativeAd.a();
                if (a10 == null) {
                    a10 = "";
                }
                TextView G2 = ay0.G(context, a10, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
                eVar.setBodyView(G2);
                linearLayout2.addView(G2);
                if (c10 == null) {
                    string3 = "Media View";
                } else {
                    string3 = c10.getString(R.string.native_media_view);
                }
                linearLayout2.addView(ay0.G(context, string3, android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setTag("media_view_tag");
                eVar.setMediaView(frameLayout);
                linearLayout2.addView(frameLayout);
                eVar.setNativeAd(nativeAd);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            oa.a v12 = oa.b.v1(parcel.readStrongBinder());
            oa.a v13 = oa.b.v1(parcel.readStrongBinder());
            qh.f(parcel);
            E1(readString, v12, v13);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final synchronized void v4(Object obj, String str) {
        this.f12226u.put(str, obj);
        w4(z4(obj));
    }

    public final synchronized void w4(String str) {
        try {
            yx d2 = this.f12231z.d(str);
            hx0 hx0Var = new hx0(19, this);
            d2.a(new t81(d2, 0, hx0Var), this.f12230y);
        } catch (NullPointerException e) {
            f9.k.C.f16817h.d("OutOfContextTester.setAdAsOutOfContext", e);
            this.f12229x.b();
        }
    }

    public final synchronized void x4(String str) {
        try {
            yx d2 = this.f12231z.d(str);
            lx0 lx0Var = new lx0(24, this);
            d2.a(new t81(d2, 0, lx0Var), this.f12230y);
        } catch (NullPointerException e) {
            f9.k.C.f16817h.d("OutOfContextTester.setAdAsShown", e);
            this.f12229x.b();
        }
    }

    public final Context y4() {
        Context context = (Context) this.f12228w.get();
        if (context == null) {
            return this.f12227v;
        }
        return context;
    }
}
