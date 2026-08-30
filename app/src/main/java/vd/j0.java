package vd;

import android.os.Message;
import java.util.Comparator;
import ya.ac;

/* loaded from: classes.dex */
public final class j0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ac.a(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
