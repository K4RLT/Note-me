package u7;
import q.d;
import r0.a1;
import t.k2;
import u7.e5;
import v1.b;

import java.util.List;

/* loaded from: classes.dex */
public final class e5 extends ve.h implements df.p {
    public final /* synthetic */ o1 A;
    public final /* synthetic */ pf.z B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ List D;
    public final /* synthetic */ df.l E;

    /* renamed from: u, reason: collision with root package name */
    public float f26137u;

    /* renamed from: v, reason: collision with root package name */
    public int f26138v;

    /* renamed from: w, reason: collision with root package name */
    public int f26139w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f26140x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f26141y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d f26142z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(d dVar, d dVar2, o1 o1Var, pf.z zVar, a1 a1Var, List list, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f26141y = dVar;
        this.f26142z = dVar2;
        this.A = o1Var;
        this.B = zVar;
        this.C = a1Var;
        this.D = list;
        this.E = lVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        e5 e5Var = new e5(this.f26141y, this.f26142z, this.A, this.B, this.C, this.D, this.E, cVar);
        e5Var.f26140x = obj;
        return e5Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e5) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0042, code lost:
    
        if (r15 != r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0044, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x002f, code lost:
    
        if (k2.c(r0, r14, 2) == r6) goto L16;
     */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0042 -> B:6:0x0045). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.e5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
