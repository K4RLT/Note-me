package u7;
import k1.l0;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26980u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26981v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26982w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f26983x;

    public /* synthetic */ w(int i, int i10, Context context, m3 m3Var) {
        this.f26980u = i10;
        this.f26981v = m3Var;
        this.f26982w = i;
        this.f26983x = context;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f26980u) {
            case 0:
                h8.e eVar = (h8.e) obj;
                eVar.getClass();
                if (eVar.f17922c) {
                    this.f26981v.V0(this.f26982w, this.f26983x, Integer.valueOf(l0.F(eVar.f17920a)));
                }
                return pe.z.f22715a;
            default:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    this.f26981v.T0(this.f26982w, this.f26983x, uri);
                }
                return pe.z.f22715a;
        }
    }
}
