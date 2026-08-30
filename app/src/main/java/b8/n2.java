package b8;
import k7.f;
import u7.m3;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class n2 extends ve.i implements df.r {
    public final /* synthetic */ m3 A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2435u;

    /* renamed from: v, reason: collision with root package name */
    public int f2436v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ File f2437w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ String f2438x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ int f2439y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f2440z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Context context, m3 m3Var, Object obj, te.c cVar, int i) {
        super(4, cVar);
        this.f2435u = i;
        this.f2440z = context;
        this.A = m3Var;
        this.B = obj;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f2435u;
        File file = (File) obj;
        String str = (String) obj2;
        int intValue = ((Number) obj3).intValue();
        te.c cVar = (te.c) obj4;
        switch (i) {
            case 0:
                n2 n2Var = new n2(this.f2440z, this.A, (String) this.B, cVar, 0);
                n2Var.f2437w = file;
                n2Var.f2438x = str;
                n2Var.f2439y = intValue;
                return n2Var.invokeSuspend(pe.z.f22715a);
            case 1:
                n2 n2Var2 = new n2(this.f2440z, this.A, (f) this.B, cVar, 1);
                n2Var2.f2437w = file;
                n2Var2.f2438x = str;
                n2Var2.f2439y = intValue;
                return n2Var2.invokeSuspend(pe.z.f22715a);
            default:
                n2 n2Var3 = new n2(this.f2440z, this.A, (ca) this.B, cVar, 2);
                n2Var3.f2437w = file;
                n2Var3.f2438x = str;
                n2Var3.f2439y = intValue;
                return n2Var3.invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2435u;
        Object obj2 = this.B;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                File file = this.f2437w;
                String str = this.f2438x;
                int i10 = this.f2439y;
                int i11 = this.f2436v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f2437w = null;
                this.f2438x = null;
                this.f2439y = i10;
                this.f2436v = 1;
                wf.e eVar = pf.l0.f22767a;
                Object J = pf.b0.J(wf.d.f29913w, new i1(this.A, (String) obj2, this.f2440z, str, i10, file, null), this);
                if (J == aVar) {
                    return aVar;
                }
                return J;
            case 1:
                File file2 = this.f2437w;
                String str2 = this.f2438x;
                int i12 = this.f2439y;
                int i13 = this.f2436v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                String str3 = ((f) obj2).f19605a;
                this.f2437w = null;
                this.f2438x = null;
                this.f2439y = i12;
                this.f2436v = 1;
                wf.e eVar2 = pf.l0.f22767a;
                Object J2 = pf.b0.J(wf.d.f29913w, new i1(this.A, str3, this.f2440z, str2, i12, file2, null), this);
                if (J2 == aVar) {
                    return aVar;
                }
                return J2;
            default:
                File file3 = this.f2437w;
                String str4 = this.f2438x;
                int i14 = this.f2439y;
                int i15 = this.f2436v;
                if (i15 != 0) {
                    if (i15 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                String str5 = ((ca) obj2).f1946n;
                this.f2437w = null;
                this.f2438x = null;
                this.f2439y = i14;
                this.f2436v = 1;
                wf.e eVar3 = pf.l0.f22767a;
                Object J3 = pf.b0.J(wf.d.f29913w, new i1(this.A, str5, this.f2440z, str4, i14, file3, null), this);
                if (J3 == aVar) {
                    return aVar;
                }
                return J3;
        }
    }
}
