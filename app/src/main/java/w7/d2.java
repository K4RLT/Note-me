package w7;
import r0.a1;
import r0.e1;
import v1.b;
import w7.d2;

import android.view.View;

/* loaded from: classes.dex */
public final class d2 extends ve.h implements df.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ float C;
    public final /* synthetic */ View D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ e1 F;
    public final /* synthetic */ u7.m3 G;
    public final /* synthetic */ a1 H;

    /* renamed from: u, reason: collision with root package name */
    public p4 f28061u;

    /* renamed from: v, reason: collision with root package name */
    public pe.j f28062v;

    /* renamed from: w, reason: collision with root package name */
    public float f28063w;

    /* renamed from: x, reason: collision with root package name */
    public float f28064x;

    /* renamed from: y, reason: collision with root package name */
    public long f28065y;

    /* renamed from: z, reason: collision with root package name */
    public int f28066z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(float f10, View view, a1 a1Var, e1 e1Var, u7.m3 m3Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.C = f10;
        this.D = view;
        this.E = a1Var;
        this.F = e1Var;
        this.G = m3Var;
        this.H = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        d2 d2Var = new d2(this.C, this.D, this.E, this.F, this.G, this.H, cVar);
        d2Var.B = obj;
        return d2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d2) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0073, code lost:
    
        if (r2 == r14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02e5, code lost:
    
        if (r6 != r14) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02e7, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0268, code lost:
    
        if (r6 != r14) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x02e5 -> B:7:0x02e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0268 -> B:65:0x026c). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.d2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
