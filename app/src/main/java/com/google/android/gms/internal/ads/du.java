package com.google.android.gms.internal.ads;
import f9.k;
import wa.g9;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class du {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5515a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5516b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5517c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5518d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5519f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5520g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f5521h;

    public du(boolean z3, String str, boolean z9, boolean z10, String str2, int i, String str3, String str4) {
        this.f5515a = z3;
        this.f5516b = str;
        this.f5517c = z9;
        this.f5518d = z10;
        this.e = str2;
        this.f5519f = i;
        this.f5520g = str3;
        Bundle bundle = null;
        if (!TextUtils.isEmpty(str4)) {
            try {
                bundle = g9.h(new JSONObject(str4));
            } catch (JSONException e) {
                k.C.f16817h.d("PlayPrewarmOptions.parseHsdpExtraQueryParams", e);
            }
        }
        this.f5521h = bundle;
    }
}
