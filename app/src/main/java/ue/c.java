package ue;

import df.p;
import kotlin.jvm.internal.b0;
import q.x;
import te.g;

/* loaded from: classes.dex */
public final class c extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int f27199u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f27200v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ te.c f27201w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(te.c cVar, g gVar, p pVar, te.c cVar2) {
        super(cVar, gVar);
        this.f27200v = pVar;
        this.f27201w = cVar2;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f27199u;
        if (i != 0) {
            if (i == 1) {
                this.f27199u = 2;
                pe.a.e(obj);
                return obj;
            }
            x.o("This coroutine had already completed");
            return null;
        }
        this.f27199u = 1;
        pe.a.e(obj);
        p pVar = this.f27200v;
        pVar.getClass();
        b0.b(2, pVar);
        return pVar.invoke(this.f27201w, this);
    }
}
