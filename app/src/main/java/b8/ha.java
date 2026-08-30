package b8;
import e0.b;
import l.a;
import m.d;
import r0.m;
import r0.y;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class ha {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f2170a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final sf.n0 f2171b;

    /* renamed from: c, reason: collision with root package name */
    public static final sf.a0 f2172c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f2173d;
    public static boolean e;

    static {
        sf.n0 b10 = sf.b(qe.t.f24024u);
        f2171b = b10;
        f2172c = new sf.a0(b10);
        f2173d = new ConcurrentHashMap();
    }

    public static void a(Context context) {
        Object obj;
        if (e) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_universe_news", 0);
        qe.u uVar = qe.u.f24025u;
        Set<String> stringSet = sharedPreferences.getStringSet("visto", uVar);
        if (stringSet != null) {
            Iterator<T> it = stringSet.iterator();
            while (it.hasNext()) {
                f2170a.put((String) it.next(), Boolean.TRUE);
            }
        }
        Set<String> stringSet2 = sharedPreferences.getStringSet("estrenado", uVar);
        if (stringSet2 != null) {
            for (String str : stringSet2) {
                Iterator<E> it2 = ma.getEntries().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (kotlin.jvm.internal.a(((ma) obj).name(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ma maVar = (ma) obj;
                if (maVar != null) {
                    f2173d.put(maVar, Boolean.TRUE);
                }
            }
        }
        e = true;
    }

    public static String b(ma maVar, String str) {
        String lowerCase = maVar.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase + ":" + str;
    }

    public static boolean c(ma maVar, m mVar) {
        maVar.getClass();
        Collection collection = (Set) ((Map) y.o(f2172c, mVar).getValue()).get(maVar);
        if (collection == null) {
            collection = qe.u.f24025u;
        }
        return !collection.isEmpty();
    }

    public static void d(Context context, ma maVar, ArrayList arrayList) {
        Map map;
        Map map2;
        context.getClass();
        maVar.getClass();
        a(context);
        ArrayList arrayList2 = new ArrayList(qe.d(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(b(maVar, (String) obj));
        }
        ConcurrentHashMap concurrentHashMap = f2173d;
        boolean a10 = kotlin.jvm.internal.a(concurrentHashMap.get(maVar), Boolean.TRUE);
        sf.n0 n0Var = f2171b;
        ConcurrentHashMap concurrentHashMap2 = f2170a;
        if (!a10) {
            if (arrayList2.isEmpty()) {
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_universe_news", 0);
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                concurrentHashMap2.put((String) obj2, Boolean.TRUE);
            }
            concurrentHashMap.put(maVar, Boolean.TRUE);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Set keySet = concurrentHashMap2.keySet();
            keySet.getClass();
            SharedPreferences.Editor putStringSet = edit.putStringSet("visto", qe.l.U(keySet));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set keySet2 = linkedHashMap.keySet();
            ArrayList arrayList3 = new ArrayList(qe.d(keySet2, 10));
            Iterator it = keySet2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ma) it.next()).name());
            }
            putStringSet.putStringSet("estrenado", qe.l.U(arrayList3)).apply();
            Map map3 = (Map) n0Var.getValue();
            map3.getClass();
            boolean isEmpty = map3.isEmpty();
            qe.u uVar = qe.u.f24025u;
            if (isEmpty) {
                map2 = Collections.singletonMap(maVar, uVar);
                map2.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                linkedHashMap2.put(maVar, uVar);
                map2 = linkedHashMap2;
            }
            n0Var.k(null, map2);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj3 = arrayList2.get(i);
            i++;
            if (!kotlin.jvm.internal.a(concurrentHashMap2.get((String) obj3), Boolean.TRUE)) {
                arrayList4.add(obj3);
            }
        }
        Set U = qe.l.U(arrayList4);
        Map map4 = (Map) n0Var.getValue();
        map4.getClass();
        if (map4.isEmpty()) {
            map = Collections.singletonMap(maVar, U);
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map4);
            linkedHashMap3.put(maVar, U);
            map = linkedHashMap3;
        }
        n0Var.k(null, map);
    }
}
