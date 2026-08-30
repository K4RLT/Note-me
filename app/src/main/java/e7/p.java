package e7;
import q.g;

import android.app.Activity;
import pe.z;
import sf.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15989u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f15990v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15991w;

    public /* synthetic */ p(Activity activity, String str, int i) {
        this.f15989u = i;
        this.f15990v = activity;
        this.f15991w = str;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f15989u;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                if (booleanValue) {
                    q qVar = q.f15992z;
                    qVar.getClass();
                    Activity activity = this.f15990v;
                    g(activity, this.f15991w);
                    qVar.f(activity, ((Number) ((a0) qVar.f1342y).f25140u.getValue()).intValue() - 1);
                }
                return z.f22715a;
            default:
                if (booleanValue) {
                    q.f15992z.getClass();
                    g(this.f15990v, this.f15991w);
                }
                return z.f22715a;
        }
    }
}
