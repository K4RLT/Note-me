package n;
import x.o;
import n.j0;
import n.k0;
import n.l0;
import q.x;

/* loaded from: classes.dex */
public final class k0 extends ve.h implements df.p {
    public int A;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ l0 E;
    public final /* synthetic */ lf.c F;

    /* renamed from: u, reason: collision with root package name */
    public lf.c f20906u;

    /* renamed from: v, reason: collision with root package name */
    public l0 f20907v;

    /* renamed from: w, reason: collision with root package name */
    public long[] f20908w;

    /* renamed from: x, reason: collision with root package name */
    public int f20909x;

    /* renamed from: y, reason: collision with root package name */
    public int f20910y;

    /* renamed from: z, reason: collision with root package name */
    public int f20911z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, lf.c cVar, te.c cVar2) {
        super(2, cVar2);
        this.E = l0Var;
        this.F = cVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        k0 k0Var = new k0(this.E, this.F, cVar);
        k0Var.D = obj;
        return k0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((lf.e) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.C
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.A
            int r5 = r0.f20911z
            long r6 = r0.B
            int r8 = r0.f20910y
            int r9 = r0.f20909x
            long[] r10 = r0.f20908w
            l0 r11 = r0.f20907v
            lf.c r12 = r0.f20906u
            java.lang.Object r13 = r0.D
            lf.e r13 = (lf.e) r13
            pe.a.e(r21)
            goto L94
        L25:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r1)
            r1 = 0
            return r1
        L2c:
            pe.a.e(r21)
            java.lang.Object r1 = r0.D
            lf.e r1 = (lf.e) r1
            l0 r5 = r0.E
            j0 r6 = r5.f20914v
            long[] r6 = r6.f20898a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            lf.c r8 = r0.F
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f20357v = r2
            j0 r3 = r11.f20914v
            java.lang.Object[] r3 = r3.f20899b
            r2 = r3[r2]
            r0.D = r13
            r0.f20906u = r12
            r0.f20907v = r11
            r0.f20908w = r10
            r0.f20909x = r9
            r0.f20910y = r8
            r0.B = r6
            r0.f20911z = r5
            r0.A = r1
            r0.C = r4
            r13.b(r2, r0)
            ue.a r1 = ue.a.f27192u
            return r1
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            pe.z r1 = pe.z.f22715a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
