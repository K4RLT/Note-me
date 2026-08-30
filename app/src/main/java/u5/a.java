package u5;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.daren.scraply.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ya.gd;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f25852d;
    public static final Object e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f25855c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f25854b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25853a = new HashMap();

    public a(Context context) {
        this.f25855c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f25852d == null) {
            synchronized (e) {
                try {
                    if (f25852d == null) {
                        f25852d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f25852d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f25855c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f25854b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e8) {
                throw new ab.b(18, e8);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f25853a;
        if (gd.b()) {
            try {
                gd.a(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> a10 = bVar.a();
                    if (!a10.isEmpty()) {
                        for (Class cls2 : a10) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.create(this.f25855c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new ab.b(18, th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
