package i2;
import c.a;

import y2.k;

/* loaded from: classes.dex */
public final class a extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public Object f18142u;

    /* renamed from: v, reason: collision with root package name */
    public k f18143v;

    /* renamed from: w, reason: collision with root package name */
    public int f18144w;

    /* renamed from: x, reason: collision with root package name */
    public int f18145x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f18146y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f18147z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ve.c cVar2) {
        super(cVar2);
        this.f18147z = cVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18146y = obj;
        this.A |= Integer.MIN_VALUE;
        return c.a(this.f18147z, null, null, this);
    }
}
