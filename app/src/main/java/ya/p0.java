package ya;
import f.c;
import ea.j;
import m3.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class p0 {
    public static void a(Context context, c cVar, o0 o0Var, Handler handler) {
        Handler handler2;
        if (Looper.myLooper() == null) {
            handler2 = new Handler(Looper.getMainLooper());
        } else {
            handler2 = new Handler();
        }
        pw pwVar = new pw(o0Var, 17, new j(handler2));
        j jVar = new j(handler);
        Context applicationContext = context.getApplicationContext();
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{cVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        f.c(applicationContext, Collections.unmodifiableList(arrayList), 0, jVar, pwVar);
    }
}
