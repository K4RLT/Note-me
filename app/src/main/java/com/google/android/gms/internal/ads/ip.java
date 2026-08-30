package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import k9.a0;
import l9.i;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class ip implements f31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7191b;

    public /* synthetic */ ip(String str, int i) {
        this.f7190a = i;
        this.f7191b = str;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final Object apply(Object obj) {
        int i = this.f7190a;
        String str = this.f7191b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                hp hpVar = lp.f8076a;
                if (str2 != null) {
                    if (((Boolean) vm.f11945f.p()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str).getHost();
                        for (int i10 = 0; i10 < 3; i10++) {
                            if (!host.endsWith(strArr[i10])) {
                            }
                        }
                        return str;
                    }
                    String str3 = (String) vm.f11941a.p();
                    String str4 = (String) vm.f11942b.p();
                    if (!TextUtils.isEmpty(str3)) {
                        str = str.replace(str3, str2);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        Uri parse = Uri.parse(str);
                        if (TextUtils.isEmpty(parse.getQueryParameter(str4))) {
                            return parse.buildUpon().appendQueryParameter(str4, str2).toString();
                        }
                        return str;
                    }
                    return str;
                }
                return str;
            case 1:
                Throwable th = (Throwable) obj;
                hp hpVar2 = lp.f8076a;
                if (((Boolean) vm.i.p()).booleanValue()) {
                    k.C.f16817h.d("prepareClickUrl.attestation2", th);
                }
                return str;
            case 2:
                return new bc0(str, (pn) obj);
            default:
                Throwable th2 = (Throwable) obj;
                vm0 vm0Var = kn0.f7813j;
                int i11 = a0.f19634b;
                i.c("Error calling adapter: ".concat(String.valueOf(str)));
                if (((Boolean) r.e.f17698c.a(sl.Fe)).booleanValue()) {
                    k.C.f16817h.e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                    return null;
                }
                k.C.f16817h.d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)), th2);
                return null;
        }
    }
}
