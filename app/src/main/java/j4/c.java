package j4;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import q.x;
import qe.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f18899a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18900b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f18901c;

    /* renamed from: d, reason: collision with root package name */
    public final Condition f18902d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18903f;

    public c(int i) {
        this.f18899a = i;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f18901c = reentrantLock;
        this.f18902d = reentrantLock.newCondition();
        if (i > 0) {
            return;
        }
        x.n("Pool size must be at least 1");
        throw null;
    }

    public static final a a(c cVar) {
        int i = cVar.f18899a;
        ArrayList arrayList = cVar.f18900b;
        if (!cVar.f18903f) {
            if (i == 1) {
                b bVar = (b) l.x(arrayList);
                if (bVar != null) {
                    bVar.f18898c = true;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    return bVar.f18896a;
                }
            } else {
                while (cVar.e == 0 && arrayList.size() >= i) {
                    Log.w("BufferPool", "Waiting for buffer to become available, current allocation count: " + arrayList.size());
                    cVar.f18902d.await();
                }
                arrayList.getClass();
                int size = arrayList.size();
                int i10 = 0;
                Object obj = null;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    b bVar2 = (b) obj2;
                    bVar2.getClass();
                    if (bVar2.f18898c) {
                        if (obj == null) {
                            obj = obj2;
                        }
                        bVar2.getClass();
                        e eVar = bVar2.f18897b;
                        if (eVar == null || eVar.f18906u.f() != Long.MAX_VALUE) {
                            obj = obj2;
                            break;
                        }
                    }
                }
                b bVar3 = (b) obj;
                if (bVar3 != null) {
                    cVar.e--;
                    bVar3.f18898c = false;
                    e eVar2 = bVar3.f18897b;
                    if (eVar2 != null) {
                        eVar2.f();
                        eVar2.close();
                    }
                } else {
                    bVar3 = null;
                }
                if (bVar3 != null) {
                    return bVar3.f18896a;
                }
            }
            return null;
        }
        x.o("Attempt to obtain frame buffer from FrameBufferPool that has already been closed");
        return null;
    }
}
