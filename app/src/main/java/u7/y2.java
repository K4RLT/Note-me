package u7;

import java.io.File;
import java.util.Comparator;
import ya.ac;

/* loaded from: classes.dex */
public final class y2 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27056u;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f27056u) {
            case 0:
                return ac.a(Integer.valueOf(((q1) obj).f26742a), Integer.valueOf(((q1) obj2).f26742a));
            case 1:
                return ac.a(Integer.valueOf(((a8) obj).d()), Integer.valueOf(((a8) obj2).d()));
            default:
                return ac.a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }
}
