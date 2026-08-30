package u7;
import q.d;
import q.e;
import q.k1;
import q.t;
import q.x;
import q.y;
import r2.g;
import u7.o1;

/* loaded from: classes.dex */
public final class k1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f26395u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f26396v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f26397w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f26398x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(boolean z3, o1 o1Var, float f10, te.c cVar) {
        super(2, cVar);
        this.f26396v = z3;
        this.f26397w = o1Var;
        this.f26398x = f10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new k1(this.f26396v, this.f26397w, this.f26398x, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (g(r3, r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (d.c(r1, r3, r7, r6) == r0) goto L16;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f26395u
            r1 = 1
            r2 = 2
            if (r0 == 0) goto L15
            if (r0 == r1) goto La
            if (r0 != r2) goto Le
        La:
            pe.a.e(r7)
            goto L4b
        Le:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L15:
            pe.a.e(r7)
            float r7 = r6.f26398x
            ue.a r0 = ue.a.f27192u
            boolean r3 = r6.f26396v
            o1 r4 = r6.f26397w
            if (r3 == 0) goto L32
            d r2 = r4.f26648b
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r7)
            r6.f26395u = r1
            java.lang.Object r7 = g(r3, r6)
            if (r7 != r0) goto L4b
            goto L4a
        L32:
            d r1 = r4.f26648b
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r7)
            r7 = 0
            t r4 = y.f23031a
            r5 = 400(0x190, float:5.6E-43)
            q.k1 r7 = e.s(r5, r7, r4, r2)
            r6.f26395u = r2
            java.lang.Object r7 = d.c(r1, r3, r7, r6)
            if (r7 != r0) goto L4b
        L4a:
            return r0
        L4b:
            pe.z r7 = pe.z.f22715a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
