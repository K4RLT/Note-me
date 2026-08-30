package wa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i8 {
    public static void a(ArrayList arrayList) {
        boolean z3;
        boolean z9;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ic.a aVar = (ic.a) obj;
            ic.h hVar = new ic.h(aVar);
            for (ic.r rVar : aVar.f18387b) {
                if (aVar.e == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ic.i iVar = new ic.i(rVar, !z9);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z9) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (ic.h hVar2 : (Set) it.next()) {
                for (ic.j jVar : hVar2.f18402a.f18388c) {
                    if (jVar.f18409c == 0) {
                        ic.r rVar2 = jVar.f18407a;
                        if (jVar.f18408b == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Set<ic.h> set2 = (Set) hashMap.get(new ic.i(rVar2, z3));
                        if (set2 != null) {
                            for (ic.h hVar3 : set2) {
                                hVar2.f18403b.add(hVar3);
                                hVar3.f18404c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            ic.h hVar4 = (ic.h) it3.next();
            if (hVar4.f18404c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            ic.h hVar5 = (ic.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i++;
            Iterator it4 = hVar5.f18403b.iterator();
            while (it4.hasNext()) {
                ic.h hVar6 = (ic.h) it4.next();
                hVar6.f18404c.remove(hVar5);
                if (hVar6.f18404c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            ic.h hVar7 = (ic.h) it5.next();
            if (!hVar7.f18404c.isEmpty() && !hVar7.f18403b.isEmpty()) {
                arrayList2.add(hVar7.f18402a);
            }
        }
        throw new ab.b("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 11);
    }
}
