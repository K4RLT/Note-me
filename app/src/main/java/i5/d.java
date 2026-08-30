package i5;

import android.database.SQLException;
import ya.n9;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18228u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f18229v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f18230w;

    public /* synthetic */ d(int i, Object obj, boolean z3) {
        this.f18228u = i;
        this.f18230w = obj;
        this.f18229v = z3;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        switch (this.f18228u) {
            case 0:
                f fVar = (f) this.f18230w;
                if (this.f18229v) {
                    str = "reader";
                } else {
                    str = "writer";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Timed out attempting to acquire a " + str + " connection.");
                sb2.append("\n\nWriter pool:\n");
                fVar.f18238v.d(sb2);
                sb2.append("Reader pool:");
                sb2.append('\n');
                fVar.f18237u.d(sb2);
                try {
                    n9.b(5, sb2.toString());
                    throw null;
                } catch (SQLException e) {
                    int i = fVar.A;
                    if (i != 1) {
                        if (i == 2) {
                            e.printStackTrace();
                        }
                        return pe.z.f22715a;
                    }
                    throw e;
                }
            default:
                ((df.l) this.f18230w).invoke(Boolean.valueOf(!this.f18229v));
                return pe.z.f22715a;
        }
    }
}
