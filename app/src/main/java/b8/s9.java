package b8;
import k7.f;
import r0.a1;
import u7.m3;
import z5.d;

import android.content.Context;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final class s9 extends ve.i implements df.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ m3 C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ a1 E;

    /* renamed from: u, reason: collision with root package name */
    public int f2737u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u6 f2738v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f2739w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f2740x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f2741y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f2742z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(u6 u6Var, String str, f fVar, String str2, String str3, String str4, Context context, m3 m3Var, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f2738v = u6Var;
        this.f2739w = str;
        this.f2740x = fVar;
        this.f2741y = str2;
        this.f2742z = str3;
        this.A = str4;
        this.B = context;
        this.C = m3Var;
        this.D = a1Var;
        this.E = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new s9(this.f2738v, this.f2739w, this.f2740x, this.f2741y, this.f2742z, this.A, this.B, this.C, this.D, this.E, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s9) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        int i = this.f2737u;
        Context context = this.B;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                c10 = ((pe.l) obj).f22696u;
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            String str = this.f2739w;
            u6 u6Var = this.f2738v;
            u6Var.b(str);
            f fVar = this.f2740x;
            s4 s4Var = new s4(fVar.f19605a, this.f2741y, this.f2739w, "template", this.f2742z, this.A, "");
            m3 m3Var = this.C;
            r9 r9Var = new r9(context, m3Var, fVar, null, 0);
            n2 n2Var = new n2(context, m3Var, fVar, null, 1);
            this.f2737u = 1;
            c10 = u6Var.c(s4Var, r9Var, n2Var, this);
            ue.a aVar = ue.a.f27192u;
            if (c10 == aVar) {
                return aVar;
            }
        }
        q.t tVar = z9.f3099a;
        this.D.setValue(null);
        z5 z5Var = z5.f3075a;
        d();
        if (!(c10 instanceof pe.k)) {
            String string = context.getString(R.string.universe_published);
            string.getClass();
            z9.q(context, string);
            this.E.setValue(la.EXPLORE);
        } else {
            String string2 = context.getString(R.string.universe_publish_failed);
            string2.getClass();
            z9.q(context, string2);
        }
        return pe.z.f22715a;
    }
}
