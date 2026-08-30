package com.google.android.gms.internal.ads;
import a5.a;

/* loaded from: classes.dex */
public final class bd1 extends v91 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4768a;

    /* renamed from: b, reason: collision with root package name */
    public final x91 f4769b;

    public bd1(String str, x91 x91Var) {
        this.f4768a = str;
        this.f4769b = x91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f4769b != x91.f12506f;
    }

    public final String toString() {
        return a.h("(typeUrl=", this.f4768a, ", outputPrefixType=", this.f4769b.f12526b, ")");
    }
}
