package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class en0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5729a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5731c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5732d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5733f;

    public en0(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f5729a = str;
        this.f5730b = num;
        this.f5731c = str2;
        this.f5732d = str3;
        this.e = str4;
        this.f5733f = str5;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        Bundle bundle = (Bundle) obj;
        b80.H("pn", bundle, this.f5729a);
        Integer num = this.f5730b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        b80.H("vnm", bundle, this.f5731c);
        b80.H("dl", bundle, this.f5732d);
        b80.H("ins_pn", bundle, this.e);
        b80.H("ini_pn", bundle, this.f5733f);
    }
}
