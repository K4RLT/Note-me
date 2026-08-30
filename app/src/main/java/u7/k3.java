package u7;
import m3.i;

import android.content.Context;

/* loaded from: classes.dex */
public final class k3 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Context f26401u;

    /* renamed from: v, reason: collision with root package name */
    public String f26402v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f26403w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m3 f26404x;

    /* renamed from: y, reason: collision with root package name */
    public int f26405y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, ve.c cVar) {
        super(cVar);
        this.f26404x = m3Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f26403w = obj;
        this.f26405y |= Integer.MIN_VALUE;
        return i(this.f26404x, null, null, this);
    }
}
