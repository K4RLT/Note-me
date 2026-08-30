package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.iq;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.vr;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e1 extends ph implements f1 {
    public e1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        iq iqVar = null;
        n1 n1Var = null;
        switch (i) {
            case 1:
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                qh.f(parcel);
                x1(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                qh.f(parcel);
                r3(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean a10 = qh.a(parcel);
                qh.f(parcel);
                Z(a10);
                parcel2.writeNoException();
                return true;
            case 5:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                qh.f(parcel);
                M1(v12, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                W1(v13, readString3);
                parcel2.writeNoException();
                return true;
            case 7:
                float i10 = i();
                parcel2.writeNoException();
                parcel2.writeFloat(i10);
                return true;
            case 8:
                boolean h3 = h();
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(h3 ? 1 : 0);
                return true;
            case 9:
                String m4 = m();
                parcel2.writeNoException();
                parcel2.writeString(m4);
                return true;
            case 10:
                String readString4 = parcel.readString();
                qh.f(parcel);
                b2(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                vr v4 = tr.v4(parcel.readStrongBinder());
                qh.f(parcel);
                D2(v4);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    if (queryLocalInterface instanceof iq) {
                        iqVar = (iq) queryLocalInterface;
                    } else {
                        iqVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 0);
                    }
                }
                qh.f(parcel);
                t4(iqVar);
                parcel2.writeNoException();
                return true;
            case 13:
                List j10 = j();
                parcel2.writeNoException();
                parcel2.writeTypedList(j10);
                return true;
            case 14:
                u2 u2Var = (u2) qh.b(parcel, u2.CREATOR);
                qh.f(parcel);
                E3(u2Var);
                parcel2.writeNoException();
                return true;
            case 15:
                A();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (queryLocalInterface2 instanceof n1) {
                        n1Var = (n1) queryLocalInterface2;
                    } else {
                        n1Var = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 0);
                    }
                }
                qh.f(parcel);
                e4(n1Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean a11 = qh.a(parcel);
                qh.f(parcel);
                D0(a11);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                qh.f(parcel);
                T(readString5);
                parcel2.writeNoException();
                return true;
            case 19:
                R1();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
