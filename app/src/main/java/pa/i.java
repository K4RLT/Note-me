package pa;
import g.b;

import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class i extends oh {
    public final oa.a u4(oa.b bVar, String str, int i) {
        Parcel o12 = o1();
        ua.b(o12, bVar);
        o12.writeString(str);
        o12.writeInt(i);
        return g3.a.q(R0(o12, 2));
    }

    public final oa.a v4(oa.b bVar, String str, int i) {
        Parcel o12 = o1();
        ua.b(o12, bVar);
        o12.writeString(str);
        o12.writeInt(i);
        return g3.a.q(R0(o12, 4));
    }

    public final oa.a w4(oa.b bVar, String str, int i, oa.b bVar2) {
        Parcel o12 = o1();
        ua.b(o12, bVar);
        o12.writeString(str);
        o12.writeInt(i);
        ua.b(o12, bVar2);
        return g3.a.q(R0(o12, 8));
    }
}
