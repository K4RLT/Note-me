package b8;
import a6.f;
import b8.q9;
import r0.a1;
import t.k;

import android.content.Context;

/* loaded from: classes.dex */
public final class q9 extends ve.i implements df.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2605u = 0;

    /* renamed from: v, reason: collision with root package name */
    public Object f2606v;

    /* renamed from: w, reason: collision with root package name */
    public int f2607w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2608x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2609y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2610z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(u6 u6Var, ca caVar, Context context, a1 a1Var, pf.z zVar, a1 a1Var2, a1 a1Var3, te.c cVar) {
        super(2, cVar);
        this.f2609y = u6Var;
        this.f2610z = caVar;
        this.A = context;
        this.B = a1Var;
        this.E = zVar;
        this.C = a1Var2;
        this.D = a1Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2605u) {
            case 0:
                return new q9((u6) this.f2609y, (ca) this.f2610z, (Context) this.A, (a1) this.B, (pf.z) this.E, (a1) this.C, (a1) this.D, cVar);
            default:
                q9 q9Var = new q9((r.u0) this.B, (r.w0) this.C, (f) this.D, (k) this.E, cVar);
                q9Var.A = obj;
                return q9Var;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2605u) {
            case 0:
                return ((q9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((q9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // ve.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.q9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(r.u0 u0Var, r.w0 w0Var, f fVar, k kVar, te.c cVar) {
        super(2, cVar);
        this.B = u0Var;
        this.C = w0Var;
        this.D = fVar;
        this.E = kVar;
    }
}
