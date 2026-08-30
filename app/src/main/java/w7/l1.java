package w7;
import p7.x0;
import p7.y0;

import android.content.Context;

/* loaded from: classes.dex */
public final class l1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28604u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28605v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28606w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28607x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f28608y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f28609z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(float f10, float f11, int i, int i10, kotlin.jvm.internal.y yVar, te.c cVar, u7.m3 m3Var) {
        super(2, cVar);
        this.f28604u = m3Var;
        this.f28605v = i;
        this.f28606w = i10;
        this.f28607x = yVar;
        this.f28608y = f10;
        this.f28609z = f11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new l1(this.f28608y, this.f28609z, this.f28605v, this.f28606w, this.f28607x, cVar, this.f28604u);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        l1 l1Var = (l1) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        l1Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        for (int i = 0; i < 2; i++) {
            x0 x0Var = y0.f22611a;
            y0.g(this.f28604u.s1(this.f28605v, this.f28606w, i, (Context) this.f28607x.f19787u), this.f28608y, this.f28609z);
        }
        return pe.z.f22715a;
    }
}
