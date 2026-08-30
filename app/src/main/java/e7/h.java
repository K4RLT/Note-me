package e7;

import android.content.Context;
import android.util.Log;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15950a;

    public /* synthetic */ h(Context context) {
        o oVar = o.f15975a;
        this.f15950a = context;
    }

    public final void a(e9.b bVar) {
        String str;
        o oVar = o.f15975a;
        Map b10 = bVar.b();
        b10.getClass();
        for (Map.Entry entry : b10.entrySet()) {
            String str2 = (String) entry.getKey();
            e9.a aVar = (e9.a) entry.getValue();
            int a10 = aVar.a();
            String description = aVar.getDescription();
            StringBuilder sb2 = new StringBuilder("mediacion: ");
            sb2.append(str2);
            sb2.append(" → ");
            if (a10 != 1) {
                if (a10 != 2) {
                    str = "null";
                } else {
                    str = "READY";
                }
            } else {
                str = "NOT_READY";
            }
            sb2.append(str);
            sb2.append(" (");
            sb2.append(description);
            sb2.append(")");
            Log.d("AdsManager", sb2.toString());
        }
        Context context = this.f15950a;
        context.getClass();
        o.d(context);
    }
}
