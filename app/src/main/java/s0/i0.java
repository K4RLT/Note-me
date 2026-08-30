package s0;
import z.a;

import com.google.android.gms.internal.ads.hb;
import r0.e2;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24880b;

    public /* synthetic */ i0(int i, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? 0 : i10);
    }

    public abstract void a(androidx.datastore.preferences.protobuf.i iVar, r0.c cVar, e2 e2Var, hb hbVar, j0 j0Var);

    public r0.a b(androidx.datastore.preferences.protobuf.i iVar) {
        return null;
    }

    public final String toString() {
        String c10 = kotlin.jvm.internal.a(getClass()).c();
        if (c10 == null) {
            return "";
        }
        return c10;
    }

    public i0(int i, int i10) {
        this.f24879a = i;
        this.f24880b = i10;
    }
}
