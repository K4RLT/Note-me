package w7;
import k1.f;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class c3 extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        f fVar = (f) obj2;
        ((Uri) obj).getClass();
        fVar.getClass();
        Bitmap bitmap = fVar.f19477a;
        return bitmap.getHeight() * bitmap.getWidth() * 4;
    }
}
