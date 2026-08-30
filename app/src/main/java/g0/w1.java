package g0;
import b0.j;
import g0.w1;
import j.h;
import q.x;
import r0.a1;
import v.i;
import v.k;
import v.l;

/* loaded from: classes.dex */
public final class w1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17343u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f17344v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f17345w;

    /* renamed from: x, reason: collision with root package name */
    public a1 f17346x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f17347y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17348z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(boolean z3, a1 a1Var, a1 a1Var2, a1 a1Var3, te.c cVar) {
        super(2, cVar);
        this.f17345w = z3;
        this.f17346x = a1Var;
        this.f17347y = a1Var2;
        this.f17348z = a1Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f17343u) {
            case 0:
                return new w1(this.f17347y, this.f17345w, (i) this.f17348z, cVar);
            default:
                return new w1(this.f17345w, this.f17346x, this.f17347y, (a1) this.f17348z, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f17343u) {
            case 0:
                return ((w1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((w1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (pf.j(50, r5) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (pf.j(150, r5) == r1) goto L19;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f17343u
            switch(r0) {
                case 0: goto L60;
                default: goto L5;
            }
        L5:
            a1 r0 = r5.f17346x
            int r1 = r5.f17344v
            a1 r2 = r5.f17347y
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L17
            pe.a.e(r6)
            goto L59
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            goto L5f
        L1e:
            pe.a.e(r6)
            goto L39
        L22:
            pe.a.e(r6)
            boolean r6 = r5.f17345w
            ue.a r1 = ue.a.f27192u
            if (r6 == 0) goto L3f
            x7.h(r0, r4)
            r5.f17344v = r4
            r3 = 50
            java.lang.Object r6 = pf.j(r3, r5)
            if (r6 != r1) goto L39
            goto L57
        L39:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r2.setValue(r6)
            goto L5d
        L3f:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.setValue(r6)
            java.lang.Object r6 = r5.f17348z
            a1 r6 = (a1) r6
            x7.a r2 = x7.a.NONE
            r6.setValue(r2)
            r5.f17344v = r3
            r2 = 150(0x96, double:7.4E-322)
            java.lang.Object r6 = pf.j(r2, r5)
            if (r6 != r1) goto L59
        L57:
            r6 = r1
            goto L5f
        L59:
            r6 = 0
            x7.h(r0, r6)
        L5d:
            pe.z r6 = pe.z.f22715a
        L5f:
            return r6
        L60:
            int r0 = r5.f17344v
            r1 = 1
            if (r0 == 0) goto L74
            if (r0 != r1) goto L6d
            a1 r0 = r5.f17346x
            pe.a.e(r6)
            goto La4
        L6d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            goto Laa
        L74:
            pe.a.e(r6)
            a1 r0 = r5.f17347y
            java.lang.Object r6 = r0.getValue()
            k r6 = (k) r6
            if (r6 == 0) goto La8
            java.lang.Object r2 = r5.f17348z
            i r2 = (i) r2
            boolean r3 = r5.f17345w
            if (r3 == 0) goto L8f
            l r3 = new l
            r3.<init>(r6)
            goto L94
        L8f:
            j r3 = new j
            r3.<init>(r6)
        L94:
            if (r2 == 0) goto La4
            r5.f17346x = r0
            r5.f17344v = r1
            java.lang.Object r6 = r2.a(r3, r5)
            ue.a r1 = ue.a.f27192u
            if (r6 != r1) goto La4
            r6 = r1
            goto Laa
        La4:
            r6 = 0
            r0.setValue(r6)
        La8:
            pe.z r6 = pe.z.f22715a
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(a1 a1Var, boolean z3, i iVar, te.c cVar) {
        super(2, cVar);
        this.f17347y = a1Var;
        this.f17345w = z3;
        this.f17348z = iVar;
    }
}
