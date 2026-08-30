package eb;
import n.b;
import n.e;
import n.r0;

import com.google.android.gms.internal.measurement.b7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16356a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16357b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.k3 f16358c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f16359d;
    public final BitSet e;

    /* renamed from: f, reason: collision with root package name */
    public final e f16360f;

    /* renamed from: g, reason: collision with root package name */
    public final e f16361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q3 f16362h;

    /* JADX WARN: Type inference failed for: r1v1, types: [e, r0] */
    public r3(q3 q3Var, String str, com.google.android.gms.internal.measurement.k3 k3Var, BitSet bitSet, BitSet bitSet2, e eVar, e eVar2) {
        this.f16362h = q3Var;
        this.f16356a = str;
        this.f16359d = bitSet;
        this.e = bitSet2;
        this.f16360f = eVar;
        this.f16361g = new r0(0);
        Iterator it = ((b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f16361g.put(num, arrayList);
        }
        this.f16357b = false;
        this.f16358c = k3Var;
    }

    public final void a(c cVar) {
        int t3;
        boolean z3;
        boolean B;
        d1 d1Var = (d1) this.f16362h.f3443v;
        switch (cVar.e) {
            case 0:
                t3 = ((com.google.android.gms.internal.measurement.r1) cVar.f16077f).t();
                break;
            default:
                t3 = ((com.google.android.gms.internal.measurement.x1) cVar.f16077f).p();
                break;
        }
        Boolean bool = cVar.f16073a;
        if (bool != null) {
            this.e.set(t3, bool.booleanValue());
        }
        Boolean bool2 = cVar.f16074b;
        if (bool2 != null) {
            this.f16359d.set(t3, bool2.booleanValue());
        }
        if (cVar.f16075c != null) {
            Integer valueOf = Integer.valueOf(t3);
            e eVar = this.f16360f;
            Long l10 = (Long) eVar.get(valueOf);
            long longValue = cVar.f16075c.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                eVar.put(Integer.valueOf(t3), Long.valueOf(longValue));
            }
        }
        if (cVar.f16076d != null) {
            Integer valueOf2 = Integer.valueOf(t3);
            e eVar2 = this.f16361g;
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(Integer.valueOf(t3), list);
            }
            switch (cVar.e) {
                case 0:
                    z3 = false;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z3) {
                list.clear();
            }
            b7.a();
            e eVar3 = d1Var.A;
            c0 c0Var = v.f16406j0;
            String str = this.f16356a;
            if (eVar3.F(str, c0Var)) {
                switch (cVar.e) {
                    case 0:
                        B = ((com.google.android.gms.internal.measurement.r1) cVar.f16077f).B();
                        break;
                    default:
                        B = false;
                        break;
                }
                if (B) {
                    list.clear();
                }
            }
            b7.a();
            boolean F = d1Var.A.F(str, c0Var);
            Long l11 = cVar.f16076d;
            if (F) {
                long longValue2 = l11.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(l11.longValue() / 1000));
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [e, r0] */
    public r3(q3 q3Var, String str) {
        this.f16362h = q3Var;
        this.f16356a = str;
        this.f16357b = true;
        this.f16359d = new BitSet();
        this.e = new BitSet();
        this.f16360f = new r0(0);
        this.f16361g = new r0(0);
    }
}
