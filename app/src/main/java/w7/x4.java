package w7;
import f.i;
import l7.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.daren.scraply.R;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f29436a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f29437b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f29438c;

    static {
        b bVar = b.CIRCLE;
        b bVar2 = b.ROUNDED;
        b bVar3 = b.HEART;
        b bVar4 = b.ARCH;
        w4 w4Var = new w4("frames_basicos", R.string.frame_pack_basics, qe.m.h(bVar, bVar2, bVar3, bVar4, b.TORN), new pe.j(-16725505, -7143779), qe.m.h(new v4(bVar, -0.55f, 0.15f, -15.0f, 0.4f), new v4(bVar3, 0.55f, 0.15f, 15.0f, 0.4f), new v4(bVar4, 0.0f, -0.45f, 0.0f, 0.45f)));
        b bVar5 = b.SCRAP;
        b bVar6 = b.SCRAP_PREMIUM;
        b bVar7 = b.SCRAP_CAMEO;
        b bVar8 = b.SCRAP_SLOTTED;
        b bVar9 = b.SCALLOPED;
        b bVar10 = b.CLASSIC_CORNERS;
        w4 w4Var2 = new w4("frames_albumes", R.string.frame_pack_albums, qe.m.h(bVar5, bVar6, bVar7, bVar8, bVar9, bVar10), new pe.j(-7459358, -11927328), qe.m.h(new v4(bVar10, -0.55f, -0.45f, -15.0f, 0.7f), new v4(bVar5, 0.55f, -0.45f, 15.0f, 0.7f), new v4(bVar6, 0.0f, -0.05f, 0.0f, 0.95f)));
        b bVar11 = b.POLAROID;
        b bVar12 = b.POLAROID_CAMERA;
        b bVar13 = b.FILM;
        b bVar14 = b.FILM_SINGLE;
        b bVar15 = b.TICKET;
        b bVar16 = b.STAMP;
        b bVar17 = b.WASHI;
        w4 w4Var3 = new w4("frames_camara", R.string.frame_pack_camera, qe.m.h(bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, b.TAPED_CORNERS), new pe.j(-13877680, -16777216), qe.m.h(new v4(bVar14, -0.6f, -0.35f, -22.0f, 0.7f), new v4(bVar17, 0.6f, -0.35f, 22.0f, 0.7f), new v4(bVar12, 0.0f, 0.0f, -2.0f, 0.95f)));
        b bVar18 = b.MUSEUM;
        b bVar19 = b.GOLD;
        f29436a = qe.m.h(w4Var, w4Var2, w4Var3, new w4("frames_galeria", R.string.frame_pack_gallery, qe.m.h(bVar18, bVar19), new pe.j(-2838729, -5605604), qe.m.h(new v4(bVar18, -0.55f, -0.4f, -16.0f, 0.7f), new v4(bVar18, 0.55f, -0.4f, 16.0f, 0.7f), new v4(bVar19, 0.0f, -0.05f, 0.0f, 0.95f))));
        f29437b = qe.m.h(new pe.j(-12968847, -2658953), new pe.j(-15511970, -9325952), new pe.j(-10402939, -11443307), new pe.j(-9614271, -4745071), new pe.j(-14143416, -8023144));
        f29438c = new ConcurrentHashMap();
    }

    public static Bitmap a(String str) {
        Object kVar;
        FileInputStream fileInputStream;
        str.getClass();
        String concat = str.concat("@512");
        ConcurrentHashMap concurrentHashMap = f29438c;
        Bitmap bitmap = (Bitmap) concurrentHashMap.get(concat);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        try {
            fileInputStream = new FileInputStream(new File(str));
            try {
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
        if (options.outWidth > 0 && options.outHeight > 0) {
            while (true) {
                if (options.outWidth / i <= 512 && options.outHeight / i <= 512) {
                    break;
                }
                i *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i;
            try {
                fileInputStream = new FileInputStream(new File(str));
            } catch (Throwable th) {
                kVar = new pe.k(th);
            }
            try {
                kVar = BitmapFactory.decodeStream(fileInputStream, null, options2);
                fileInputStream.close();
                if (kVar instanceof pe.k) {
                    kVar = null;
                }
                Bitmap bitmap2 = (Bitmap) kVar;
                if (bitmap2 != null) {
                    concurrentHashMap.put(concat, bitmap2);
                    return bitmap2;
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        return null;
    }

    public static ArrayList b(Context context) {
        context.getClass();
        List<w4> list = f29436a;
        ArrayList arrayList = new ArrayList(qe.m.d(list, 10));
        for (w4 w4Var : list) {
            String str = w4Var.f29363a;
            String string = context.getString(w4Var.f29364b);
            string.getClass();
            List list2 = w4Var.f29365c;
            ArrayList arrayList2 = new ArrayList(qe.m.d(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a5(((b) it.next()).name(), w4Var.f29363a, "", "", 1.0f, qe.s.f24023u));
            }
            arrayList.add(new t9(new s9(str, string, arrayList2)));
        }
        List p10 = p9.f28915a.p(context);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : p10) {
            if (((t9) obj).d()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList3.get(i);
            i++;
            qe.q.n(arrayList4, ((t9) obj2).f29155a.f29087j);
        }
        if (arrayList4.isEmpty()) {
            return arrayList;
        }
        String string2 = context.getString(R.string.frame_pack_added);
        string2.getClass();
        return qe.l.E(qe.m.g(new t9(new s9("frames_anadidos", string2, arrayList4))), arrayList);
    }

    public static d5 c(Context context, a5 a5Var) {
        context.getClass();
        a5Var.getClass();
        String str = a5Var.f27870c;
        if (mf.f.u(str)) {
            return c5.u(n4.j1(a5Var.f27868a));
        }
        fg.s sVar = d8.f.f15790a;
        File i = d8.i(context, a5Var.f27869b, str);
        if (i != null) {
            b bVar = b.REMOTE;
            String absolutePath = i.getAbsolutePath();
            float f10 = a5Var.e;
            List list = a5Var.f27872f;
            list.getClass();
            if (bVar != null && bVar != b.NONE && absolutePath != null && !mf.f.u(absolutePath)) {
                if (f10 <= 0.0f) {
                    f10 = 1.0f;
                }
                return new d5(bVar, absolutePath, f10, list);
            }
            return null;
        }
        return null;
    }

    public static a5 d(Context context, String str) {
        context.getClass();
        str.getClass();
        int i = 0;
        int r8 = mf.f.r(str, '/', 0, 6);
        Object obj = null;
        if (r8 < 0) {
            b j12 = n4.j1(str);
            if (j12 == null) {
                return null;
            }
            ArrayList b10 = b(context);
            ArrayList arrayList = new ArrayList();
            int size = b10.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = b10.get(i10);
                i10++;
                qe.q.n(arrayList, ((t9) obj2).f29155a.f29087j);
            }
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                if (kotlin.jvm.internal.l.a(((a5) obj3).f27868a, j12.name())) {
                    obj = obj3;
                    break;
                }
            }
            return (a5) obj;
        }
        String substring = str.substring(0, r8);
        String substring2 = str.substring(r8 + 1);
        ArrayList b11 = b(context);
        ArrayList arrayList2 = new ArrayList();
        int size3 = b11.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj4 = b11.get(i11);
            i11++;
            qe.q.n(arrayList2, ((t9) obj4).f29155a.f29087j);
        }
        int size4 = arrayList2.size();
        while (true) {
            if (i >= size4) {
                break;
            }
            Object obj5 = arrayList2.get(i);
            i++;
            a5 a5Var = (a5) obj5;
            if (kotlin.jvm.internal.l.a(a5Var.f27869b, substring) && kotlin.jvm.internal.l.a(a5Var.f27868a, substring2)) {
                obj = obj5;
                break;
            }
        }
        return (a5) obj;
    }
}
