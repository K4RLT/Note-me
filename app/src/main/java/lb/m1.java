package lb;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ m1 f20208a = new Object();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return n1.f20212a.matcher(str).matches();
    }
}
