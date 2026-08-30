package eb;
import n.e;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16059u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f16060v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f16061w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f16062x;

    public /* synthetic */ b(q qVar, String str, long j10, int i) {
        this.f16059u = i;
        this.f16060v = str;
        this.f16061w = j10;
        this.f16062x = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16059u) {
            case 0:
                q qVar = this.f16062x;
                qVar.u();
                String str = this.f16060v;
                fa.y.e(str);
                e eVar = qVar.f16317x;
                boolean isEmpty = eVar.isEmpty();
                long j10 = this.f16061w;
                if (isEmpty) {
                    qVar.f16318y = j10;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                } else if (eVar.f20934w >= 100) {
                    qVar.f().D.g("Too many ads visible");
                    return;
                } else {
                    eVar.put(str, 1);
                    qVar.f16316w.put(str, Long.valueOf(j10));
                    return;
                }
            default:
                q qVar2 = this.f16062x;
                qVar2.u();
                e eVar2 = qVar2.f16316w;
                String str2 = this.f16060v;
                fa.y.e(str2);
                e eVar3 = qVar2.f16317x;
                Integer num2 = (Integer) eVar3.get(str2);
                if (num2 != null) {
                    k2 B = qVar2.w().B(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        eVar3.remove(str2);
                        Long l10 = (Long) eVar2.get(str2);
                        long j11 = this.f16061w;
                        if (l10 == null) {
                            qVar2.f().A.g("First ad unit exposure time was never set");
                        } else {
                            long longValue = j11 - l10.longValue();
                            eVar2.remove(str2);
                            qVar2.B(str2, longValue, B);
                        }
                        if (eVar3.isEmpty()) {
                            long j12 = qVar2.f16318y;
                            if (j12 == 0) {
                                qVar2.f().A.g("First ad exposure time was never set");
                                return;
                            } else {
                                qVar2.z(j11 - j12, B);
                                qVar2.f16318y = 0L;
                                return;
                            }
                        }
                        return;
                    }
                    eVar3.put(str2, Integer.valueOf(intValue));
                    return;
                }
                qVar2.f().A.f(str2, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}
