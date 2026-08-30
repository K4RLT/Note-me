package w7;
import r0.a1;
import w7.w2;

import java.io.File;

/* loaded from: classes.dex */
public final class w2 extends ve.i implements df.p {
    public final /* synthetic */ File A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ e3 C;
    public final /* synthetic */ e3 D;
    public final /* synthetic */ e3 E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Float f29351u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Float f29352v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29353w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29354x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f29355y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f29356z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(Float f10, Float f11, u7.m3 m3Var, int i, int i10, String str, File file, a1 a1Var, e3 e3Var, e3 e3Var2, e3 e3Var3, te.c cVar) {
        super(2, cVar);
        this.f29351u = f10;
        this.f29352v = f11;
        this.f29353w = m3Var;
        this.f29354x = i;
        this.f29355y = i10;
        this.f29356z = str;
        this.A = file;
        this.B = a1Var;
        this.C = e3Var;
        this.D = e3Var2;
        this.E = e3Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new w2(this.f29351u, this.f29352v, this.f29353w, this.f29354x, this.f29355y, this.f29356z, this.A, this.B, this.C, this.D, this.E, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        w2 w2Var = (w2) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        w2Var.invokeSuspend(zVar);
        return zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0165, code lost:
    
        if (r6 < 1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022a  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.w2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
