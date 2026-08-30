package b8;
import b8.r3;
import r0.a1;

import android.content.Context;

/* loaded from: classes.dex */
public final class r3 extends ve.i implements df.p {
    public final /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2629u = 0;

    /* renamed from: v, reason: collision with root package name */
    public Object f2630v;

    /* renamed from: w, reason: collision with root package name */
    public int f2631w;

    /* renamed from: x, reason: collision with root package name */
    public int f2632x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2633y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2634z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(a1 a1Var, Context context, a1 a1Var2, a1 a1Var3, te.c cVar) {
        super(2, cVar);
        this.A = a1Var;
        this.B = context;
        this.C = a1Var2;
        this.D = a1Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2629u) {
            case 0:
                r3 r3Var = new r3((u3) this.A, (r9) this.D, (String) this.C, cVar);
                r3Var.f2630v = obj;
                return r3Var;
            default:
                return new r3((a1) this.A, (Context) this.B, (a1) this.C, (a1) this.D, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2629u) {
            case 0:
                return ((r3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((r3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0215 A[Catch: all -> 0x0232, TryCatch #0 {all -> 0x0232, blocks: (B:84:0x01f8, B:85:0x020f, B:87:0x0215, B:89:0x0224, B:91:0x0234, B:94:0x0238), top: B:83:0x01f8 }] */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(u3 u3Var, r9 r9Var, String str, te.c cVar) {
        super(2, cVar);
        this.A = u3Var;
        this.D = r9Var;
        this.C = str;
    }
}
