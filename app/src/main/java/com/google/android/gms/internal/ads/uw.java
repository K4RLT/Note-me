package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class uw implements ai {

    /* renamed from: u, reason: collision with root package name */
    public final Context f11733u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f11734v;

    /* renamed from: w, reason: collision with root package name */
    public final String f11735w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11736x;

    public uw(Context context, String str) {
        this.f11733u = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f11735w = str;
        this.f11736x = false;
        this.f11734v = new Object();
    }

    public final void a(boolean z3) {
        f9.k kVar = f9.k.C;
        ww wwVar = kVar.f16833y;
        Context context = this.f11733u;
        if (!wwVar.a(context)) {
            return;
        }
        synchronized (this.f11734v) {
            try {
                if (this.f11736x == z3) {
                    return;
                }
                this.f11736x = z3;
                String str = this.f11735w;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f11736x) {
                    ww wwVar2 = kVar.f16833y;
                    if (wwVar2.a(context)) {
                        wwVar2.j(context, str, "beginAdUnitExposure");
                    }
                } else {
                    ww wwVar3 = kVar.f16833y;
                    if (wwVar3.a(context)) {
                        wwVar3.j(context, str, "endAdUnitExposure");
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void k(zh zhVar) {
        a(zhVar.f13171j);
    }
}
