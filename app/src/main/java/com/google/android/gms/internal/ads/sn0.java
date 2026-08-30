package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11069a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11070b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11071c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11072d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11073f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11074g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11075h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f11076j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11077k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11078l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11079m;

    /* renamed from: n, reason: collision with root package name */
    public final long f11080n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11081o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11082p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11083q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11084r;

    public sn0(boolean z3, boolean z9, String str, boolean z10, boolean z11, boolean z12, String str2, ArrayList arrayList, String str3, String str4, boolean z13, long j10, boolean z14, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f11069a = z3;
        this.f11070b = z9;
        this.f11071c = str;
        this.f11072d = z10;
        this.e = z11;
        this.f11073f = z12;
        this.f11074g = str2;
        this.f11075h = str6;
        this.f11076j = arrayList;
        this.f11077k = str3;
        this.f11078l = str4;
        this.f11079m = z13;
        this.f11080n = j10;
        this.f11081o = z14;
        this.f11082p = str5;
        this.f11083q = i;
        this.f11084r = str8;
        this.i = str7;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f11069a);
        bundle.putBoolean("coh", this.f11070b);
        bundle.putString("gl", this.f11071c);
        bundle.putBoolean("simulator", this.f11072d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putInt("build_api_level", this.f11083q);
        nl nlVar = sl.f10987vc;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (!((Boolean) qlVar.a(nlVar)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f11073f);
        }
        bundle.putString("hl", this.f11074g);
        if (((Boolean) qlVar2.a(sl.Ze)).booleanValue() || ((Boolean) qlVar2.a(sl.f10657af)).booleanValue()) {
            bundle.putString("dlc", this.f11075h);
        }
        ArrayList<String> arrayList = this.f11076j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f11077k);
        bundle.putString("submodel", Build.MODEL);
        Bundle d2 = b80.d("device", bundle);
        bundle.putBundle("device", d2);
        d2.putString("build", Build.FINGERPRINT);
        d2.putLong("remaining_data_partition_space", this.f11080n);
        Bundle d10 = b80.d("browser", d2);
        d2.putBundle("browser", d10);
        d10.putBoolean("is_browser_custom_tabs_capable", this.f11079m);
        String str3 = this.f11078l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle d11 = b80.d("play_store", d2);
            d2.putBundle("play_store", d11);
            d11.putString("package_version", str3);
        }
        if (((Boolean) qlVar2.a(sl.Lc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f11081o);
        }
        String str4 = this.f11082p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) qlVar2.a(sl.Fc)).booleanValue()) {
            b80.E(bundle, "gotmt_l", true, ((Boolean) qlVar2.a(sl.Cc)).booleanValue());
            b80.E(bundle, "gotmt_i", true, ((Boolean) qlVar2.a(sl.Bc)).booleanValue());
        }
        if (((Boolean) qlVar2.a(sl.Qf)).booleanValue() && (str = this.f11084r) != null) {
            bundle.putString("sdk_i_s", str);
        }
    }
}
