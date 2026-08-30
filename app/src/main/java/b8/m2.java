package b8;
import l.a;
import r0.a1;
import u7.b;
import u7.m3;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class m2 extends ve.i implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2406u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f2407v;

    /* renamed from: w, reason: collision with root package name */
    public int f2408w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2409x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f2410y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2411z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(m3 m3Var, int i, int i10, String str, File file, w7.k0 k0Var, te.c cVar) {
        super(2, cVar);
        this.f2407v = m3Var;
        this.f2408w = i;
        this.f2409x = i10;
        this.A = str;
        this.f2410y = file;
        this.f2411z = k0Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2406u) {
            case 0:
                m2 m2Var = new m2(this.f2409x, (Context) this.f2411z, (String) this.A, cVar, this.f2407v);
                m2Var.f2410y = obj;
                return m2Var;
            case 1:
                return new m2(this.f2407v, this.f2408w, this.f2409x, (kotlin.jvm.internal.y) this.f2410y, (a1) this.f2411z, (a1) this.A, cVar);
            default:
                return new m2(this.f2407v, this.f2408w, this.f2409x, (String) this.A, (File) this.f2410y, (w7.k0) this.f2411z, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2406u) {
            case 0:
                return ((m2) create((File) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                m2 m2Var = (m2) create((pf.z) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                m2Var.invokeSuspend(zVar);
                return zVar;
            default:
                m2 m2Var2 = (m2) create((pf.z) obj, (te.c) obj2);
                pe.z zVar2 = pe.z.f22715a;
                m2Var2.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2406u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f2411z;
        Object obj3 = this.A;
        switch (i) {
            case 0:
                File file = (File) this.f2410y;
                int i10 = this.f2408w;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f2410y = null;
                this.f2408w = 1;
                wf.e eVar = pf.l0.f22767a;
                Object J = pf.b0.J(wf.d.f29913w, new v4(this.f2409x, (Context) obj2, file, (String) obj3, null, this.f2407v), this);
                ue.a aVar = ue.a.f27192u;
                if (J == aVar) {
                    return aVar;
                }
                return J;
            case 1:
                pe.a.e(obj);
                a1 a1Var = (a1) obj2;
                String str = (String) a1Var.getValue();
                if (str != null && !kotlin.jvm.internal.a((String) ((a1) obj3).getValue(), str)) {
                    this.f2407v.t(this.f2408w, this.f2409x, (Context) ((kotlin.jvm.internal.y) this.f2410y).f19787u, str);
                    a1Var.setValue(null);
                }
                return zVar;
            default:
                pe.a.e(obj);
                int i11 = this.f2408w;
                String str2 = (String) obj3;
                String absolutePath = new File((File) this.f2410y, str2).getAbsolutePath();
                absolutePath.getClass();
                m3.n(this.f2407v, i11, this.f2409x, new b(str2, absolutePath, 0.5f, 0.5f, 1.0f, 0.0f, null, false, null, null, 0.0f, null, 4194240), null, null, 56);
                ((w7.k0) obj2).invoke();
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(int i, Context context, String str, te.c cVar, m3 m3Var) {
        super(2, cVar);
        this.f2411z = context;
        this.f2407v = m3Var;
        this.A = str;
        this.f2409x = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f2407v = m3Var;
        this.f2408w = i;
        this.f2409x = i10;
        this.f2410y = yVar;
        this.f2411z = a1Var;
        this.A = a1Var2;
    }
}
