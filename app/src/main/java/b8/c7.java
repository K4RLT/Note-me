package b8;
import b0.j;
import b8.c7;
import k0.j1;

import android.content.Context;

/* loaded from: classes.dex */
public final class c7 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1922u;

    /* renamed from: v, reason: collision with root package name */
    public int f1923v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f1924w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(j1 j1Var, boolean z3, te.c cVar) {
        super(2, cVar);
        this.f1922u = 1;
        this.f1925x = j1Var;
        this.f1924w = z3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1922u) {
            case 0:
                return new c7(this.f1924w, (Context) this.f1925x, cVar, 0);
            case 1:
                return new c7((j1) this.f1925x, this.f1924w, cVar);
            default:
                return new c7(this.f1924w, (q.d) this.f1925x, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1922u) {
            case 0:
                return ((c7) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((c7) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((c7) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r10 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r10 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
    
        if (pf.j(2600, r9) == r5) goto L60;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.c7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(boolean z3, Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f1922u = i;
        this.f1924w = z3;
        this.f1925x = obj;
    }
}
