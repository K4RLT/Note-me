package g7;

import android.util.Log;
import ib.o;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.p;
import nd.s;
import sf.n0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ib.d, ib.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17559u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f17560v;

    public /* synthetic */ b(String str, int i) {
        this.f17559u = i;
        this.f17560v = str;
    }

    @Override // ib.g
    public o q(Object obj) {
        s sVar = (s) obj;
        switch (this.f17559u) {
            case 2:
                sVar.getClass();
                o d2 = sVar.d(new p("S", this.f17560v));
                sVar.f();
                return d2;
            default:
                sVar.getClass();
                o d10 = sVar.d(new p("U", this.f17560v));
                sVar.f();
                return d10;
        }
    }

    @Override // ib.d
    public void w(Exception exc) {
        Object value;
        Map map;
        switch (this.f17559u) {
            case 0:
                Log.w("PlayAssetManager", "removePack(" + this.f17560v + ") falló: " + exc.getMessage());
                return;
            default:
                String message = exc.getMessage();
                StringBuilder sb2 = new StringBuilder("fetch(");
                String str = this.f17560v;
                sb2.append(str);
                sb2.append(") falló: ");
                sb2.append(message);
                Log.w("PlayAssetManager", sb2.toString());
                n0 n0Var = i.f17566a;
                do {
                    value = n0Var.getValue();
                    Map map2 = (Map) value;
                    map2.getClass();
                    boolean isEmpty = map2.isEmpty();
                    d dVar = d.f17562a;
                    if (isEmpty) {
                        map = Collections.singletonMap(str, dVar);
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(str, dVar);
                        map = linkedHashMap;
                    }
                } while (!n0Var.i(value, map));
                return;
        }
    }
}
