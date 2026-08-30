package vd;

import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements ic.d {

    /* renamed from: u */
    public final /* synthetic */ int f27622u;

    public /* synthetic */ n(int i) {
        this.f27622u = i;
    }

    public static /* synthetic */ void a(int i, Object obj, Object obj2, String str) {
        throw new ab.b(str + i + obj + obj2, 21);
    }

    public static /* synthetic */ void b(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void c(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void d(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2) {
        throw new ab.b(str + obj + ((Object) " at path ") + obj2, 22);
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        xd.g components$lambda$3;
        u components$lambda$4;
        l0 components$lambda$5;
        k8.f lambda$getComponents$0;
        k8.f lambda$getComponents$1;
        k8.f lambda$getComponents$2;
        switch (this.f27622u) {
            case 0:
                components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(nVar);
                return components$lambda$3;
            case 1:
                components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(nVar);
                return components$lambda$4;
            case 2:
                components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(nVar);
                return components$lambda$5;
            case 3:
            case 4:
            case 5:
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(nVar);
                return lambda$getComponents$2;
            case 6:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(nVar);
                return lambda$getComponents$0;
            case 7:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(nVar);
                return lambda$getComponents$1;
        }
    }
}
