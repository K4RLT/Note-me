package d8;

import android.content.Context;
import b8.a1;
import b8.l3;
import com.daren.scraply.data.local.ScraplyDatabase;
import df.p;
import fg.s;
import pf.b0;
import pf.l0;
import pf.z;
import q.x;
import ve.i;

/* loaded from: classes.dex */
public final class e extends i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15786u;

    /* renamed from: v, reason: collision with root package name */
    public int f15787v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f15788w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f15789x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, String str, te.c cVar, int i) {
        super(2, cVar);
        this.f15786u = i;
        this.f15788w = context;
        this.f15789x = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f15786u) {
            case 0:
                return new e(this.f15788w, this.f15789x, cVar, 0);
            case 1:
                return new e(this.f15788w, this.f15789x, cVar, 1);
            default:
                return new e(this.f15788w, this.f15789x, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f15786u) {
            case 0:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f15786u;
        pe.z zVar = pe.z.f22715a;
        String str = this.f15789x;
        Context context = this.f15788w;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f15787v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                s sVar = f.f15790a;
                context.getClass();
                this.f15787v = 1;
                wf.e eVar = l0.f22767a;
                if (b0.J(wf.d.f29913w, new l3(context, str, (te.c) null), this) == aVar) {
                    return aVar;
                }
                return zVar;
            case 1:
                int i11 = this.f15787v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                s sVar2 = f.f15790a;
                context.getClass();
                this.f15787v = 1;
                wf.e eVar2 = l0.f22767a;
                if (b0.J(wf.d.f29913w, new a1(context, str, (te.c) null), this) == aVar) {
                    return aVar;
                }
                return zVar;
            default:
                int i12 = this.f15787v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                h7.c cVar = h7.c.f17879a;
                j7.f x9 = ScraplyDatabase.f4148l.a(context).x();
                this.f15787v = 1;
                Object d2 = cVar.d(context, str, x9, this);
                if (d2 == aVar) {
                    return aVar;
                }
                return d2;
        }
    }
}
