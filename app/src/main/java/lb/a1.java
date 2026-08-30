package lb;
import p.a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c7.a f20081b = new c7.a("MergeSliceTaskHandler", 5);

    /* renamed from: a, reason: collision with root package name */
    public final v f20082a;

    public a1(v vVar) {
        this.f20082a = vVar;
    }

    public static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new k0("Unable to delete directory: ".concat(String.valueOf(file)));
            }
            return;
        }
        if (!file2.exists()) {
            if (file.renameTo(file2)) {
                return;
            } else {
                throw new k0("Unable to move file: ".concat(String.valueOf(file)));
            }
        }
        throw new k0("File clashing with existing file from other slice: ".concat(file2.toString()));
    }

    public final void a(z0 z0Var) {
        String str = (String) z0Var.f13135v;
        int i = z0Var.f13134u;
        long j10 = z0Var.f20318x;
        int i10 = z0Var.f20317w;
        String str2 = z0Var.f20319y;
        v vVar = this.f20082a;
        File m4 = vVar.m(i10, j10, str, str2);
        if (m4.exists()) {
            vVar.getClass();
            File file = new File(vVar.d(str, j10, i10), "_packs");
            if (!file.exists()) {
                file.mkdirs();
            }
            b(m4, file);
            try {
                int i11 = vVar.i(str, j10, i10) + 1;
                File file2 = new File(new File(vVar.d(str, j10, i10), "_packs"), "merge.tmp");
                Properties properties = new Properties();
                properties.put("numberOfMerges", String.valueOf(i11));
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
                return;
            } catch (IOException e) {
                f20081b.c("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new k0("Writing merge checkpoint failed.", e, i);
            }
        }
        throw new k0(a.k("Cannot find verified files for slice ", z0Var.f20319y, "."), i);
    }
}
