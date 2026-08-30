package sf;
import b0.j;
import q.x;

/* loaded from: classes.dex */
public final class j0 extends ve.i implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public int f25187u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ h f25188v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ int f25189w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k0 f25190x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, te.c cVar) {
        super(3, cVar);
        this.f25190x = k0Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        j0 j0Var = new j0(this.f25190x, (te.c) obj3);
        j0Var.f25188v = (h) obj;
        j0Var.f25189w = intValue;
        return j0Var.invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (r0.e(sf.g0.f25173w, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (pf.j(Long.MAX_VALUE, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.e(sf.g0.f25172v, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.e(sf.g0.f25171u, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (pf.j(0, r7) == r6) goto L32;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f25187u
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r0 == 0) goto L33
            if (r0 == r5) goto L2f
            if (r0 == r4) goto L29
            if (r0 == r3) goto L23
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L16
            goto L2f
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L1d:
            sf.h r0 = r7.f25188v
            pe.a.e(r8)
            goto L71
        L23:
            sf.h r0 = r7.f25188v
            pe.a.e(r8)
            goto L61
        L29:
            sf.h r0 = r7.f25188v
            pe.a.e(r8)
            goto L54
        L2f:
            pe.a.e(r8)
            goto L7f
        L33:
            pe.a.e(r8)
            sf.h r0 = r7.f25188v
            int r8 = r7.f25189w
            if (r8 <= 0) goto L47
            r7.f25187u = r5
            sf.g0 r8 = sf.g0.f25171u
            java.lang.Object r8 = r0.e(r8, r7)
            if (r8 != r6) goto L7f
            goto L7e
        L47:
            r7.f25188v = r0
            r7.f25187u = r4
            r4 = 0
            java.lang.Object r8 = pf.j(r4, r7)
            if (r8 != r6) goto L54
            goto L7e
        L54:
            r7.f25188v = r0
            r7.f25187u = r3
            sf.g0 r8 = sf.g0.f25172v
            java.lang.Object r8 = r0.e(r8, r7)
            if (r8 != r6) goto L61
            goto L7e
        L61:
            r7.f25188v = r0
            r7.f25187u = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = pf.j(r2, r7)
            if (r8 != r6) goto L71
            goto L7e
        L71:
            r8 = 0
            r7.f25188v = r8
            r7.f25187u = r1
            sf.g0 r8 = sf.g0.f25173w
            java.lang.Object r8 = r0.e(r8, r7)
            if (r8 != r6) goto L7f
        L7e:
            return r6
        L7f:
            pe.z r8 = pe.z.f22715a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
