package h7;
import l.b;

import java.io.File;
import pe.z;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17869u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17870v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17871w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f17872x;

    public /* synthetic */ a(long j10, String str, String str2) {
        this.f17869u = 2;
        this.f17870v = str;
        this.f17872x = j10;
        this.f17871w = str2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f17869u) {
            case 0:
                File file = (File) this.f17870v;
                File file2 = (File) this.f17871w;
                String str = (String) obj;
                str.getClass();
                File file3 = new File(file, new File(str).getName());
                if (!file3.isFile()) {
                    return null;
                }
                File file4 = new File(file2, "orig_" + this.f17872x + "_" + file3.getName());
                if (!file4.exists()) {
                    af.b(file3, file4);
                }
                return file4.getAbsolutePath();
            case 1:
                File file5 = (File) this.f17870v;
                File file6 = (File) this.f17871w;
                File file7 = new File(file5, new File((String) obj).getName());
                if (!file7.exists()) {
                    return null;
                }
                File file8 = new File(file6, "imported_" + this.f17872x + "_" + file7.getName());
                if (!file8.exists()) {
                    af.b(file7, file8);
                }
                return file8.getAbsolutePath();
            default:
                String str2 = (String) this.f17870v;
                long j10 = this.f17872x;
                String str3 = (String) this.f17871w;
                p5.a aVar = (p5.a) obj;
                aVar.getClass();
                p5.c T = aVar.T("UPDATE stacks SET title = ?, updatedAt = ? WHERE id = ?");
                try {
                    T.s(1, str2);
                    T.b(2, j10);
                    T.s(3, str3);
                    T.P();
                    T.close();
                    return z.f22715a;
                } catch (Throwable th) {
                    T.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ a(File file, File file2, long j10, int i) {
        this.f17869u = i;
        this.f17870v = file;
        this.f17871w = file2;
        this.f17872x = j10;
    }
}
