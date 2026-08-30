package b8;
import k7.f;
import u7.m3;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class r9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2679u;

    /* renamed from: v, reason: collision with root package name */
    public int f2680v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2681w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f2682x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m3 f2683y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f f2684z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9(Context context, m3 m3Var, f fVar, te.c cVar, int i) {
        super(2, cVar);
        this.f2679u = i;
        this.f2682x = context;
        this.f2683y = m3Var;
        this.f2684z = fVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2679u) {
            case 0:
                r9 r9Var = new r9(this.f2682x, this.f2683y, this.f2684z, cVar, 0);
                r9Var.f2681w = obj;
                return r9Var;
            default:
                r9 r9Var2 = new r9(this.f2682x, this.f2683y, this.f2684z, cVar, 1);
                r9Var2.f2681w = obj;
                return r9Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        File file = (File) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2679u) {
            case 0:
                return ((r9) create(file, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((r9) create(file, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2679u;
        f fVar = this.f2684z;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                File file = (File) this.f2681w;
                int i10 = this.f2680v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                String str = fVar.f19605a;
                int i11 = fVar.f19607c;
                this.f2681w = null;
                this.f2680v = 1;
                wf.e eVar = pf.l0.f22767a;
                Object J = pf.b0.J(wf.d.f29913w, new v4(i11, this.f2682x, file, str, null, this.f2683y), this);
                if (J == aVar) {
                    return aVar;
                }
                return J;
            default:
                File file2 = (File) this.f2681w;
                int i12 = this.f2680v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                String str2 = fVar.f19605a;
                int i13 = fVar.f19607c;
                this.f2681w = null;
                this.f2680v = 1;
                wf.e eVar2 = pf.l0.f22767a;
                Object J2 = pf.b0.J(wf.d.f29913w, new v4(i13, this.f2682x, file2, str2, null, this.f2683y), this);
                if (J2 == aVar) {
                    return aVar;
                }
                return J2;
        }
    }
}
