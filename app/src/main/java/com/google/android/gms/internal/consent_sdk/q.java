package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class q extends WebView {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f13527x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f13528u;

    /* renamed from: v, reason: collision with root package name */
    public final b6.u f13529v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13530w;

    public q(r rVar, Handler handler, b6.u uVar) {
        super(rVar);
        this.f13530w = false;
        this.f13528u = handler;
        this.f13529v = uVar;
    }

    public final void a(String str, String str2) {
        this.f13528u.post(new l(this, 1, w7.i1.d(str, "(", str2, ");")));
    }
}
