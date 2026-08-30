package u7;

import java.util.List;

/* loaded from: classes.dex */
public final class h3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int f26272u;

    /* renamed from: v, reason: collision with root package name */
    public String f26273v;

    /* renamed from: w, reason: collision with root package name */
    public List f26274w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f26275x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m3 f26276y;

    /* renamed from: z, reason: collision with root package name */
    public int f26277z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(m3 m3Var, ve.c cVar) {
        super(cVar);
        this.f26276y = m3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26275x = obj;
        this.f26277z |= Integer.MIN_VALUE;
        return this.f26276y.r0(0, null, this);
    }
}
