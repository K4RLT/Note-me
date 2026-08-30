package eb;
import f0.a;
import f0.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends oh implements d0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 1);
    }

    @Override // eb.d0
    public final void G1(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 20);
    }

    @Override // eb.d0
    public final void I0(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 4);
    }

    @Override // eb.d0
    public final List J1(String str, String str2, o3 o3Var) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        Parcel t12 = t1(g02, 16);
        ArrayList createTypedArrayList = t12.createTypedArrayList(d.CREATOR);
        t12.recycle();
        return createTypedArrayList;
    }

    @Override // eb.d0
    public final void J2(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 6);
    }

    @Override // eb.d0
    public final g K3(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        Parcel t12 = t1(g02, 21);
        g gVar = (g) com.google.android.gms.internal.measurement.a(t12, g.CREATOR);
        t12.recycle();
        return gVar;
    }

    @Override // eb.d0
    public final void a4(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 25);
    }

    @Override // eb.d0
    public final void b1(d dVar, o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, dVar);
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 12);
    }

    @Override // eb.d0
    public final byte[] c1(u uVar, String str) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, uVar);
        g02.writeString(str);
        Parcel t12 = t1(g02, 9);
        byte[] createByteArray = t12.createByteArray();
        t12.recycle();
        return createByteArray;
    }

    @Override // eb.d0
    public final List d2(String str, String str2, boolean z3, o3 o3Var) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.f0.f13745a;
        g02.writeInt(z3 ? 1 : 0);
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        Parcel t12 = t1(g02, 14);
        ArrayList createTypedArrayList = t12.createTypedArrayList(k3.CREATOR);
        t12.recycle();
        return createTypedArrayList;
    }

    @Override // eb.d0
    public final List h1(String str, String str2, String str3, boolean z3) {
        Parcel g02 = g0();
        g02.writeString(null);
        g02.writeString(str2);
        g02.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.f0.f13745a;
        g02.writeInt(z3 ? 1 : 0);
        Parcel t12 = t1(g02, 15);
        ArrayList createTypedArrayList = t12.createTypedArrayList(k3.CREATOR);
        t12.recycle();
        return createTypedArrayList;
    }

    @Override // eb.d0
    public final void j2(long j10, String str, String str2, String str3) {
        Parcel g02 = g0();
        g02.writeLong(j10);
        g02.writeString(str);
        g02.writeString(str2);
        g02.writeString(str3);
        z1(g02, 10);
    }

    @Override // eb.d0
    public final void k3(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 26);
    }

    @Override // eb.d0
    public final List l2(String str, String str2, String str3) {
        Parcel g02 = g0();
        g02.writeString(null);
        g02.writeString(str2);
        g02.writeString(str3);
        Parcel t12 = t1(g02, 17);
        ArrayList createTypedArrayList = t12.createTypedArrayList(d.CREATOR);
        t12.recycle();
        return createTypedArrayList;
    }

    @Override // eb.d0
    public final List q0(Bundle bundle, o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        com.google.android.gms.internal.measurement.c(g02, bundle);
        Parcel t12 = t1(g02, 24);
        ArrayList createTypedArrayList = t12.createTypedArrayList(b3.CREATOR);
        t12.recycle();
        return createTypedArrayList;
    }

    @Override // eb.d0
    public final String r1(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        Parcel t12 = t1(g02, 11);
        String readString = t12.readString();
        t12.recycle();
        return readString;
    }

    @Override // eb.d0
    public final void r2(o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 18);
    }

    @Override // eb.d0
    public final void v0(k3 k3Var, o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, k3Var);
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 2);
    }

    @Override // eb.d0
    public final void w1(u uVar, o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, uVar);
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 1);
    }

    @Override // eb.d0
    /* renamed from: q0 */
    public final void mo226q0(Bundle bundle, o3 o3Var) {
        Parcel g02 = g0();
        com.google.android.gms.internal.measurement.c(g02, bundle);
        com.google.android.gms.internal.measurement.c(g02, o3Var);
        z1(g02, 19);
    }
}
