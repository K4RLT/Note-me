package w7;
import j1.b;
import r0.b;
import v1.b;
import v1.g0;
import v1.k;
import v1.l;
import v1.s;
import v1.t;
import w7.e3;
import w7.z1;
import x.o;

/* loaded from: classes.dex */
public final class z1 extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f29525u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f29526v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f29527w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f29528x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f29529y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(t tVar, float f10, e3 e3Var, te.c cVar) {
        super(2, cVar);
        this.f29527w = tVar;
        this.f29528x = f10;
        this.f29529y = e3Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        z1 z1Var = new z1(this.f29527w, this.f29528x, this.f29529y, cVar);
        z1Var.f29526v = obj;
        return z1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (b.d(b.g(r4.f27343c, r6.f27343c)) > r11.f29528x) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        qe.m.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f29526v
            b r0 = (b) r0
            int r1 = r11.f29525u
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto L10
            pe.a.e(r12)
            goto L2e
        L10:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r12)
            r12 = 0
            return r12
        L17:
            pe.a.e(r12)
        L1a:
            r12 = r2
        L1b:
            if (r12 != 0) goto Lb2
            r11.f29526v = r0
            r11.f29525u = r3
            g0 r0 = (g0) r0
            l r12 = l.f27331u
            java.lang.Object r12 = b(r12, r11)
            ue.a r1 = ue.a.f27192u
            if (r12 != r1) goto L2e
            return r1
        L2e:
            k r12 = (k) r12
            java.lang.Object r1 = r12.f27327a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r4 = r1.hasNext()
            r5 = 0
            t r6 = r11.f29527w
            if (r4 == 0) goto L53
            java.lang.Object r4 = r1.next()
            r7 = r4
            t r7 = (t) r7
            long r7 = r7.f27341a
            long r9 = r6.f27341a
            boolean r7 = s.a(r7, r9)
            if (r7 == 0) goto L38
            goto L54
        L53:
            r4 = r5
        L54:
            t r4 = (t) r4
            if (r4 == 0) goto Laf
            boolean r1 = r4.f27344d
            if (r1 == 0) goto Laf
            e3 r1 = r11.f29529y
            boolean r1 = r1.b()
            if (r1 != 0) goto L6a
            boolean r1 = r4.f()
            if (r1 != 0) goto Laf
        L6a:
            java.lang.Object r12 = r12.f27327a
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r1 = r12 instanceof java.util.Collection
            if (r1 == 0) goto L7d
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7d
            r1 = r2
            goto L9b
        L7d:
            java.util.Iterator r12 = r12.iterator()
            r1 = r2
        L82:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r12.next()
            t r7 = (t) r7
            boolean r7 = r7.f27344d
            if (r7 == 0) goto L82
            int r1 = r1 + 1
            if (r1 < 0) goto L97
            goto L82
        L97:
            qe.m.k()
            throw r5
        L9b:
            if (r1 > r3) goto Laf
            long r4 = r4.f27343c
            long r6 = r6.f27343c
            long r4 = b.g(r4, r6)
            float r12 = b.d(r4)
            float r1 = r11.f29528x
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto L1a
        Laf:
            r12 = r3
            goto L1b
        Lb2:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.z1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
