package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class z6 extends a7 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f15329b;

    public z6(gn gnVar, gn gnVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, gnVar);
        d(linkedHashMap, gnVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((d6) entry.getKey()).f14186c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f15329b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, gn gnVar) {
        for (int i = 0; i < gnVar.a(); i++) {
            d6 i10 = gnVar.i(i);
            Object obj = linkedHashMap.get(i10);
            boolean z3 = i10.f14186c;
            Class cls = i10.f14185b;
            if (z3) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(i10, list);
                }
                list.add(cls.cast(gnVar.r(i)));
            } else {
                linkedHashMap.put(i10, cls.cast(gnVar.r(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.a7
    public final int a() {
        return this.f15329b.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.a7
    public final Set b() {
        return this.f15329b.keySet();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.a7
    public final void c(u6 u6Var, p6 p6Var) {
        for (Map.Entry entry : this.f15329b.entrySet()) {
            d6 d6Var = (d6) entry.getKey();
            Object value = entry.getValue();
            if (d6Var.f14186c) {
                u6Var.b(d6Var, ((List) value).iterator(), p6Var);
            } else {
                u6Var.a(d6Var, value, p6Var);
            }
        }
    }
}
