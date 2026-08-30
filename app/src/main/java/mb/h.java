package mb;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends oh implements j {
    @Override // mb.j
    public final void A2(String str, Bundle bundle, Bundle bundle2, lb.j jVar) {
        Parcel R = R();
        R.writeString(str);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeInt(1);
        bundle2.writeToParcel(R, 0);
        R.writeStrongBinder(jVar);
        r0(R, 13);
    }

    @Override // mb.j
    public final void D3(String str, Bundle bundle, Bundle bundle2, lb.j jVar) {
        Parcel R = R();
        R.writeString(str);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeInt(1);
        bundle2.writeToParcel(R, 0);
        R.writeStrongBinder(jVar);
        r0(R, 6);
    }

    @Override // mb.j
    public final void I2(String str, Bundle bundle, Bundle bundle2, lb.j jVar) {
        Parcel R = R();
        R.writeString(str);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeInt(1);
        bundle2.writeToParcel(R, 0);
        R.writeStrongBinder(jVar);
        r0(R, 9);
    }

    @Override // mb.j
    public final void N1(String str, ArrayList arrayList, Bundle bundle, lb.j jVar) {
        Parcel R = R();
        R.writeString(str);
        R.writeTypedList(arrayList);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeStrongBinder(jVar);
        r0(R, 14);
    }

    @Override // mb.j
    public final void O1(String str, Bundle bundle, lb.k kVar) {
        Parcel R = R();
        R.writeString(str);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeStrongBinder(kVar);
        r0(R, 10);
    }

    @Override // mb.j
    public final void T0(String str, Bundle bundle, Bundle bundle2, lb.l lVar) {
        Parcel R = R();
        R.writeString(str);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeInt(1);
        bundle2.writeToParcel(R, 0);
        R.writeStrongBinder(lVar);
        r0(R, 7);
    }

    @Override // mb.j
    public final void Z0(String str, Bundle bundle, lb.k kVar) {
        Parcel R = R();
        R.writeString(str);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeStrongBinder(kVar);
        r0(R, 5);
    }

    @Override // mb.j
    public final void g1(String str, ArrayList arrayList, Bundle bundle, lb.n nVar) {
        Parcel R = R();
        R.writeString(str);
        R.writeTypedList(arrayList);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeStrongBinder(nVar);
        r0(R, 2);
    }

    @Override // mb.j
    public final void i1(String str, Bundle bundle, Bundle bundle2, lb.j jVar) {
        Parcel R = R();
        R.writeString(str);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeInt(1);
        bundle2.writeToParcel(R, 0);
        R.writeStrongBinder(jVar);
        r0(R, 11);
    }

    @Override // mb.j
    public final void o2(String str, ArrayList arrayList, Bundle bundle, lb.m mVar) {
        Parcel R = R();
        R.writeString(str);
        R.writeTypedList(arrayList);
        int i = g.f20774a;
        R.writeInt(1);
        bundle.writeToParcel(R, 0);
        R.writeStrongBinder(mVar);
        r0(R, 12);
    }
}
