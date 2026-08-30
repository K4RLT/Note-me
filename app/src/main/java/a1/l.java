package a1;
import q.j;

import com.google.android.gms.internal.ads.x90;
import java.util.Map;
import k9.z;
import n.i0;
import n.p0;
import r0.o2;
import r0.q1;
import r0.v0;
import r0.y;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: y, reason: collision with root package name */
    public static final x90 f210y = new x90(new i(0), 1, new j(0));

    /* renamed from: u, reason: collision with root package name */
    public final Map f211u;

    /* renamed from: v, reason: collision with root package name */
    public final i0 f212v;

    /* renamed from: w, reason: collision with root package name */
    public o f213w;

    /* renamed from: x, reason: collision with root package name */
    public final f f214x;

    public l(Map map) {
        this.f211u = map;
        long[] jArr = p0.f20923a;
        this.f212v = new i0();
        this.f214x = new f(0, this);
    }

    @Override // a1.e
    public final void a(Object obj, z0.c cVar, r0.m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(533563200);
        if ((i & 6) == 0) {
            if (rVar.h(obj)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.h(cVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i & 384) == 0) {
            if (rVar.h(this)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        int i14 = 0;
        if ((i10 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            rVar.d0(obj);
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                f fVar = this.f214x;
                if (((Boolean) fVar.invoke(obj)).booleanValue()) {
                    Map map = (Map) this.f211u.get(obj);
                    o2 o2Var = q.f219a;
                    r rVar2 = new r(new p(map, fVar));
                    rVar.k0(rVar2);
                    O = rVar2;
                } else {
                    g5.j("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
            }
            r rVar3 = (r) O;
            y.b(new z[]{q.f219a.a(rVar3), n5.a.f21150a.a(rVar3)}, cVar, rVar, (i10 & 112) | 8);
            boolean h3 = rVar.h(this) | rVar.h(obj) | rVar.h(rVar3);
            Object O2 = rVar.O();
            if (h3 || O2 == v0Var) {
                O2 = new g(i14, this, obj, rVar3);
                rVar.k0(O2);
            }
            y.c(pe.z.f22715a, (df.l) O2, rVar);
            if (rVar.f24357y && rVar.G.i == rVar.f24358z) {
                rVar.f24358z = -1;
                rVar.f24357y = false;
            }
            rVar.p(false);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h(this, obj, cVar, i);
        }
    }
}
