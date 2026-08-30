package sf;
import x.o;
import c.c;
import q.x;

/* loaded from: classes.dex */
public final class c extends tf.e {

    /* renamed from: x, reason: collision with root package name */
    public final b5.a f25149x;

    /* renamed from: y, reason: collision with root package name */
    public final b5.a f25150y;

    public c(b5.a aVar, te.g gVar, int i, rf.a aVar2) {
        super(gVar, i, aVar2);
        this.f25149x = aVar;
        this.f25150y = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // tf.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(rf.t r5, te.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sf.b
            if (r0 == 0) goto L13
            r0 = r6
            sf.b r0 = (sf.b) r0
            int r1 = r0.f25144x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25144x = r1
            goto L1a
        L13:
            sf.b r0 = new sf.b
            ve.c r6 = (ve.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f25142v
            int r1 = r0.f25144x
            pe.z r2 = pe.z.f22715a
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            rf.t r5 = r0.f25141u
            pe.a.e(r6)
            goto L48
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r5)
        L30:
            r5 = 0
            return r5
        L32:
            pe.a.e(r6)
            r0.f25141u = r5
            r0.f25144x = r3
            b5.a r6 = r4.f25149x
            java.lang.Object r6 = r6.invoke(r5, r0)
            ue.a r0 = ue.a.f27192u
            if (r6 != r0) goto L44
            goto L45
        L44:
            r6 = r2
        L45:
            if (r6 != r0) goto L48
            return r0
        L48:
            rf.h r5 = r5.f24819x
            boolean r5 = r5.x()
            if (r5 == 0) goto L51
            return r2
        L51:
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            x.o(r5)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.c.c(rf.t, te.c):java.lang.Object");
    }

    @Override // tf.e
    public final tf.e d(te.g gVar, int i, rf.a aVar) {
        return new c(this.f25150y, gVar, i, aVar);
    }

    @Override // tf.e
    public final String toString() {
        return "block[" + this.f25149x + "] -> " + super.toString();
    }
}
