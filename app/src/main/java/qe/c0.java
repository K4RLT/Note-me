package qe;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 extends ve.h implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Iterator C;

    /* renamed from: u, reason: collision with root package name */
    public Object f24007u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f24008v;

    /* renamed from: w, reason: collision with root package name */
    public int f24009w;

    /* renamed from: x, reason: collision with root package name */
    public int f24010x;

    /* renamed from: y, reason: collision with root package name */
    public int f24011y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f24012z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i, int i10, Iterator it, te.c cVar) {
        super(2, cVar);
        this.A = i;
        this.B = i10;
        this.C = it;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        c0 c0Var = new c0(this.A, this.B, this.C, cVar);
        c0Var.f24012z = obj;
        return c0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((lf.e) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b1  */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
