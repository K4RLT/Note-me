package b8;
import g0.b;
import b1.g0;
import d8.f;
import e7.o;

import android.content.Context;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final class w9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f2946u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f2947v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w7.s9 f2948w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f2949x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f2950y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g0 f2951z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(Context context, w7.s9 s9Var, boolean z3, boolean z9, g0 g0Var, te.c cVar) {
        super(2, cVar);
        this.f2947v = context;
        this.f2948w = s9Var;
        this.f2949x = z3;
        this.f2950y = z9;
        this.f2951z = g0Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new w9(this.f2947v, this.f2948w, this.f2949x, this.f2950y, this.f2951z, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w9) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2946u;
        Context context = this.f2947v;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            fg.s sVar = f.f15790a;
            String str = this.f2948w.f29080a;
            this.f2946u = 1;
            wf.e eVar = pf.l0.f22767a;
            obj = pf.b0.J(wf.d.f29913w, new l3(context, str, (te.c) null), this);
            ue.a aVar = ue.a.f27192u;
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            if (this.f2949x && !this.f2950y) {
                g0 g0Var = this.f2951z;
                g0Var.getClass();
                if (g0.b()) {
                    int intValue = ((Number) ((sf.n0) g0Var.f1341x).getValue()).intValue();
                    if (intValue > 0) {
                        g0Var.f(context, intValue - 1);
                    }
                    o oVar = o.f15975a;
                    o.d(context);
                }
            }
            String string = context.getString(R.string.universe_pack_added);
            string.getClass();
            z9.q(context, string);
        } else {
            String string2 = context.getString(R.string.universe_add_failed);
            string2.getClass();
            z9.q(context, string2);
        }
        return pe.z.f22715a;
    }
}
