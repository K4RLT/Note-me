package n3;

import android.view.View;
import android.view.ViewTreeObserver;
import j6.s;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21144u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f21145v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f21146w;

    public /* synthetic */ a(s sVar, View view, int i) {
        this.f21144u = i;
        this.f21146w = sVar;
        this.f21145v = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f21144u) {
            case 0:
                if (((d) this.f21146w.f18982w).b()) {
                    return false;
                }
                this.f21145v.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                if (((d) ((c) this.f21146w).f18982w).b()) {
                    return false;
                }
                this.f21145v.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
