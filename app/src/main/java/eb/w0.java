package eb;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w0 extends com.google.android.gms.internal.ads.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16444h = 0;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var) {
        super(20);
        this.i = u0Var;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final Object a(Object obj) {
        com.google.android.gms.internal.measurement.j2 j2Var;
        LinkedHashMap linkedHashMap;
        switch (this.f16444h) {
            case 0:
                String str = (String) obj;
                fa.y.e(str);
                u0 u0Var = (u0) this.i;
                u0Var.y();
                fa.y.e(str);
                if (!TextUtils.isEmpty(str) && (j2Var = (com.google.android.gms.internal.measurement.j2) u0Var.C.get(str)) != null && j2Var.p() != 0) {
                    if (u0Var.C.containsKey(str) && u0Var.C.get(str) != null) {
                        u0Var.H(str, (com.google.android.gms.internal.measurement.j2) u0Var.C.get(str));
                    } else {
                        u0Var.U(str);
                    }
                    w0 w0Var = u0Var.E;
                    synchronized (((mc.c) w0Var.f6523g)) {
                        Set entrySet = ((LinkedHashMap) ((ic.c) w0Var.f6522f).f18393v).entrySet();
                        entrySet.getClass();
                        linkedHashMap = new LinkedHashMap(entrySet.size());
                        Set<Map.Entry> entrySet2 = ((LinkedHashMap) ((ic.c) w0Var.f6522f).f18393v).entrySet();
                        entrySet2.getClass();
                        for (Map.Entry entry : entrySet2) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return (com.google.android.gms.internal.measurement.v) linkedHashMap.get(str);
                }
                return null;
            default:
                String str2 = (String) obj;
                str2.getClass();
                return ((i5.h) this.i).f18244u.T(str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.h0
    public void b(Object obj, Object obj2, Object obj3) {
        switch (this.f16444h) {
            case 1:
                ((String) obj).getClass();
                ((p5.c) obj2).close();
                return;
            default:
                super.b(obj, obj2, obj3);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i5.h hVar) {
        super(25);
        this.i = hVar;
    }
}
