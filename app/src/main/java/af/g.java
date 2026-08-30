package af;

import java.io.File;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f370b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f371c;

    /* renamed from: d, reason: collision with root package name */
    public int f372d;

    @Override // af.i
    public final File a() {
        boolean z3 = this.f370b;
        File file = this.f375a;
        if (!z3) {
            this.f370b = true;
            return file;
        }
        File[] fileArr = this.f371c;
        if (fileArr != null && this.f372d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f371c = listFiles;
            if (listFiles == null || listFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f371c;
        fileArr2.getClass();
        int i = this.f372d;
        this.f372d = i + 1;
        return fileArr2[i];
    }
}
