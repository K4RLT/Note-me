package t;
import b1.v;
import r0.a1;
import t.w0;

import u7.m3;
import w7.e3;

/* loaded from: classes.dex */
public final class w0 extends ve.i implements df.p {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25556u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f25557v;

    /* renamed from: w, reason: collision with root package name */
    public int f25558w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f25559x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f25560y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f25561z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, v vVar, float f10, float f11, e3 e3Var, e3 e3Var2, a1 a1Var, a1 a1Var2, a1 a1Var3, te.c cVar) {
        super(2, cVar);
        this.A = m3Var;
        this.f25557v = i;
        this.f25558w = i10;
        this.f25559x = yVar;
        this.B = vVar;
        this.f25560y = f10;
        this.f25561z = f11;
        this.C = e3Var;
        this.D = e3Var2;
        this.E = a1Var;
        this.F = a1Var2;
        this.G = a1Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25556u) {
            case 0:
                w0 w0Var = new w0((kotlin.jvm.internal.v) this.D, this.f25559x, (kotlin.jvm.internal.y) this.E, this.f25560y, (f5.a) this.F, this.f25561z, (z1) this.G, cVar);
                w0Var.C = obj;
                return w0Var;
            default:
                return new w0((m3) this.A, this.f25557v, this.f25558w, this.f25559x, (v) this.B, this.f25560y, this.f25561z, (e3) this.C, (e3) this.D, (a1) this.E, (a1) this.F, (a1) this.G, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25556u) {
            case 0:
                return ((w0) create((x1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                w0 w0Var = (w0) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                w0Var.invokeSuspend(zVar);
                return zVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0737  */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x06e1 -> B:125:0x06e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x06f4 -> B:127:0x05c0). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, float f10, f5.a aVar, float f11, z1 z1Var, te.c cVar) {
        super(2, cVar);
        this.D = vVar;
        this.f25559x = yVar;
        this.E = yVar2;
        this.f25560y = f10;
        this.F = aVar;
        this.f25561z = f11;
        this.G = z1Var;
    }
}
