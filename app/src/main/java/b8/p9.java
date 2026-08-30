package b8;
import b0.x;
import r0.a1;

import android.content.Context;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final /* synthetic */ class p9 extends kotlin.jvm.internal.j implements df.a {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2535u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f2536v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pf.z f2537w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f2538x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u6 f2539y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ca f2540z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Context context, pf.z zVar, a1 a1Var, u6 u6Var, ca caVar, a1 a1Var2, a1 a1Var3, int i) {
        super(0, kotlin.jvm.internal.k.class, "add", "UniverseScreenContent$lambda$68$0$1$11$4$0$add(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lcom/daren/scraply/universe/UniverseApi;Lcom/daren/scraply/universe/UniverseListing;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f2535u = i;
        switch (i) {
            case 1:
                this.f2536v = context;
                this.f2537w = zVar;
                this.f2538x = a1Var;
                this.f2539y = u6Var;
                this.f2540z = caVar;
                this.A = a1Var2;
                this.B = a1Var3;
                super(0, kotlin.jvm.internal.k.class, "add", "UniverseScreenContent$lambda$68$0$1$11$4$0$add(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lcom/daren/scraply/universe/UniverseApi;Lcom/daren/scraply/universe/UniverseListing;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
                return;
            default:
                this.f2536v = context;
                this.f2537w = zVar;
                this.f2538x = a1Var;
                this.f2539y = u6Var;
                this.f2540z = caVar;
                this.A = a1Var2;
                this.B = a1Var3;
                return;
        }
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f2535u;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                Context context = this.f2536v;
                String string = context.getString(R.string.universe_adding);
                a1 a1Var = this.f2538x;
                a1Var.setValue(string);
                u6 u6Var = this.f2539y;
                ca caVar = this.f2540z;
                pf.z zVar2 = this.f2537w;
                pf.x(zVar2, null, new q9(u6Var, caVar, context, a1Var, zVar2, this.A, this.B, null), 3);
                return zVar;
            default:
                q.t tVar = z9.f3099a;
                Context context2 = this.f2536v;
                String string2 = context2.getString(R.string.universe_adding);
                a1 a1Var2 = this.f2538x;
                a1Var2.setValue(string2);
                u6 u6Var2 = this.f2539y;
                ca caVar2 = this.f2540z;
                pf.z zVar3 = this.f2537w;
                pf.x(zVar3, null, new q9(u6Var2, caVar2, context2, a1Var2, zVar3, this.A, this.B, null), 3);
                return zVar;
        }
    }
}
