package b0;
import u0.a;
import b0.j;
import b0.s0;
import b0.u0;
import c0.a0;
import q.l;
import r0.a;
import r0.b;
import r0.c;
import r0.e;
import r0.f;
import r0.i1;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ float A;
    public final /* synthetic */ kotlin.jvm.internal.w B;
    public final /* synthetic */ int C;
    public final /* synthetic */ kotlin.jvm.internal.y D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a0 f1250u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1251v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f1252w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f1253x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f1254y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f1255z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(a0 a0Var, int i, float f10, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.u uVar, boolean z3, float f11, kotlin.jvm.internal.w wVar, int i10, kotlin.jvm.internal.y yVar) {
        super(1);
        this.f1250u = a0Var;
        this.f1251v = i;
        this.f1252w = f10;
        this.f1253x = vVar;
        this.f1254y = uVar;
        this.f1255z = z3;
        this.A = f11;
        this.B = wVar;
        this.C = i10;
        this.D = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (u0.a(r4, r0, r1) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r6 != r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r2.f19784u += r6;
        r2 = r9.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r4 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (((java.lang.Number) r10.e.getValue()).floatValue() <= r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        r2 = r9.B.f19785u;
        r6 = r9.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r4 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r2 < 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if ((r1 - e()) <= r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        f(r1 - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r2 < 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if ((c() - r1) <= r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        f(r6 + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (((java.lang.Number) r10.e.getValue()).floatValue() >= (-r2)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        r10.a();
        r3.f19783u = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0039, code lost:
    
        if (r2 < r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2 > r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        r2 = r9.f1253x;
        r6 = r6 - r2.f19784u;
        r7 = a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (u0.c(r0, r1) == false) goto L15;
     */
    @Override // df.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            j r10 = (j) r10
            a0 r0 = r9.f1250u
            int r1 = r9.f1251v
            boolean r2 = u0.c(r0, r1)
            kotlin.jvm.internal.u r3 = r9.f1254y
            boolean r4 = r9.f1255z
            r5 = 0
            if (r2 != 0) goto Lb3
            r2 = 0
            float r6 = r9.f1252w
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2b
            i1 r2 = r10.e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L29
            goto L3b
        L29:
            r6 = r2
            goto L3b
        L2b:
            i1 r2 = r10.e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L29
        L3b:
            kotlin.jvm.internal.v r2 = r9.f1253x
            float r7 = r2.f19784u
            float r6 = r6 - r7
            float r7 = a(r6)
            boolean r8 = u0.c(r0, r1)
            if (r8 == 0) goto L4b
            goto Lb3
        L4b:
            boolean r8 = u0.a(r4, r0, r1)
            if (r8 != 0) goto Lb3
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 != 0) goto Lad
            float r7 = r2.f19784u
            float r7 = r7 + r6
            r2.f19784u = r7
            float r2 = r9.A
            if (r4 == 0) goto L72
            i1 r6 = r10.e
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L86
            r10.a()
            goto L86
        L72:
            i1 r6 = r10.e
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r2 = -r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L86
            r10.a()
        L86:
            kotlin.jvm.internal.w r2 = r9.B
            int r2 = r2.f19785u
            int r6 = r9.C
            r7 = 2
            if (r4 == 0) goto L9f
            if (r2 < r7) goto Lb3
            int r2 = e()
            int r2 = r1 - r2
            if (r2 <= r6) goto Lb3
            int r2 = r1 - r6
            f(r2)
            goto Lb3
        L9f:
            if (r2 < r7) goto Lb3
            int r2 = c()
            int r2 = r2 - r1
            if (r2 <= r6) goto Lb3
            int r6 = r6 + r1
            f(r6)
            goto Lb3
        Lad:
            r10.a()
            r3.f19783u = r5
            goto Lc8
        Lb3:
            boolean r2 = u0.a(r4, r0, r1)
            if (r2 == 0) goto Lc2
            f(r1)
            r3.f19783u = r5
            r10.a()
            goto Lc8
        Lc2:
            boolean r10 = u0.c(r0, r1)
            if (r10 != 0) goto Lcb
        Lc8:
            pe.z r10 = pe.z.f22715a
            return r10
        Lcb:
            int r10 = b(r1)
            j r0 = new j
            kotlin.jvm.internal.y r1 = r9.D
            java.lang.Object r1 = r1.f19787u
            l r1 = (l) r1
            r0.<init>(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.s0.invoke(java.lang.Object):java.lang.Object");
    }
}
