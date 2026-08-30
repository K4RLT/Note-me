package b8;
import u7.m3;

import android.content.Context;

/* loaded from: classes.dex */
public final class h1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2147u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f2148v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f2149w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i, Context context, te.c cVar, m3 m3Var) {
        super(2, cVar);
        this.f2147u = i;
        this.f2148v = m3Var;
        this.f2149w = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2147u) {
            case 0:
                return new h1(0, this.f2149w, cVar, this.f2148v);
            default:
                return new h1(1, this.f2149w, cVar, this.f2148v);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2147u) {
            case 0:
                return ((h1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((h1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2147u) {
            case 0:
                pe.a.e(obj);
                return this.f2148v.a0(this.f2149w);
            default:
                pe.a.e(obj);
                return this.f2148v.a0(this.f2149w);
        }
    }
}
