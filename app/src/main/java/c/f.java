package c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sf.n0;
import wa.la;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements m5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3229b;

    public /* synthetic */ f(int i, Object obj) {
        this.f3228a = i;
        this.f3229b = obj;
    }

    @Override // m5.d
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        Map map;
        pe.j[] jVarArr;
        switch (this.f3228a) {
            case 0:
                o oVar = (o) this.f3229b;
                Bundle bundle = new Bundle();
                m mVar = oVar.C;
                mVar.getClass();
                LinkedHashMap linkedHashMap = mVar.f3255b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(mVar.f3257d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.f3259g));
                return bundle;
            case 1:
                Map c10 = ((a1.p) this.f3229b).c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : c10.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
            default:
                u0 u0Var = (u0) this.f3229b;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) u0Var.f15039y;
                linkedHashMap2.getClass();
                int size = linkedHashMap2.size();
                Map map2 = qe.t.f24024u;
                if (size != 0) {
                    if (size != 1) {
                        map = new LinkedHashMap(linkedHashMap2);
                    } else {
                        Map.Entry entry2 = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        map = Collections.singletonMap(entry2.getKey(), entry2.getValue());
                        map.getClass();
                    }
                } else {
                    map = map2;
                }
                for (Map.Entry entry3 : map.entrySet()) {
                    u0Var.o(((n0) entry3.getValue()).getValue(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) u0Var.f15037w;
                linkedHashMap3.getClass();
                int size2 = linkedHashMap3.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        map2 = new LinkedHashMap(linkedHashMap3);
                    } else {
                        Map.Entry entry4 = (Map.Entry) linkedHashMap3.entrySet().iterator().next();
                        map2 = Collections.singletonMap(entry4.getKey(), entry4.getValue());
                        map2.getClass();
                    }
                }
                for (Map.Entry entry5 : map2.entrySet()) {
                    u0Var.o(((m5.d) entry5.getValue()).a(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) u0Var.f15036v;
                if (linkedHashMap4.isEmpty()) {
                    jVarArr = new pe.j[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap4.size());
                    for (Map.Entry entry6 : linkedHashMap4.entrySet()) {
                        arrayList2.add(new pe.j((String) entry6.getKey(), entry6.getValue()));
                    }
                    jVarArr = (pe.j[]) arrayList2.toArray(new pe.j[0]);
                }
                return la.a((pe.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        }
    }
}
