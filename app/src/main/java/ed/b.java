package ed;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import g9.n;
import ic.r;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ic.d {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16478u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f16479v;

    public /* synthetic */ b(r rVar, int i) {
        this.f16478u = i;
        this.f16479v = rVar;
    }

    @Override // ic.d
    public final Object e(n nVar) {
        switch (this.f16478u) {
            case 0:
                return new d((Context) nVar.a(Context.class), ((bc.g) nVar.a(bc.g.class)).d(), nVar.i(r.a(e.class)), nVar.e(pd.b.class), (Executor) nVar.h(this.f16479v));
            case 1:
                return FirebaseMessagingRegistrar.a(this.f16479v, nVar);
            default:
                return RemoteConfigRegistrar.a(this.f16479v, nVar);
        }
    }
}
