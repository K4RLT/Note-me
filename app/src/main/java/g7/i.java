package g7;

import com.google.android.play.core.assetpacks.bn;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import lb.r1;
import qe.t;
import sf.a0;
import sf.e0;
import sf.n0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f17566a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f17567b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f17568c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f17569d;
    public static r1 e;

    static {
        t tVar = t.f24024u;
        n0 b10 = e0.b(tVar);
        f17566a = b10;
        f17567b = new a0(b10);
        n0 b11 = e0.b(tVar);
        f17568c = b11;
        f17569d = new a0(b11);
    }

    public static void a(String str, bn bnVar) {
        Object cVar;
        n0 n0Var;
        Object value;
        Map map;
        int i = bnVar.f15576b;
        float f10 = 0.0f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 7) {
                                cVar = f.f17564a;
                            } else {
                                cVar = g.f17565a;
                            }
                        } else {
                            cVar = d.f17562a;
                        }
                    } else {
                        cVar = e.f17563a;
                    }
                } else {
                    cVar = new c(1.0f);
                }
            } else {
                long j10 = bnVar.e;
                if (j10 != 0) {
                    f10 = ((float) bnVar.f15578d) / ((float) j10);
                }
                cVar = new c(f10);
            }
        } else {
            cVar = new c(0.0f);
        }
        do {
            n0Var = f17566a;
            value = n0Var.getValue();
            Map map2 = (Map) value;
            map2.getClass();
            if (map2.isEmpty()) {
                map = Collections.singletonMap(str, cVar);
                map.getClass();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                linkedHashMap.put(str, cVar);
                map = linkedHashMap;
            }
        } while (!n0Var.i(value, map));
    }
}
