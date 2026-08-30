package w7;
import r0.a1;
import v1.b;
import v1.t;
import w7.x1;

import android.view.View;

/* loaded from: classes.dex */
public final class x1 extends ve.h implements df.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ b1.v E;
    public final /* synthetic */ u7.m3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ a1 I;
    public final /* synthetic */ a1 J;
    public final /* synthetic */ df.l K;
    public final /* synthetic */ kotlin.jvm.internal.y L;

    /* renamed from: u, reason: collision with root package name */
    public t f29419u;

    /* renamed from: v, reason: collision with root package name */
    public int f29420v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f29421w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b1.v f29422x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ View f29423y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f29424z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(b1.v vVar, View view, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, b1.v vVar2, u7.m3 m3Var, int i, int i10, a1 a1Var6, a1 a1Var7, df.l lVar, kotlin.jvm.internal.y yVar, te.c cVar) {
        super(2, cVar);
        this.f29422x = vVar;
        this.f29423y = view;
        this.f29424z = a1Var;
        this.A = a1Var2;
        this.B = a1Var3;
        this.C = a1Var4;
        this.D = a1Var5;
        this.E = vVar2;
        this.F = m3Var;
        this.G = i;
        this.H = i10;
        this.I = a1Var6;
        this.J = a1Var7;
        this.K = lVar;
        this.L = yVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        x1 x1Var = new x1(this.f29422x, this.f29423y, this.f29424z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, cVar);
        x1Var.f29421w = obj;
        return x1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (r4 == r6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003b, code lost:
    
        if (r2 == r6) goto L15;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
