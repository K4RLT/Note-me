package h5;

import eb.x;
import i0.m;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final x f17847c = new x(22);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f17848d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f17849a;

    /* renamed from: b, reason: collision with root package name */
    public final m f17850b;

    public a(String str, boolean z3) {
        ReentrantLock reentrantLock;
        m mVar;
        synchronized (f17847c) {
            try {
                LinkedHashMap linkedHashMap = f17848d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17849a = reentrantLock;
        if (z3) {
            mVar = new m(str);
        } else {
            mVar = null;
        }
        this.f17850b = mVar;
    }
}
