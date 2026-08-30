package d8;
import f.b;

import af.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import b8.b7;
import b8.ha;
import b8.ma;
import df.p;
import fg.s;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import pe.j;
import pe.k;
import pf.z;
import q.x;
import qe.m;
import sf.n0;
import u7.u0;
import ve.i;
import w7.p9;
import w7.t9;

/* loaded from: classes.dex */
public final class d extends i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15782u = 1;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f15783v;

    /* renamed from: w, reason: collision with root package name */
    public int f15784w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f15785x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, Context context, te.c cVar) {
        super(2, cVar);
        this.f15784w = i;
        this.f15785x = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f15782u) {
            case 0:
                d dVar = new d(this.f15785x, cVar);
                dVar.f15783v = obj;
                return dVar;
            default:
                d dVar2 = new d(this.f15784w, this.f15785x, cVar);
                dVar2.f15783v = obj;
                return dVar2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f15782u) {
            case 0:
                return ((d) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((d) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object kVar;
        File[] listFiles;
        int i;
        Bitmap bitmap;
        int i10 = 1;
        k1.f fVar = null;
        switch (this.f15782u) {
            case 0:
                pe.z zVar = pe.z.f22715a;
                ue.a aVar = ue.a.f27192u;
                int i11 = this.f15784w;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    s sVar = f.f15790a;
                    f.n(this.f15785x);
                    if (c8.a.d()) {
                        Serializable e = c8.a.e("content_packs", qe.x.c(new j("select", "id,kind,name,version,premium,price_coins,archive_path,archive_bytes,archive_sha256,thumb_path,manifest,min_app_version"), new j("published", "eq.true"), new j("order", "sort_order.asc")));
                        if (e instanceof k) {
                            e = null;
                        }
                        String str = (String) e;
                        if (str != null) {
                            try {
                                s sVar2 = f.f15790a;
                                sVar2.getClass();
                                kVar = (List) sVar2.a(new eg.c(c.Companion.serializer()), str);
                            } catch (Throwable th) {
                                kVar = new k(th);
                            }
                            if (kVar instanceof k) {
                                kVar = null;
                            }
                            List<c> list = (List) kVar;
                            if (list == null) {
                                Log.w("RemotePacks", "respuesta del catálogo ilegible");
                            } else {
                                Context context = this.f15785x;
                                try {
                                    s sVar3 = f.f15790a;
                                    l.h(new File(f.l(context), "catalog.json"), str);
                                } catch (Throwable unused) {
                                }
                                s sVar4 = f.f15790a;
                                f.f15804q = null;
                                n0 n0Var = f.f15794f;
                                List<c> list2 = list;
                                int b10 = qe.x.b(m.d(list2, 10));
                                if (b10 < 16) {
                                    b10 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
                                for (c cVar : list2) {
                                    linkedHashMap.put(cVar.f15772a, new Long(cVar.f15778h));
                                }
                                n0Var.getClass();
                                n0Var.k(null, linkedHashMap);
                                p9 p9Var = p9.f28915a;
                                p9Var.j();
                                s sVar5 = f.f15790a;
                                f.n(this.f15785x);
                                b();
                                List p10 = p9Var.p(this.f15785x);
                                ConcurrentHashMap concurrentHashMap = ha.f2170a;
                                Context context2 = this.f15785x;
                                ma maVar = ma.TAPES;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : p10) {
                                    if (((t9) obj2).f29155a.f29083d) {
                                        arrayList.add(obj2);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(m.d(arrayList, 10));
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj3 = arrayList.get(i12);
                                    i12++;
                                    arrayList2.add(((t9) obj3).f29155a.f29080a);
                                }
                                ha.d(context2, maVar, arrayList2);
                                Context context3 = this.f15785x;
                                ma maVar2 = ma.FRAMES;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : p10) {
                                    if (((t9) obj4).d()) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(m.d(arrayList3, 10));
                                int size2 = arrayList3.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    Object obj5 = arrayList3.get(i13);
                                    i13++;
                                    arrayList4.add(((t9) obj5).f29155a.f29080a);
                                }
                                ha.d(context3, maVar2, arrayList4);
                                Context context4 = this.f15785x;
                                ma maVar3 = ma.STICKERS;
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj6 : p10) {
                                    if (((t9) obj6).g()) {
                                        arrayList5.add(obj6);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(m.d(arrayList5, 10));
                                int size3 = arrayList5.size();
                                int i14 = 0;
                                while (i14 < size3) {
                                    Object obj7 = arrayList5.get(i14);
                                    i14++;
                                    arrayList6.add(((t9) obj7).f29155a.f29080a);
                                }
                                ha.d(context4, maVar3, arrayList6);
                                Context context5 = this.f15785x;
                                ma maVar4 = ma.ACCESSORIES;
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj8 : p10) {
                                    if (((t9) obj8).f()) {
                                        arrayList7.add(obj8);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(m.d(arrayList7, 10));
                                int size4 = arrayList7.size();
                                int i15 = 0;
                                while (i15 < size4) {
                                    Object obj9 = arrayList7.get(i15);
                                    i15++;
                                    arrayList8.add(((t9) obj9).f29155a.f29080a);
                                }
                                ha.d(context5, maVar4, arrayList8);
                                s sVar6 = f.f15790a;
                                Context context6 = this.f15785x;
                                this.f15783v = null;
                                this.f15784w = 1;
                                for (c cVar2 : list) {
                                    String str2 = cVar2.f15779j;
                                    String str3 = cVar2.f15772a;
                                    if (str2 != null && !mf.m.j(cVar2.f15777g, "taller:")) {
                                        File o10 = f.o(context6, str3, str2);
                                        if (!o10.exists() && !(c8.a.b(c8.a.h("packs-public", str2), o10, new b7(13)) instanceof k)) {
                                            File parentFile = o10.getParentFile();
                                            if (parentFile != null && (listFiles = parentFile.listFiles()) != null) {
                                                int length = listFiles.length;
                                                int i16 = 0;
                                                while (i16 < length) {
                                                    File file = listFiles[i16];
                                                    if (!kotlin.jvm.internal.l.a(file, o10)) {
                                                        String name = file.getName();
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append(str3);
                                                        i = i10;
                                                        sb2.append(".png");
                                                        if (!kotlin.jvm.internal.l.a(name, sb2.toString())) {
                                                            String name2 = file.getName();
                                                            name2.getClass();
                                                            if (!name2.startsWith(str3 + "_")) {
                                                            }
                                                        }
                                                        file.delete();
                                                    } else {
                                                        i = i10;
                                                    }
                                                    i16++;
                                                    i10 = i;
                                                }
                                            }
                                            int i17 = i10;
                                            p9 p9Var2 = p9.f28915a;
                                            str3.getClass();
                                            p9.e.remove(str3);
                                            n0 n0Var2 = f.f15797j;
                                            n0Var2.k(null, Integer.valueOf(((Number) n0Var2.getValue()).intValue() + 1));
                                            i10 = i17;
                                        }
                                    }
                                }
                                if (zVar == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                }
                return zVar;
            default:
                pe.a.e(obj);
                ConcurrentHashMap concurrentHashMap2 = u0.f26908g;
                int i18 = this.f15784w;
                k1.f fVar2 = (k1.f) concurrentHashMap2.get(new Integer(i18));
                if (fVar2 == null) {
                    Context context7 = this.f15785x;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    options.inScaled = false;
                    BitmapFactory.decodeResource(context7.getResources(), i18, options);
                    while (true) {
                        if (options.outWidth / i10 <= 512 && options.outHeight / i10 <= 512) {
                            try {
                                Resources resources = context7.getResources();
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inSampleSize = i10;
                                options2.inScaled = false;
                                bitmap = BitmapFactory.decodeResource(resources, i18, options2);
                            } catch (Exception | OutOfMemoryError unused2) {
                                bitmap = null;
                            }
                            if (bitmap != null) {
                                fVar = new k1.f(bitmap);
                            }
                            if (fVar != null) {
                                u0.f26908g.put(new Integer(i18), fVar);
                            }
                            return fVar;
                        }
                        i10 *= 2;
                    }
                } else {
                    return fVar2;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, te.c cVar) {
        super(2, cVar);
        this.f15785x = context;
    }
}
