package o2;

import android.text.SegmentFinder;
import com.google.android.gms.internal.ads.x90;

/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x90 f21763a;

    public a(x90 x90Var) {
        this.f21763a = x90Var;
    }

    public final int nextEndBoundary(int i) {
        return this.f21763a.j(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f21763a.g(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f21763a.h(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f21763a.i(i);
    }
}
