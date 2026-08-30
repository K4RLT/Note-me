package com.google.android.gms.internal.ads;
import c4.s;
import u.c;
import v9.a;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class lu extends ph implements cx {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v9.a f8150u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(mu muVar, v9.a aVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f8150u = aVar;
    }

    @Override // com.google.android.gms.internal.ads.cx
    public final void m0(String str, Bundle bundle, String str2) {
        this.f8150u.b(new u.c(5, new c4.s(str, 3)));
    }

    @Override // com.google.android.gms.internal.ads.cx
    public final void o(String str) {
        this.f8150u.a(str);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                m0(readString, bundle, readString2);
            } else {
                String readString3 = parcel.readString();
                qh.f(parcel);
                o(readString3);
            }
        } else {
            parcel.readString();
            parcel.readString();
            qh.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
