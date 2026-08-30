package h7;

import java.util.ArrayList;
import pe.z;

/* loaded from: classes.dex */
public final class h extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public int f17888u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j7.l f17889v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7.f f17890w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j7.f f17891x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17892y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j7.l lVar, k7.f fVar, j7.f fVar2, ArrayList arrayList, te.c cVar) {
        super(1, cVar);
        this.f17889v = lVar;
        this.f17890w = fVar;
        this.f17891x = fVar2;
        this.f17892y = arrayList;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new h(this.f17889v, this.f17890w, this.f17891x, this.f17892y, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        return ((h) create((te.c) obj)).invokeSuspend(z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r6.f17889v.b(r6.f17890w, r6) == r4) goto L18;
     */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f17888u
            pe.z r1 = pe.z.f22715a
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            pe.a.e(r7)
            goto L48
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r7)
            r7 = 0
            return r7
        L19:
            pe.a.e(r7)
            goto L2d
        L1d:
            pe.a.e(r7)
            r6.f17888u = r3
            j7.l r7 = r6.f17889v
            k7.f r0 = r6.f17890w
            java.lang.Object r7 = r7.b(r0, r6)
            if (r7 != r4) goto L2d
            goto L47
        L2d:
            r6.f17888u = r2
            j7.f r7 = r6.f17891x
            r7.getClass()
            g5.w r0 = new g5.w
            r2 = 0
            r3 = 3
            java.util.ArrayList r5 = r6.f17892y
            r0.<init>(r7, r5, r2, r3)
            java.lang.Object r7 = wa.g8.a(r0, r6)
            if (r7 != r4) goto L44
            goto L45
        L44:
            r7 = r1
        L45:
            if (r7 != r4) goto L48
        L47:
            return r4
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
