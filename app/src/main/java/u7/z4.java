package u7;
import q.d;
import r0.a1;
import r0.f1;
import u7.z4;
import w7.e3;

import android.net.Uri;

/* loaded from: classes.dex */
public final class z4 extends ve.i implements df.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27095u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f27096v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f27097w;

    /* renamed from: x, reason: collision with root package name */
    public int f27098x;

    /* renamed from: y, reason: collision with root package name */
    public int f27099y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f27100z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(kotlin.jvm.internal.y yVar, Uri uri, Float f10, Float f11, m3 m3Var, int i, int i10, a1 a1Var, e3 e3Var, e3 e3Var2, e3 e3Var3, te.c cVar) {
        super(2, cVar);
        this.B = yVar;
        this.C = uri;
        this.D = f10;
        this.E = f11;
        this.f27097w = m3Var;
        this.f27098x = i;
        this.f27099y = i10;
        this.f27100z = a1Var;
        this.F = e3Var;
        this.G = e3Var2;
        this.H = e3Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f27095u) {
            case 0:
                return new z4(this.f27097w, this.f27100z, (d) this.A, (d) this.B, (d) this.C, (d) this.D, (l2) this.E, (f1) this.F, (f1) this.G, (f1) this.H, cVar);
            default:
                z4 z4Var = new z4((kotlin.jvm.internal.y) this.B, (Uri) this.C, (Float) this.D, (Float) this.E, this.f27097w, this.f27098x, this.f27099y, this.f27100z, (e3) this.F, (e3) this.G, (e3) this.H, cVar);
                z4Var.A = obj;
                return z4Var;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f27095u) {
            case 0:
                return ((z4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((z4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ab, code lost:
    
        if (r4.g(r5, r21) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0193, code lost:
    
        if (r4.g(r5, r21) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017b, code lost:
    
        if (r4.g(r5, r21) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0165, code lost:
    
        if (r4.g(r5, r21) != r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.z4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(m3 m3Var, a1 a1Var, d dVar, d dVar2, d dVar3, d dVar4, l2 l2Var, f1 f1Var, f1 f1Var2, f1 f1Var3, te.c cVar) {
        super(2, cVar);
        this.f27097w = m3Var;
        this.f27100z = a1Var;
        this.A = dVar;
        this.B = dVar2;
        this.C = dVar3;
        this.D = dVar4;
        this.E = l2Var;
        this.F = f1Var;
        this.G = f1Var2;
        this.H = f1Var3;
    }
}
