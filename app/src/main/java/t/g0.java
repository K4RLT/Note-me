package t;
import a0.g;
import b1.y;
import b2.k0;
import c0.n;
import t.g0;
import v1.w;

import android.content.Context;
import java.util.List;
import u7.m3;

/* loaded from: classes.dex */
public final class g0 extends ve.i implements df.p {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25394u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f25395v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25396w;

    /* renamed from: x, reason: collision with root package name */
    public Object f25397x;

    /* renamed from: y, reason: collision with root package name */
    public Object f25398y;

    /* renamed from: z, reason: collision with root package name */
    public Object f25399z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r1 r1Var, w wVar, n nVar, k0 k0Var, h0 h0Var, h0 h0Var2, g gVar, te.c cVar) {
        super(2, cVar);
        this.f25397x = r1Var;
        this.f25398y = wVar;
        this.f25399z = nVar;
        this.A = k0Var;
        this.B = h0Var;
        this.C = h0Var2;
        this.D = gVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25394u) {
            case 0:
                g0 g0Var = new g0((r1) this.f25397x, (w) this.f25398y, (n) this.f25399z, (k0) this.A, (h0) this.B, (h0) this.C, (g) this.D, cVar);
                g0Var.f25396w = obj;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0((u7.o1) this.f25398y, (m3) this.f25399z, (Context) this.A, (String) this.B, (List) this.C, (y) this.D, cVar);
                g0Var2.f25396w = obj;
                return g0Var2;
            default:
                return new g0((vd.f0) this.C, (vd.a0) this.D, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25394u) {
            case 0:
                return ((g0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((g0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((g0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        if (r5 == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005d, code lost:
    
        if (r5 == r6) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v0, types: [pe.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [pf.z] */
    /* JADX WARN: Type inference failed for: r3v4, types: [pf.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [pf.z] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(u7.o1 o1Var, m3 m3Var, Context context, String str, List list, y yVar, te.c cVar) {
        super(2, cVar);
        this.f25398y = o1Var;
        this.f25399z = m3Var;
        this.A = context;
        this.B = str;
        this.C = list;
        this.D = yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(vd.f0 f0Var, vd.a0 a0Var, te.c cVar) {
        super(2, cVar);
        this.C = f0Var;
        this.D = a0Var;
    }
}
