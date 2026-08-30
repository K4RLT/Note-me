package pb;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class e extends oh implements g {
    public final void u4(String str, String str2, String str3, Bundle bundle, qb.c cVar) {
        Parcel o12 = o1();
        o12.writeString(str);
        o12.writeString(str2);
        o12.writeString(str3);
        int i = za.a.f32013a;
        o12.writeInt(1);
        bundle.writeToParcel(o12, 0);
        if (cVar == null) {
            o12.writeStrongBinder(null);
        } else {
            o12.writeStrongBinder(cVar);
        }
        z1(o12, 2);
    }
}
