package m7;

import java.util.List;

/* loaded from: classes.dex */
public final class m extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public List f20666u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f20667v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j6.n f20668w;

    /* renamed from: x, reason: collision with root package name */
    public int f20669x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j6.n nVar, ve.c cVar) {
        super(cVar);
        this.f20668w = nVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20667v = obj;
        this.f20669x |= Integer.MIN_VALUE;
        return this.f20668w.n(null, this);
    }
}
