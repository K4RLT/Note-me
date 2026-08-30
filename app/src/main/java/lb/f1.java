package lb;
import v.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: c, reason: collision with root package name */
    public static final c7.a f20134c = new c7.a("PackMetadataManager", 5);

    /* renamed from: a, reason: collision with root package name */
    public final v f20135a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f20136b;

    public f1(v vVar, g1 g1Var) {
        this.f20135a = vVar;
        this.f20136b = g1Var;
    }

    public final String a(String str) {
        v vVar = this.f20135a;
        vVar.getClass();
        try {
            if (vVar.n(str) != null) {
                int a10 = this.f20136b.a();
                File file = new File(new File(vVar.k(str, b(new File(vVar.c(str), String.valueOf((int) b(vVar.c(str), true))), true), a10), "_metadata"), "properties.dat");
                try {
                    if (!file.exists()) {
                        return String.valueOf(a10);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        Properties properties = new Properties();
                        properties.load(fileInputStream);
                        fileInputStream.close();
                        String property = properties.getProperty("moduleVersionTag");
                        if (property == null) {
                            return String.valueOf(a10);
                        }
                        return property;
                    } finally {
                    }
                } catch (IOException unused) {
                    f20134c.c("Failed to read pack version tag for pack %s", str);
                }
            }
        } catch (IOException unused2) {
        }
        return "";
    }

    public final void b(int i, long j10, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        v vVar = this.f20135a;
        vVar.getClass();
        File file = new File(new File(vVar.k(str, j10, i), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
