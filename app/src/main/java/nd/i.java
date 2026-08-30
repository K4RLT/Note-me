package nd;
import v.g;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements ib.e {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21256u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f21257v;

    public /* synthetic */ i(FirebaseMessaging firebaseMessaging, int i) {
        this.f21256u = i;
        this.f21257v = firebaseMessaging;
    }

    @Override // ib.e
    public final void d(Object obj) {
        switch (this.f21256u) {
            case 0:
                s sVar = (s) obj;
                if (this.f21257v.e.c()) {
                    sVar.f();
                    return;
                }
                return;
            default:
                ba.a aVar = (ba.a) obj;
                if (aVar != null) {
                    g(aVar.f3113u);
                    this.f21257v.e();
                    return;
                }
                return;
        }
    }
}
