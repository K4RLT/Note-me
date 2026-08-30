package j9;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class j extends RelativeLayout {

    /* renamed from: u, reason: collision with root package name */
    public final k9.g f19079u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19080v;

    public j(Context context, String str, String str2, String str3) {
        super(context);
        k9.g gVar = new k9.g(context);
        gVar.f19688c = str;
        this.f19079u = gVar;
        gVar.e = str2;
        gVar.f19689d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f19080v) {
            this.f19079u.a(motionEvent);
            return false;
        }
        return false;
    }
}
