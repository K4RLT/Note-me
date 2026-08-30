package ue;

import df.p;
import kotlin.jvm.internal.b0;
import q.x;
import ve.g;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: u, reason: collision with root package name */
    public int f27196u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f27197v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ te.c f27198w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, te.c cVar, te.c cVar2) {
        super(cVar);
        this.f27197v = pVar;
        this.f27198w = cVar2;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f27196u;
        if (i != 0) {
            if (i == 1) {
                this.f27196u = 2;
                pe.a.e(obj);
                return obj;
            }
            x.o("This coroutine had already completed");
            return null;
        }
        this.f27196u = 1;
        pe.a.e(obj);
        p pVar = this.f27197v;
        pVar.getClass();
        b0.b(2, pVar);
        return pVar.invoke(this.f27198w, this);
    }
}
