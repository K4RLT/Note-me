package lb;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f20212a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static ArrayList a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(m1.f20208a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            int i = 0;
            while (true) {
                int length = listFiles.length;
                if (i < length) {
                    File file3 = listFiles[i];
                    int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                    if (parseInt > length || fileArr2[parseInt] != null) {
                        break;
                    }
                    fileArr2[parseInt] = file3;
                    i++;
                } else {
                    fileArr = fileArr2;
                    break;
                }
            }
            throw new k0("Metadata folder ordering corrupt.");
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    String str = new d0(fileInputStream).f().f20087a;
                    if (str != null) {
                        File file5 = new File(file, str);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new k0("Missing asset file " + file5.getCanonicalPath() + " during slice reconstruction.");
                        }
                    } else {
                        throw new k0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
