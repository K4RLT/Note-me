package b8;
import b8.d5;
import c0.d;
import c2.b3;
import r0.a1;
import r0.u1;
import u7.m3;
import v1.w;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class d5 extends ve.i implements df.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1974u;

    /* renamed from: v, reason: collision with root package name */
    public int f1975v;

    /* renamed from: w, reason: collision with root package name */
    public Object f1976w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1977x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1978y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1979z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(df.l lVar, Context context, String str, df.l lVar2, df.a aVar, Activity activity, te.c cVar) {
        super(2, cVar);
        this.f1974u = 1;
        this.f1976w = lVar;
        this.f1978y = context;
        this.f1979z = str;
        this.A = lVar2;
        this.f1977x = aVar;
        this.B = activity;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ve.i, df.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ve.i, df.l] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1974u) {
            case 0:
                return new d5((df.l) this.f1976w, (d) this.f1978y, (q.d) this.f1979z, (df.a) this.f1977x, (a1) this.A, (a1) this.B, cVar, 0);
            case 1:
                return new d5((df.l) this.f1976w, (Context) this.f1978y, (String) this.f1979z, (df.l) this.A, (df.a) this.f1977x, (Activity) this.B, cVar);
            case 2:
                d5 d5Var = new d5((kotlin.jvm.internal.y) this.f1978y, (u1) this.f1979z, (androidx.lifecycle.w) this.f1977x, (b3) this.A, (View) this.B, cVar);
                d5Var.f1976w = obj;
                return d5Var;
            case 3:
                d5 d5Var2 = new d5((rf.l) this.f1977x, (q.d) this.f1979z, (a1) this.A, (a1) this.B, cVar);
                d5Var2.f1978y = obj;
                return d5Var2;
            case 4:
                d5 d5Var3 = new d5((q.m0) this.A, (df.l) this.B, cVar);
                d5Var3.f1977x = obj;
                return d5Var3;
            case 5:
                d5 d5Var4 = new d5((r.w0) this.A, (df.l) this.B, cVar);
                d5Var4.f1977x = obj;
                return d5Var4;
            case 6:
                d5 d5Var5 = new d5((w) this.f1979z, (df.q) this.f1977x, (df.l) this.f1976w, (df.l) this.A, (df.l) this.B, cVar);
                d5Var5.f1978y = obj;
                return d5Var5;
            default:
                return new d5((String) this.f1976w, (w7.a8) this.f1978y, (String) this.f1979z, (m3) this.f1977x, (String) this.A, (Context) this.B, cVar, 7);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1974u) {
            case 0:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [df.l] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [pf.d1] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [pf.d1] */
    /* JADX WARN: Type inference failed for: r2v21, types: [pf.d1] */
    /* JADX WARN: Type inference failed for: r3v14, types: [df.l] */
    /* JADX WARN: Type inference failed for: r3v19, types: [yf.a] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0368 -> B:142:0x036c). Please report as a decompilation issue!!! */
    @Override // ve.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.d5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, te.c cVar, int i) {
        super(2, cVar);
        this.f1974u = i;
        this.f1976w = obj;
        this.f1978y = obj2;
        this.f1979z = obj3;
        this.f1977x = obj4;
        this.A = obj5;
        this.B = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(kotlin.jvm.internal.y yVar, u1 u1Var, androidx.lifecycle.w wVar, b3 b3Var, View view, te.c cVar) {
        super(2, cVar);
        this.f1974u = 2;
        this.f1978y = yVar;
        this.f1979z = u1Var;
        this.f1977x = wVar;
        this.A = b3Var;
        this.B = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d5(q.m0 m0Var, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f1974u = 4;
        this.A = m0Var;
        this.B = (ve.i) lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d5(r.w0 w0Var, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f1974u = 5;
        this.A = w0Var;
        this.B = (ve.i) lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(rf.l lVar, q.d dVar, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f1974u = 3;
        this.f1977x = lVar;
        this.f1979z = dVar;
        this.A = a1Var;
        this.B = a1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(w wVar, df.q qVar, df.l lVar, df.l lVar2, df.l lVar3, te.c cVar) {
        super(2, cVar);
        this.f1974u = 6;
        this.f1979z = wVar;
        this.f1977x = qVar;
        this.f1976w = lVar;
        this.A = lVar2;
        this.B = lVar3;
    }
}
