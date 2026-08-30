package u7;

import com.daren.scraply.R;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e8 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f26153a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f26154b;

    static {
        List h3 = qe.m.h(new d8("none", R.string.text_effect_none, false, false, -1, 0.5f), new d8("outline", R.string.text_effect_outline, true, true, -1, 0.45f), new d8("hollow", R.string.text_effect_hollow, false, true, -1, 0.4f), new d8("shadow", R.string.text_effect_shadow, true, true, -16777216, 0.5f), new d8("lift", R.string.text_effect_lift, false, true, -16777216, 0.45f), new d8("glow", R.string.text_effect_glow, true, true, -45149, 0.55f), new d8("echo", R.string.text_effect_echo, true, true, -7434605, 0.5f), new d8("label", R.string.text_effect_label_fx, true, true, -1, 0.45f));
        f26153a = h3;
        List list = h3;
        int b10 = qe.x.b(qe.m.d(list, 10));
        if (b10 < 16) {
            b10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (Object obj : list) {
            linkedHashMap.put(((d8) obj).f26105a, obj);
        }
        f26154b = linkedHashMap;
    }

    public static d8 a(String str) {
        str.getClass();
        d8 d8Var = (d8) f26154b.get(str);
        if (d8Var == null) {
            return (d8) qe.l.w(f26153a);
        }
        return d8Var;
    }
}
