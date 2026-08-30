package m7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public String f20637u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f20638v;

    /* renamed from: w, reason: collision with root package name */
    public int f20639w;

    /* renamed from: x, reason: collision with root package name */
    public int f20640x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f20641y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ j6.n f20642z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20642z = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20641y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f20642z.e(null, this);
    }
}
