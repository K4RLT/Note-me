package ya;
import oa.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class vf extends oh {
    public final ag u4(b bVar, sf sfVar) {
        ag createFromParcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9121w);
        int i = s.f31486a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        sfVar.writeToParcel(obtain, 0);
        Parcel v12 = v1(obtain, 3);
        Parcelable.Creator<ag> creator = ag.CREATOR;
        if (v12.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(v12);
        }
        ag agVar = createFromParcel;
        v12.recycle();
        return agVar;
    }
}
