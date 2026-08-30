package z;

import r.u0;

/* loaded from: classes.dex */
public final class l extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public m f31721u;

    /* renamed from: v, reason: collision with root package name */
    public u0 f31722v;

    /* renamed from: w, reason: collision with root package name */
    public ve.i f31723w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f31724x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f31725y;

    /* renamed from: z, reason: collision with root package name */
    public int f31726z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, te.c cVar) {
        super(cVar);
        this.f31725y = mVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f31724x = obj;
        this.f31726z |= Integer.MIN_VALUE;
        return this.f31725y.e(null, null, this);
    }
}
