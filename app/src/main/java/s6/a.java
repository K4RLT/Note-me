package s6;

import pf.z;
import r0.a1;
import t.f1;
import t.v1;

/* loaded from: classes.dex */
public final class a extends ve.i implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24926u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f24927v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f24928w;

    /* renamed from: x, reason: collision with root package name */
    public Object f24929x;

    /* renamed from: y, reason: collision with root package name */
    public Object f24930y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f24931z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, o6.a aVar, float f10, l lVar, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f24929x = gVar;
        this.f24930y = aVar;
        this.f24928w = f10;
        this.f24931z = lVar;
        this.A = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f24926u) {
            case 0:
                return new a((g) this.f24929x, (o6.a) this.f24930y, this.f24928w, (l) this.f24931z, (a1) this.A, cVar);
            case 1:
                return new a(this.f24928w, (t.j) this.f24931z, (v1) this.A, cVar);
            default:
                return new a((u.h) this.f24930y, this.f24928w, (df.l) this.f24931z, (f1) this.A, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f24926u) {
            case 0:
                return ((a) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((a) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((a) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0122, code lost:
    
        if (r1 == r7) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0364  */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f10, t.j jVar, v1 v1Var, te.c cVar) {
        super(2, cVar);
        this.f24928w = f10;
        this.f24931z = jVar;
        this.A = v1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u.h hVar, float f10, df.l lVar, f1 f1Var, te.c cVar) {
        super(2, cVar);
        this.f24930y = hVar;
        this.f24928w = f10;
        this.f24931z = lVar;
        this.A = f1Var;
    }
}
