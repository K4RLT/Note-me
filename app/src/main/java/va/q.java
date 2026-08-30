package va;

import wa.na;
import ya.rf;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements gd.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n8.o f27506b;

    public /* synthetic */ q(n8.o oVar, int i) {
        this.f27505a = i;
        this.f27506b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [k8.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [k8.e, java.lang.Object] */
    @Override // gd.b
    public final Object get() {
        switch (this.f27505a) {
            case 0:
                return this.f27506b.a("FIREBASE_ML_SDK", new k8.c("json"), new Object());
            case 1:
                return this.f27506b.a("FIREBASE_ML_SDK", new k8.c("proto"), new Object());
            case 2:
                return this.f27506b.a("FIREBASE_ML_SDK", new k8.c("json"), na.f29768y);
            case 3:
                return this.f27506b.a("FIREBASE_ML_SDK", new k8.c("proto"), na.f29767x);
            case 4:
                return this.f27506b.a("FIREBASE_ML_SDK", new k8.c("json"), rf.f31484y);
            default:
                return this.f27506b.a("FIREBASE_ML_SDK", new k8.c("proto"), rf.f31483x);
        }
    }
}
