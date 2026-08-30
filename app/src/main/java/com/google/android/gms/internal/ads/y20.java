package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import mf.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class y20 implements u20 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12761a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12762b;

    public y20(Context context) {
        this.f12761a = 2;
        this.f12762b = k.C.f16815f.b();
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final void a(HashMap hashMap) {
        switch (this.f12761a) {
            case 0:
                if (((Boolean) r.e.f17698c.a(sl.Ob)).booleanValue()) {
                    ed1.U(q81.t(((ju0) this.f12762b).a(true)), Throwable.class, x20.f12429b, xx.f12651a);
                    return;
                }
                return;
            case 1:
                String str = (String) hashMap.get("render_in_browser");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        ((pp0) this.f12762b).a(Boolean.parseBoolean(str));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Invalid render_in_browser state", e);
                    }
                }
                return;
            default:
                CookieManager cookieManager = (CookieManager) this.f12762b;
                if (cookieManager != null) {
                    if (((String) hashMap.get("clear")) != null) {
                        String str2 = (String) r.e.f17698c.a(sl.f10978v1);
                        String cookie = cookieManager.getCookie(str2);
                        if (cookie != null) {
                            List n10 = b(new a31(';')).n(cookie);
                            for (int i = 0; i < n10.size(); i++) {
                                String str3 = (String) n10.get(i);
                                mf b10 = b(new a31('='));
                                str3.getClass();
                                o31 o31Var = (o31) ((p31) b10.f8338w).f(b10, str3);
                                if (o31Var.hasNext()) {
                                    cookieManager.setCookie(str2, String.valueOf((String) o31Var.next()).concat(String.valueOf((String) r.e.f17698c.a(sl.f10740g1))));
                                } else {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 70);
                                    sb2.append("position (0) must be less than the number of elements that remained (0)");
                                    throw new IndexOutOfBoundsException(sb2.toString());
                                }
                            }
                            return;
                        }
                        return;
                    }
                    String str4 = (String) hashMap.get("cookie");
                    if (!TextUtils.isEmpty(str4)) {
                        cookieManager.setCookie((String) r.e.f17698c.a(sl.f10978v1), str4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ y20(int i, Object obj) {
        this.f12761a = i;
        this.f12762b = obj;
    }
}
