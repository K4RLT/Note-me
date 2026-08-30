package u7;
import u7.o0;
import v1.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class o0 extends ve.h implements df.p {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ m3 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;

    /* renamed from: u, reason: collision with root package name */
    public Float f26641u;

    /* renamed from: v, reason: collision with root package name */
    public float f26642v;

    /* renamed from: w, reason: collision with root package name */
    public float f26643w;

    /* renamed from: x, reason: collision with root package name */
    public float f26644x;

    /* renamed from: y, reason: collision with root package name */
    public float f26645y;

    /* renamed from: z, reason: collision with root package name */
    public float f26646z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i, Context context, te.c cVar, m3 m3Var) {
        super(2, cVar);
        this.D = m3Var;
        this.E = i;
        this.F = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        o0 o0Var = new o0(this.E, this.F, cVar, this.D);
        o0Var.C = obj;
        return o0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0059, code lost:
    
        if (r4 == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        if (r9 != r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014d, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0278  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x014b -> B:6:0x014e). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
