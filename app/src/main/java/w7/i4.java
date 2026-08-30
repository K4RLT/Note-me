package w7;
import r0.a1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class i4 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.a f28425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f28426c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f28427d;
    public final /* synthetic */ e3 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e3 f28428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e3 f28429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e3 f28430h;
    public final /* synthetic */ e3 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e3 f28431j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e3 f28432k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e3 f28433l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e3 f28434m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f28435n;

    public /* synthetic */ i4(df.a aVar, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, Object obj, int i) {
        this.f28424a = i;
        this.f28425b = aVar;
        this.f28426c = e3Var;
        this.f28427d = e3Var2;
        this.e = e3Var3;
        this.f28428f = e3Var4;
        this.f28429g = e3Var5;
        this.f28430h = e3Var6;
        this.i = e3Var7;
        this.f28431j = e3Var8;
        this.f28432k = e3Var9;
        this.f28433l = e3Var10;
        this.f28434m = e3Var11;
        this.f28435n = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f28424a) {
            case 0:
                a1 a1Var = (a1) this.f28435n;
                df.a aVar = this.f28425b;
                e3 e3Var = this.f28426c;
                e3 e3Var2 = this.f28427d;
                e3 e3Var3 = this.e;
                e3 e3Var4 = this.f28428f;
                e3 e3Var5 = this.f28429g;
                e3 e3Var6 = this.f28430h;
                e3 e3Var7 = this.i;
                e3 e3Var8 = this.f28431j;
                e3 e3Var9 = this.f28432k;
                e3 e3Var10 = this.f28433l;
                e3 e3Var11 = this.f28434m;
                Object e = t.k2.e(wVar, null, new h4(aVar, e3Var, e3Var2, e3Var3, e3Var4, e3Var5, e3Var6, e3Var7, e3Var8, e3Var9, e3Var10, e3Var11, a1Var, 0), null, new h4(aVar, e3Var, e3Var2, e3Var3, e3Var4, e3Var5, e3Var6, e3Var7, e3Var8, e3Var9, a1Var, e3Var11, e3Var10), cVar, 5);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
            default:
                Object e8 = t.k2.e(wVar, null, null, null, new h4(this.f28425b, this.f28426c, this.f28427d, this.e, this.f28428f, this.f28429g, this.f28430h, this.i, this.f28431j, this.f28432k, this.f28433l, this.f28434m, (e3) this.f28435n, 2), cVar, 7);
                if (e8 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e8;
        }
    }
}
