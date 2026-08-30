package ib;

import android.os.Looper;
import b0.e1;
import ea.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class n extends ea.e {

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f18380v;

    public n(x xVar) {
        super(xVar);
        this.f18380v = new ArrayList();
        e1 e1Var = xVar.f16049u;
        Map map = (Map) e1Var.f1180c;
        String str = "TaskOnStopCallback";
        if (!map.containsKey("TaskOnStopCallback")) {
            map.put("TaskOnStopCallback", this);
            if (e1Var.f1179b > 0) {
                new bb.a(Looper.getMainLooper(), 5).post(new ba.j(e1Var, this, str, 11, false));
                return;
            }
            return;
        }
        q.x.n(p.a.o(new StringBuilder("TaskOnStopCallback".length() + 59), "LifecycleCallback with tag ", "TaskOnStopCallback", " already added to this fragment."));
    }

    @Override // ea.e
    public final void g() {
        synchronized (this.f18380v) {
            try {
                ArrayList arrayList = this.f18380v;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m mVar = (m) ((WeakReference) obj).get();
                    if (mVar != null) {
                        mVar.c();
                    }
                }
                this.f18380v.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
