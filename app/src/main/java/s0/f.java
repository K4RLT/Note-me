package s0;

import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.measurement.e4;
import r0.e2;

/* loaded from: classes.dex */
public final class f extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f24872c = new i0(0, 2, 1);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ba.r] */
    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        int i;
        e4 e4Var;
        z0.d dVar = (z0.d) iVar.d(1);
        if (dVar != null) {
            i = dVar.f31760a;
        } else {
            i = 0;
        }
        a aVar = (a) iVar.d(0);
        if (i > 0) {
            Object obj = new Object();
            obj.f3163w = cVar;
            obj.f3161u = i;
            cVar = obj;
        }
        if (j0Var != null) {
            e4Var = new e4(19, j0Var, e2Var, false);
        } else {
            e4Var = null;
        }
        aVar.a(cVar, e2Var, hbVar, e4Var);
    }
}