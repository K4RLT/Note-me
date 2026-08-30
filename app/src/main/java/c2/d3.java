package c2;
import b0.d;
import r0.u;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import b8.l3;
import com.daren.scraply.R;
import java.util.LinkedHashMap;
import ya.jb;
import ya.lc;

/* loaded from: classes.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f3507a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r2v4, types: [sf.k0, java.lang.Object] */
    public static final sf.l0 a(Context context) {
        sf.l0 l0Var;
        LinkedHashMap linkedHashMap = f3507a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    rf.h a10 = jb.a(-1, 6, null);
                    f6.h hVar = new f6.h(new l3(contentResolver, uriFor, new c3(a10, ya.z.a(Looper.getMainLooper())), a10, context, (te.c) null));
                    pf.t1 d2 = pf.d();
                    wf.e eVar = pf.l0.f22767a;
                    obj = sf.e0.l(hVar, new uf.c(lc.c(d2, uf.n.f27235a)), new Object(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                l0Var = (sf.l0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    public static final u b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof u) {
            return (u) tag;
        }
        return null;
    }
}
