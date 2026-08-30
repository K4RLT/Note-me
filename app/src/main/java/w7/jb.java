package w7;
import v1.b;
import v1.t;
import w7.jb;

/* loaded from: classes.dex */
public final class jb extends ve.h implements df.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ u7.d B;
    public final /* synthetic */ df.p C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ df.a F;

    /* renamed from: u, reason: collision with root package name */
    public t f28536u;

    /* renamed from: v, reason: collision with root package name */
    public float f28537v;

    /* renamed from: w, reason: collision with root package name */
    public double f28538w;

    /* renamed from: x, reason: collision with root package name */
    public int f28539x;

    /* renamed from: y, reason: collision with root package name */
    public int f28540y;

    /* renamed from: z, reason: collision with root package name */
    public int f28541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(u7.d dVar, df.p pVar, float f10, float f11, df.a aVar, te.c cVar) {
        super(2, cVar);
        this.B = dVar;
        this.C = pVar;
        this.D = f10;
        this.E = f11;
        this.F = aVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        jb jbVar = new jb(this.B, this.C, this.D, this.E, this.F, cVar);
        jbVar.A = obj;
        return jbVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((jb) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r13 != r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x003d, code lost:
    
        if (r2 == r7) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x006d -> B:6:0x0070). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.jb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
