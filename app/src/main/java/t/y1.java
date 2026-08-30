package t;
import x.o;
import q.d;
import q.x;
import t.y1;
import t.z1;

/* loaded from: classes.dex */
public final class y1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public long f25587u;

    /* renamed from: v, reason: collision with root package name */
    public int f25588v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ long f25589w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z1 f25590x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, te.c cVar) {
        super(2, cVar);
        this.f25590x = z1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        y1 y1Var = new y1(this.f25590x, cVar);
        y1Var.f25589w = ((y2.q) obj).f30822a;
        return y1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((y2.q) obj).f30822a;
        y1 y1Var = new y1(this.f25590x, (te.c) obj2);
        y1Var.f25589w = j10;
        return y1Var.invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f25588v
            r1 = 3
            r2 = 2
            r3 = 1
            z1 r4 = r14.f25590x
            ue.a r5 = ue.a.f27192u
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.f25587u
            long r2 = r14.f25589w
            pe.a.e(r15)
            goto L70
        L19:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r15)
            r15 = 0
            return r15
        L20:
            long r2 = r14.f25587u
            long r6 = r14.f25589w
            pe.a.e(r15)
            goto L56
        L28:
            long r6 = r14.f25589w
            pe.a.e(r15)
            goto L40
        L2e:
            pe.a.e(r15)
            long r6 = r14.f25589w
            d r15 = r4.f25604f
            r14.f25589w = r6
            r14.f25588v = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            y2.q r15 = (y2.q) r15
            long r8 = r15.f30822a
            long r8 = y2.d(r6, r8)
            r14.f25589w = r6
            r14.f25587u = r8
            r14.f25588v = r2
            java.lang.Object r15 = r4.b(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            y2.q r15 = (y2.q) r15
            long r11 = r15.f30822a
            d r8 = r4.f25604f
            long r9 = y2.d(r2, r11)
            r14.f25589w = r6
            r14.f25587u = r11
            r14.f25588v = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            y2.q r15 = (y2.q) r15
            long r4 = r15.f30822a
            long r0 = y2.d(r0, r4)
            long r0 = y2.d(r2, r0)
            y2.q r15 = new y2.q
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t.y1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
