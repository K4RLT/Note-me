package k1;

import android.graphics.PathMeasure;
import androidx.datastore.preferences.protobuf.s1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f19488a;

    public j(PathMeasure pathMeasure) {
        this.f19488a = pathMeasure;
    }

    public final void a(float f10, float f11, h hVar) {
        if (hVar != null) {
            this.f19488a.getSegment(f10, f11, hVar.f19481a, true);
        } else {
            s1.k("Unable to obtain android.graphics.Path");
        }
    }
}
