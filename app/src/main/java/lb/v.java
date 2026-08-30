package lb;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final c7.a f20287c = new c7.a("AssetPackStorage", 5);

    /* renamed from: d, reason: collision with root package name */
    public static final long f20288d = 1209600000;
    public static final long e = 2419200000L;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20289a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f20290b;

    public v(Context context, g1 g1Var) {
        this.f20289a = context;
        this.f20290b = g1Var;
    }

    public static long b(File file, boolean z3) {
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            c7.a aVar = f20287c;
            if (z3 && file.listFiles().length > 1) {
                aVar.g("Multiple pack versions found, using highest version code.", new Object[0]);
            }
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e8) {
                aVar.d(e8, "Corrupt asset pack directories.", new Object[0]);
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
            }
            return -1L;
        }
        return -1L;
    }

    public static void g(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b10 = b(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(b10)) && !file2.getName().equals("stale.tmp")) {
                    h(file2);
                }
            }
        }
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        boolean z3 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z3 &= h(file2);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z3;
    }

    public final void a(String str, long j10, int i) {
        File c10 = c(str);
        if (c10.exists()) {
            for (File file : c10.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    h(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j10))) {
                            h(file2);
                        }
                    }
                }
            }
        }
    }

    public final File c(String str) {
        return new File(e(), str);
    }

    public final File d(String str, long j10, int i) {
        return new File(new File(new File(new File(e(), "_tmp"), str), String.valueOf(i)), String.valueOf(j10));
    }

    public final File e() {
        return new File(this.f20289a.getFilesDir(), "assetpacks");
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        try {
            if (e().exists() && e().listFiles() != null) {
                for (File file : e().listFiles()) {
                    if (!file.getCanonicalPath().equals(new File(e(), "_tmp").getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
            }
            return arrayList;
        } catch (IOException e8) {
            f20287c.c("Could not process directory while scanning installed packs. %s", e8);
            return arrayList;
        }
    }

    public final int i(String str, long j10, int i) {
        File file = new File(new File(d(str, j10, i), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e8) {
                    throw new k0(e8, "Merge checkpoint file corrupt.");
                }
            }
            throw new k0("Merge checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final y j(String str) {
        String n10 = n(str);
        if (n10 == null) {
            return null;
        }
        File file = new File(n10, "assets");
        if (!file.isDirectory()) {
            f20287c.c("Failed to find assets directory: %s", file);
            return null;
        }
        return new y(n10, 0, file.getCanonicalPath());
    }

    public final File k(String str, long j10, int i) {
        return new File(new File(c(str), String.valueOf(i)), String.valueOf(j10));
    }

    public final File l(int i, long j10, String str, String str2) {
        return new File(new File(new File(d(str, j10, i), "_slices"), "_unverified"), str2);
    }

    public final File m(int i, long j10, String str, String str2) {
        return new File(new File(new File(d(str, j10, i), "_slices"), "_verified"), str2);
    }

    public final String n(String str) {
        int length;
        File file = new File(e(), str);
        boolean exists = file.exists();
        c7.a aVar = f20287c;
        if (!exists) {
            aVar.a("Pack not found with pack name: %s", str);
            return null;
        }
        g1 g1Var = this.f20290b;
        File file2 = new File(file, String.valueOf(g1Var.a()));
        if (!file2.exists()) {
            aVar.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(g1Var.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles != null && (length = listFiles.length) != 0) {
            if (length > 1) {
                aVar.c("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(g1Var.a()));
                return null;
            }
            return listFiles[0].getCanonicalPath();
        }
        aVar.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(g1Var.a()));
        return null;
    }

    public final HashMap o() {
        HashMap hashMap = new HashMap();
        ArrayList f10 = f();
        int size = f10.size();
        int i = 0;
        while (i < size) {
            Object obj = f10.get(i);
            i++;
            String name = ((File) obj).getName();
            int b10 = (int) b(c(name), true);
            long b11 = b(new File(c(name), String.valueOf(b10)), true);
            if (k(name, b11, b10).exists()) {
                hashMap.put(name, Long.valueOf(b11));
            }
        }
        return hashMap;
    }

    public final HashMap p() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ArrayList f10 = f();
            int size = f10.size();
            int i = 0;
            while (i < size) {
                Object obj = f10.get(i);
                i++;
                File file = (File) obj;
                y j10 = j(file.getName());
                if (j10 != null) {
                    hashMap2.put(file.getName(), j10);
                }
            }
        } catch (IOException e8) {
            f20287c.c("Could not process directory while scanning installed packs: %s", e8);
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(b(new File(c(str), String.valueOf((int) b(c(str), true))), true)));
        }
        return hashMap;
    }
}
