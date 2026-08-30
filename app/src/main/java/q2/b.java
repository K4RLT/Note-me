package q2;

import java.util.List;

/* loaded from: classes.dex */
public final class b extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public List f23324u;

    /* renamed from: v, reason: collision with root package name */
    public z f23325v;

    /* renamed from: w, reason: collision with root package name */
    public int f23326w;

    /* renamed from: x, reason: collision with root package name */
    public int f23327x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f23328y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f23329z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ve.c cVar2) {
        super(cVar2);
        this.f23329z = cVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f23328y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f23329z.a(this);
    }
}
