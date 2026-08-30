package c0;
import c0.g;
import h0.a;
import k0.l;

import b0.e1;
import g0.p1;

/* loaded from: classes.dex */
public final class g extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3311u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3312v;

    /* renamed from: w, reason: collision with root package name */
    public int f3313w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3314x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3315y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f3316z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, e1 e1Var, p1 p1Var, te.c cVar) {
        super(2, cVar);
        this.f3311u = 2;
        this.f3312v = lVar;
        this.f3315y = e1Var;
        this.f3316z = p1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f3311u) {
            case 0:
                g gVar = new g((d) this.f3316z, cVar, 0);
                gVar.f3314x = obj;
                return gVar;
            case 1:
                g gVar2 = new g((a) this.f3316z, cVar, 1);
                gVar2.f3314x = obj;
                return gVar2;
            default:
                g gVar3 = new g((l) this.f3312v, (e1) this.f3315y, (p1) this.f3316z, cVar);
                gVar3.f3314x = obj;
                return gVar3;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        v1.b bVar = (v1.b) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f3311u) {
            case 0:
                return ((g) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((g) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((g) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0266, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0166, code lost:
    
        if (r2 == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00f5, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00f3, code lost:
    
        if (r10 == r9) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0166 -> B:58:0x0169). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x03b2 -> B:184:0x03b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x02fb -> B:37:0x02fc). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f3311u = i;
        this.f3316z = obj;
    }
}
