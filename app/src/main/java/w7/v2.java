package w7;
import j1.b;
import v1.k;
import v1.s;
import v1.t;
import w7.v2;
import x.o;

/* loaded from: classes.dex */
public final class v2 extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f29270u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f29271v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f29272w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f29273x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(t tVar, float f10, te.c cVar) {
        super(2, cVar);
        this.f29272w = tVar;
        this.f29273x = f10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        v2 v2Var = new v2(this.f29272w, this.f29273x, cVar);
        v2Var.f29271v = obj;
        return v2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v2) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        qe.m.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0023 -> B:5:0x0026). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f29271v
            b r0 = (b) r0
            int r1 = r10.f29270u
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            pe.a.e(r11)
            goto L26
        Lf:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r11)
            r11 = 0
            return r11
        L16:
            pe.a.e(r11)
        L19:
            r10.f29271v = r0
            r10.f29270u = r2
            java.lang.Object r11 = b.q0(r0, r10)
            ue.a r1 = ue.a.f27192u
            if (r11 != r1) goto L26
            return r1
        L26:
            k r11 = (k) r11
            java.lang.Object r1 = r11.f27327a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r3 = r1.hasNext()
            t r4 = r10.f29272w
            r5 = 0
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            r6 = r3
            t r6 = (t) r6
            long r6 = r6.f27341a
            long r8 = r4.f27341a
            boolean r6 = s.a(r6, r8)
            if (r6 == 0) goto L30
            goto L4c
        L4b:
            r3 = r5
        L4c:
            t r3 = (t) r3
            if (r3 == 0) goto Lb4
            boolean r1 = r3.f()
            if (r1 == 0) goto L57
            goto Lb4
        L57:
            boolean r1 = r3.f27344d
            if (r1 != 0) goto L62
            java.lang.Integer r11 = new java.lang.Integer
            r0 = -1
            r11.<init>(r0)
            return r11
        L62:
            java.lang.Object r11 = r11.f27327a
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r1 = r11 instanceof java.util.Collection
            r6 = 0
            if (r1 == 0) goto L76
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L76
            r1 = r6
            goto L94
        L76:
            java.util.Iterator r11 = r11.iterator()
            r1 = r6
        L7b:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L94
            java.lang.Object r7 = r11.next()
            t r7 = (t) r7
            boolean r7 = r7.f27344d
            if (r7 == 0) goto L7b
            int r1 = r1 + 1
            if (r1 < 0) goto L90
            goto L7b
        L90:
            qe.m.k()
            throw r5
        L94:
            if (r1 <= r2) goto L9c
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r6)
            return r11
        L9c:
            long r7 = r3.f27343c
            long r3 = r4.f27343c
            long r3 = b.g(r7, r3)
            float r11 = b.d(r3)
            float r1 = r10.f29273x
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 <= 0) goto L19
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r6)
            return r11
        Lb4:
            java.lang.Integer r11 = new java.lang.Integer
            r0 = -2
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.v2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
