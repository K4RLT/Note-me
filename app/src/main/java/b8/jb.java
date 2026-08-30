package b8;
import b5.a;
import b8.jb;
import b8.w5;
import k1.f;
import r0.a1;
import r0.o1;

/* loaded from: classes.dex */
public final class jb extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public o1 f2275u;

    /* renamed from: v, reason: collision with root package name */
    public int f2276v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2277w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f2278x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2279y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f2280z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(String str, int i, long j10, te.c cVar) {
        super(2, cVar);
        this.f2278x = str;
        this.f2279y = i;
        this.f2280z = j10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        jb jbVar = new jb(this.f2278x, this.f2279y, this.f2280z, cVar);
        jbVar.f2277w = obj;
        return jbVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((jb) create((o1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2277w
            o1 r0 = (o1) r0
            ue.a r1 = ue.a.f27192u
            int r2 = r7.f2276v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1a
            if (r2 != r3) goto L14
            o1 r1 = r7.f2275u
            pe.a.e(r8)
            goto L48
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r8)
            return r4
        L1a:
            pe.a.e(r8)
            a1 r8 = r0.f24309u
            java.lang.Object r8 = r8.getValue()
            if (r8 == 0) goto L28
            pe.z r8 = pe.z.f22715a
            return r8
        L28:
            java.lang.String r8 = r7.f2278x
            if (r8 != 0) goto L2f
            r1 = r0
            r8 = r4
            goto L4a
        L2f:
            wf.e r2 = pf.l0.f22767a
            wf.d r2 = wf.d.f29913w
            a r5 = new a
            int r6 = r7.f2279y
            r5.<init>(r6, r8, r4)
            r7.f2277w = r0
            r7.f2275u = r0
            r7.f2276v = r3
            java.lang.Object r8 = pf.b0.J(r2, r5, r7)
            if (r8 != r1) goto L47
            return r1
        L47:
            r1 = r0
        L48:
            f r8 = (f) r8
        L4a:
            r1.setValue(r8)
            a1 r8 = r0.f24309u
            java.lang.Object r8 = r8.getValue()
            f r8 = (f) r8
            if (r8 == 0) goto Lb5
            java.lang.String r0 = r7.f2278x
            long r1 = r7.f2280z
            w5 r3 = w5.f2926a
            monitor-enter(r3)
            if (r0 != 0) goto L61
            goto L75
        L61:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r4.<init>()     // Catch: java.lang.Throwable -> Laf
            r4.append(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch: java.lang.Throwable -> Laf
            r4.append(r1)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Laf
        L75:
            if (r4 != 0) goto L79
            monitor-exit(r3)
            goto Lb5
        L79:
            r0.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = "/thumbs/"
            boolean r1 = mf.f.n(r0, r1)     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L87
            java.util.LinkedHashMap r1 = w5.f2927b     // Catch: java.lang.Throwable -> Laf
            goto L89
        L87:
            java.util.LinkedHashMap r1 = w5.f2928c     // Catch: java.lang.Throwable -> Laf
        L89:
            r1.put(r4, r8)     // Catch: java.lang.Throwable -> Laf
        L8c:
            int r8 = r1.size()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "/thumbs/"
            boolean r2 = mf.f.n(r0, r2)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L9b
            r2 = 8
            goto L9c
        L9b:
            r2 = 6
        L9c:
            if (r8 <= r2) goto Lb1
            java.util.Set r8 = r1.keySet()     // Catch: java.lang.Throwable -> Laf
            r8.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r8 = qe.l.v(r8)     // Catch: java.lang.Throwable -> Laf
            r1.remove(r8)     // Catch: java.lang.Throwable -> Laf
            goto L8c
        Laf:
            r8 = move-exception
            goto Lb3
        Lb1:
            monitor-exit(r3)
            goto Lb5
        Lb3:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
            throw r8
        Lb5:
            pe.z r8 = pe.z.f22715a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.jb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
