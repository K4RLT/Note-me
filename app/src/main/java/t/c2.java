package t;
import c2.r2;
import q.x;
import t.c2;
import t.k2;
import v1.b;
import v1.g0;
import v1.t;

/* loaded from: classes.dex */
public final class c2 extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public long f25352u;

    /* renamed from: v, reason: collision with root package name */
    public int f25353v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25354w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f25355x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(t tVar, te.c cVar) {
        super(2, cVar);
        this.f25355x = tVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        c2 c2Var = new c2(this.f25355x, cVar);
        c2Var.f25354w = obj;
        return c2Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
//         jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f25353v
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 != r1) goto L11
            long r2 = r6.f25352u
            java.lang.Object r0 = r6.f25354w
            b r0 = (b) r0
            pe.a.e(r7)
            goto L41
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r7)
            r7 = 0
            return r7
        L18:
            pe.a.e(r7)
            java.lang.Object r7 = r6.f25354w
            b r7 = (b) r7
            t r0 = r6.f25355x
            long r2 = r0.f27342b
            g0 r7 = (g0) r7
            r2 r0 = r7.d()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L31:
            r6.f25354w = r0
            r6.f25352u = r2
            r6.f25353v = r1
            r7 = 3
            java.lang.Object r7 = k2.c(r0, r6, r7)
            ue.a r4 = ue.a.f27192u
            if (r7 != r4) goto L41
            return r4
        L41:
            t r7 = (t) r7
            long r4 = r7.f27342b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L31
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
