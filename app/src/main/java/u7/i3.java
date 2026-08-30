package u7;
import f7.c;
import m3.h;
import o7.a;
import r0.a1;
import z7.c;

import android.content.Context;
import java.util.List;
import w7.lb;

/* loaded from: classes.dex */
public final class i3 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26312u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f26313v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f26314w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f26315x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(List list, boolean z3, m3 m3Var, te.c cVar) {
        super(2, cVar);
        this.f26312u = 0;
        this.f26315x = list;
        this.f26313v = z3;
        this.f26314w = m3Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26312u) {
            case 0:
                return new i3((List) this.f26315x, this.f26313v, (m3) this.f26314w, cVar);
            case 1:
                return new i3(this.f26313v, (m3) this.f26314w, (kotlin.jvm.internal.y) this.f26315x, cVar);
            case 2:
                return new i3(this.f26313v, (a1) this.f26315x, (a1) this.f26314w, cVar, 2);
            default:
                return new i3(this.f26313v, (String) this.f26315x, (a1) this.f26314w, cVar, 3);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26312u) {
            case 0:
                return ((i3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                i3 i3Var = (i3) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                i3Var.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                i3 i3Var2 = (i3) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                i3Var2.invokeSuspend(zVar3);
                return zVar3;
            default:
                i3 i3Var3 = (i3) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                i3Var3.invokeSuspend(zVar4);
                return zVar4;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f26312u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f26315x;
        Object obj3 = this.f26314w;
        boolean z3 = this.f26313v;
        switch (i) {
            case 0:
                pe.a.e(obj);
                x2 x2Var = new x2();
                for (a aVar : (List) obj2) {
                    if (!z3 || aVar.f21841c != -2) {
                        h((m3) obj3, x2Var, aVar);
                    }
                }
                return x2Var;
            case 1:
                pe.a.e(obj);
                if (!z3) {
                    ((m3) obj3).a0((Context) ((kotlin.jvm.internal.y) obj2).f19787u);
                }
                return zVar;
            case 2:
                pe.a.e(obj);
                if (!z3) {
                    ((a1) obj2).setValue(null);
                    lb.g(0.0f, (a1) obj3);
                }
                return zVar;
            default:
                pe.a.e(obj);
                if (z3) {
                    int i10 = c.f31946a;
                    ((a1) obj3).setValue((String) obj2);
                    c.o("about");
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(boolean z3, Object obj, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26312u = i;
        this.f26313v = z3;
        this.f26315x = obj;
        this.f26314w = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(boolean z3, m3 m3Var, kotlin.jvm.internal.y yVar, te.c cVar) {
        super(2, cVar);
        this.f26312u = 1;
        this.f26313v = z3;
        this.f26314w = m3Var;
        this.f26315x = yVar;
    }
}
