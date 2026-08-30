package u7;
import q.d;
import q.x;
import r0.e1;
import r0.e;
import r0.f1;
import r0.g;
import r1.a;
import r5.h;
import r6.i;
import u7.o1;
import u7.u4;

import java.util.List;

/* loaded from: classes.dex */
public final class u4 extends ve.i implements df.p {
    public final /* synthetic */ e1 A;
    public final /* synthetic */ e1 B;
    public final /* synthetic */ o1 C;

    /* renamed from: u, reason: collision with root package name */
    public int f26922u;

    /* renamed from: v, reason: collision with root package name */
    public float f26923v;

    /* renamed from: w, reason: collision with root package name */
    public int f26924w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f1 f26925x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f26926y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d f26927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(f1 f1Var, List list, d dVar, e1 e1Var, e1 e1Var2, o1 o1Var, te.c cVar) {
        super(2, cVar);
        this.f26925x = f1Var;
        this.f26926y = list;
        this.f26927z = dVar;
        this.A = e1Var;
        this.B = e1Var2;
        this.C = o1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new u4(this.f26925x, this.f26926y, this.f26927z, this.A, this.B, this.C, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u4) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
    
        if (pf.b0.j(16, r8) != r4) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0082 -> B:6:0x0039). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f26924w
            o1 r1 = r8.C
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r0 == 0) goto L25
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L15
            int r0 = r8.f26922u
            pe.a.e(r9)
            r9 = r0
            goto L39
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L1c:
            float r0 = r8.f26923v
            int r5 = r8.f26922u
            pe.a.e(r9)
            r9 = r5
            goto L62
        L25:
            pe.a.e(r9)
            f1 r9 = r8.f26925x
            int r9 = r9.h()
            if (r9 == 0) goto L85
            java.util.List r0 = r8.f26926y
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L39
            goto L85
        L39:
            d r0 = r8.f26927z
            java.lang.Object r5 = e()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r6 = (float) r9
            r7 = 1029785518(0x3d6147ae, float:0.055)
            float r6 = r6 * r7
            float r6 = r6 + r5
            float r5 = a(r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r8.f26922u = r9
            r8.f26923v = r5
            r8.f26924w = r3
            java.lang.Object r0 = g(r6, r8)
            if (r0 != r4) goto L61
            goto L84
        L61:
            r0 = r5
        L62:
            e1 r5 = r8.B
            float r5 = h()
            r6 = 1067869798(0x3fa66666, float:1.3)
            float r5 = r5 / r6
            float r5 = r5 + r0
            float r5 = a(r5)
            e1 r6 = r8.A
            i(r5)
            r8.f26922u = r9
            r8.f26923v = r0
            r8.f26924w = r2
            r5 = 16
            java.lang.Object r0 = pf.b0.j(r5, r8)
            if (r0 != r4) goto L39
        L84:
            return r4
        L85:
            pe.z r9 = pe.z.f22715a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.u4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
