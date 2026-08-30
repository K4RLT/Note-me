package g0;
import g0.j1;
import k0.t0;
import k0.y;
import r.m1;
import v1.b;
import v1.l;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j1 extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17146u;

    /* renamed from: v, reason: collision with root package name */
    public int f17147v;

    /* renamed from: w, reason: collision with root package name */
    public Object f17148w;

    /* renamed from: x, reason: collision with root package name */
    public Object f17149x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f17150y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1(te.g gVar, df.p pVar, te.c cVar) {
        super(2, cVar);
        this.f17146u = 2;
        this.f17149x = gVar;
        this.f17150y = (ve.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [df.p, ve.h] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f17146u) {
            case 0:
                j1 j1Var = new j1((p1) this.f17150y, cVar, 0);
                j1Var.f17148w = obj;
                return j1Var;
            case 1:
                j1 j1Var2 = new j1((t0) this.f17149x, (y) this.f17150y, cVar, 1);
                j1Var2.f17148w = obj;
                return j1Var2;
            case 2:
                j1 j1Var3 = new j1((te.g) this.f17149x, (df.p) this.f17150y, cVar);
                j1Var3.f17148w = obj;
                return j1Var3;
            case 3:
                j1 j1Var4 = new j1((m1) this.f17150y, cVar, 3);
                j1Var4.f17149x = obj;
                return j1Var4;
            default:
                j1 j1Var5 = new j1((l) this.f17149x, (kotlin.jvm.internal.y) this.f17150y, cVar, 4);
                j1Var5.f17148w = obj;
                return j1Var5;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17146u) {
            case 0:
                return ((j1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((j1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((j1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((j1) create((lf.e) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((j1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cf, code lost:
    
        if (r0 == r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bf, code lost:
    
        if (r2 == r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0240, code lost:
    
        if (r4 != r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0227, code lost:
    
        if (r3 == r7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 != r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        if (r3 == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
    
        if (r0 != r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0188, code lost:
    
        if (r0 == r7) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160 A[Catch: CancellationException -> 0x0147, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0147, blocks: (B:79:0x0160, B:84:0x016e, B:91:0x0143, B:93:0x014e), top: B:69:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v33, types: [df.p, ve.h] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v4, types: [b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0240 -> B:110:0x0244). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b1 -> B:8:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x011c -> B:46:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0177 -> B:63:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0188 -> B:63:0x015a). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(Object obj, te.c cVar, int i) {
        super(2, cVar);
        this.f17146u = i;
        this.f17150y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(Object obj, Serializable serializable, te.c cVar, int i) {
        super(2, cVar);
        this.f17146u = i;
        this.f17149x = obj;
        this.f17150y = serializable;
    }
}
