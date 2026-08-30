package xa;
import o0.a;
import q.x;
import r0.e;

/* loaded from: classes.dex */
public final class o0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile i0 f30484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f30486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2 f30487d;
    public final /* synthetic */ p0 e;

    public o0(p0 p0Var, boolean z3, z zVar, k2 k2Var) {
        this.f30485b = z3;
        this.f30486c = zVar;
        this.f30487d = k2Var;
        this.e = p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        r10.f30484a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0066, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[SYNTHETIC] */
    @Override // xa.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xa.l2 r11) {
        /*
            r10 = this;
            boolean r0 = r10.f30485b
            if (r0 != 0) goto La7
            xa.i0 r0 = r10.f30484a
            if (r0 != 0) goto La2
            xa.z r0 = r10.f30486c
            xa.p0 r1 = r10.e
            xa.k2 r2 = r10.f30487d
            r0.getClass()
            java.lang.String r3 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r1, r3)
            xa.z1 r3 = r0.f30725d
            r3.getClass()
            java.lang.Object r4 = r3.f30731w
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            xa.j1 r5 = xa.z1.f30728x
            r6 = 1
            if (r1 != r5) goto L25
            goto L68
        L25:
            java.lang.Class r5 = r2.f30449a
            java.lang.Object r7 = r4.get(r5)
            xa.j0 r7 = (xa.j0) r7
            if (r7 == 0) goto L32
            if (r7 != r1) goto L69
            goto L68
        L32:
            java.lang.Class<xa.k0> r7 = xa.k0.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            xa.k0 r7 = (xa.k0) r7
            if (r7 != 0) goto L3d
            goto L69
        L3d:
            java.lang.Class r7 = r7.zza()
            java.lang.Class<xa.j0> r8 = xa.j0.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L4a
            goto L69
        L4a:
            java.lang.Object r8 = r3.f30730v
            xa.n0 r8 = (xa.n0) r8
            xa.k2 r9 = new xa.k2
            r9.<init>(r7)
            xa.c1 r7 = r8.a(r9, r6)
            java.lang.Object r7 = r7.zza()
            xa.j0 r7 = (xa.j0) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            xa.j0 r4 = (xa.j0) r4
            if (r4 == 0) goto L66
            r7 = r4
        L66:
            if (r7 != r1) goto L69
        L68:
            r1 = r3
        L69:
            java.util.List r3 = e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L70:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r3.next()
            xa.j0 r5 = (xa.j0) r5
            if (r4 != 0) goto L82
            if (r5 != r1) goto L70
            r4 = r6
            goto L70
        L82:
            xa.i0 r5 = r5.a(r0, r2)
            if (r5 == 0) goto L70
            r0 = r5
            goto L90
        L8a:
            if (r4 != 0) goto L93
            xa.i0 r0 = a(r2)
        L90:
            r10.f30484a = r0
            goto La2
        L93:
            java.lang.String r11 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            java.lang.String r11 = r0.concat(r11)
            x.n(r11)
        La0:
            r11 = 0
            return r11
        La2:
            java.lang.Object r11 = a(r11)
            return r11
        La7:
            r11.Z()
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.a(xa.l2):java.lang.Object");
    }
}
