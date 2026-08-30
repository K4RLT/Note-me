package m7;

import j7.q;

/* loaded from: classes.dex */
public final class b extends ve.c {
    public final /* synthetic */ j6.n A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public String f20623u;

    /* renamed from: v, reason: collision with root package name */
    public q f20624v;

    /* renamed from: w, reason: collision with root package name */
    public String f20625w;

    /* renamed from: x, reason: collision with root package name */
    public String f20626x;

    /* renamed from: y, reason: collision with root package name */
    public long f20627y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f20628z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.A = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20628z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, this);
    }
}
