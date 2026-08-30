package jb;

import q.x;
import ya.ue;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static z5.h f19103a;

    public static void a(ac.b bVar) {
        if (bVar.isDone()) {
            boolean z3 = false;
            while (true) {
                try {
                    bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
        x.o(ue.a("Future was expected to be done: %s", bVar));
    }
}
