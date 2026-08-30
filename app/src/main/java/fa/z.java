package fa;
import y.a;

/* loaded from: classes.dex */
public final class z extends Exception {

    /* renamed from: u, reason: collision with root package name */
    public final ca.b f16931u;

    public z(ca.b bVar) {
        boolean z3;
        if (bVar.f4022v != 0 && bVar.f4023w != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        a("ResolvableConnectionException can only be created with a connection result containing a resolution.", z3);
        this.f16931u = bVar;
    }
}
