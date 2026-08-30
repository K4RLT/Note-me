package c7;

import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.ArrayList;
import n.r0;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements p3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3998b;

    public /* synthetic */ v(int i, Object obj) {
        this.f3997a = i;
        this.f3998b = obj;
    }

    @Override // p3.a
    public final void accept(Object obj) {
        switch (this.f3997a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                n nVar = new n(arrayList);
                ((j) this.f3998b).b((f) obj, nVar);
                return;
            case 1:
                m3.e eVar = (m3.e) obj;
                if (eVar == null) {
                    eVar = new m3.e(-3);
                }
                ((pw) this.f3998b).i(eVar);
                return;
            default:
                m3.e eVar2 = (m3.e) obj;
                synchronized (m3.f.f20603c) {
                    try {
                        r0 r0Var = m3.f.f20604d;
                        ArrayList arrayList2 = (ArrayList) r0Var.get((String) this.f3998b);
                        if (arrayList2 != null) {
                            r0Var.remove((String) this.f3998b);
                            for (int i = 0; i < arrayList2.size(); i++) {
                                ((p3.a) arrayList2.get(i)).accept(eVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
