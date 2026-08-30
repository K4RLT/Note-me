package lc;

import android.util.Log;
import b1.h;
import ic.p;
import java.util.concurrent.atomic.AtomicReference;
import qc.j1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final d f20323c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final p f20324a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f20325b = new AtomicReference(null);

    public b(p pVar) {
        this.f20324a = pVar;
        pVar.a(new h(12, this));
    }

    public final d a() {
        b bVar = (b) this.f20325b.get();
        if (bVar == null) {
            return f20323c;
        }
        return bVar.a();
    }

    public final boolean b() {
        b bVar = (b) this.f20325b.get();
        if (bVar != null && bVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        b bVar = (b) this.f20325b.get();
        if (bVar != null && bVar.c()) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j10, j1 j1Var) {
        String k3 = g3.a.k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", k3, null);
        }
        this.f20324a.a(new a(str, j10, j1Var));
    }
}
