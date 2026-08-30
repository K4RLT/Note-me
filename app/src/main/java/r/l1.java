package r;
import p.c0;
import r0.f1;
import r0.g0;
import r0.y;
import t.l;
import v.i;

import com.google.android.gms.internal.ads.x90;
import t.s1;

/* loaded from: classes.dex */
public final class l1 implements s1 {
    public static final x90 i;

    /* renamed from: a, reason: collision with root package name */
    public final f1 f24114a;
    public float e;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f24115b = new f1(0);

    /* renamed from: c, reason: collision with root package name */
    public final i f24116c = new i();

    /* renamed from: d, reason: collision with root package name */
    public final f1 f24117d = new f1(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final l f24118f = new l(new c0(8, this));

    /* renamed from: g, reason: collision with root package name */
    public final g0 f24119g = y.r(new k1(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final g0 f24120h = y.r(new k1(this, 0));

    static {
        k kVar = k.A;
        i = new x90(j1.f24100u, 1, kVar);
    }

    public l1(int i10) {
        this.f24114a = new f1(i10);
    }

    @Override // s1
    public final boolean a() {
        return this.f24118f.a();
    }

    @Override // s1
    public final boolean b() {
        return ((Boolean) this.f24120h.getValue()).booleanValue();
    }

    @Override // s1
    public final boolean c() {
        return ((Boolean) this.f24119g.getValue()).booleanValue();
    }

    @Override // s1
    public final float d(float f10) {
        return this.f24118f.d(f10);
    }

    @Override // s1
    public final Object e(u0 u0Var, df.p pVar, te.c cVar) {
        Object e = this.f24118f.e(u0Var, pVar, cVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
