package n4;
import a.a;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import p4.b;

/* loaded from: classes.dex */
public interface a {
    static a a(View view) {
        Context context = view.getContext();
        o4.a a10 = o4.a.a();
        if (Build.VERSION.SDK_INT >= 34 && !a10.f21769b) {
            return new r4.a(context, a10.f21771d);
        }
        return new b(context, a10.f21771d);
    }

    void b(MotionEvent motionEvent);

    MotionEvent c();
}
