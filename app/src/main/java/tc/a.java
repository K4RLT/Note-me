package tc;
import c.i;
import c.j;

import android.util.Log;
import b0.e0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import oc.h;
import oc.j;
import qc.i2;

/* loaded from: classes.dex */
public final class a {
    public static final Charset e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f25689f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final rc.a f25690g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final e0 f25691h = new e0(9);
    public static final h i = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f25692a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final c f25693b;

    /* renamed from: c, reason: collision with root package name */
    public final lw f25694c;

    /* renamed from: d, reason: collision with root package name */
    public final j f25695d;

    public a(c cVar, lw lwVar, j jVar) {
        this.f25693b = cVar;
        this.f25694c = lwVar;
        this.f25695d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
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

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f25693b;
        arrayList.addAll(j(((File) cVar.f25702z).listFiles()));
        arrayList.addAll(j(((File) cVar.A).listFiles()));
        e0 e0Var = f25691h;
        Collections.sort(arrayList, e0Var);
        List j10 = j(((File) cVar.f25701y).listFiles());
        Collections.sort(j10, e0Var);
        arrayList.addAll(j10);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(j(((File) this.f25693b.f25700x).list())).descendingSet();
    }

    public final void d(i2 i2Var, String str, boolean z3) {
        String str2;
        c cVar = this.f25693b;
        int i10 = this.f25694c.c().f27533a.f2825v;
        f25690g.getClass();
        String g8 = rc.a.f24679a.g(i2Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.f25692a.getAndIncrement()));
        if (z3) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(cVar.d(str, p.a.k("event", format, str2)), g8);
        } catch (IOException e8) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e8);
        }
        h hVar = new h(3);
        cVar.getClass();
        File file = new File((File) cVar.f25700x, str);
        file.mkdirs();
        List<File> j10 = j(file.listFiles(hVar));
        Collections.sort(j10, new e0(10));
        int size = j10.size();
        for (File file2 : j10) {
            if (size > i10) {
                i(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
