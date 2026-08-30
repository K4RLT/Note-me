package sf;
import x.o;
import q.x;

import b8.l2;

/* loaded from: classes.dex */
public final class r extends ve.i implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public int f25232u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ h f25233v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25234w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l2 f25235x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l2 l2Var, te.c cVar) {
        super(3, cVar);
        this.f25235x = l2Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = new r(this.f25235x, (te.c) obj3);
        rVar.f25233v = (h) obj;
        rVar.f25234w = obj2;
        return rVar.invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r0.e(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r5 == r3) goto L15;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f25232u
            r1 = 2
            r2 = 1
            ue.a r3 = ue.a.f27192u
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            pe.a.e(r5)
            goto L3d
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L17:
            sf.h r0 = r4.f25233v
            pe.a.e(r5)
            goto L31
        L1d:
            pe.a.e(r5)
            sf.h r0 = r4.f25233v
            java.lang.Object r5 = r4.f25234w
            r4.f25233v = r0
            r4.f25232u = r2
            b8.l2 r2 = r4.f25235x
            java.lang.Object r5 = r2.invoke(r5, r4)
            if (r5 != r3) goto L31
            goto L3c
        L31:
            r2 = 0
            r4.f25233v = r2
            r4.f25232u = r1
            java.lang.Object r5 = r0.e(r5, r4)
            if (r5 != r3) goto L3d
        L3c:
            return r3
        L3d:
            pe.z r5 = pe.z.f22715a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
