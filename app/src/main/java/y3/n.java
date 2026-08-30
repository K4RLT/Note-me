package y3;
import x.o;
import l.a;
import q.x;
import z.b;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30839u;

    /* renamed from: v, reason: collision with root package name */
    public int f30840v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f30841w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f30842x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(z zVar, te.c cVar, int i) {
        super(2, cVar);
        this.f30839u = i;
        this.f30842x = zVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f30839u) {
            case 0:
                n nVar = new n(this.f30842x, cVar, 0);
                nVar.f30841w = obj;
                return nVar;
            default:
                n nVar2 = new n(this.f30842x, cVar, 1);
                nVar2.f30841w = obj;
                return nVar2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30839u) {
            case 0:
                return ((n) create((l) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((n) create((sf.h) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (r7 == r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (r7 == r5) goto L41;
     */
    /* JADX WARN: Type inference failed for: r7v18, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f30839u
            switch(r0) {
                case 0: goto L58;
                default: goto L5;
            }
        L5:
            y3.z r0 = r6.f30842x
            sf.n0 r1 = r0.f30905g
            int r2 = r6.f30840v
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L16
            pe.a.e(r7)
            pe.z r7 = pe.z.f22715a
            goto L57
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            goto L57
        L1d:
            pe.a.e(r7)
            java.lang.Object r7 = r6.f30841w
            sf.h r7 = (sf.h) r7
            java.lang.Object r2 = r1.getValue()
            y3.a0 r2 = (y3.a0) r2
            boolean r4 = r2 instanceof y3.c
            if (r4 != 0) goto L38
            j6.i r0 = r0.i
            y3.j r4 = new y3.j
            r4.<init>(r2)
            r0.j(r4)
        L38:
            androidx.lifecycle.q r0 = new androidx.lifecycle.q
            r4 = 0
            r5 = 28
            r0.<init>(r2, r4, r5)
            r6.f30840v = r3
            m7.j r2 = new m7.j
            r3 = 4
            r2.<init>(r7, r3)
            kotlin.jvm.internal.u r7 = new kotlin.jvm.internal.u
            r7.<init>()
            i5.j r3 = new i5.j
            r3.<init>(r7, r2, r0)
            r1.b(r3, r6)
            ue.a r7 = ue.a.f27192u
        L57:
            return r7
        L58:
            int r0 = r6.f30840v
            pe.z r1 = pe.z.f22715a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L70
            if (r0 == r3) goto L64
            if (r0 != r2) goto L69
        L64:
            pe.a.e(r7)
            goto Lcb
        L69:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
        L6e:
            r1 = 0
            goto Lcb
        L70:
            pe.a.e(r7)
            java.lang.Object r7 = r6.f30841w
            y3.l r7 = (y3.l) r7
            boolean r0 = r7 instanceof y3.j
            y3.z r4 = r6.f30842x
            ue.a r5 = ue.a.f27192u
            if (r0 == 0) goto Lbc
            y3.j r7 = (y3.j) r7
            r6.f30840v = r3
            sf.n0 r0 = r4.f30905g
            java.lang.Object r0 = r0.getValue()
            y3.a0 r0 = (y3.a0) r0
            boolean r2 = r0 instanceof y3.c
            if (r2 == 0) goto L90
            goto Lb2
        L90:
            boolean r2 = r0 instanceof y3.h
            if (r2 == 0) goto L9f
            y3.a0 r7 = r7.f30833a
            if (r0 != r7) goto Lb2
            java.lang.Object r7 = r4.f(r6)
            if (r7 != r5) goto Lb2
            goto Lb3
        L9f:
            y3.b0 r7 = y3.b0.f30823a
            boolean r7 = kotlin.jvm.internal.a(r0, r7)
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r4.f(r6)
            if (r7 != r5) goto Lb2
            goto Lb3
        Lae:
            boolean r7 = r0 instanceof y3.g
            if (r7 != 0) goto Lb6
        Lb2:
            r7 = r1
        Lb3:
            if (r7 != r5) goto Lcb
            goto Lca
        Lb6:
            java.lang.String r7 = "Can't read in final state."
            x.o(r7)
            goto L6e
        Lbc:
            boolean r0 = r7 instanceof y3.k
            if (r0 == 0) goto Lcb
            y3.k r7 = (y3.k) r7
            r6.f30840v = r2
            java.lang.Object r7 = y3.b(r4, r7, r6)
            if (r7 != r5) goto Lcb
        Lca:
            r1 = r5
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
