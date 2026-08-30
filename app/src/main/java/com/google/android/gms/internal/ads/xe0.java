package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xe0 extends ph implements gq {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12557u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f12558v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f12559w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ rr0 f12560x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ yx f12561y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ af0 f12562z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe0(long j10, yx yxVar, af0 af0Var, rr0 rr0Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f12557u = obj;
        this.f12558v = str;
        this.f12559w = j10;
        this.f12560x = rr0Var;
        this.f12561y = yxVar;
        Objects.requireNonNull(af0Var);
        this.f12562z = af0Var;
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void a() {
        synchronized (this.f12557u) {
            af0 af0Var = this.f12562z;
            String str = this.f12558v;
            f9.k.C.f16819k.getClass();
            af0Var.d(str, (int) (SystemClock.elapsedRealtime() - this.f12559w), "", true);
            af0Var.f4479l.b(str);
            af0Var.f4482o.t(str);
            vr0 vr0Var = af0Var.f4483p;
            rr0 rr0Var = this.f12560x;
            rr0Var.a(true);
            vr0Var.b(rr0Var.m());
            this.f12561y.b(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.gq
    public final void l3(String str) {
        synchronized (this.f12557u) {
            af0 af0Var = this.f12562z;
            String str2 = this.f12558v;
            f9.k.C.f16819k.getClass();
            af0Var.d(str2, (int) (SystemClock.elapsedRealtime() - this.f12559w), str, false);
            af0Var.f4479l.c(str2, "error");
            af0Var.f4482o.p(str2, "error");
            vr0 vr0Var = af0Var.f4483p;
            rr0 rr0Var = this.f12560x;
            rr0Var.R(str);
            rr0Var.a(false);
            vr0Var.b(rr0Var.m());
            this.f12561y.b(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            qh.f(parcel);
            l3(readString);
        } else {
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
