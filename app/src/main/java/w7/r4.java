package w7;
import r0.a1;
import v1.b;
import v1.t;
import w7.r4;
import z1.x;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class r4 extends ve.h implements df.p {
    public final /* synthetic */ df.a A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ Bitmap C;
    public final /* synthetic */ x D;
    public final /* synthetic */ df.l E;
    public final /* synthetic */ a1 F;

    /* renamed from: u, reason: collision with root package name */
    public t f28998u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.u f28999v;

    /* renamed from: w, reason: collision with root package name */
    public long f29000w;

    /* renamed from: x, reason: collision with root package name */
    public int f29001x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f29002y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.l f29003z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(df.l lVar, df.a aVar, a1 a1Var, Bitmap bitmap, x xVar, df.l lVar2, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f29003z = lVar;
        this.A = aVar;
        this.B = a1Var;
        this.C = bitmap;
        this.D = xVar;
        this.E = lVar2;
        this.F = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        r4 r4Var = new r4(this.f29003z, this.A, this.B, this.C, this.D, this.E, this.F, cVar);
        r4Var.f29002y = obj;
        return r4Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r4) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r14 != r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0041, code lost:
    
        if (r2 == r10) goto L19;
     */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0086 -> B:6:0x0089). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.r4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
