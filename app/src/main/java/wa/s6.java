package wa;
import z5.h;

import android.view.DragEvent;

/* loaded from: classes.dex */
public abstract class s6 {
    public static final long a(h hVar) {
        DragEvent dragEvent = (DragEvent) hVar.f31922v;
        float x9 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x9) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
    }
}
