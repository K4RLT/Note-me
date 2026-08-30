package o6;
import d.a;
import d.b;
import l.b;
import l.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import g5.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import y6.r;
import ya.ec;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f21801a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f21802b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f21803c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f21804d = {31, -117, 8};

    public static n a(Context context, InputStream inputStream, String str) {
        a a10;
        if (str == null) {
            a10 = null;
        } else {
            a10 = u6.e.f25877b.a(str);
        }
        if (a10 != null) {
            return new n(a10);
        }
        try {
            sg.n nVar = new sg.n(ec.a(inputStream));
            if (d(nVar, f21803c).booleanValue()) {
                ZipInputStream zipInputStream = new ZipInputStream(new sg.e(nVar, 1));
                try {
                    return c(context, zipInputStream, str);
                } finally {
                    a7.b(zipInputStream);
                }
            }
            if (d(nVar, f21804d).booleanValue()) {
                sg.n nVar2 = new sg.n(ec.a(new GZIPInputStream(new sg.e(nVar, 1))));
                String[] strArr = z6.a.f31932y;
                return b(new z6.b(nVar2), str, true);
            }
            String[] strArr2 = z6.a.f31932y;
            return b(new z6.b(nVar), str, true);
        } catch (IOException e) {
            return new n(e);
        }
    }

    public static n b(z6.b bVar, String str, boolean z3) {
        a a10;
        try {
            if (str == null) {
                a10 = null;
            } else {
                try {
                    a10 = u6.e.f25877b.a(str);
                } catch (Exception e) {
                    n nVar = new n(e);
                    if (z3) {
                        a7.b(bVar);
                    }
                    return nVar;
                }
            }
            if (a10 != null) {
                n nVar2 = new n(a10);
                if (z3) {
                    a7.b(bVar);
                }
                return nVar2;
            }
            a a11 = r.a(bVar);
            if (str != null) {
                u6.e.f25877b.f25878a.d(str, a11);
            }
            n nVar3 = new n(a11);
            if (z3) {
                a7.b(bVar);
            }
            return nVar3;
        } catch (Throwable th) {
            if (z3) {
                a7.b(bVar);
            }
            throw th;
        }
    }

    public static n c(Context context, ZipInputStream zipInputStream, String str) {
        a a10;
        l lVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = u6.e.f25877b.a(str);
            } catch (IOException e) {
                return new n(e);
            }
        }
        if (a10 != null) {
            return new n(a10);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        a aVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                sg.n nVar = new sg.n(ec.a(zipInputStream));
                String[] strArr = z6.a.f31932y;
                aVar = b(new z6.b(nVar), null, false).f21832a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new n(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                                break;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        a7.b("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        a7.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (aVar == null) {
            return new n(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) aVar.c()).values().iterator();
            while (true) {
                if (it.hasNext()) {
                    lVar = (l) it.next();
                    if (lVar.f21830d.equals(str4)) {
                        break;
                    }
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                lVar.f21831f = a7.d((Bitmap) entry.getValue(), lVar.f21827a, lVar.f21828b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z3 = false;
            for (u6.c cVar : aVar.f21788f.values()) {
                if (cVar.f25870a.equals(entry2.getKey())) {
                    cVar.f25872c = (Typeface) entry2.getValue();
                    z3 = true;
                }
            }
            if (!z3) {
                a7.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) aVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                l lVar2 = (l) ((Map.Entry) it2.next()).getValue();
                if (lVar2 == null) {
                    return null;
                }
                String str5 = lVar2.f21830d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        lVar2.f21831f = a7.d(BitmapFactory.decodeByteArray(decode, 0, decode.length, options), lVar2.f21827a, lVar2.f21828b);
                    } catch (IllegalArgumentException e8) {
                        a7.b("data URL did not have correct base64 format.", e8);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            u6.e.f25877b.f25878a.d(str, aVar);
        }
        return new n(aVar);
    }

    public static Boolean d(sg.n nVar, byte[] bArr) {
        try {
            BufferedSource peek = nVar.peek();
            for (byte b10 : bArr) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            a7.d.f304a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void e() {
        ArrayList arrayList = new ArrayList(f21802b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        q.b();
    }
}
