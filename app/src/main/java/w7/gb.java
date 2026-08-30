package w7;
import k2.b;
import r0.a1;
import w7.gb;

/* loaded from: classes.dex */
public final class gb extends ve.h implements df.p {
    public final /* synthetic */ df.a A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ a1 C;

    /* renamed from: u, reason: collision with root package name */
    public int f28320u;

    /* renamed from: v, reason: collision with root package name */
    public float f28321v;

    /* renamed from: w, reason: collision with root package name */
    public float f28322w;

    /* renamed from: x, reason: collision with root package name */
    public int f28323x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f28324y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.p f28325z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(df.p pVar, df.a aVar, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f28325z = pVar;
        this.A = aVar;
        this.B = a1Var;
        this.C = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        gb gbVar = new gb(this.f28325z, this.A, this.B, this.C, cVar);
        gbVar.f28324y = obj;
        return gbVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((gb) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r14 != r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        qe.m.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0033, code lost:
    
        if (t.b(r0, false, r2, r13) == r6) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004b -> B:6:0x004e). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.gb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
