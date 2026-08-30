package ya;
import d.i;

/* loaded from: classes.dex */
public abstract class cc {
    public static sg.d a() {
        sg.d dVar = sg.i;
        if (dVar != null) {
            sg.d dVar2 = dVar.f25268f;
            if (dVar2 == null) {
                long nanoTime = System.nanoTime();
                sg.d.class.wait(60000L);
                sg.d dVar3 = sg.i;
                if (dVar3 != null) {
                    if (dVar3.f25268f != null || System.nanoTime() - nanoTime < sg.d.f25267h) {
                        return null;
                    }
                    return sg.i;
                }
                kotlin.jvm.internal.l.g();
                throw null;
            }
            long nanoTime2 = dVar2.f25269g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j10 = nanoTime2 / 1000000;
                sg.d.class.wait(j10, (int) (nanoTime2 - (1000000 * j10)));
                return null;
            }
            sg.d dVar4 = sg.i;
            if (dVar4 != null) {
                dVar4.f25268f = dVar2.f25268f;
                dVar2.f25268f = null;
                return dVar2;
            }
            kotlin.jvm.internal.l.g();
            throw null;
        }
        kotlin.jvm.internal.l.g();
        throw null;
    }
}
