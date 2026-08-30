package ca;
import g.b;
import q.f;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import fa.y;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends com.google.android.gms.internal.play_billing.d implements IInterface {

    /* renamed from: v, reason: collision with root package name */
    public final int f4049v;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        boolean z3;
        if (bArr.length == 25) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.b(z3);
        this.f4049v = Arrays.hashCode(bArr);
    }

    public static byte[] T1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            g5.f(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        oa.a z12;
        if (obj instanceof m) {
            try {
                m mVar = (m) obj;
                if (mVar.f4049v == this.f4049v && (z12 = mVar.z1()) != null) {
                    return Arrays.equals(v1(), (byte[]) oa.b.z1(z12));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4049v;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean o1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f4049v);
            return true;
        }
        oa.a z12 = z1();
        parcel2.writeNoException();
        ua.b(parcel2, z12);
        return true;
    }

    public abstract byte[] v1();

    public final oa.a z1() {
        return new oa.b(v1());
    }
}
