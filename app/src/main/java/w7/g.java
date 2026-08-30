package w7;
import r1.a;
import v1.b;
import v1.k;
import v1.t;
import w7.g;
import x.o;

/* loaded from: classes.dex */
public final class g extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28262u;

    /* renamed from: v, reason: collision with root package name */
    public int f28263v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f28264w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f28262u = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f28262u) {
            case 0:
                g gVar = new g(2, cVar, 0);
                gVar.f28264w = obj;
                return gVar;
            default:
                g gVar2 = new g(2, cVar, 1);
                gVar2.f28264w = obj;
                return gVar2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f28262u) {
            case 0:
                ((g) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
            default:
                ((g) create(bVar, cVar)).invokeSuspend(pe.z.f22715a);
                return ue.a.f27192u;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[LOOP:1: B:25:0x0077->B:27:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0028 -> B:7:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:22:0x006d). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f28262u
            switch(r0) {
                case 0: goto L46;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f28264w
            b r0 = (b) r0
            int r1 = r3.f28263v
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L14
            pe.a.e(r4)
            goto L2c
        L14:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r4)
            r4 = 0
            goto L2b
        L1b:
            pe.a.e(r4)
        L1e:
            r3.f28264w = r0
            r3.f28263v = r2
            java.lang.Object r4 = b.q0(r0, r3)
            ue.a r1 = ue.a.f27192u
            if (r4 != r1) goto L2c
            r4 = r1
        L2b:
            return r4
        L2c:
            k r4 = (k) r4
            java.lang.Object r4 = r4.f27327a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r4.next()
            t r1 = (t) r1
            a()
            goto L36
        L46:
            java.lang.Object r0 = r3.f28264w
            b r0 = (b) r0
            int r1 = r3.f28263v
            r2 = 1
            if (r1 == 0) goto L5c
            if (r1 != r2) goto L55
            pe.a.e(r4)
            goto L6d
        L55:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r4)
            r4 = 0
            goto L6c
        L5c:
            pe.a.e(r4)
        L5f:
            r3.f28264w = r0
            r3.f28263v = r2
            java.lang.Object r4 = b.q0(r0, r3)
            ue.a r1 = ue.a.f27192u
            if (r4 != r1) goto L6d
            r4 = r1
        L6c:
            return r4
        L6d:
            k r4 = (k) r4
            java.lang.Object r4 = r4.f27327a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r4.next()
            t r1 = (t) r1
            a()
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
