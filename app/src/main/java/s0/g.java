package s0;

import com.google.android.gms.internal.ads.hb;
import java.util.List;
import r0.e2;

/* loaded from: classes.dex */
public final class g extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f24874c = new i0(0, 2, 1);

    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        int i = ((z0.d) iVar.d(0)).f31760a;
        List list = (List) iVar.d(1);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            int i11 = i + i10;
            cVar.d(i11, obj);
            cVar.n(i11, obj);
        }
    }
}
