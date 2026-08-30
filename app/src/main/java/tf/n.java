package tf;
import o.a;

import pf.z;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.p {
    public final /* synthetic */ sf.g[] A;
    public final /* synthetic */ a2.c B;
    public final /* synthetic */ f6.g C;
    public final /* synthetic */ sf.h D;

    /* renamed from: u, reason: collision with root package name */
    public rf.l f25739u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f25740v;

    /* renamed from: w, reason: collision with root package name */
    public int f25741w;

    /* renamed from: x, reason: collision with root package name */
    public int f25742x;

    /* renamed from: y, reason: collision with root package name */
    public int f25743y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f25744z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sf.g[] gVarArr, a2.c cVar, f6.g gVar, sf.h hVar, te.c cVar2) {
        super(2, cVar2);
        this.A = gVarArr;
        this.B = cVar;
        this.C = gVar;
        this.D = hVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        n nVar = new n(this.A, this.B, this.C, this.D, cVar);
        nVar.f25744z = obj;
        return nVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        if (r11 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        if (r11 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r12 = r11.f24026a;
        r13 = r10[r12];
        r10[r12] = r11.f24027b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (r13 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (r8[r12] == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        r8[r12] = (byte) r2;
        r11 = (qe.v) rf.a(r9.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (r11 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r7 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        r11 = new f6.c[((sf.g[]) r17.B.f228v).length];
        qe.k.g(0, 0, 14, r10, r11);
        r17.f25744z = r10;
        r17.f25739u = r9;
        r17.f25740v = r8;
        r17.f25741w = r7;
        r17.f25742x = r2;
        r17.f25743y = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        if (r17.C.b(r17.D, r11, r17) != r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r7 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        return r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:11:0x0075). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
