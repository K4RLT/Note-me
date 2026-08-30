package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.vi;

/* loaded from: classes.dex */
public final class i0 extends oh implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 0);
    }

    @Override // g9.k0
    public final v1 A() {
        v1 u1Var;
        Parcel u22 = u2(g2(), 41);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            u1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof v1) {
                u1Var = (v1) queryLocalInterface;
            } else {
                u1Var = new u1(readStrongBinder);
            }
        }
        u22.recycle();
        return u1Var;
    }

    @Override // g9.k0
    public final void B0(long j10) {
        Parcel g22 = g2();
        g22.writeLong(j10);
        v2(g22, 48);
    }

    @Override // g9.k0
    public final void F1(q1 q1Var) {
        Parcel g22 = g2();
        qh.e(g22, q1Var);
        v2(g22, 42);
    }

    @Override // g9.k0
    public final void G2(boolean z3) {
        Parcel g22 = g2();
        ClassLoader classLoader = qh.f9846a;
        g22.writeInt(z3 ? 1 : 0);
        v2(g22, 22);
    }

    @Override // g9.k0
    public final void G3(x xVar) {
        Parcel g22 = g2();
        qh.e(g22, xVar);
        v2(g22, 7);
    }

    @Override // g9.k0
    public final String M() {
        Parcel u22 = u2(g2(), 31);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // g9.k0
    public final void O0(u0 u0Var) {
        Parcel g22 = g2();
        qh.e(g22, u0Var);
        v2(g22, 8);
    }

    @Override // g9.k0
    public final void P0(z2 z2Var, a0 a0Var) {
        Parcel g22 = g2();
        qh.c(g22, z2Var);
        qh.e(g22, a0Var);
        v2(g22, 43);
    }

    @Override // g9.k0
    public final z1 U() {
        z1 w1Var;
        Parcel u22 = u2(g2(), 26);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            w1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof z1) {
                w1Var = (z1) queryLocalInterface;
            } else {
                w1Var = new w1(readStrongBinder);
            }
        }
        u22.recycle();
        return w1Var;
    }

    @Override // g9.k0
    public final void a() {
        v2(g2(), 5);
    }

    @Override // g9.k0
    public final void b() {
        v2(g2(), 6);
    }

    @Override // g9.k0
    public final void d3(w2 w2Var) {
        Parcel g22 = g2();
        qh.c(g22, w2Var);
        v2(g22, 29);
    }

    @Override // g9.k0
    public final long i0() {
        Parcel u22 = u2(g2(), 47);
        long readLong = u22.readLong();
        u22.recycle();
        return readLong;
    }

    @Override // g9.k0
    public final c3 m() {
        Parcel u22 = u2(g2(), 12);
        c3 c3Var = (c3) qh.b(u22, c3.CREATOR);
        u22.recycle();
        return c3Var;
    }

    @Override // g9.k0
    public final boolean n1(z2 z2Var) {
        boolean z3;
        Parcel g22 = g2();
        qh.c(g22, z2Var);
        Parcel u22 = u2(g22, 4);
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // g9.k0
    public final void p2(u uVar) {
        Parcel g22 = g2();
        qh.e(g22, uVar);
        v2(g22, 20);
    }

    @Override // g9.k0
    public final void q2(c3 c3Var) {
        Parcel g22 = g2();
        qh.c(g22, c3Var);
        v2(g22, 13);
    }

    @Override // g9.k0
    public final void q4(vi viVar) {
        Parcel g22 = g2();
        qh.e(g22, viVar);
        v2(g22, 40);
    }

    @Override // g9.k0
    public final void r4(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 44);
    }

    @Override // g9.k0
    public final void t0(boolean z3) {
        Parcel g22 = g2();
        ClassLoader classLoader = qh.f9846a;
        g22.writeInt(z3 ? 1 : 0);
        v2(g22, 34);
    }

    @Override // g9.k0
    public final void y() {
        v2(g2(), 2);
    }

    @Override // g9.k0
    public final void z3(z0 z0Var) {
        Parcel g22 = g2();
        qh.e(g22, z0Var);
        v2(g22, 45);
    }

    @Override // g9.k0
    public final oa.a zza() {
        return g3.a.q(u2(g2(), 1));
    }
}
