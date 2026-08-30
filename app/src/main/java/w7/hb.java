package w7;
import r0.a1;
import v1.b;
import v1.t;
import w7.hb;

/* loaded from: classes.dex */
public final class hb extends ve.h implements df.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ double C;
    public final /* synthetic */ float D;
    public final /* synthetic */ df.p E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ df.a H;
    public final /* synthetic */ df.l I;
    public final /* synthetic */ a1 J;

    /* renamed from: u, reason: collision with root package name */
    public t f28377u;

    /* renamed from: v, reason: collision with root package name */
    public float f28378v;

    /* renamed from: w, reason: collision with root package name */
    public int f28379w;

    /* renamed from: x, reason: collision with root package name */
    public int f28380x;

    /* renamed from: y, reason: collision with root package name */
    public int f28381y;

    /* renamed from: z, reason: collision with root package name */
    public int f28382z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(double d2, float f10, df.p pVar, float f11, float f12, df.a aVar, df.l lVar, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.C = d2;
        this.D = f10;
        this.E = pVar;
        this.F = f11;
        this.G = f12;
        this.H = aVar;
        this.I = lVar;
        this.J = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        hb hbVar = new hb(this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, cVar);
        hbVar.B = obj;
        return hbVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((hb) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        if (r12 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003e, code lost:
    
        if (r2 == r6) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0069 -> B:6:0x006c). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.hb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
