package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class mn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8381a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8382b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8383c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8384d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8385f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8386g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8387h;

    public mn0(boolean z3, boolean z9, String str, boolean z10, int i, int i10, int i11, String str2) {
        this.f8381a = z3;
        this.f8382b = z9;
        this.f8383c = str;
        this.f8384d = z10;
        this.e = i;
        this.f8385f = i10;
        this.f8386g = i11;
        this.f8387h = str2;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f8383c);
        bundle.putBoolean("is_nonagon", true);
        nl nlVar = sl.D4;
        g9.r rVar = g9.r.e;
        bundle.putString("extra_caps", (String) rVar.f17698c.a(nlVar));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f8385f);
        bundle.putInt("lv", this.f8386g);
        if (((Boolean) rVar.f17698c.a(sl.Q6)).booleanValue()) {
            String str = this.f8387h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle d2 = b80.d("sdk_env", bundle);
        d2.putBoolean("mf", ((Boolean) wm.f12286g.p()).booleanValue());
        d2.putBoolean("instant_app", this.f8381a);
        d2.putBoolean("lite", this.f8382b);
        d2.putBoolean("is_privileged_process", this.f8384d);
        bundle.putBundle("sdk_env", d2);
        Bundle d10 = b80.d("build_meta", d2);
        d10.putString("cl", "919173219");
        d10.putString("rapid_rc", "dev");
        d10.putString("rapid_rollup", "HEAD");
        d2.putBundle("build_meta", d10);
    }
}
