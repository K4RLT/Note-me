package ya;
import q.a;
import q.b;
import b0.e1;
import ic.n;
import k8.c;
import k8.d;
import n8.o;
import n8.p;
import n8.q;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31398a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31399b;

    public nf(Context context, mf mfVar, int i) {
        this.f31398a = i;
        switch (i) {
            case 1:
                a aVar = a.e;
                q.b(context);
                o c10 = q.a().c(aVar);
                if (a.f20019d.contains(new c("json"))) {
                    new n(new q(c10, 4));
                }
                this.f31399b = new n(new q(c10, 5));
                return;
            default:
                ArrayList arrayList = new ArrayList();
                this.f31399b = arrayList;
                arrayList.add(new nf(context, mfVar, 1));
                return;
        }
    }

    public final void a(e1 e1Var) {
        a aVar;
        switch (this.f31398a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f31399b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((nf) obj).a(e1Var);
                }
                return;
            default:
                p pVar = (p) ((n) this.f31399b).get();
                if (e1Var.f1179b != 0) {
                    aVar = new a(e1Var.n(), d.f19626u, null);
                } else {
                    aVar = new a(e1Var.n(), d.f19627v, null);
                }
                pVar.a(aVar, new a(17));
                return;
        }
    }
}
