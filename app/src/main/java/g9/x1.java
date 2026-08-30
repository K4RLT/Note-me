package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public abstract class x1 extends ph implements z1 {
    public x1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static z1 v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof z1) {
            return (z1) queryLocalInterface;
        }
        return new w1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        a2 a2Var;
        switch (i) {
            case 1:
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean a10 = qh.a(parcel);
                qh.f(parcel);
                p0(a10);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean d2 = d();
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(d2 ? 1 : 0);
                return true;
            case 5:
                int g8 = g();
                parcel2.writeNoException();
                parcel2.writeInt(g8);
                return true;
            case 6:
                float f10 = f();
                parcel2.writeNoException();
                parcel2.writeFloat(f10);
                return true;
            case 7:
                float i10 = i();
                parcel2.writeNoException();
                parcel2.writeFloat(i10);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    a2Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof a2) {
                        a2Var = (a2) queryLocalInterface;
                    } else {
                        a2Var = new a2(readStrongBinder);
                    }
                }
                qh.f(parcel);
                u0(a2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float m4 = m();
                parcel2.writeNoException();
                parcel2.writeFloat(m4);
                return true;
            case 10:
                boolean n10 = n();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qh.f9846a;
                parcel2.writeInt(n10 ? 1 : 0);
                return true;
            case 11:
                a2 p10 = p();
                parcel2.writeNoException();
                qh.e(parcel2, p10);
                return true;
            case 12:
                boolean q10 = q();
                parcel2.writeNoException();
                ClassLoader classLoader3 = qh.f9846a;
                parcel2.writeInt(q10 ? 1 : 0);
                return true;
            case 13:
                j();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
