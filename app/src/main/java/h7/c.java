package h7;
import a.a;
import c.d;
import j.b;

import android.content.Context;
import android.util.Log;
import b8.b7;
import fg.s;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import pe.z;
import wa.p6;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f17879a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final s f17880b = p6.a(new b7(22));

    public static List a(Context context, String str) {
        ArrayList arrayList;
        File[] listFiles = c(context).listFiles();
        if (listFiles != null) {
            arrayList = new ArrayList();
            for (File file : listFiles) {
                String name = file.getName();
                name.getClass();
                if (mf.f.n(name, "_" + str + ".")) {
                    String name2 = file.getName();
                    name2.getClass();
                    if (!name2.startsWith("orig_")) {
                        arrayList.add(file);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return qe.s.f24023u;
        }
        return arrayList;
    }

    public static List b(Context context, String str) {
        ArrayList arrayList;
        File file = new File(context.getFilesDir(), "drawings");
        if (!file.exists()) {
            file.mkdirs();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            arrayList = new ArrayList();
            for (File file2 : listFiles) {
                String name = file2.getName();
                name.getClass();
                if (mf.f.n(name, "_notebook_" + str + "_spread_-2.")) {
                    arrayList.add(file2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return qe.s.f24023u;
        }
        return arrayList;
    }

    public static File c(Context context) {
        File file = new File(context.getFilesDir(), "covers");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void e(Context context, String str, ArrayList arrayList) {
        Object kVar;
        FileInputStream fileInputStream;
        context.getClass();
        str.getClass();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(f(context, str)), 8192));
            try {
                zipOutputStream.putNextEntry(new ZipEntry("elements.json"));
                s sVar = f17880b;
                ag.a serializer = k7.c.Companion.serializer();
                serializer.getClass();
                byte[] bytes = sVar.b(new eg.c(serializer), arrayList).getBytes(mf.a.f20798a);
                bytes.getClass();
                zipOutputStream.write(bytes);
                zipOutputStream.closeEntry();
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    j jVar = j.f17899a;
                    Iterator it = b(((k7.c) obj).f19602k).iterator();
                    while (it.hasNext()) {
                        File file = new File((String) it.next());
                        if (file.isFile() && hashSet.add(file.getName())) {
                            zipOutputStream.putNextEntry(new ZipEntry("assets/" + file.getName()));
                            fileInputStream = new FileInputStream(file);
                            try {
                                na.a(fileInputStream, zipOutputStream);
                                fileInputStream.close();
                                zipOutputStream.closeEntry();
                            } finally {
                            }
                        }
                    }
                }
                for (File file2 : a(context, str)) {
                    zipOutputStream.putNextEntry(new ZipEntry("covers/" + file2.getName()));
                    fileInputStream = new FileInputStream(file2);
                    try {
                        na.a(fileInputStream, zipOutputStream);
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    } finally {
                    }
                }
                for (File file3 : b(context, str)) {
                    zipOutputStream.putNextEntry(new ZipEntry("drawings/" + file3.getName()));
                    fileInputStream = new FileInputStream(file3);
                    try {
                        na.a(fileInputStream, zipOutputStream);
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                zipOutputStream.close();
                kVar = z.f22715a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    pa.a(zipOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            kVar = new pe.k(th3);
        }
        Throwable a10 = pe.a(kVar);
        if (a10 != null) {
            Log.w("CoverOriginal", "no se pudo guardar el original de " + str + ": " + a10.getMessage());
        }
    }

    public static File f(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(c(context), p.a.k("orig_", str, ".zip"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:1|(2:3|(31:5|6|7|8|(1:(1:(1:(6:13|14|15|16|17|18)(2:30|31))(28:32|33|34|35|36|(2:39|37)|40|41|(2:44|42)|45|46|(3:48|(1:50)|51)|52|(3:54|(3:56|(2:58|59)(1:61)|60)|62)|63|(1:65)|66|(1:68)|(5:86|87|88|(1:90)|91)(1:70)|(1:72)|73|(2:76|74)|77|78|(2:80|(1:82))|16|17|18))(3:95|96|97))(2:112|(2:114|115)(14:116|117|118|119|120|(2:122|(3:124|(1:144)(7:126|(1:128)|129|130|131|132|133)|134)(3:145|146|147))|148|149|150|151|152|153|(1:155)|84))|98|(6:100|(2:103|101)|104|105|(1:107)(1:111)|(2:109|84)(2:110|35))|36|(1:37)|40|41|(1:42)|45|46|(0)|52|(0)|63|(0)|66|(0)|(0)(0)|(0)|73|(1:74)|77|78|(0)|16|17|18))|173|6|7|8|(0)(0)|98|(0)|36|(1:37)|40|41|(1:42)|45|46|(0)|52|(0)|63|(0)|66|(0)|(0)(0)|(0)|73|(1:74)|77|78|(0)|16|17|18|(3:(0)|(1:165)|(1:140))) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x005b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ed, code lost:
    
        if (r9 == r10) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0154 A[Catch: all -> 0x005b, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a5 A[Catch: all -> 0x005b, LOOP:0: B:37:0x019f->B:39:0x01a5, LOOP_END, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bf A[Catch: all -> 0x005b, LOOP:1: B:42:0x01b9->B:44:0x01bf, LOOP_END, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d6 A[Catch: all -> 0x005b, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0201 A[Catch: all -> 0x005b, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0243 A[Catch: all -> 0x005b, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0289 A[Catch: all -> 0x005b, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2 A[Catch: all -> 0x005b, LOOP:4: B:74:0x029c->B:76:0x02a2, LOOP_END, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d2 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #10 {all -> 0x005b, blocks: (B:33:0x0055, B:36:0x0195, B:37:0x019f, B:39:0x01a5, B:41:0x01af, B:42:0x01b9, B:44:0x01bf, B:46:0x01c9, B:48:0x01d6, B:50:0x01da, B:52:0x01f6, B:54:0x0201, B:56:0x0205, B:58:0x021b, B:60:0x021e, B:63:0x022b, B:65:0x0243, B:66:0x0246, B:88:0x027d, B:91:0x0283, B:72:0x0289, B:73:0x028b, B:74:0x029c, B:76:0x02a2, B:78:0x02cc, B:80:0x02d2, B:94:0x0277, B:96:0x0066, B:98:0x0149, B:100:0x0154, B:101:0x0163, B:103:0x0169, B:105:0x0175, B:87:0x025b), top: B:8:0x0031, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r23, java.lang.String r24, j7.f r25, ve.c r26) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d(android.content.Context, java.lang.String, j7.f, ve.c):java.lang.Object");
    }
}
