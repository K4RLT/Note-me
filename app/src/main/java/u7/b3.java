package u7;
import m3.e;

import android.content.Context;

/* loaded from: classes.dex */
public final class b3 extends ve.c {
    public final /* synthetic */ m3 A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public Context f25944u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f25945v;

    /* renamed from: w, reason: collision with root package name */
    public String f25946w;

    /* renamed from: x, reason: collision with root package name */
    public String f25947x;

    /* renamed from: y, reason: collision with root package name */
    public int f25948y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f25949z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(m3 m3Var, ve.c cVar) {
        super(cVar);
        this.A = m3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25949z = obj;
        this.B |= Integer.MIN_VALUE;
        return e(this.A, null, 0, 0L, null, null, null, null, null, this);
    }
}
