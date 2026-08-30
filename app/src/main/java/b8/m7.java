package b8;
import b0.j;
import b8.m7;
import b8.s7;
import c2.w0;

/* loaded from: classes.dex */
public final class m7 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2422u;

    /* renamed from: v, reason: collision with root package name */
    public int f2423v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f2422u = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2422u) {
            case 0:
                return new m7(2, cVar, 0);
            case 1:
                return new m7(2, cVar, 1);
            case 2:
                return new m7(2, cVar, 2);
            case 3:
                return new m7(2, cVar, 3);
            default:
                m7 m7Var = new m7(2, cVar, 4);
                m7Var.f2423v = ((Number) obj).intValue();
                return m7Var;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2422u) {
            case 0:
                return ((m7) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((m7) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((m7) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((m7) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((m7) create(Integer.valueOf(((Number) obj).intValue()), (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x009c, code lost:
    
        if (s7.a(r7) == r6) goto L49;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f2422u
            r1 = 2
            pe.z r2 = pe.z.f22715a
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 0
            r5 = 1
            ue.a r6 = ue.a.f27192u
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L5e;
                case 2: goto L40;
                case 3: goto L1c;
                default: goto Le;
            }
        Le:
            pe.a.e(r8)
            int r8 = r7.f2423v
            if (r8 <= 0) goto L16
            goto L17
        L16:
            r5 = 0
        L17:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        L1c:
            int r0 = r7.f2423v
            if (r0 == 0) goto L2b
            if (r0 != r5) goto L26
            pe.a.e(r8)
            goto L3f
        L26:
            q.x.o(r3)
            r2 = r4
            goto L3f
        L2b:
            pe.a.e(r8)
            wf.e r8 = pf.l0.f22767a
            w0 r0 = new w0
            r3 = 4
            r0.<init>(r1, r4, r3)
            r7.f2423v = r5
            java.lang.Object r8 = pf.b0.J(r8, r0, r7)
            if (r8 != r6) goto L3f
            r2 = r6
        L3f:
            return r2
        L40:
            int r0 = r7.f2423v
            if (r0 == 0) goto L4f
            if (r0 != r5) goto L4a
            pe.a.e(r8)
            goto L5d
        L4a:
            q.x.o(r3)
            r2 = r4
            goto L5d
        L4f:
            pe.a.e(r8)
            r7.f2423v = r5
            r0 = 1
            java.lang.Object r8 = pf.j(r0, r7)
            if (r8 != r6) goto L5d
            r2 = r6
        L5d:
            return r2
        L5e:
            int r0 = r7.f2423v
            if (r0 == 0) goto L6d
            if (r0 != r5) goto L68
            pe.a.e(r8)
            goto L7b
        L68:
            q.x.o(r3)
            r2 = r4
            goto L7b
        L6d:
            pe.a.e(r8)
            s7 r8 = s7.f2719a
            r7.f2423v = r5
            java.lang.Object r8 = s7.b(r7)
            if (r8 != r6) goto L7b
            r2 = r6
        L7b:
            return r2
        L7c:
            int r0 = r7.f2423v
            if (r0 == 0) goto L91
            if (r0 == r5) goto L8d
            if (r0 != r1) goto L88
            pe.a.e(r8)
            goto Laa
        L88:
            q.x.o(r3)
            r2 = r4
            goto Laa
        L8d:
            pe.a.e(r8)
            goto L9f
        L91:
            pe.a.e(r8)
            s7 r8 = s7.f2719a
            r7.f2423v = r5
            java.lang.Object r8 = s7.a(r7)
            if (r8 != r6) goto L9f
            goto La9
        L9f:
            s7 r8 = s7.f2719a
            r7.f2423v = r1
            java.lang.Object r8 = s7.b(r7)
            if (r8 != r6) goto Laa
        La9:
            r2 = r6
        Laa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.m7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
