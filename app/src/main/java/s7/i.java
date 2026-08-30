package s7;
import c.d;

import android.content.Context;
import df.p;
import pf.z;
import r0.a1;

/* loaded from: classes.dex */
public final class i extends ve.i implements p {

    /* renamed from: u, reason: collision with root package name */
    public int f25023u;

    /* renamed from: v, reason: collision with root package name */
    public int f25024v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f25025w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f25026x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f25027y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f25028z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z3, Context context, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f25025w = z3;
        this.f25026x = context;
        this.f25027y = a1Var;
        this.f25028z = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new i(this.f25025w, this.f25026x, this.f25027y, this.f25028z, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (pf.b0.j(r5, r7) != r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:6:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0096 -> B:9:0x002f). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f25024v
            r1 = 2
            r0.a1 r2 = r7.f25027y
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r1) goto L14
            int r0 = r7.f25023u
            pe.a.e(r8)
            goto L7c
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r8)
            r8 = 0
            return r8
        L1b:
            pe.a.e(r8)
            goto L45
        L1f:
            pe.a.e(r8)
            boolean r8 = r7.f25025w
            if (r8 != 0) goto L2e
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r2.setValue(r8)
            pe.z r8 = pe.z.f22715a
            return r8
        L2e:
            r8 = r3
        L2f:
            r0.i1 r0 = s7.j.f25029a
            if (r8 == 0) goto L37
            r5 = 40000(0x9c40, double:1.97626E-319)
            goto L3a
        L37:
            r5 = 240000(0x3a980, double:1.18576E-318)
        L3a:
            r7.f25023u = r8
            r7.f25024v = r3
            java.lang.Object r8 = pf.b0.j(r5, r7)
            if (r8 != r4) goto L45
            goto L95
        L45:
            r0.a1 r8 = r7.f25028z
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r0 = 0
            if (r8 != 0) goto L96
            r0.i1 r8 = s7.j.f25029a
            android.content.Context r8 = r7.f25026x
            r8.getClass()
            java.lang.String r5 = "apis_promo"
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r5, r0)
            java.lang.String r5 = "dismissed"
            boolean r8 = r8.getBoolean(r5, r0)
            if (r8 != 0) goto L96
            int r8 = s7.j.f25030b
            r5 = 3
            if (r8 >= r5) goto L96
            int r8 = r8 + 1
            s7.j.f25030b = r8
            java.lang.String r8 = "bee_visit"
            f7.d(r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r2.setValue(r8)
        L7c:
            r8 = r0
        L7d:
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2f
            r7.f25023u = r8
            r7.f25024v = r1
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = pf.b0.j(r5, r7)
            if (r0 != r4) goto L7d
        L95:
            return r4
        L96:
            r8 = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
