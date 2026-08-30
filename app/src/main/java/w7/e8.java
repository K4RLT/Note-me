package w7;
import c.c;
import c.i;
import r0.a1;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class e8 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f28164u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.i7 f28165v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28166w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28167x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28168y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f28169z;

    public e8(Context context, u7.i7 i7Var, u7.m3 m3Var, int i, int i10, a1 a1Var) {
        this.f28164u = context;
        this.f28165v = i7Var;
        this.f28166w = m3Var;
        this.f28167x = i;
        this.f28168y = i10;
        this.f28169z = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        Set set = x7.g0.f30195a;
        String str = this.f28165v.f26339a;
        x7.g0.c(this.f28164u, "paper:".concat(str));
        float f10 = h8.f28370a;
        a1 a1Var = this.f28169z;
        int i = g8.f28307a[((i8) a1Var.getValue()).ordinal()];
        u7.m3 m3Var = this.f28166w;
        int i10 = this.f28167x;
        int i11 = this.f28168y;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m3Var.Y0(str, i10, i11, str);
                } else {
                    l4.a.o();
                    return null;
                }
            } else {
                m3Var.Y0(null, i10, i11, str);
            }
        } else {
            m3Var.Y0(str, i10, i11, null);
        }
        String analytics = ((i8) a1Var.getValue()).getAnalytics();
        analytics.getClass();
        f7.i("paper_changed", f7.c(new pe.j("paper", str), new pe.j("scope", analytics)));
        return pe.z.f22715a;
    }
}
