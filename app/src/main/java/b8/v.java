package b8;
import r0.a1;

import android.content.Context;
import android.widget.Toast;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2850u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2851v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2852w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2853x;

    public /* synthetic */ v(k0 k0Var, boolean z3, String str) {
        this.f2850u = 0;
        this.f2852w = k0Var;
        this.f2851v = z3;
        this.f2853x = str;
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f2850u;
        pe.z zVar = pe.z.f22715a;
        Object obj = this.f2853x;
        Object obj2 = this.f2852w;
        boolean z3 = this.f2851v;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (((k0) obj2) != null && !z3) {
                    sf.n0 n0Var = q0.f2559h;
                    n0Var.getClass();
                    n0Var.k(null, str);
                    sf.n0 n0Var2 = q0.f2564n;
                    Boolean bool = Boolean.FALSE;
                    n0Var2.getClass();
                    n0Var2.k(null, bool);
                    sf.n0 n0Var3 = q0.f2557f;
                    Boolean bool2 = Boolean.TRUE;
                    n0Var3.getClass();
                    n0Var3.k(null, bool2);
                }
                return zVar;
            case 1:
                Context context = (Context) obj2;
                a1 a1Var = (a1) obj;
                if (!z3) {
                    Toast.makeText(context, context.getString(R.string.spread_need_one_page), 0).show();
                } else {
                    a1Var.setValue(Boolean.valueOf(!((Boolean) a1Var.getValue()).booleanValue()));
                }
                return zVar;
            default:
                df.a aVar = (df.a) obj2;
                w7.r0 r0Var = (w7.r0) obj;
                if (z3) {
                    aVar.invoke();
                } else {
                    r0Var.invoke();
                }
                return zVar;
        }
    }

    public /* synthetic */ v(int i, Object obj, Object obj2, boolean z3) {
        this.f2850u = i;
        this.f2851v = z3;
        this.f2852w = obj;
        this.f2853x = obj2;
    }
}
