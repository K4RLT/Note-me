package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hf0 extends ph implements iq {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6803u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6804v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(int i, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f6803u = i;
        this.f6804v = obj;
    }

    @Override // com.google.android.gms.internal.ads.iq
    public final void f2(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f6803u) {
            case 0:
                ((jf0) this.f6804v).b(list);
                return;
            default:
                g9.i2 i2Var = (g9.i2) this.f6804v;
                synchronized (i2Var.f17655d) {
                    i2Var.f17656f = false;
                    i2Var.f17657g = true;
                    arrayList = new ArrayList(i2Var.e);
                    i2Var.e.clear();
                }
                jk0 a10 = g9.i2.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((e7.h) arrayList.get(i)).a(a10);
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(eq.CREATOR);
            qh.f(parcel);
            f2(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
