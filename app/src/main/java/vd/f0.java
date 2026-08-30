package vd;
import x.o;
import f0.a;
import q.x;
import u.c;

/* loaded from: classes.dex */
public final class f0 implements d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final double f27576f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27577g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final bc.g f27578a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.e f27579b;

    /* renamed from: c, reason: collision with root package name */
    public final xd.g f27580c;

    /* renamed from: d, reason: collision with root package name */
    public final c f27581d;
    public final te.g e;

    public f0(bc.g gVar, hd.e eVar, xd.g gVar2, c cVar, te.g gVar3) {
        this.f27578a = gVar;
        this.f27579b = eVar;
        this.f27580c = gVar2;
        this.f27581d = cVar;
        this.e = gVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vd.f0 r4, ve.c r5) {
        /*
            boolean r0 = r5 instanceof vd.e0
            if (r0 == 0) goto L13
            r0 = r5
            vd.e0 r0 = (vd.e0) r0
            int r1 = r0.f27571x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27571x = r1
            goto L18
        L13:
            vd.e0 r0 = new vd.e0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f27569v
            int r1 = r0.f27571x
            r2 = 1
            java.lang.String r3 = "SessionFirelogPublisher"
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            vd.f0 r4 = r0.f27568u
            pe.a.e(r5)
            goto L47
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L30:
            pe.a.e(r5)
            java.lang.String r5 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r5)
            xd.g r5 = r4.f27580c
            r0.f27568u = r4
            r0.f27571x = r2
            java.lang.Object r5 = r5.b(r0)
            ue.a r0 = ue.a.f27192u
            if (r5 != r0) goto L47
            return r0
        L47:
            xd.g r5 = r4.f27580c
            c r0 = r5.f30753a
            java.lang.Boolean r0 = r0.i()
            if (r0 == 0) goto L56
            boolean r2 = r0.booleanValue()
            goto L62
        L56:
            xd.b r5 = r5.f30754b
            java.lang.Boolean r5 = r5.a()
            if (r5 == 0) goto L62
            boolean r2 = r5.booleanValue()
        L62:
            if (r2 != 0) goto L6c
            java.lang.String r4 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L6c:
            xd.g r4 = r4.f27580c
            double r4 = r4.a()
            double r0 = vd.f0.f27576f
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L7b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L7b:
            java.lang.String r4 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.a(vd.f0, ve.c):java.lang.Object");
    }
}
