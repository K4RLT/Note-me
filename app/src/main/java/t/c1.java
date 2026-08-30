package t;
import q.x;
import t.a1;
import t.b1;
import t.c1;

/* loaded from: classes.dex */
public final class c1 implements y2.c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y2.c f25348u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25349v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25350w;

    /* renamed from: x, reason: collision with root package name */
    public final yf.c f25351x = new yf.c(false);

    public c1(y2.c cVar) {
        this.f25348u = cVar;
    }

    @Override // y2.c
    public final long B0(long j10) {
        return this.f25348u.B0(j10);
    }

    @Override // y2.c
    public final float D0(long j10) {
        return this.f25348u.D0(j10);
    }

    @Override // y2.c
    public final long R(float f10) {
        return this.f25348u.R(f10);
    }

    @Override // y2.c
    public final float Y(int i) {
        return this.f25348u.Y(i);
    }

    @Override // y2.c
    public final float a() {
        return this.f25348u.a();
    }

    @Override // y2.c
    public final float a0(float f10) {
        return this.f25348u.a0(f10);
    }

    public final void b() {
        this.f25350w = true;
        yf.c cVar = this.f25351x;
        if (cVar.c()) {
            cVar.j(null);
        }
    }

    public final void c() {
        this.f25349v = true;
        yf.c cVar = this.f25351x;
        if (cVar.c()) {
            cVar.j(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ve.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a1
            if (r0 == 0) goto L13
            r0 = r5
            a1 r0 = (a1) r0
            int r1 = r0.f25321x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25321x = r1
            goto L18
        L13:
            a1 r0 = new a1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25319v
            int r1 = r0.f25321x
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            t.c1 r0 = r0.f25318u
            pe.a.e(r5)
            goto L41
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L2e:
            pe.a.e(r5)
            r0.f25318u = r4
            r0.f25321x = r2
            yf.c r5 = r4.f25351x
            java.lang.Object r5 = r5.f(r0)
            ue.a r0 = ue.a.f27192u
            if (r5 != r0) goto L40
            return r0
        L40:
            r0 = r4
        L41:
            r5 = 0
            r0.f25349v = r5
            r0.f25350w = r5
            pe.z r5 = pe.z.f22715a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c1.d(ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ve.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b1
            if (r0 == 0) goto L13
            r0 = r5
            b1 r0 = (b1) r0
            int r1 = r0.f25336x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25336x = r1
            goto L18
        L13:
            b1 r0 = new b1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25334v
            int r1 = r0.f25336x
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            t.c1 r0 = r0.f25333u
            pe.a.e(r5)
            goto L49
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
            r5 = 0
            return r5
        L2e:
            pe.a.e(r5)
            boolean r5 = r4.f25349v
            if (r5 != 0) goto L50
            boolean r5 = r4.f25350w
            if (r5 != 0) goto L50
            r0.f25333u = r4
            r0.f25336x = r2
            yf.c r5 = r4.f25351x
            java.lang.Object r5 = r5.f(r0)
            ue.a r0 = ue.a.f27192u
            if (r5 != r0) goto L48
            return r0
        L48:
            r0 = r4
        L49:
            yf.c r5 = r0.f25351x
            r1 = 0
            r5.j(r1)
            goto L51
        L50:
            r0 = r4
        L51:
            boolean r5 = r0.f25349v
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c1.f(ve.c):java.lang.Object");
    }

    @Override // y2.c
    public final float i0() {
        return this.f25348u.i0();
    }

    @Override // y2.c
    public final float l0(float f10) {
        return this.f25348u.l0(f10);
    }

    @Override // y2.c
    public final long o(float f10) {
        return this.f25348u.o(f10);
    }

    @Override // y2.c
    public final long p(long j10) {
        return this.f25348u.p(j10);
    }

    @Override // y2.c
    public final int t0(float f10) {
        return this.f25348u.t0(f10);
    }

    @Override // y2.c
    public final float x(long j10) {
        return this.f25348u.x(j10);
    }
}
