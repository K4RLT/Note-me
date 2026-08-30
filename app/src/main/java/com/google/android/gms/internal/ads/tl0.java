package com.google.android.gms.internal.ads;
import fa.y;
import g9.c3;
import j3.c;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final c3 f11374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11375b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11376c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11377d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11378f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11379g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11380h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11381j;

    /* renamed from: k, reason: collision with root package name */
    public final c f11382k;

    /* renamed from: l, reason: collision with root package name */
    public final sl0 f11383l;

    public tl0(c3 c3Var, String str, boolean z3, String str2, float f10, int i, int i10, String str3, int i11, boolean z9, c cVar, sl0 sl0Var) {
        y.i(c3Var, "the adSize must not be null");
        this.f11374a = c3Var;
        this.f11375b = str;
        this.f11376c = z3;
        this.f11377d = str2;
        this.e = f10;
        this.f11378f = i;
        this.f11379g = i10;
        this.f11380h = str3;
        this.i = i11;
        this.f11381j = z9;
        this.f11382k = cVar;
        this.f11383l = sl0Var;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        boolean z3;
        boolean z9;
        Bundle bundle = (Bundle) obj;
        c3 c3Var = this.f11374a;
        int i = c3Var.f17593y;
        boolean z10 = c3Var.I;
        if (i == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.u(bundle, "smart_w", "full", z3);
        int i10 = c3Var.f17590v;
        if (i10 == -2) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.u(bundle, "smart_h", "auto", z9);
        b80.E(bundle, "ene", true, c3Var.D);
        b80.u(bundle, "rafmt", "102", c3Var.G);
        b80.u(bundle, "rafmt", "108", c3Var.J);
        b80.u(bundle, "rafmt", "103", c3Var.H);
        b80.u(bundle, "rafmt", "105", z10);
        b80.E(bundle, "inline_adaptive_slot", true, this.f11381j);
        b80.E(bundle, "interscroller_slot", true, z10);
        b80.H("format", bundle, this.f11375b);
        b80.u(bundle, "fluid", "height", this.f11376c);
        b80.u(bundle, "sz", this.f11377d, !TextUtils.isEmpty(r2));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f11378f);
        bundle.putInt("sh", this.f11379g);
        String str = this.f11380h;
        b80.u(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i11 = this.i;
        if (i11 != -1) {
            bundle.putInt("u_mso", i11);
        }
        c cVar = this.f11382k;
        if (cVar != null) {
            bundle.putInt("sam_t", cVar.f18875b);
            bundle.putInt("sam_b", cVar.f18877d);
            bundle.putInt("sam_l", cVar.f18874a);
            bundle.putInt("sam_r", cVar.f18876c);
        }
        sl0 sl0Var = this.f11383l;
        if (sl0Var != null) {
            bundle.putInt("rc_tl", sl0Var.f11054a);
            bundle.putInt("rc_tr", sl0Var.f11055b);
            bundle.putInt("rc_bl", sl0Var.f11056c);
            bundle.putInt("rc_br", sl0Var.f11057d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        c3[] c3VarArr = c3Var.A;
        if (c3VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i10);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", c3Var.C);
            arrayList.add(bundle2);
        } else {
            for (c3 c3Var2 : c3VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", c3Var2.C);
                bundle3.putInt("height", c3Var2.f17590v);
                bundle3.putInt("width", c3Var2.f17593y);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
