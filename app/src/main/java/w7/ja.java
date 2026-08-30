package w7;
import k1.f;
import r0.a1;
import w7.ja;
import w7.p9;
import w7.t9;
import x.o;

import android.content.Context;

/* loaded from: classes.dex */
public final class ja extends ve.i implements df.p {
    public final /* synthetic */ a1 A;

    /* renamed from: u, reason: collision with root package name */
    public a1 f28530u;

    /* renamed from: v, reason: collision with root package name */
    public int f28531v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f28532w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f28533x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t9 f28534y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f28535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(boolean z3, Context context, t9 t9Var, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f28532w = z3;
        this.f28533x = context;
        this.f28534y = t9Var;
        this.f28535z = a1Var;
        this.A = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new ja(this.f28532w, this.f28533x, this.f28534y, this.f28535z, this.A, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ja) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r9 != r6) goto L20;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f28531v
            r1 = 0
            t9 r2 = r8.f28534y
            android.content.Context r3 = r8.f28533x
            r4 = 2
            r5 = 1
            ue.a r6 = ue.a.f27192u
            if (r0 == 0) goto L23
            if (r0 == r5) goto L1d
            if (r0 != r4) goto L17
            a1 r0 = r8.f28530u
            pe.a.e(r9)
            goto L5a
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r9)
            return r1
        L1d:
            a1 r0 = r8.f28530u
            pe.a.e(r9)
            goto L43
        L23:
            pe.a.e(r9)
            boolean r9 = r8.f28532w
            if (r9 == 0) goto L4b
            wf.e r9 = pf.l0.f22767a
            wf.d r9 = wf.d.f29913w
            androidx.lifecycle.q r0 = new androidx.lifecycle.q
            r7 = 27
            r0.<init>(r3, r2, r1, r7)
            a1 r1 = r8.f28535z
            r8.f28530u = r1
            r8.f28531v = r5
            java.lang.Object r9 = pf.b0.J(r9, r0, r8)
            if (r9 != r6) goto L42
            goto L59
        L42:
            r0 = r1
        L43:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.getClass()
            r0.setValue(r9)
        L4b:
            p9 r9 = p9.f28915a
            a1 r0 = r8.A
            r8.f28530u = r0
            r8.f28531v = r4
            java.lang.Object r9 = p9.k(r3, r2, r8)
            if (r9 != r6) goto L5a
        L59:
            return r6
        L5a:
            f r9 = (f) r9
            r0.setValue(r9)
            pe.z r9 = pe.z.f22715a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.ja.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
