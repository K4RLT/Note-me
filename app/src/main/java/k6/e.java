package k6;
import m.a;
import m.b;
import q.f;

import a6.w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.HashSet;
import java.util.Iterator;
import wa.e9;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final String f19555w = a6.f("EnqueueRunnable");

    /* renamed from: u, reason: collision with root package name */
    public final b6.o f19556u;

    /* renamed from: v, reason: collision with root package name */
    public final pw f19557v;

    public e(b6.o oVar) {
        pw pwVar = new pw(1);
        this.f19556u = oVar;
        this.f19557v = pwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c8  */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(b6.o r58) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.e.a(b6.o):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        pw pwVar = this.f19557v;
        b6.o oVar = this.f19556u;
        try {
            oVar.getClass();
            b6.r rVar = oVar.f1760a;
            HashSet hashSet = new HashSet();
            hashSet.addAll(oVar.e);
            HashSet b10 = b6.o.b(oVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (b10.contains((String) it.next())) {
                        z3 = true;
                        break;
                    }
                } else {
                    hashSet.removeAll(oVar.e);
                    z3 = false;
                    break;
                }
            }
            if (!z3) {
                WorkDatabase workDatabase = rVar.f1774c;
                workDatabase.c();
                try {
                    e9.a(workDatabase, rVar.f1773b, oVar);
                    boolean a10 = a(oVar);
                    workDatabase.v();
                    if (a10) {
                        a(rVar.f1772a, RescheduleReceiver.class, true);
                        b6.b(rVar.f1773b, rVar.f1774c, rVar.e);
                    }
                    pwVar.g(w.f294a);
                    return;
                } finally {
                    workDatabase.h();
                }
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + oVar + ")");
        } catch (Throwable th) {
            pwVar.g(new a6.t(th));
        }
    }
}
