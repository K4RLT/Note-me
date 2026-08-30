package u7;
import b8.d5;
import o0.h;
import o7.b;
import r0.a1;
import w7.a8;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26734u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26735v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26736w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f26737x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f26738y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26739z;

    public /* synthetic */ q(int i, Context context, a1 a1Var, a1 a1Var2, m3 m3Var) {
        this.f26735v = m3Var;
        this.f26736w = i;
        this.f26737x = context;
        this.f26738y = a1Var;
        this.f26739z = a1Var2;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        switch (this.f26734u) {
            case 0:
                String str2 = (String) this.f26739z;
                a1 a1Var = this.f26738y;
                pe.j jVar = (pe.j) a1Var.getValue();
                if (jVar != null) {
                    String str3 = (String) jVar.f22693u;
                    a8 a8Var = (a8) jVar.f22694v;
                    Context context = this.f26737x;
                    context.getClass();
                    str3.getClass();
                    a8Var.getClass();
                    str2.getClass();
                    m3 m3Var = this.f26735v;
                    b bVar = (b) qe.l.y(this.f26736w, m3Var.f26547u);
                    if (bVar != null && (str = bVar.f21848a) != null) {
                        pf.b0.x(androidx.lifecycle.h(m3Var), null, new d5(str3, a8Var, str2, m3Var, str, context, null, 7), 3);
                    }
                }
                a1Var.setValue(null);
                break;
            case 1:
                a1 a1Var2 = (a1) this.f26739z;
                this.f26735v.M0(this.f26737x, this.f26736w);
                b(this.f26738y);
                u0.d(a1Var2);
                break;
            default:
                Uri uri = (Uri) this.f26739z;
                this.f26738y.setValue(uri);
                this.f26735v.T0(this.f26736w, this.f26737x, uri);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ q(Uri uri, m3 m3Var, int i, Context context, a1 a1Var) {
        this.f26739z = uri;
        this.f26735v = m3Var;
        this.f26736w = i;
        this.f26737x = context;
        this.f26738y = a1Var;
    }

    public /* synthetic */ q(a1 a1Var, m3 m3Var, int i, Context context, String str) {
        this.f26738y = a1Var;
        this.f26735v = m3Var;
        this.f26736w = i;
        this.f26737x = context;
        this.f26739z = str;
    }
}
