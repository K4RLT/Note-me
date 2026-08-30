package com.google.android.gms.internal.ads;
import q.x;
import z5.h;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r21 extends ph {

    /* renamed from: u, reason: collision with root package name */
    public final z5.h f10065u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s21 f10066v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(s21 s21Var, z5.h hVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f10066v = s21Var;
        this.f10065u = hVar;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        bj0 bj0Var;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            qh.a(parcel);
            parcel.readInt();
            qh.f(parcel);
            return true;
        }
        Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
        qh.f(parcel);
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        byte b10 = (byte) (((byte) (0 | 1)) | 1);
        Boolean bool = null;
        if (string == null) {
            string = null;
        }
        byte b11 = (byte) (b10 | 2);
        if (bundle.containsKey("userInteracted")) {
            bool = Boolean.valueOf(bundle.getBoolean("userInteracted"));
        }
        if (b11 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b11 & 1) == 0) {
                sb2.append(" statusCode");
            }
            if ((b11 & 2) == 0) {
                sb2.append(" uiMode");
            }
            q.x.o("Missing required properties:".concat(sb2.toString()));
            return false;
        }
        this.f10065u.t(new p21(i10, string, i11, bool));
        if (i10 == 8157 && (bj0Var = this.f10066v.f10469a) != null) {
            s21.f10467c.b("unbind LMD display overlay service", new Object[0]);
            bj0Var.a(new qu0(10, bj0Var));
        }
        return true;
    }
}
