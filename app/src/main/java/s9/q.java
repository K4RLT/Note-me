package s9;
import u.c;

import android.util.Pair;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.fe0;
import ya.zb;

/* loaded from: classes.dex */
public final class q extends v9.a {

    /* renamed from: a, reason: collision with root package name */
    public final p f25099a;

    /* renamed from: b, reason: collision with root package name */
    public final fe0 f25100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25102d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f25103f;

    public q(p pVar, boolean z3, int i, Boolean bool, fe0 fe0Var) {
        this.f25099a = pVar;
        this.f25101c = z3;
        this.f25102d = i;
        this.f25103f = bool;
        this.f25100b = fe0Var;
        f9.k.C.f16819k.getClass();
        this.e = System.currentTimeMillis();
    }

    @Override // v9.a
    public final void a(String str) {
        String str2;
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        f9.k kVar = f9.k.C;
        kVar.f16819k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        int i = this.f25102d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f25103f));
        boolean z3 = this.f25101c;
        if (true != z3) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        zb.d(this.f25100b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", str2));
        kVar.f16819k.getClass();
        this.f25099a.b(z3, new r(null, str, ((Long) bn.f4842h.p()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // v9.a
    public final void b(c cVar) {
        String str;
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        f9.k kVar = f9.k.C;
        kVar.f16819k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        int i = this.f25102d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f25103f));
        boolean z3 = this.f25101c;
        if (true != z3) {
            str = "0";
        } else {
            str = "1";
        }
        zb.d(this.f25100b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", str));
        kVar.f16819k.getClass();
        this.f25099a.b(z3, new r(cVar, "", ((Long) bn.f4842h.p()).longValue() + System.currentTimeMillis(), i));
    }
}
