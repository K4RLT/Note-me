package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;
import w2.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class uu implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu f15085b;

    public /* synthetic */ uu(yu yuVar, int i) {
        this.f15084a = i;
        this.f15085b = yuVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f15084a;
        int i10 = 3;
        yu yuVar = this.f15085b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                zv zvVar = yuVar.f15305a;
                ArrayList arrayList = new ArrayList();
                Context context = zvVar.f15362a;
                SharedPreferences d2 = nw.d(context, "gms_icing_mdd_shared_files", zvVar.f15363b);
                SharedPreferences.Editor editor = null;
                for (String str : d2.getAll().keySet()) {
                    try {
                        arrayList.add(gn.m(context, str));
                    } catch (jx e) {
                        cx.h(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                        a("|").b(str).size();
                        if (editor == null) {
                            editor = d2.edit();
                        }
                        editor.remove(str);
                    }
                }
                if (editor != null) {
                    editor.commit();
                }
                va m4 = n5.m(arrayList);
                r0 r0Var = new r0(yuVar, 14, bool);
                int i11 = g2.f14354a;
                return n5.q(m4, new r0(b(), i10, r0Var), yuVar.f15311h);
            default:
                f9 e8 = yuVar.e(yuVar.f15306b.p());
                wu wuVar = new wu(yuVar, (hx) obj, 1);
                int i12 = g2.f14354a;
                return n5.q(e8, new r0(b(), i10, wuVar), yuVar.f15311h);
        }
    }
}
