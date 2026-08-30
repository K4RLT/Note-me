package s7;

import df.p;
import pf.z;
import r0.a1;

/* loaded from: classes.dex */
public final class h extends ve.i implements p {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public q.d F;
    public a1 G;
    public a1 H;
    public q.d I;
    public int J;
    public final /* synthetic */ float K;
    public final /* synthetic */ float L;
    public final /* synthetic */ q.d M;
    public final /* synthetic */ q.d N;
    public final /* synthetic */ df.a O;
    public final /* synthetic */ float P;
    public final /* synthetic */ a1 Q;
    public final /* synthetic */ a1 R;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25017u;

    /* renamed from: v, reason: collision with root package name */
    public float f25018v;

    /* renamed from: w, reason: collision with root package name */
    public float f25019w;

    /* renamed from: x, reason: collision with root package name */
    public float f25020x;

    /* renamed from: y, reason: collision with root package name */
    public float f25021y;

    /* renamed from: z, reason: collision with root package name */
    public float f25022z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(float f10, float f11, q.d dVar, q.d dVar2, df.a aVar, float f12, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.K = f10;
        this.L = f11;
        this.M = dVar;
        this.N = dVar2;
        this.O = aVar;
        this.P = f12;
        this.Q = a1Var;
        this.R = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new h(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        if (r13.g(r9, r34) == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x025a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0237 -> B:15:0x006f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
