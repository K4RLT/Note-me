package eb;
import n.b;
import n.e;
import n.r0;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final e f16316w;

    /* renamed from: x, reason: collision with root package name */
    public final e f16317x;

    /* renamed from: y, reason: collision with root package name */
    public long f16318y;

    /* JADX WARN: Type inference failed for: r2v1, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [e, r0] */
    public q(d1 d1Var) {
        super(d1Var);
        this.f16317x = new r0(0);
        this.f16316w = new r0(0);
    }

    public final void A(long j10, String str) {
        if (str != null && str.length() != 0) {
            h().D(new b(this, str, j10, 0));
        } else {
            f().A.g("Ad unit id must be a non-empty string");
        }
    }

    public final void B(String str, long j10, k2 k2Var) {
        if (k2Var == null) {
            f().I.g("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            f().I.f(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        l3.Y(k2Var, bundle, true);
        v().c0("am", bundle, "_xu");
    }

    public final void C(long j10) {
        e eVar = this.f16316w;
        Iterator it = ((b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j10));
        }
        if (!eVar.isEmpty()) {
            this.f16318y = j10;
        }
    }

    public final void D(long j10, String str) {
        if (str != null && str.length() != 0) {
            h().D(new b(this, str, j10, 1));
        } else {
            f().A.g("Ad unit id must be a non-empty string");
        }
    }

    public final void y(long j10) {
        k2 B = w().B(false);
        e eVar = this.f16316w;
        Iterator it = ((b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            B(str, j10 - ((Long) eVar.get(str)).longValue(), B);
        }
        if (!eVar.isEmpty()) {
            z(j10 - this.f16318y, B);
        }
        C(j10);
    }

    public final void z(long j10, k2 k2Var) {
        if (k2Var == null) {
            f().I.g("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            f().I.f(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        l3.Y(k2Var, bundle, true);
        v().c0("am", bundle, "_xa");
    }
}
