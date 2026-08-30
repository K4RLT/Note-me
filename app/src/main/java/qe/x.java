package qe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class x {
    public static Object a(Object obj, Map map) {
        map.getClass();
        if (map instanceof w) {
            return ((w) map).d();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map c(pe.j... jVarArr) {
        if (jVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b(jVarArr.length));
            e(linkedHashMap, jVarArr);
            return linkedHashMap;
        }
        return t.f24024u;
    }

    public static LinkedHashMap d(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void e(HashMap hashMap, pe.j[] jVarArr) {
        for (pe.j jVar : jVarArr) {
            hashMap.put(jVar.f22693u, jVar.f22694v);
        }
    }

    public static Map f(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(b(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    pe.j jVar = (pe.j) obj;
                    linkedHashMap.put(jVar.f22693u, jVar.f22694v);
                }
                return linkedHashMap;
            }
            pe.j jVar2 = (pe.j) arrayList.get(0);
            jVar2.getClass();
            Map singletonMap = Collections.singletonMap(jVar2.f22693u, jVar2.f22694v);
            singletonMap.getClass();
            return singletonMap;
        }
        return t.f24024u;
    }
}
