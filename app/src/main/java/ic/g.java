package ic;
import q.b;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import wa.i8;
import wa.j8;

/* loaded from: classes.dex */
public final class g implements b {
    public static final f B = new f(0);
    public final e A;

    /* renamed from: y, reason: collision with root package name */
    public final l f18400y;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f18396u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f18397v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f18398w = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f18399x = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f18401z = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.f18400y = lVar;
        this.A = eVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a.c(lVar, l.class, dd.c.class, dd.b.class));
        int i = 0;
        arrayList3.add(a.c(this, g.class, new Class[0]));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((gd.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.A.a(componentRegistrar));
                        it.remove();
                    }
                } catch (m e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f18387b.toArray();
                int length = array.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Object obj3 = array[i12];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f18399x.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f18399x.add(obj3.toString());
                        }
                        i12++;
                    }
                }
            }
            if (this.f18396u.isEmpty()) {
                i8.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f18396u.keySet());
                arrayList6.addAll(arrayList3);
                i8.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                a aVar2 = (a) obj4;
                this.f18396u.put(aVar2, new n(new bc.c(this, 2, aVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f18401z.get();
        if (bool != null) {
            b(this.f18396u, bool.booleanValue());
        }
    }

    public final void b(HashMap hashMap, boolean z3) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            gd.b bVar = (gd.b) entry.getValue();
            int i = aVar.f18389d;
            if (i == 1 || (i == 2 && z3)) {
                bVar.get();
            }
        }
        l lVar = this.f18400y;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f18411b;
                if (arrayDeque != null) {
                    lVar.f18411b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                g5.b();
            }
        }
    }

    public final void c(boolean z3) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f18401z;
        Boolean valueOf = Boolean.valueOf(z3);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f18396u);
        }
        b(hashMap, z3);
    }

    @Override // ic.b
    public final synchronized gd.b d(r rVar) {
        j8.a(rVar, "Null interface requested.");
        return (gd.b) this.f18397v.get(rVar);
    }

    @Override // ic.b
    public final p f(r rVar) {
        gd.b d2 = d(rVar);
        if (d2 == null) {
            return new p(p.f18418c, p.f18419d);
        }
        if (d2 instanceof p) {
            return (p) d2;
        }
        return new p(null, d2);
    }

    @Override // ic.b
    public final synchronized gd.b g(r rVar) {
        o oVar = (o) this.f18398w.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return B;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, ic.o] */
    public final void j() {
        boolean z3;
        HashMap hashMap = this.f18397v;
        HashMap hashMap2 = this.f18398w;
        for (a aVar : this.f18396u.keySet()) {
            for (j jVar : aVar.f18388c) {
                if (jVar.f18408b == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = jVar.f18407a;
                if (z3 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    Object obj = new Object();
                    obj.f18417b = null;
                    obj.f18416a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f18416a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i = jVar.f18408b;
                    if (i != 1) {
                        if (i != 2) {
                            hashMap.put(rVar, new p(p.f18418c, p.f18419d));
                        }
                    } else {
                        throw new ab.b("Unsatisfied dependency for component " + aVar + ": " + rVar, 11);
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                gd.b bVar = (gd.b) this.f18396u.get(aVar);
                for (r rVar : aVar.f18387b) {
                    HashMap hashMap = this.f18397v;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new b6.g((p) ((gd.b) hashMap.get(rVar)), 11, bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ic.o] */
    public final ArrayList l() {
        HashMap hashMap = this.f18398w;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f18396u.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                gd.b bVar = (gd.b) entry.getValue();
                for (r rVar : aVar.f18387b) {
                    if (!hashMap2.containsKey(rVar)) {
                        hashMap2.put(rVar, new HashSet());
                    }
                    ((Set) hashMap2.get(rVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                Object obj = new Object();
                obj.f18417b = null;
                obj.f18416a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f18416a.addAll(set);
                hashMap.put(rVar2, obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new b6.g(oVar, 12, (gd.b) it.next()));
                }
            }
        }
        return arrayList;
    }
}