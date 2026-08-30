package af;

import java.io.File;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f366b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f367c;

    /* renamed from: d, reason: collision with root package name */
    public int f368d;
    public boolean e;

    @Override // af.i
    public final File a() {
        boolean z3 = this.e;
        File file = this.f375a;
        if (!z3 && this.f367c == null) {
            File[] listFiles = file.listFiles();
            this.f367c = listFiles;
            if (listFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.f367c;
        if (fileArr != null && this.f368d < fileArr.length) {
            fileArr.getClass();
            int i = this.f368d;
            this.f368d = i + 1;
            return fileArr[i];
        }
        if (!this.f366b) {
            this.f366b = true;
            return file;
        }
        return null;
    }
}
