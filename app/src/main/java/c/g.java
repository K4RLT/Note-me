package c;
import b0.a;
import i0.m;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f3231a;

    public /* synthetic */ g(o oVar) {
        this.f3231a = oVar;
    }

    public final void a(Context context) {
        context.getClass();
        o oVar = this.f3231a;
        Bundle e = ((m) oVar.f3265x.f18915w).e("android:support:activity-result");
        if (e != null) {
            m mVar = oVar.C;
            LinkedHashMap linkedHashMap = mVar.f3255b;
            LinkedHashMap linkedHashMap2 = mVar.f3254a;
            Bundle bundle = mVar.f3259g;
            ArrayList<Integer> integerArrayList = e.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = e.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = e.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    mVar.f3257d.addAll(stringArrayList2);
                }
                Bundle bundle2 = e.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList.get(i);
                    if (linkedHashMap.containsKey(str)) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (!bundle.containsKey(str)) {
                            kotlin.jvm.internal.a(linkedHashMap2).remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i);
                    num2.getClass();
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i);
                    str2.getClass();
                    String str3 = str2;
                    linkedHashMap2.put(Integer.valueOf(intValue), str3);
                    mVar.f3255b.put(str3, Integer.valueOf(intValue));
                }
            }
        }
    }
}
