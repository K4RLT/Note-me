package tf;
import l.a;

import m2.a0;
import pe.z;
import pf.b0;

/* loaded from: classes.dex */
public final class s extends ve.c implements sf.h {

    /* renamed from: u, reason: collision with root package name */
    public final sf.h f25749u;

    /* renamed from: v, reason: collision with root package name */
    public final te.g f25750v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25751w;

    /* renamed from: x, reason: collision with root package name */
    public te.g f25752x;

    /* renamed from: y, reason: collision with root package name */
    public te.c f25753y;

    public s(sf.h hVar, te.g gVar) {
        super(q.f25747u, te.h.f25707u);
        this.f25749u = hVar;
        this.f25750v = gVar;
        this.f25751w = ((Number) gVar.H(new a0(27), 0)).intValue();
    }

    @Override // sf.h
    public final Object e(Object obj, te.c cVar) {
        try {
            Object j10 = j(cVar, obj);
            if (j10 == ue.a.f27192u) {
                return j10;
            }
            return z.f22715a;
        } catch (Throwable th) {
            this.f25752x = new o(th, cVar.getContext());
            throw th;
        }
    }

    @Override // ve.a, ve.d
    public final ve.d getCallerFrame() {
        te.c cVar = this.f25753y;
        if (cVar instanceof ve.d) {
            return (ve.d) cVar;
        }
        return null;
    }

    @Override // ve.c, te.c
    public final te.g getContext() {
        te.g gVar = this.f25752x;
        if (gVar == null) {
            return te.h.f25707u;
        }
        return gVar;
    }

    @Override // ve.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = pe.a(obj);
        if (a10 != null) {
            this.f25752x = new o(a10, getContext());
        }
        te.c cVar = this.f25753y;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return ue.a.f27192u;
    }

    public final Object j(te.c cVar, Object obj) {
        te.g context = cVar.getContext();
        b0.k(context);
        te.g gVar = this.f25752x;
        if (gVar != context) {
            if (!(gVar instanceof o)) {
                if (((Number) context.H(new a1.a(12, this), 0)).intValue() == this.f25751w) {
                    this.f25752x = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f25750v + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(mf.g.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o) gVar).f25746v + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f25753y = cVar;
        df.q qVar = u.f25755a;
        sf.h hVar = this.f25749u;
        hVar.getClass();
        Object b10 = qVar.b(hVar, obj, this);
        if (!kotlin.jvm.internal.a(b10, ue.a.f27192u)) {
            this.f25753y = null;
        }
        return b10;
    }
}
