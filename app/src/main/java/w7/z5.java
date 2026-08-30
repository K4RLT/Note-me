package w7;
import k1.f;
import r0.a1;
import w7.n4;
import w7.z5;
import x.o;

import android.content.Context;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class z5 extends ve.i implements df.p {
    public final /* synthetic */ a1 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29536u;

    /* renamed from: v, reason: collision with root package name */
    public a1 f29537v;

    /* renamed from: w, reason: collision with root package name */
    public int f29538w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b1.v f29539x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f29540y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ LruCache f29541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(b1.v vVar, Context context, LruCache lruCache, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f29536u = i;
        this.f29539x = vVar;
        this.f29540y = context;
        this.f29541z = lruCache;
        this.A = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f29536u) {
            case 0:
                return new z5(this.f29539x, this.f29540y, this.f29541z, this.A, cVar, 0);
            default:
                return new z5(this.f29539x, this.f29540y, this.f29541z, this.A, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f29536u) {
            case 0:
                return ((z5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((z5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r12 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r12 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if (r12 == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r12 == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [f] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f29536u
            pe.z r1 = pe.z.f22715a
            android.util.LruCache r2 = r11.f29541z
            a1 r3 = r11.A
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            ue.a r5 = ue.a.f27192u
            r6 = 1
            r7 = 2
            android.content.Context r8 = r11.f29540y
            b1.v r9 = r11.f29539x
            r10 = 0
            switch(r0) {
                case 0: goto L6a;
                default: goto L16;
            }
        L16:
            int r0 = r11.f29538w
            if (r0 == 0) goto L2d
            if (r0 == r6) goto L29
            if (r0 != r7) goto L24
            a1 r3 = r11.f29537v
            pe.a.e(r12)
            goto L63
        L24:
            q.o(r4)
            r1 = r10
            goto L69
        L29:
            pe.a.e(r12)
            goto L44
        L2d:
            pe.a.e(r12)
            wf.e r12 = pf.l0.f22767a
            wf.d r12 = wf.d.f29913w
            b8.y6 r0 = new b8.y6
            r4 = 13
            r0.<init>(r4, r8, r10)
            r11.f29538w = r6
            java.lang.Object r12 = pf.b0.J(r12, r0, r11)
            if (r12 != r5) goto L44
            goto L61
        L44:
            java.util.List r12 = (java.util.List) r12
            r9.clear()
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
            java.lang.Object r12 = qe.l.x(r12)
            android.net.Uri r12 = (android.net.Uri) r12
            if (r12 == 0) goto L66
            r11.f29537v = r3
            r11.f29538w = r7
            java.lang.Object r12 = n4.n1(r8, r12, r2, r11)
            if (r12 != r5) goto L63
        L61:
            r1 = r5
            goto L69
        L63:
            r10 = r12
            f r10 = (f) r10
        L66:
            r3.setValue(r10)
        L69:
            return r1
        L6a:
            int r0 = r11.f29538w
            if (r0 == 0) goto L81
            if (r0 == r6) goto L7d
            if (r0 != r7) goto L78
            a1 r3 = r11.f29537v
            pe.a.e(r12)
            goto Lb7
        L78:
            q.o(r4)
            r1 = r10
            goto Lbd
        L7d:
            pe.a.e(r12)
            goto L98
        L81:
            pe.a.e(r12)
            wf.e r12 = pf.l0.f22767a
            wf.d r12 = wf.d.f29913w
            b8.y6 r0 = new b8.y6
            r4 = 12
            r0.<init>(r4, r8, r10)
            r11.f29538w = r6
            java.lang.Object r12 = pf.b0.J(r12, r0, r11)
            if (r12 != r5) goto L98
            goto Lb5
        L98:
            java.util.List r12 = (java.util.List) r12
            r9.clear()
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
            java.lang.Object r12 = qe.l.x(r12)
            android.net.Uri r12 = (android.net.Uri) r12
            if (r12 == 0) goto Lba
            r11.f29537v = r3
            r11.f29538w = r7
            java.lang.Object r12 = n4.n1(r8, r12, r2, r11)
            if (r12 != r5) goto Lb7
        Lb5:
            r1 = r5
            goto Lbd
        Lb7:
            r10 = r12
            f r10 = (f) r10
        Lba:
            r3.setValue(r10)
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.z5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
