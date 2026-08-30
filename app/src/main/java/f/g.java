package f;
import g.b;

import c.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import vd.n;
import wa.j6;
import wa.q6;

/* loaded from: classes.dex */
public final class g extends j6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f16616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q6 f16618d;

    public /* synthetic */ g(m mVar, String str, q6 q6Var, int i) {
        this.f16615a = i;
        this.f16616b = mVar;
        this.f16617c = str;
        this.f16618d = q6Var;
    }

    @Override // wa.j6
    public final void a(Object obj) {
        switch (this.f16615a) {
            case 0:
                m mVar = this.f16616b;
                LinkedHashMap linkedHashMap = mVar.f3255b;
                ArrayList arrayList = mVar.f3257d;
                String str = this.f16617c;
                Object obj2 = linkedHashMap.get(str);
                b bVar = (b) this.f16618d;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        mVar.b(intValue, bVar, obj);
                        return;
                    } catch (Exception e) {
                        arrayList.remove(str);
                        throw e;
                    }
                }
                n.d("Attempting to launch an unregistered ActivityResultLauncher with contract ", bVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                m mVar2 = this.f16616b;
                LinkedHashMap linkedHashMap2 = mVar2.f3255b;
                ArrayList arrayList2 = mVar2.f3257d;
                String str2 = this.f16617c;
                Object obj3 = linkedHashMap2.get(str2);
                q6 q6Var = this.f16618d;
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str2);
                    try {
                        mVar2.b(intValue2, q6Var, obj);
                        return;
                    } catch (Exception e8) {
                        arrayList2.remove(str2);
                        throw e8;
                    }
                }
                n.d("Attempting to launch an unregistered ActivityResultLauncher with contract ", q6Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }
}
