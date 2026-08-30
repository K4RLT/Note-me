package com.google.android.gms.internal.mlkit_vision_digital_ink;
import e5.b;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class vs implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx f15149b;

    public /* synthetic */ vs(lx lxVar, int i) {
        this.f15148a = i;
        this.f15149b = lxVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        switch (this.f15148a) {
            case 0:
                return n5.m((m) n5.r(this.f15149b));
            default:
                e5 e5Var = (e5) obj;
                e5 e5Var2 = (e5) n5.r(this.f15149b);
                HashMap hashMap = new HashMap();
                k5 k3 = e5Var2.entrySet().k();
                while (k3.hasNext()) {
                    Map.Entry entry = (Map.Entry) k3.next();
                    if (e5Var.containsKey(entry.getValue())) {
                        hashMap.put((or) entry.getKey(), ((os) e5Var.get(entry.getValue())).v());
                    }
                }
                return n5.m(b(hashMap));
        }
    }
}
