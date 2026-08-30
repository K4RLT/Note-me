package s0;
import s.c;

import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.measurement.e4;
import r0.b2;
import r0.e2;

/* loaded from: classes.dex */
public final class t extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f24899c = new i0(0, 3, 1);

    @Override // s0.i0
    public final void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var) {
        e4 e4Var;
        b2 b2Var = (b2) iVar.d(1);
        r0.a aVar = (r0.a) iVar.d(0);
        c cVar2 = (c) iVar.d(2);
        e2 k3 = b2Var.k();
        if (j0Var != null) {
            try {
                e4Var = new e4(19, j0Var, e2Var, false);
            } catch (Throwable th) {
                k3.e(false);
                throw th;
            }
        } else {
            e4Var = null;
        }
        if (!cVar2.f24866b.c()) {
            r0.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.f24865a.b(cVar, k3, hbVar, e4Var);
        k3.e(true);
        e2Var.d();
        aVar.getClass();
        e2Var.z(b2Var, b2Var.a(aVar));
        e2Var.k();
    }
}
