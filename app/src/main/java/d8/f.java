package d8;
import a.a;
import d.a;
import f.a;

import af.l;
import android.content.Context;
import b8.b7;
import com.google.android.gms.internal.ads.wd0;
import fg.m;
import fg.n;
import fg.s;
import fg.z;
import g7.h;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import pe.k;
import pf.b0;
import pf.l0;
import pf.t1;
import qe.t;
import sf.a0;
import sf.e0;
import sf.n0;
import w7.a5;
import w7.i1;
import w7.s9;
import wa.p6;
import ya.lc;
import ya.x0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final s f15790a = p6.a(new b7(15));

    /* renamed from: b, reason: collision with root package name */
    public static final uf.c f15791b;

    /* renamed from: c, reason: collision with root package name */
    public static final yf.c f15792c;

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f15793d;
    public static final a0 e;

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f15794f;

    /* renamed from: g, reason: collision with root package name */
    public static final a0 f15795g;

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f15796h;
    public static final a0 i;

    /* renamed from: j, reason: collision with root package name */
    public static final n0 f15797j;

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f15798k;

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f15799l;

    /* renamed from: m, reason: collision with root package name */
    public static final n0 f15800m;

    /* renamed from: n, reason: collision with root package name */
    public static final a0 f15801n;

    /* renamed from: o, reason: collision with root package name */
    public static final n0 f15802o;

    /* renamed from: p, reason: collision with root package name */
    public static final a0 f15803p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile List f15804q;

    static {
        t1 d2 = b0.d();
        wf.e eVar = l0.f22767a;
        f15791b = b0.b(lc.c(d2, wf.d.f29913w));
        f15792c = yf.a();
        t tVar = t.f24024u;
        n0 b10 = e0.b(tVar);
        f15793d = b10;
        e = new a0(b10);
        n0 b11 = e0.b(tVar);
        f15794f = b11;
        f15795g = new a0(b11);
        n0 b12 = e0.b(0);
        f15796h = b12;
        i = new a0(b12);
        n0 b13 = e0.b(0);
        f15797j = b13;
        f15798k = new a0(b13);
        f15799l = new AtomicInteger(0);
        Boolean bool = Boolean.FALSE;
        n0 b14 = e0.b(bool);
        f15800m = b14;
        f15801n = new a0(b14);
        n0 b15 = e0.b(bool);
        f15802o = b15;
        f15803p = new a0(b15);
    }

    public static final String a(c cVar) {
        Object subSequence;
        Object kVar;
        if (cVar.e && cVar.f15776f != 0) {
            Serializable a10 = c8.a("download", "{\"itemType\":\"pack\",\"itemId\":\"" + cVar.f15772a + "\"}", null);
            if (a10 instanceof k) {
                a10 = null;
            }
            String str = (String) a10;
            if (str == null) {
                return null;
            }
            try {
                m mVar = (m) n.b(f15790a.c(str)).get("url");
                if (mVar != null) {
                    kVar = n.c(mVar).a();
                } else {
                    kVar = null;
                }
            } catch (Throwable th) {
                kVar = new k(th);
            }
            if (kVar instanceof k) {
                kVar = null;
            }
            String str2 = (String) kVar;
            if (str2 == null || mf.f.u(str2)) {
                return null;
            }
            return str2;
        }
        char[] cArr = {'/'};
        int i10 = 39;
        while (true) {
            int i11 = i10 - 1;
            if (!qe.k.b(cArr, "https://oqbcvhdykmiasihzbnus.supabase.co".charAt(i10))) {
                subSequence = "https://oqbcvhdykmiasihzbnus.supabase.co".subSequence(0, i10 + 1);
                break;
            }
            if (i11 < 0) {
                subSequence = "";
                break;
            }
            i10 = i11;
        }
        return wd0.n(subSequence.toString(), "/storage/v1/object/public/packs-public/", cVar.f15777g);
    }

    public static final void b() {
        n0 n0Var = f15796h;
        n0Var.k(null, Integer.valueOf(((Number) n0Var.getValue()).intValue() + 1));
    }

    public static final int c(Context context, c cVar, File file) {
        File file2;
        File[] listFiles;
        String str = cVar.f15772a;
        File file3 = null;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            file2 = new File(externalFilesDir, "taller/packs");
        } else {
            file2 = null;
        }
        if (file2 != null) {
            file3 = new File(file2, str);
        }
        int i10 = 0;
        if (file3 != null && (listFiles = file3.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file4 : listFiles) {
                if (file4.isFile()) {
                    arrayList.add(file4);
                }
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                File file5 = (File) obj;
                file5.getClass();
                String lowerCase = l.d(file5).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!kotlin.jvm.internal.l.a(file5.getName(), "pack.json") && !kotlin.jvm.internal.l.a(file5.getName(), "cover.png")) {
                    String name = file5.getName();
                    name.getClass();
                    if (!name.startsWith("_") && (lowerCase.equals("png") || lowerCase.equals("webp") || lowerCase.equals("jpg") || lowerCase.equals("mesh"))) {
                        l.b(file5, new File(file, file5.getName()));
                        i10++;
                    }
                }
            }
        }
        return i10;
    }

    public static final void d(Context context, String str, int i10) {
        File[] listFiles = k(context, str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory() && !kotlin.jvm.internal.l.a(file.getName(), String.valueOf(i10))) {
                    l.c(file);
                }
            }
        }
    }

    public static final void e(String str, h hVar) {
        Map map;
        n0 n0Var = f15793d;
        Map map2 = (Map) n0Var.getValue();
        map2.getClass();
        if (map2.isEmpty()) {
            map = Collections.singletonMap(str, hVar);
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put(str, hVar);
            map = linkedHashMap;
        }
        n0Var.k(null, map);
    }

    public static final String f(File file) {
        int i10;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            bufferedInputStream.close();
            byte[] digest = messageDigest.digest();
            digest.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "");
            int i11 = 0;
            for (byte b10 : digest) {
                i11++;
                if (i11 > 1) {
                    sb2.append((CharSequence) "");
                }
                sb2.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
            }
            sb2.append((CharSequence) "");
            return sb2.toString();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pa.a(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public static final int g(File file, File file2) {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file), 8192));
        int i10 = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return i10;
                }
                String name = new File(nextEntry.getName()).getName();
                if (!nextEntry.isDirectory()) {
                    name.getClass();
                    if (!mf.f.u(name) && !name.startsWith(".")) {
                        String name2 = nextEntry.getName();
                        name2.getClass();
                        if (!name2.startsWith("__MACOSX")) {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, name));
                            try {
                                na.a(zipInputStream, fileOutputStream);
                                fileOutputStream.close();
                                zipInputStream.closeEntry();
                                i10++;
                            } finally {
                            }
                        }
                    }
                }
                zipInputStream.closeEntry();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    pa.a(zipInputStream, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [w7.s9] */
    public static ArrayList h(Context context) {
        Object kVar;
        Object obj;
        s9 s9Var;
        boolean a10;
        boolean a11;
        List list;
        context.getClass();
        List<c> m4 = m(context);
        ArrayList arrayList = new ArrayList();
        for (c cVar : m4) {
            int i10 = cVar.f15781l;
            String str = cVar.f15773b;
            String str2 = null;
            str2 = null;
            str2 = null;
            str2 = null;
            if (i10 <= 14 && (kotlin.jvm.internal.l.a(str, "stickers") || kotlin.jvm.internal.l.a(str, "tape") || kotlin.jvm.internal.l.a(str, "frames") || kotlin.jvm.internal.l.a(str, "ornaments"))) {
                try {
                    s sVar = f15790a;
                    ag.a serializer = s9.Companion.serializer();
                    z zVar = cVar.f15780k;
                    sVar.getClass();
                    serializer.getClass();
                    zVar.getClass();
                    s9Var = (s9) new gg.n(sVar, zVar, str2, 12).q(serializer);
                    a10 = kotlin.jvm.internal.l.a(str, "frames");
                } catch (Throwable th) {
                    kVar = new k(th);
                }
                if ((!a10 || !s9Var.f29087j.isEmpty()) && (!(a11 = kotlin.jvm.internal.l.a(str, "ornaments")) || !s9Var.f29089l.isEmpty())) {
                    String str3 = cVar.f15772a;
                    boolean z3 = cVar.e;
                    boolean a12 = kotlin.jvm.internal.l.a(str, "tape");
                    boolean j10 = mf.m.j(cVar.f15777g, "taller:");
                    List list2 = qe.s.f24023u;
                    if (a10) {
                        List<a5> list3 = s9Var.f29087j;
                        ArrayList arrayList2 = new ArrayList(qe.m.d(list3, 10));
                        for (a5 a5Var : list3) {
                            String str4 = cVar.f15772a;
                            String str5 = a5Var.f27868a;
                            String str6 = a5Var.f27870c;
                            c cVar2 = cVar;
                            String str7 = a5Var.f27871d;
                            float f10 = a5Var.e;
                            List list4 = a5Var.f27872f;
                            str5.getClass();
                            str4.getClass();
                            str6.getClass();
                            str7.getClass();
                            list4.getClass();
                            arrayList2.add(new a5(str5, str4, str6, str7, f10, list4));
                            cVar = cVar2;
                        }
                        list = arrayList2;
                    } else {
                        list = list2;
                    }
                    if (a11) {
                        list2 = s9Var.f29089l;
                    }
                    kVar = s9.a(s9Var, str3, z3, a12, list, list2, j10);
                    if (kVar instanceof k) {
                        obj = null;
                    } else {
                        obj = kVar;
                    }
                    str2 = (s9) obj;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static File i(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        Integer j10 = j(context, str);
        if (j10 != null) {
            int intValue = j10.intValue();
            File file = new File(new File(k(context, str), String.valueOf(intValue)), new File(str2).getName());
            if (file.isFile()) {
                return file;
            }
            return null;
        }
        return null;
    }

    public static Integer j(Context context, String str) {
        int i10;
        boolean z3;
        File[] listFiles = k(context, str).listFiles();
        Comparable comparable = null;
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (File file : listFiles) {
            if (file.isDirectory()) {
                String name = file.getName();
                name.getClass();
                if (mf.m.k(10, name) != null) {
                    arrayList.add(file);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            File[] listFiles2 = ((File) obj).listFiles();
            if (listFiles2 != null) {
                i10 = listFiles2.length;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            String name2 = ((File) obj2).getName();
            name2.getClass();
            Integer k3 = mf.m.k(10, name2);
            if (k3 != null) {
                arrayList3.add(k3);
            }
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
        }
        return (Integer) comparable;
    }

    public static File k(Context context, String str) {
        return new File(l(context), str);
    }

    public static File l(Context context) {
        File file = new File(context.getFilesDir(), "remote_packs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    public static List m(Context context) {
        qe.s kVar;
        qe.s sVar = qe.s.f24023u;
        List list = f15804q;
        if (list != null) {
            return list;
        }
        File file = new File(l(context), "catalog.json");
        if (!file.exists()) {
            return sVar;
        }
        try {
            s sVar2 = f15790a;
            String f10 = l.f(file);
            sVar2.getClass();
            kVar = (List) sVar2.a(new eg.c(c.Companion.serializer()), f10);
        } catch (Throwable th) {
            kVar = new k(th);
        }
        Throwable a10 = pe.l.a(kVar);
        if (a10 == null) {
            sVar = kVar;
        } else {
            wd0.o("catálogo ilegible: ", a10.getMessage(), "RemotePacks");
        }
        qe.s sVar3 = sVar;
        if (!sVar3.isEmpty()) {
            f15804q = sVar3;
        }
        return sVar3;
    }

    public static void n(Context context) {
        context.getClass();
        n0 n0Var = f15793d;
        Map map = (Map) n0Var.getValue();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (c cVar : m(context)) {
            Integer j10 = j(context, cVar.f15772a);
            String str = cVar.f15772a;
            h hVar = g7.f.f17564a;
            if (j10 != null && j10.intValue() >= cVar.f15775d) {
                hVar = g7.e.f17563a;
            }
            linkedHashMap.put(str, hVar);
        }
        n0Var.k(null, linkedHashMap);
    }

    public static File o(Context context, String str, String str2) {
        String g8;
        File file;
        if (str2 != null && str2.startsWith("taller:")) {
            File file2 = null;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                file = new File(externalFilesDir, "taller/packs");
            } else {
                file = null;
            }
            if (file != null) {
                file2 = new File(file, str);
            }
            if (file2 != null) {
                return new File(file2, "cover.png");
            }
        }
        File file3 = new File(l(context), "thumbs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        if (str2 != null && !mf.f.u(str2)) {
            int abs = Math.abs(str2.hashCode());
            x0.a(16);
            String num = Integer.toString(abs, 16);
            num.getClass();
            g8 = i1.d(str, "_", num, ".png");
        } else {
            g8 = a5.a.g(str, ".png");
        }
        return new File(file3, g8);
    }
}
