package u7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class p6 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f26730a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f26731b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f26732c;

    static {
        pe.j[] jVarArr = {new pe.j("strap1", new o6("strap", 0.5f, 0.07f)), new pe.j("strap2", new o6("strap", 0.5f, 0.2133f)), new pe.j("strap3", new o6("strap", 0.5f, 0.3567f)), new pe.j("strap4", new o6("strap", 0.5f, 0.5f)), new pe.j("strap5", new o6("strap", 0.5f, 0.6433f)), new pe.j("strap6", new o6("strap", 0.5f, 0.7867f)), new pe.j("strap7", new o6("strap", 0.5f, 0.93f)), new pe.j("top_left", new o6("front", 0.24000001f, 0.22f)), new pe.j("top", new o6("front", 0.5f, 0.22f)), new pe.j("top_right", new o6("front", 0.76f, 0.22f)), new pe.j("left", new o6("front", 0.24000001f, 0.5f)), new pe.j("center", new o6("front", 0.5f, 0.5f)), new pe.j("right", new o6("front", 0.76f, 0.5f)), new pe.j("bottom_left", new o6("front", 0.24000001f, 0.78f)), new pe.j("bottom", new o6("front", 0.5f, 0.78f)), new pe.j("bottom_right", new o6("front", 0.76f, 0.78f)), new pe.j("spine", new o6("spine", 0.5f, 0.5f)), new pe.j("edge", new o6("edge", 0.5f, 0.5f))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(qe.x.b(18));
        qe.x.e(linkedHashMap, jVarArr);
        f26730a = linkedHashMap;
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (mf.m.j((String) obj, "strap")) {
                arrayList.add(obj);
            }
        }
        f26731b = arrayList;
        Set keySet2 = f26730a.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : keySet2) {
            Object obj3 = f26730a.get((String) obj2);
            obj3.getClass();
            if (((o6) obj3).f26681a.equals("front")) {
                arrayList2.add(obj2);
            }
        }
        f26732c = arrayList2;
    }

    public static s6 a(s6 s6Var) {
        s6Var.getClass();
        String str = s6Var.f26870m;
        o6 o6Var = (o6) f26730a.get(str);
        if (o6Var == null) {
            return s6Var;
        }
        String str2 = o6Var.f26681a;
        float f10 = o6Var.f26682b;
        float f11 = o6Var.f26683c;
        String str3 = s6Var.f26860a;
        String str4 = s6Var.f26861b;
        String str5 = s6Var.f26862c;
        String str6 = s6Var.f26863d;
        float f12 = s6Var.f26866h;
        float f13 = s6Var.i;
        int i = s6Var.f26867j;
        float f14 = s6Var.f26868k;
        float f15 = s6Var.f26869l;
        String str7 = s6Var.f26871n;
        String str8 = s6Var.f26872o;
        str3.getClass();
        str4.getClass();
        str.getClass();
        str7.getClass();
        str8.getClass();
        return new s6(str3, str4, str5, str6, str2, f10, f11, f12, f13, i, f14, f15, str, str7, str8);
    }
}
