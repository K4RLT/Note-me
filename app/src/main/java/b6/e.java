package b6;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1729d;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.f1726a = i;
        this.f1727b = obj;
        this.f1728c = obj2;
        this.f1729d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1726a) {
            case 0:
                h hVar = (h) this.f1727b;
                ArrayList arrayList = (ArrayList) this.f1728c;
                String str = (String) this.f1729d;
                WorkDatabase workDatabase = hVar.e;
                arrayList.addAll(workDatabase.D().c(str));
                return workDatabase.C().j(str);
            default:
                return ((jc.f) this.f1727b).f19145u.submit(new g((Callable) this.f1728c, 14, (ic.c) this.f1729d));
        }
    }
}
